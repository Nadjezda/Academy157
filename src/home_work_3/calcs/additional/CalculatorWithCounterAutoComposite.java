package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
//7. Создать класс CalculatorWithCounterAutoComposite.
//	7.1 Все методы и поля объявленные в данном классе НЕ статические (не имеют модификатор static).
//	7.2 Внутри класса мы должны создавать поле хранящее объект класса калькулятор.
//	Для примера можно использовать любой тип калькулятора. Я возьму для примера CalculatorWithMathCopy
//	7.3 Инициализировать данное поле созданным (использовать new) внутри данного класса объектом калькулятора.
//	7.4 Данный класс напрямую не умеют считать математику, он умеют делегировать расчёт математики
//	калькулятору который сохранён в его поле.
//	7.5 В классах должны присутствовать математические методы:
//		7.5.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
//		7.5.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
//	7.6 В классе должен быть метод long getCountOperation() который должен возвращать количество
//	использований данного калькулятора. При вызове данного метода счётчик учёта не увеличивается.

public class CalculatorWithCounterAutoComposite {
    private CalculatorWithMathCopy calculatorMath = new CalculatorWithMathCopy();
    private long count;

    public long getCountOperation(){
        return count;
    }

    public double plus (double a, double b){
        count++;
        return calculatorMath.plus(a, b);
    }

    public double minus (double a, double b){
        count++;
        return calculatorMath.minus(a, b);
    }

    public double dividing (double a, double b){
        count++;
        return calculatorMath.dividing(a, b);
    }

    public double multiplying (double a, double b){
        count++;
        return calculatorMath.multiplying(a, b);
    }

    public double power (double a, int b){
        count++;
        return calculatorMath.power(a, b);
    }

    public double absoluteNumber(double a){
        count++;
        return calculatorMath.absoluteNumber(a);
    }

    public double squareRoot(int a){
        count++;
        return calculatorMath.squareRoot(a);
    }
    }

