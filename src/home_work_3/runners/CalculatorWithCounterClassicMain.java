package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    //5.5 Создать класс CalculatorWithCounterClassicMain в котором будет точка входа (main метод).
    // В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра
    // посчитать выражения из задания 1) 4.1 + 15 * 7 + (28 / 5) ^ 2. при каждой математической операции
    // самостоятельно вызывать метод incrementCountOperation() для увеличения счётчика.
    // Вывести в консоль результат.
    public static void main(String[] args) {

        CalculatorWithCounterClassic calculatorCounter = new CalculatorWithCounterClassic();

        double firstOperation = calculatorCounter.dividing(28.0, 5.0);
        calculatorCounter.incrementCountOperation();
        double secondOperation = calculatorCounter.multiplying(15,7);
        calculatorCounter.incrementCountOperation();
        double thirdOperation = calculatorCounter.plus(4.1, secondOperation);
        calculatorCounter.incrementCountOperation();
        double fourthOperation = calculatorCounter.power(firstOperation, 2);
        calculatorCounter.incrementCountOperation();
        double result = calculatorCounter.plus(thirdOperation, fourthOperation);
        calculatorCounter.incrementCountOperation();

        calculatorCounter.printf(result);
        System.out.println();
        System.out.println(calculatorCounter.getCountOperation());
    }
}
