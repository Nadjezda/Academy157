package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;

//8.7 Создать класс CalculatorWithCounterDelegateAgregationMain в котором будет точка входа (main метод).
// В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра
// посчитать выражения из задания 1) 4.1 + 15 * 7 + (28 / 5) ^ 2.
// Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
public class CalculatorWithCounterDelegateAgregationMain {
    public static void main(String[] args) {

        CalculatorWithCounterAutoAgregation calculatorDelegate = new CalculatorWithCounterAutoAgregation();

        double result = calculatorDelegate.plus(4.1, (calculatorDelegate.plus
                (calculatorDelegate.multiplying(15,7), (calculatorDelegate.power
                        (calculatorDelegate.dividing(28.0,5.0)  , 2)))));

        System.out.printf("%.2f", result);
        System.out.println();
        System.out.println(calculatorDelegate.getCountOperation());



    }
}
