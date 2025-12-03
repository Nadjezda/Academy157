package home_work_2.tests.loops;

import home_work_2.loops.For5Part3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class For5Part3Test {
    @Test
    public void powerNumber(){
        Assertions.assertEquals("1889568.0", For5Part3.powerNumber(18,5));
        Assertions.assertEquals("56.25", For5Part3.powerNumber(7.5F,2));
        Assertions.assertEquals("0", For5Part3.powerNumber(0,0));
        Assertions.assertEquals("100.0", For5Part3.powerNumber(100,1));
        Assertions.assertEquals("1", For5Part3.powerNumber(5,0));
        Assertions.assertEquals("отрицательная степень", For5Part3.powerNumber(4,-1));

    }
}
