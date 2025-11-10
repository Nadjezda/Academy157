package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    //6. Создать класс CalculatorWithCounterAutoSuper.
    //	6.1 Все методы и поля объявленные в данном классе НЕ статические (не имеют модификатор static).
    //	6.2 Данный класс наследует класс CalculatorWithMathExtends.
    //	6.3 Данный класс переопределяет все методы полученные в результате наследования и в этих методах
    //	должен быть реализован механизм учёта их использования (учёт общий для всех методов класса),
    //	а вместо реализации математики при помощи ключевого слова super вызывает данный метод у родителя.
    //	Например вызвали метод plus(7, 3) который должен сложить два числа и вернуть результат сложения.
    //	Внутри метода plus() пишем реализацию учета, а после делаем вызов super.plus(7, 3).
    //	Использование super позволит вызвать реализацию из родительского класса.
    //	6.4 В классе должен быть метод long getCountOperation() который должен возвращать количество
    //	использований данного калькулятора. При вызове данного метода счётчик учёта не увеличивается.

    private long count;

    public long getCountOperation(){
        return count;
    }

    public double plus (double a, double b){
        count++;
        return super.plus(a,b);
    }

    public double minus (double a,double b){
        count++;
        return super.minus(a,b);
    }

    public double dividing(double a, double b){
        count ++;
        return super.dividing(a,b);
    }

    public double multiplying(double a, double b){
        count++;
        return super.multiplying(a,b);
    }

    public double power(double a, int b){
        count++;
        return super.power(a,b);
    }

    public double absoluteNumber (double a){
        count++;
        return super.absoluteNumber(a);
    }

    public double squareRoot(int a){
        count++;
        return super.squareRoot(a);
    }
}
