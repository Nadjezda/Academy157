package home_work_3.calcs.additional;

//8. Создать класс CalculatorWithCounterAutoAgregation.
//	8.1 Все методы и поля объявленные в данном классе НЕ статические (не имеют модификатор static).
//	8.2 Внутри класса мы должны создавать поле хранящее объект класса калькулятор.
//	Для примера можно использовать любой тип калькулятора. Я возьму для примера CalculatorWithMathCopy
//	8.3 Для инициализации данного поля требуется использовать конструктор в который будут передавать CalculatorWithMathCopy.
//	8.4 Данный класс напрямую не умеют считать математику, он умеют делегировать расчёт математики калькулятору
//	который сохранён в его поле.
//	8.5 В классах должны присутствовать математические методы:
//		8.5.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
//		8.5.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
//	8.6 В классе должен быть метод long getCountOperation() который должен возвращать количество
//	использований данного калькулятора. При вызове данного метода счётчик учёта не увеличивается.

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoAgregation {

    private CalculatorWithMathCopy calculatorMath;
    private long count;

    public long getCountOperation(){
        return count;
    }

    public CalculatorWithCounterAutoAgregation(){
        calculatorMath = new CalculatorWithMathCopy();
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

    public double absoluteNumber (double a){
        count++;
        return calculatorMath.absoluteNumber(a);
    }

    public double squareRoot (int a){
        count++;
        return calculatorMath.squareRoot(a);
    }
}
