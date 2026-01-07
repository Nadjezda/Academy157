package home_work_3.calcs.adapter;

import home_work_3.calcs.adapter.api.IHandler;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithOperator;


import java.util.PriorityQueue;

public class CalculatorAdapter {

    private final ICalculator calculator;
    private final PriorityQueue <IHandler> queueHandler =
            new PriorityQueue<>((o1, o2) -> o1.getPriority() - o2.getPriority());

    public CalculatorAdapter(){
        this.calculator = new CalculatorWithOperator();
        this.queueHandler.add(new MultiplyingHandler(this.calculator));
        this.queueHandler.add(new PlusHandler(this.calculator));
        this.queueHandler.add(new MinusHandler(this.calculator));
        this.queueHandler.add(new DividingHandler(this.calculator));
        this.queueHandler.add(new PowerHandler(this.calculator));
        this.queueHandler.add(new BracketsHandler(this.calculator));

    }
    public double calc (String text){
        for(IHandler item: queueHandler){
            text = item.handle(text);
        }
        return Double.valueOf(text);
    }
}
