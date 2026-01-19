package home_work_1.tests.runners;

import home_work_1.runners.SleepOrGo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class SleepOrGoTest {
    @Test
    public void OnVacation() {
        Assertions.assertTrue(SleepOrGo.OnVacation("да"));
        Assertions.assertFalse(SleepOrGo.OnVacation("нет"));
    }
    @Test
    public void dayOfWeek() {
        Assertions.assertTrue(SleepOrGo.dayOfWeek("вторник"));
        Assertions.assertFalse(SleepOrGo.dayOfWeek("суббота"));
    }
    @Test
    void OnVacationThrow() {
        try {
            SleepOrGo.OnVacation(",jhgxd");
            fail("Ожидалось, что метод выбросит исключение, но не выбросил."); // Если до этой строки дошли, тест падает
        } catch (IllegalArgumentException e) {
            // Исключение нужного типа поймано, проверяем его свойства
            assertEquals("Введенное слово не соответсвует слову 'да' или 'нет'", e.getMessage());
        } catch (Exception e) {
            // Если поймали исключение другого типа - тест падает
            fail("Выброшено исключение неверного типа: " + e.getClass().getName());
        }
    }
    @Test
    void dayOfWeekThrow() {
        try {
            SleepOrGo.dayOfWeek(",jhgxd");
            fail("Ожидалось, что метод выбросит исключение, но не выбросил."); // Если до этой строки дошли, тест падает
        } catch (IllegalArgumentException e) {
            // Исключение нужного типа поймано, проверяем его свойства
            assertEquals("Нет такого дня недели.", e.getMessage());
        } catch (Exception e) {
            // Если поймали исключение другого типа - тест падает
            fail("Выброшено исключение неверного типа: " + e.getClass().getName());
        }
    }
}

