package home_work_3.calcs.additional;

//9. Создать класс CalculatorWithCounterAutoChoiceAgregation.
//	9.1 Все методы объявленные в данных классах НЕ статические (не имеют модификатор static).
//	9.2 В данном классе должны быть следующие варианты конструктора:
//		9.2.1 Принимающий объект типа CalculatorWithOperator
//		9.2.2 Принимающий объект типа CalculatorWithMathCopy
//		9.2.3 Принимающий объект типа CalculatorWithMathExtends
//	9.4 Данные класс также не умеет напрямую считать математику, они умеют делегировать расчёт математики калькулятору
//	который передали в конструктор.
//	9.5 В классах должны присутствовать математические методы:
//		9.5.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
//		9.5.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
//	9.6 В классе должен быть метод long getCountOperation() который должен возвращать количество использований
//	данного калькулятора. При вызове данного метода счётчик учёта не увеличивается.

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {

    private long count;

    public long getCountOperation() {
        return count;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator obj) {
        obj = new CalculatorWithOperator();
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy obj) {
        obj = new CalculatorWithMathCopy();
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends obj) {
        obj= new CalculatorWithMathExtends();
    }

    public double plus(CalculatorWithOperator calculator, double a, double b) {
        count++;
        return calculator.plus(a, b);
    }

    public double plus(CalculatorWithMathCopy calculator, double a, double b) {
        count++;
        return calculator.plus(a, b);
    }

    public double plus(CalculatorWithMathExtends calculator, double a, double b) {
        count++;
        return calculator.plus(a, b);
    }

    public double minus (CalculatorWithOperator calculator, double a, double b){
        count++;
        return calculator.minus(a, b);
    }

    public double minus (CalculatorWithMathCopy calculator, double a, double b){
        count++;
        return calculator.minus(a, b);
    }

    public double minus (CalculatorWithMathExtends calculator, double a, double b){
        count++;
        return calculator.minus(a, b);
    }

    public double dividing (CalculatorWithOperator calculator, double a, double b){
        count++;
        return calculator.dividing(a, b);
    }

    public double dividing (CalculatorWithMathCopy calculator, double a, double b){
        count++;
        return calculator.dividing(a, b);
    }

    public double dividing (CalculatorWithMathExtends calculator, double a, double b){
        count++;
        return calculator.dividing(a, b);
    }

    public double multiplying (CalculatorWithOperator calculator, double a, double b){
        count++;
        return calculator.multiplying(a, b);
    }

    public double multiplying (CalculatorWithMathCopy calculator, double a, double b){
        count++;
        return calculator.multiplying(a, b);
    }

    public double multiplying (CalculatorWithMathExtends calculator, double a, double b){
        count++;
        return calculator.multiplying(a, b);
    }

    public double power (CalculatorWithOperator calculator, double a, int b){
        count++;
        return calculator.power(a, b);
    }

    public double power (CalculatorWithMathCopy calculator, double a, int b){
        count++;
        return calculator.power(a, b);
    }

    public double power (CalculatorWithMathExtends calculator, double a, int b){
        count++;
        return calculator.power(a, b);
    }

    public double absoluteNumber (CalculatorWithOperator calculator, double a){
        count++;
        return calculator.absoluteNumber(a);
    }

    public double absoluteNumber (CalculatorWithMathCopy calculator, double a){
        count++;
        return calculator.absoluteNumber(a);
    }

    public double absoluteNumber (CalculatorWithMathExtends calculator, double a){
        count++;
        return calculator.absoluteNumber(a);
    }

    public double squareRoot (CalculatorWithOperator calculator, int a){
        count++;
        return calculator.squareRoot(a);
    }

    public double squareRoot (CalculatorWithMathCopy calculator, int a){
        count++;
        return calculator.squareRoot(a);
    }

    public double squareRoot (CalculatorWithMathExtends calculator, int a){
        count++;
        return calculator.squareRoot(a);
    }
}
