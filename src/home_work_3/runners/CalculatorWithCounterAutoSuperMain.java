package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    //6.5 Создать класс CalculatorWithCounterAutoSuperMain в котором будет точка входа (main метод).
    // В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра
    // посчитать выражения из задания 1)4.1 + 15 * 7 + (28 / 5) ^ 2. Вывести в консоль результаты
    // посчитанных выражений и результат метода getCountOperation().
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calculatorAutoSuper = new CalculatorWithCounterAutoSuper();

         double result = calculatorAutoSuper.plus(4.1, (calculatorAutoSuper.plus
                 (calculatorAutoSuper.multiplying(15,7), (calculatorAutoSuper.power
                         (calculatorAutoSuper.dividing(28.0,5.0)  , 2)))));

         calculatorAutoSuper.printf(result);

         System.out.println();

         System.out.println(calculatorAutoSuper.getCountOperation());
    }
}
