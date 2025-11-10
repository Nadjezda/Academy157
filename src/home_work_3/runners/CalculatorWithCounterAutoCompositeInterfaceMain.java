package home_work_3.runners;

//11.7 Создать класс CalculatorWithCounterAutoCompositeInterfaceMain в котором будет точка входа (main метод).
// В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать
// выражения из задания 1)  4.1 + 15 * 7 + (28 / 5) ^ 2
// Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {

        System.out.println("_____________CalculatorWithOperator____________");
        CalculatorWithCounterAutoAgregationInterface oper =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());

        double result = oper.plus(4.1, (oper.plus
                (oper.multiplying(15,7), (oper.power
                        (oper.dividing(28.0,5.0)  , 2)))));

        System.out.printf("%.2f", result);
        System.out.println();
        System.out.println(oper.getCountOperation());

        System.out.println("_____________CalculatorWithMathCopy____________");
        CalculatorWithCounterAutoAgregationInterface copy =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());

        double result1 = copy.plus(4.1, (copy.plus
                (copy.multiplying(15,7), (copy.power
                        (copy.dividing(28.0,5.0)  , 2)))));

        System.out.printf("%.2f", result1);
        System.out.println();
        System.out.println(copy.getCountOperation());


        System.out.println("_____________CalculatorWithMathExtends____________");
        CalculatorWithCounterAutoAgregationInterface math =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());

        double result2 = math.plus(4.1, (math.plus
                (math.multiplying(15,7), (math.power
                        (math.dividing(28.0,5.0)  , 2)))));

        System.out.printf("%.2f", result2);
        System.out.println();
        System.out.println(math.getCountOperation());

    }
}
