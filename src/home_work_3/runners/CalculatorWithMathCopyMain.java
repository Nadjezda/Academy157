package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    //3.3 Создать класс CalculatorWithMathCopyMain в котором будет точка входа (main метод). В main методе требуется создать
    // экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1) 4.1 + 15 * 7 + (28 / 5) ^ 2.)
    // Вывести в консоль результат.

    public static void main(String[] args) {
        CalculatorWithMathCopy calculatorWithMath = new CalculatorWithMathCopy();

        calculatorWithMath.printf(calculatorWithMath.plus(4.1, (calculatorWithMath.plus
                (calculatorWithMath.multiplying(15,7), (calculatorWithMath.power
                        (calculatorWithMath.dividing(28.0,5.0)  , 2))))));
    }
}
