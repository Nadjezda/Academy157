package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {
    //2. Создать класс CalculatorWithOperator.
	//2.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
    //2.2 В классе должны присутствовать математические методы:
    //2.2.1 4 базовых математических метода (деление, умножение, вычитание, сложение)
    // каждый из этих методов должен принимать два параметра (определитесь с их типами)
    // и должны возвращать результат (определиться с возвращаемым типом результата) при помощи ключевого слово return.
    //2.2.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Квадратный корень из числа).
    //2.3 В методах можно использовать любые арифметические операторы.
	//2.4 Использование библиотеки Math ЗАПРЕЩЕНО! (кроме извлечения корня). Если у Вас плохо с математикой,
    // то для реализации метода "Квадратный корень из числа" можно воспользоваться библиотекой Math.

    public double plus (double a, double b){
        return a + b;
    }
    public double minus (double a,double b){
        return a - b;
    }
    public double dividing(double a, double b){
        return a / b;
    }
    public double multiplying(double a, double b){
        return a * b;
    }
    public void printf(double a){
        System.out.printf("%.2f", a);
    }
    public double power(double a, int b){
        double exponentResult = 1;

        while (b >0) {
            exponentResult *= a;
            b--;
        }
            return exponentResult;
    }
    public double absoluteNumber (double a){
        if(a < 0){
            return -a;
        }else{
            return a;
        }
    }
    public double squareRoot(int a) {
        double tmp;
        double approxiInitial = a / 2;
        do {
            tmp = approxiInitial;
            approxiInitial = (tmp + (a / tmp)) / 2;
        } while ((tmp - approxiInitial) != 0);
        return approxiInitial;
    }
    public int remainderOfDivision (int a, int b){
    int result = a % b;
    return result;
}
}