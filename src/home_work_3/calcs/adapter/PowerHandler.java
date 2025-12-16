package home_work_3.calcs.adapter;

import home_work_3.calcs.adapter.api.IHandler;
import home_work_3.calcs.api.ICalculator;

import java.util.regex.Matcher;


public class PowerHandler extends PatternHandler implements IHandler {

    private final ICalculator calculator;


    public PowerHandler(ICalculator calculator){
        super("([+-]?\\d*\\.?\\d+)\\s*[\\^]\\s*([+-]?\\d*\\.?\\d+)");
        this.calculator = calculator;
    }

    @Override
    public int getPriority() {
        return 2;
    }

    @Override
    protected double calc (Matcher matcher) {
        String oper1 = matcher.group(1);
        String oper2 = matcher.group(2);
        double power = calculator.power(Double.parseDouble(oper1),
                Integer.parseInt(oper2));
        return power;
    }
}
