package home_work_1.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SleepInTest {
    @Test
    public void sleepIn() {
        Assertions.assertTrue(home_work_1.SleepIn.sleepIn(false, false));
        Assertions.assertTrue(home_work_1.SleepIn.sleepIn(false, true));
        Assertions.assertFalse(home_work_1.SleepIn.sleepIn(true, false));
        Assertions.assertTrue(home_work_1.SleepIn.sleepIn(true, true));
    }
}
