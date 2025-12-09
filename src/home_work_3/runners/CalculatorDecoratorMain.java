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
import home_work_3.calcs.additional.CalculatorWithCounterClassic;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorDecoratorMain {

    public static void main(String[] args) {
        ICalculator calc = new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator
                (new CalculatorWithMathExtends()));

        double result = calc.plus(4.1, (calc.plus
                (calc.multiplying(15, 7), (calc.power
                        (calc.dividing(28.0, 5.0), 2)))));

        System.out.printf("%.2f", result);
        System.out.println();
        // принудительное приведение типов именно к этому т.к. метод getCount есть только у него
        System.out.println(calc.getClass());
        System.out.println(((CalculatorWithCounterAutoDecorator) calc).getCount());
        // дальше будем "разворачивать"
        //13.7** Получить перечисленные далее сведения требуется из калькулятора который
        // вам вернёт метод getCalculator(). Данный пункт вам очень поможет выполнить
        //оператор instanceof который нужно использовать в main.

        CalculatorWithCounterAutoDecorator oneDecorMinus = (CalculatorWithCounterAutoDecorator) calc;

        ICalculator tmp1 = oneDecorMinus.getCalculator();
        if (tmp1 instanceof CalculatorWithMemoryDecorator) {
            System.out.println("Внутри CalculatorWithMemoryDecorator");
        }
        //		13.7.1 Выполнить метод сохранения последнего расчёта и вывести сохранённое значение.
        CalculatorWithMemoryDecorator twoDecorMinus = (CalculatorWithMemoryDecorator) tmp1;
        twoDecorMinus.save(result);
        System.out.println(twoDecorMinus.load());
       // 13.7.2 Изменить calc путём изменения создаваемого экземпляра на CalculatorWithCounterClassic.
        // Сделать выводы в комментариях зачем нужен instanceof

        calc = new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithCounterClassic()));
    //Вывод: мы можем обернуть в декораторы любой калькулятор, который реализует интерфейс ICalculator.
        // Но для того чтобы пользоваться методами вложенных калькуляторов необходимо сделать принудительное приведение типов.
        // А если делать такое приведение не проверяя к какому классу относиться объект получим ошибку ClassCastException.


    }
}
