package home_work_3.calcs.additional;

//11. Создать класс CalculatorWithCounterAutoAgregationInterface.
//	11.1 Внутри класса нельзя создавать объекты (использовать new), можно пользоваться только тем,
//	что передал вам пользователь вашего класса.
//	11.2 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
//	11.3 В данном классе должен быть только конструктор принимающий объект типа ICalculator
//	11.4 Данный класс напрямую не умеет считать математику, он умеет делегировать расчёт математики калькулятору
//	который передали в конструктор
//	11.5 В классе должны присутствовать все методы объявленные в интерфейсе.
//	11.6 В классе должен быть метод long getCountOperation() который должен возвращать
//	количество использований данного калькулятора. При вызове данного метода счётчик учёта не увеличивается.
import home_work_3.calcs.api.ICalculator;


public class CalculatorWithCounterAutoAgregationInterface implements ICalculator {
    private long count;
    private ICalculator obj;

    public long getCountOperation() {
        return count;
    }

    public CalculatorWithCounterAutoAgregationInterface(ICalculator obj) {
        this.obj = obj;
    }

    @Override
    public double plus(double x, double y) {
        count++;
        return this.obj.plus(x, y);
    }

    @Override
    public double minus(double x, double y) {
        count++;
        return this.obj.minus(x, y);
    }

    @Override
    public double dividing(double x, double y) {
        count++;
        return this.obj.dividing(x, y);
    }

    @Override
    public double multiplying(double x, double y) {
        count++;
        return this.obj.multiplying(x, y);
    }

    @Override
    public double power(double x, int y) {
        count++;
        return this.obj.power(x, y);
    }

    @Override
    public double absoluteNumber(double x) {
        count++;
        return this.obj.absoluteNumber(x);
    }

    @Override
    public double squareRoot(int x) {
        count++;
        return this.obj.squareRoot(x);
    }
}
