package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {
   // 3. Создать класс CalculatorWithMathCopy.
   // 3.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
   //3.2 В классе должны присутствовать математические методы:
   //3.2.1 4 базовых математических метода (деление, умножение, вычитание, сложение). Скопировать базовые математические
    // операции из CalculatorWithOperator.
   //3.2.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
    // Данные методы должны содержать в своём теле вызов библиотеки Math и возврат полученного результата.

    public double plus(double a, double b) {
        return a + b;
    }

    public double minus(double a, double b) {
        return a - b;
    }

    public double dividing(double a, double b) {
        return a / b;
    }

    public double multiplying(double a, double b) {
        return a * b;
    }

    public void printf(double a) {
        System.out.printf("%.2f", a);
    }

    public double absoluteNumber (double a) {
        return Math.abs(a);
    }
    public double power (double a, int b){
        return Math.pow(a,b);
    }
    public double squareRoot (int a){
        return Math.sqrt(a);
        }
    }
