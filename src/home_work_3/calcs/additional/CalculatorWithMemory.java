package home_work_3.calcs.additional;

//12*. Создать CalculatorWithMemory используя аналогичные принципы построения класса
// CalculatorWithCounterAutoAgregationInterface.
//	12.1 Данный калькулятор предназначен для того чтобы расширить возможности калькулятора
//	и обеспечить его дополнительной функцией памяти. В принципе работает как калькулятор из реальной жизни.
//	12.2 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
//	12.3 В данном классе должен быть только конструктор принимающий объект типа ICalculator
//	12.4 Данный класс напрямую не умеет считать математику, он умеет делегировать расчёт математики калькулятору
//	который передали в конструктор
//	12.5 В классе должны присутствовать математические методы:
//		12.5.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
//		12.5.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
//	12.6 Функция памяти работает через методы:
//		12.6.1 Записать в память результат выполнения последнего вызванного метода.
//		У данного метода не должно быть параметров. Данный метод вызывается непосредтвенно пользователем,
//		а не автоматический. Пример void save();
//		12.6.2 Получить из памяти записанное значение. При получении записи из памяти память стирается,
//		при записи нового значения память перезаписывается. Данный метод вызывается непосредтвенно пользователем,
//		а не автоматический. Пример double load();
//	12.7 В этом калькуляторе НЕТ ФУНКЦИИ ПОДСЧЁТА количества использований

import home_work_3.calcs.api.ICalculator;


public class CalculatorWithMemory implements ICalculator{
    private ICalculator obj;
    private double result;

    public double load() {
        return result;
    }

    public void save(){
        this.result = result;
    }

    public CalculatorWithMemory (ICalculator obj){
        this.obj = obj;
    }

    @Override
    public double plus(double x, double y) {
        return result = this.obj.plus(x, y);
    }

    @Override
    public double minus(double x, double y) {
        return result = this.obj.minus(x, y);
    }

    @Override
    public double dividing(double x, double y) {
        return result = this.obj.dividing(x, y);
    }

    @Override
    public double multiplying(double x, double y) {
        return result = this.obj.multiplying(x, y);
    }

    @Override
    public double power(double x, int y) {
        return result = this.obj.power(x, y);
    }

    @Override
    public double absoluteNumber(double x) {
        return result = this.obj.absoluteNumber(x);
    }

    @Override
    public double squareRoot(int x) {
        return result = this.obj.squareRoot(x);
    }
}
