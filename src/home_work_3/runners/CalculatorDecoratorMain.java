package home_work_3.runners;

//13.5 Создать класс CalculatorDecoratorMain в котором будет точка входа (main метод).
// Cоздать переменную, типа ICalculator calc, записав в неё новый экземпляр класса
// CalculatorWithCounterAutoDecorator, которому в конструктор был передан новый
// экземпляр класса CalculatorWithMemoryDecorator, которому в конструтор был передан
// новый экземпляр класса CalculatorWithMathExtends. Используя созданную переменную посчитать
// выражения из задания 1) 4.1 + 15 * 7 + (28 / 5) ^ 2.
// Вывести в консоль.
//	13.6 Вывести количество использований калькулятора.

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorDecoratorMain {
    private long count;

    public long getCount(){return count;}
    public static void main(String[] args) {
        ICalculator calc = new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator
                (new CalculatorWithMathExtends()));

        double result = calc.plus(4.1, (calc.plus
                (calc.multiplying(15,7), (calc.power
                        (calc.dividing(28.0,5.0)  , 2)))));

        System.out.printf("%.2f", result);
        System.out.println();
        System.out.println(((CalculatorWithCounterAutoDecorator)calc).getCount());
    }
}
