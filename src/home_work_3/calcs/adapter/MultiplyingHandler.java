package home_work_3.calcs.adapter;

import home_work_3.calcs.adapter.api.IHandler;
import home_work_3.calcs.api.ICalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MultiplyingHandler extends PatternHandler implements IHandler {

    private final ICalculator calculator;


    public MultiplyingHandler(ICalculator calculator){
        super("([+-]?\\d*\\.?\\d+)\\s*[\\*]\\s*([+-]?\\d*\\.?\\d+)");
        this.calculator = calculator;
    }

    @Override
    public int getPriority() {
        return 3;
    }

    @Override
    protected double calc (Matcher matcher) {
        String oper1 = matcher.group(1);
        String oper2 = matcher.group(2);
        double multiplying = calculator.multiplying(Double.parseDouble(oper1),
                Double.parseDouble(oper2));
        return multiplying;
    }
}
