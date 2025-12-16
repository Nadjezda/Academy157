package home_work_3.calcs.additional;

//13*. Создать класс CalculatorWithCounterAutoDecorator и CalculatorWithMemoryDecorator
//	13.1 Отличие от предыдущих CalculatorWithCounterAutoAgregationInterface и
//	CalculatorWithMemory в том что данные классы будут реализовывать интерфейс ICalculator.
//	13.2 Данный подход позволяет назвать данный классы "Декораторами"
//	13.4 Добавить в эти классы метод ICalculator getCalculator() который будут
//	возвращать вложенный в них калькулятор.

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemoryDecorator implements ICalculator {


    private final ICalculator calculator;
    private double result;

    public double load() {
        return result;
    }

    public void save(double result){
        this.result = result;
    }

    public ICalculator getCalculator(){
        return calculator;
    }

    public CalculatorWithMemoryDecorator (ICalculator calculator){
        this.calculator = calculator;
    }

    @Override
    public double squareRoot(int x) {
        return this.calculator.squareRoot(x);
    }

    @Override
    public double absoluteNumber(double x) {
        return this.calculator.absoluteNumber(x);
    }

    @Override
    public double power(double x, int y) {
        return this.calculator.power(x, y);
    }

    @Override
    public double multiplying(double x, double y) {
        return this.calculator.multiplying(x, y);
    }

    @Override
    public double dividing(double x, double y) {
        return this.calculator.dividing(x, y);
    }

    @Override
    public double minus(double x, double y) {
        return this.calculator.minus(x, y);
    }

    @Override
    public double plus(double x, double y) {
        return this.calculator.plus(x, y);
    }
}
