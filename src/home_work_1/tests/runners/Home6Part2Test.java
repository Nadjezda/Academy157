package home_work_1.tests.runners;

import home_work_1.runners.Home6Part2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Home6Part2Test {

    private final Home6Part2 whoAreYou = new Home6Part2();

    @Test
    public void welcome() {
        Assertions.assertEquals("Привет.\nЯ тебя так долго ждал.", whoAreYou.welcome("Вася"));
        Assertions.assertEquals("\nЯ тебя так долго ждал.", whoAreYou.welcome("Анастасия"));
        Assertions.assertEquals("Добрый день,а Вы кто?", whoAreYou.welcome("Анна"));
        Assertions.assertEquals("Добрый день,а Вы кто?", whoAreYou.welcome(""));
    }

    @Test
    public void nullWelcome() {
        Assertions.assertThrows(NullPointerException.class, () -> {
                    whoAreYou.welcome(null);
                }
        );
    }
}