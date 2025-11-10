package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    //2.5 Создать класс CalculatorWithOperatorMain в котором будет точка входа (main метод). В main методе требуется
    // создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1.
    //(1.1 4.1 + 15 * 7 + (28 / 5) ^ 2. Внимание, знак "^" обозначает возведение в степень.
    // Вывести в консоль результат.
    public static void main(String[] args) {
        CalculatorWithOperator calculatorFirst = new CalculatorWithOperator();

        double result = calculatorFirst.plus(4.1, (calculatorFirst.plus(calculatorFirst.multiplying(15,7),
                (calculatorFirst.power(calculatorFirst.dividing(28.0,5.0)  , 2)))));

        calculatorFirst.printf(result);

            }
}
