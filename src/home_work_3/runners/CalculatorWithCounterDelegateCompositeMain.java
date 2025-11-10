package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;

public class CalculatorWithCounterDelegateCompositeMain {
    //7.7 Создать класс CalculatorWithCounterDelegateCompositeMain в котором будет точка входа (main метод).
    // В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра
    // посчитать выражения из задания 1) 4.1 + 15 * 7 + (28 / 5) ^ 2.
    // Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite calculatorComposite = new CalculatorWithCounterAutoComposite();

        double result = calculatorComposite.plus(4.1, (calculatorComposite.plus
                (calculatorComposite.multiplying(15,7), (calculatorComposite.power
                        (calculatorComposite.dividing(28.0,5.0)  , 2)))));

        System.out.printf("%.2f" , result);
        System.out.println();
        System.out.println(calculatorComposite.getCountOperation());
    }
}
