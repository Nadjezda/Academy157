package home_work_3.runners;

import home_work_3.calcs.adapter.CalculatorAdapter;

public class CalculatorStringExpressionMain {

    public static void main(String[] args) {
        CalculatorAdapter adapter = new CalculatorAdapter();
        double result = adapter.calc("4.1 + 15 * 7 + (28 / 5) ^ 2");
        System.out.println(result);
     }
}
