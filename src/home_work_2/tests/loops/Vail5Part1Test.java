package home_work_2.tests.loops;

import home_work_2.loops.Vail5Part1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Vail5Part1Test {

    @Test
    public void factorial() {
        Assertions.assertEquals(120, Vail5Part1.factiorial(5));
        Assertions.assertEquals(0, Vail5Part1.factiorial(20));
        Assertions.assertEquals(0, Vail5Part1.factiorial(0));
        Assertions.assertEquals(0, Vail5Part1.factiorial(-1));
    }
}
