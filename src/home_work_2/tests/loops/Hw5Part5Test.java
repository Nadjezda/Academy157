package home_work_2.tests.loops;

import home_work_2.loops.Hw5Part5;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Hw5Part5Test {
    @ParameterizedTest
    @CsvSource({
            "492, 9", "921, 9", "125, 5", "555, 5",
            "0, 0", "-123, 0", "85749992471266, 9"
    })
    public void max(long input, int expected){
        Assertions.assertEquals(expected, Hw5Part5.max(input));
    }
    @Test
    public void probability(){
//нельзя протестировать рандом
    }
    @Test
    public void evenAndOdd() {
        Assertions.assertEquals("even: 4 odd: 6", Hw5Part5.evenAndOdd(1257777248));
        Assertions.assertEquals("even: 3 odd: 3", Hw5Part5.evenAndOdd(123456));
        Assertions.assertEquals("even: 4 odd: 0", Hw5Part5.evenAndOdd(2468));
        Assertions.assertEquals("even: 0 odd: 4", Hw5Part5.evenAndOdd(1357));
        Assertions.assertEquals("even: 0 odd: 0", Hw5Part5.evenAndOdd(0));
        Assertions.assertEquals("even: 0 odd: 0", Hw5Part5.evenAndOdd(-123));
        Assertions.assertEquals("even: 9 odd: 10", Hw5Part5.evenAndOdd(Long.MAX_VALUE));
    }
    @Test
    public void rowFibonachi(){
        Assertions.assertEquals(0, Hw5Part5.rowFibonachi(0));
        Assertions.assertEquals(0, Hw5Part5.rowFibonachi(-1));
        Assertions.assertEquals(1, Hw5Part5.rowFibonachi(1));
        Assertions.assertEquals(2, Hw5Part5.rowFibonachi(2));
        Assertions.assertEquals(3, Hw5Part5.rowFibonachi(3));
        Assertions.assertEquals(8, Hw5Part5.rowFibonachi(5));
        Assertions.assertEquals(7_540_113_804_746_346_429L, Hw5Part5.rowFibonachi(91));
        Assertions.assertEquals(-1, Hw5Part5.rowFibonachi(92));
    }

    @ParameterizedTest
    @CsvSource({
            "1, 10, 0, 0", "-1, 10, 2, 0", "0, 0, 0, 0", "1, 10, 2, 9",
            "3, 15, 4, 15", "5, 20, 5, 20", "7, 1250, 18, 1249"
    })
    public void rowNumbersFromStep(long a,long b, long step, int expected){
        Assertions.assertEquals(expected, Hw5Part5.rowNumbersFromStep(a, b, step));
    }
    @Test
    public void revers(){
        Assertions.assertEquals(54321, Hw5Part5.revers(12345));
        Assertions.assertEquals(12345, Hw5Part5.revers(54321));
        Assertions.assertEquals(5, Hw5Part5.revers(5));
        Assertions.assertEquals(1, Hw5Part5.revers(100));
        Assertions.assertEquals(-321, Hw5Part5.revers(-123));
        Assertions.assertEquals(0, Hw5Part5.revers(0));
    }
}
