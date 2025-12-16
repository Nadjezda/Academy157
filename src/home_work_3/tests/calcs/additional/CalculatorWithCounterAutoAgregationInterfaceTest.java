package home_work_3.tests.calcs.additional;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorWithCounterAutoAgregationInterfaceTest {

    CalculatorWithCounterAutoAgregationInterface calculator =
            new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());

    @Test
    void testPlus() {
        Assertions.assertEquals(5.0, calculator.plus(2.0, 3.0), "2 + 3 должно быть 5");
        Assertions.assertEquals(-1.0, calculator.plus(-2.0, 1.0), "−2 + 1 должно быть −1");
        Assertions.assertEquals(0.0, calculator.plus(0.0, 0.0), "0 + 0 должно быть 0");
    }

    @Test
    void testMinus() {
        Assertions.assertEquals(-1.0, calculator.minus(2.0, 3.0), "2 - 3 должно быть −1");
        Assertions.assertEquals(-3.0, calculator.minus(-2.0, 1.0), "−2 - 1 должно быть −3");
        Assertions.assertEquals(0.0, calculator.minus(0.0, 0.0), "0 - 0 должно быть 0");
    }

    @Test
    void testDividing() {
        Assertions.assertEquals(2.0, calculator.dividing(6.0, 3.0), "6 / 3 должно быть 2");
        Assertions.assertEquals(-2.0, calculator.dividing(-6.0, 3.0), "−6 / 3 должно быть −2");
        Assertions.assertEquals(Double.POSITIVE_INFINITY, calculator.dividing(1.0, 0.0), "деление double на ноль в Java возвращает ±Infinity");

    }


    @Test
    void testMultiplying() {
        Assertions.assertEquals(6.0, calculator.multiplying(2.0, 3.0), "2 * 3 должно быть 6");
        Assertions.assertEquals(-2.0, calculator.multiplying(-2.0, 1.0), "−2 * 1 должно быть −2");
        Assertions.assertEquals(0.0, calculator.multiplying(0.0, 5.0), "0 * 5 должно быть 0");
    }

    @Test
    void testAbsoluteNumber() {
        Assertions.assertEquals(3.0, calculator.absoluteNumber(-3.0), "Абсолютное значение −3 должно быть 3");
        Assertions.assertEquals(0.0, calculator.absoluteNumber(0.0), "Абсолютное значение 0 должно быть 0");
        Assertions.assertEquals(3.0, calculator.absoluteNumber(3.0), "Абсолютное значение 3 должно быть 3");
    }

    @Test
    void testPower() {
        Assertions.assertEquals(8.0, calculator.power(2.0, 3), "2^3 должно быть 8");
        Assertions.assertEquals(1.0, calculator.power(5.0, 0), "любое число в степени 0 равно 1");
        Assertions.assertEquals(0.0, calculator.power(0.0, 5), "0^5 равно 0");
        Assertions.assertEquals(16.0, calculator.power(4.0, 2), "4^2 равно 16");
    }
    @ParameterizedTest
    @CsvSource({
            "25, 5.0" , "0, 0.0",
            "225, 15.0" ,  "-8, NaN"
    })
    void testSquareRoot(int a, double expected) {
        double result = calculator.squareRoot(a);
        Assertions.assertEquals(expected, result);
    }
}

