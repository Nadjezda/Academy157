package home_work_3.tests.calcs.simple;

import home_work_3.calcs.simple.CalculatorWithMathExtends;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorWithMathExtendsTest {

    CalculatorWithMathExtends calculator = new CalculatorWithMathExtends();

    @ParameterizedTest
    @CsvSource({
            "25, 5.0", "0, 0.0",
            "225, 15.0", "-8, NaN"
    })
    void testSquareRoot(int a, double expected) {
        double result = calculator.squareRoot(a);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "2.0, 3, 8.0", "5.0, 0, 1.0",
            "0.0, 5, 0.0", "2.0,-1, 0.5",
            "-2.0, 1, -2", " -2, 3, -8"
    })
    void testPower(double a, int b, double expected) {
        double result = calculator.power(a, b);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "-2.0, 2.0" , "1.0, 1.0",  "0.0, 0.0"
    })
    void testAbsoluteNumber(double a, double expected) {
        double result = calculator.absoluteNumber(a);
        Assertions.assertEquals(expected, result);
    }
}
