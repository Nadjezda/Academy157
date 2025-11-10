package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    //4.4 Создать класс CalculatorWithMathExtendsMain в котором будет точка входа (main метод).
    // В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать
    // выражения из задания 1) 4.1 + 15 * 7 + (28 / 5) ^ 2. Вывести в консоль результат.
    public static void main(String[] args) {

    CalculatorWithMathExtends calculatorExtend = new CalculatorWithMathExtends();

    double result = calculatorExtend.plus(4.1, (calculatorExtend.plus(calculatorExtend.multiplying(15,7),
            (calculatorExtend.power(calculatorExtend.dividing(28.0,5.0)  , 2)))));

    calculatorExtend.printf(result);
    }
}
