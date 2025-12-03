package home_work_2.tests.loops;

import home_work_2.loops.Overflow5Part4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Overflow5Part4Test {

    @Test
    public void overflow(){
        Assertions.assertEquals(4_052_555_153_018_976_267L,
                Overflow5Part4.overflow(new long[42],1L,3));
        Assertions.assertEquals(1_560_496_482_665_168_896L,
                Overflow5Part4.overflow(new long[42],1L,188));
        Assertions.assertEquals(4_611_686_014_132_420_609L,
                Overflow5Part4.overflow(new long[42],1L,Integer.MAX_VALUE));
        Assertions.assertEquals(799_006_685_782_884_121L,
                Overflow5Part4.overflow(new long[42],1L,-19));
        Assertions.assertEquals(4_611_686_018_427_387_904L,
                Overflow5Part4.overflow(new long[42],-15L,4));
        Assertions.assertEquals(0,
                Overflow5Part4.overflow(new long[42],0L,4));
        Assertions.assertEquals(0,
                Overflow5Part4.overflow(new long[42],1L,0));

    }
}
