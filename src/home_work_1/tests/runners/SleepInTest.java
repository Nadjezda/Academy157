package home_work_1.tests.runners;

import home_work_1.runners.SleepIn;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SleepInTest {
    @Test
    public void sleepIn() {
        Assertions.assertTrue(SleepIn.sleepIn(false, false));
        Assertions.assertTrue(SleepIn.sleepIn(false, true));
        Assertions.assertFalse(SleepIn.sleepIn(true, false));
        Assertions.assertTrue(SleepIn.sleepIn(true, true));
    }
}
