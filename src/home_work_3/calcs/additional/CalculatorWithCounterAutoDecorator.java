package home_work_3.calcs.additional;

//13*. Создать класс CalculatorWithCounterAutoDecorator и CalculatorWithMemoryDecorator
//	13.1 Отличие от предыдущих CalculatorWithCounterAutoAgregationInterface и
//	CalculatorWithMemory в том что данные классы будут реализовывать интерфейс ICalculator.
//	13.2 Данный подход позволяет назвать данный классы "Декораторами"
//	13.4 Добавить в эти классы метод ICalculator getCalculator() который будут
//	возвращать вложенный в них калькулятор.

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoDecorator implements ICalculator {

    private final ICalculator calculator;
    private long count;

    public long getCount() {
        return count;
    }

    public ICalculator getCalculator() {
        return calculator;
    }

    public CalculatorWithCounterAutoDecorator(ICalculator calculator){
        this.calculator = calculator;
    }

    @Override
    public double squareRoot(int x) {
        count++;
        return this.calculator.squareRoot(x);
    }

    @Override
    public double absoluteNumber(double x) {
        count++;
        return this.calculator.absoluteNumber(x);
    }

    @Override
    public double power(double x, int y) {
        count++;
        return this.calculator.power(x, y);
    }

    @Override
    public double multiplying(double x, double y) {
        count++;
        return this.calculator.multiplying(x, y);
    }

    @Override
    public double dividing(double x, double y) {
        count++;
        return this.calculator.dividing(x, y);
    }

    @Override
    public double minus(double x, double y) {
        count++;
        return this.calculator.minus(x, y);
    }

    @Override
    public double plus(double x, double y) {
        count++;
        return this.calculator.plus(x, y);
    }
}
