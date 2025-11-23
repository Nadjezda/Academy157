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
    private CalculatorWithOperator calcOper;
    private CalculatorWithMathCopy calcMath;
    private CalculatorWithMathExtends calcExtends;

    public long getCountOperation() {
        return count;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator obj) {
        this.calcOper = obj;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy obj) {
        this.calcMath = obj;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends obj) {
        this.calcExtends = obj;
    }

    public double plus(double a, double b) {
        count++;
        if (calcOper != null) {
            return calcOper.plus(a, b);
        } else if (calcMath != null) {
            return calcMath.plus(a, b);
        } else {
            return calcExtends.plus(a, b);
        }
    }

    public double minus (double a, double b) {
        count++;
        if(calcOper != null) {
            return calcOper.minus(a, b);
        } else if (calcMath != null) {
            return calcMath.minus(a, b);
        } else {
            return calcExtends.minus(a, b);
        }
    }

    public double dividing (double a, double b){
        count++;
        if(calcOper != null) {
            return calcOper.dividing(a, b);
        } else if (calcMath != null) {
            return calcMath.dividing(a, b);
        } else {
            return calcExtends.dividing(a, b);
        }
    }

    public double multiplying (double a, double b){
        count++;
        if(calcOper != null) {
            return calcOper.multiplying(a, b);
        } else if (calcMath != null) {
            return calcMath.multiplying(a, b);
        } else {
            return calcExtends.multiplying(a, b);
        }
    }

    public double power (double a, int b){
        count++;
        if(calcOper != null) {
            return calcOper.power(a, b);
        } else if (calcMath != null) {
            return calcMath.power(a, b);
        } else {
            return calcExtends.power(a, b);
        }
    }

    public double absoluteNumber (double a){
        count++;
        if(calcOper != null) {
            return calcOper.absoluteNumber(a);
        } else if (calcMath != null) {
            return calcMath.absoluteNumber(a);
        } else {
            return calcExtends.absoluteNumber(a);
        }
    }

    public double squareRoot (int a){
        count++;
        if(calcOper != null) {
            return calcOper.squareRoot(a);
        } else if (calcMath != null) {
            return calcMath.squareRoot(a);
        } else {
            return calcExtends.squareRoot(a);
        }
    }
}
