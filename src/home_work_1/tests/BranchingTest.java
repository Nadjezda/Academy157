package home_work_1.tests;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BranchingTest {
    @Test
    public void oddNumber() {
        Assertions.assertEquals(7, home_work_1.Branching4_1.oddNumber(7));
        Assertions.assertEquals(-1, home_work_1.Branching4_1.oddNumber(-1));
        Assertions.assertEquals(0, home_work_1.Branching4_1.oddNumber(6));
        Assertions.assertEquals(0, home_work_1.Branching4_1.oddNumber(-2));
    }

    @Test
    public void middleNumber() {
        Assertions.assertEquals(2, home_work_1.Branching4_2.middleNumber(1, 2, 3));
        Assertions.assertEquals(2, home_work_1.Branching4_2.middleNumber(3, 2, 1));
        Assertions.assertEquals(0, home_work_1.Branching4_2.middleNumber(1, 0, -8));
        Assertions.assertEquals(2, home_work_1.Branching4_2.middleNumber(2, 2, 3));

    }

    @Test
    public void howDividedNumbers() {
        Assertions.assertEquals(5, home_work_1.Branching4_3.howDividedNumbers(10, 2));
        Assertions.assertEquals(0, home_work_1.Branching4_3.howDividedNumbers(0, 10));
        Assertions.assertEquals(-5, home_work_1.Branching4_3.howDividedNumbers(-10, 2));
        Assertions.assertEquals(1, home_work_1.Branching4_3.howDividedNumbers(7, 2));
    }

    @Test
    public void convert() {
        Assertions.assertEquals(1, home_work_1.Branching4_4.convert(1, 1024));
        Assertions.assertEquals(1024, home_work_1.Branching4_4.convert(2, 1));
        Assertions.assertEquals(0, home_work_1.Branching4_4.convert(1, 0));
        Assertions.assertEquals(0, home_work_1.Branching4_4.convert(2, 0));
        Assertions.assertEquals(5.6, home_work_1.Branching4_4.convert(1, 5734.4));
        Assertions.assertEquals(2662.4, home_work_1.Branching4_4.convert(2, 2.6));
        Assertions.assertEquals(0, home_work_1.Branching4_4.convert(0, 1024));
    }

    @Test
    public void ifLetter() {
        Assertions.assertEquals(0, home_work_1.Branching4_5.ifLetter(1));
        Assertions.assertEquals(0, home_work_1.Branching4_5.ifLetter(0));
        Assertions.assertEquals(0, home_work_1.Branching4_5.ifLetter(-1));
        Assertions.assertEquals(1, home_work_1.Branching4_5.ifLetter(97));
        Assertions.assertEquals(1, home_work_1.Branching4_5.ifLetter(90));
    }

    @Test
    public void leapYear() {
        Assertions.assertEquals(1, home_work_1.Branching4_6.leapYear(2000));
        Assertions.assertEquals(0, home_work_1.Branching4_6.leapYear(2100));
        Assertions.assertEquals(1, home_work_1.Branching4_6.leapYear(2024));
        Assertions.assertEquals(0, home_work_1.Branching4_6.leapYear(2019));
    }
}
