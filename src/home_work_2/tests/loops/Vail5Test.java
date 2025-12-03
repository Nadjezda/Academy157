package home_work_2.tests.loops;

import home_work_2.loops.Vail5;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Vail5Test {

    @Test
    public void factorial(){
        Assertions.assertEquals("Переполнение", Vail5.factiorial(20));
        Assertions.assertEquals(" = 121645100408832000", Vail5.factiorial(19));
        Assertions.assertEquals(" = 120", Vail5.factiorial(5));
        Assertions.assertEquals(" = 1", Vail5.factiorial(0));
        Assertions.assertEquals(" = 1", Vail5.factiorial(-1));
    }
}
