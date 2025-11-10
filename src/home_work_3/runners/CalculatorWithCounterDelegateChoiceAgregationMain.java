package home_work_3.runners;

//9.7 Создать класс CalculatorWithCounterDelegateChoiceAgregationMain в котором будет точка входа (main метод).
// В main методе требуется:
//		9.7.1 Создать экземпляр калькулятора используя конструктор принимающий CalculatorWithOperator
//		и используя методы из данного экземпляра посчитать выражения из задания 1) 4.1 + 15 * 7 + (28 / 5) ^ 2.
//		Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
//		9.7.2 Создать экземпляр калькулятора используя конструктор принимающий CalculatorWithMathCopy
//		и используя методы из данного экземпляра посчитать выражения из задания 1) 4.1 + 15 * 7 + (28 / 5) ^ 2.
//		Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
//		9.7.3 Создать экземпляр калькулятора используя конструктор принимающий CalculatorWithMathExtends
//		и используя методы из данного экземпляра посчитать выражения из задания 1) 4.1 + 15 * 7 + (28 / 5) ^ 2.
//		Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().


import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAgregationMain {

    public static void main(String[] args) {

        System.out.println("__________________CalculatorWithOperator__________________");
        CalculatorWithCounterAutoChoiceAgregation calculatorDelegateOper =
                new CalculatorWithCounterAutoChoiceAgregation
                        (new CalculatorWithOperator());


        double result = calculatorDelegateOper.plus(new CalculatorWithOperator(),4.1,
                (calculatorDelegateOper.plus(new CalculatorWithOperator(),
                        calculatorDelegateOper.multiplying(new CalculatorWithOperator(), 15, 7),
                        calculatorDelegateOper.power(new CalculatorWithOperator(),
                        (calculatorDelegateOper.dividing(new CalculatorWithOperator(),28.0, 5.0)), 2))));
        System.out.printf("%.2f", result);
        System.out.println();
        System.out.println(calculatorDelegateOper.getCountOperation());
        System.out.println("__________________CalculatorWithMathCopy__________________");

        CalculatorWithCounterAutoChoiceAgregation calculatorDelegateOper1 =
                new CalculatorWithCounterAutoChoiceAgregation
                        (new CalculatorWithMathCopy());

        double result1 = calculatorDelegateOper1.plus(new CalculatorWithMathCopy(),4.1,
                (calculatorDelegateOper1.plus(new CalculatorWithMathCopy(),
                        calculatorDelegateOper1.multiplying(new CalculatorWithMathCopy(), 15, 7),
                        calculatorDelegateOper1.power(new CalculatorWithMathCopy(),
                        (calculatorDelegateOper1.dividing(new CalculatorWithMathCopy(),28.0, 5.0)), 2))));
        System.out.printf("%.2f", result1);
        System.out.println();
        System.out.println(calculatorDelegateOper1.getCountOperation());

        System.out.println("__________________CalculatorWithMathExtends__________________");
        CalculatorWithCounterAutoChoiceAgregation calculatorDelegateOper2 =
                new CalculatorWithCounterAutoChoiceAgregation
                        (new CalculatorWithMathExtends());


        double result2 = calculatorDelegateOper2.plus(new CalculatorWithMathExtends(),4.1,
                (calculatorDelegateOper2.plus(new CalculatorWithMathExtends(),
                        calculatorDelegateOper2.multiplying(new CalculatorWithMathExtends(), 15, 7),
                        calculatorDelegateOper2.power(new CalculatorWithMathExtends(),
                        (calculatorDelegateOper2.dividing(new CalculatorWithMathExtends(),28.0, 5.0)), 2))));
        System.out.printf("%.2f", result2);
        System.out.println();
        System.out.println(calculatorDelegateOper2.getCountOperation());


    }
}
