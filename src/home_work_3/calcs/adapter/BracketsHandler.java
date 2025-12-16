package home_work_3.calcs.adapter;

import home_work_3.calcs.adapter.api.IHandler;
import home_work_3.calcs.api.ICalculator;

import java.util.regex.Matcher;


public class BracketsHandler extends PatternHandler implements IHandler {

    private final ICalculator calculator;


    public BracketsHandler(ICalculator calculator) {
        super("[(]\\s*([+-]?\\d*\\.?\\d+)\\s*([+\\-*/%^])\\s*([+-]?\\d*\\.?\\d+)[)]");
        this.calculator = calculator;
    }

    @Override
    public int getPriority() {
        return 1;
    }

    @Override
    protected double calc(Matcher matcher) {
        String oper1 = matcher.group(1);
        String oper2 = matcher.group(3);

        if (matcher.group(2).contains("+")) {
            double result = calculator.plus(Double.parseDouble(oper1),
                    Double.parseDouble(oper2));
            return result;
        } else if (matcher.group().contains("-")) {
            double result = calculator.minus(Double.parseDouble(oper1),
                    Double.parseDouble(oper2));
            return result;
        } else if (matcher.group().contains("*")) {
            double result = calculator.multiplying(Double.parseDouble(oper1),
                    Double.parseDouble(oper2));
            return result;
        } else if (matcher.group().contains("/")) {
            double result = calculator.dividing(Double.parseDouble(oper1),
                    Double.parseDouble(oper2));
            return result;
        } else if (matcher.group().contains("^")) {
            double result = calculator.power(Double.parseDouble(oper1),
                    Integer.parseInt(oper2));
            return result;
        }
        return 0.0;

    }
}