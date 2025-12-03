package home_work_1.tests.runners;

import home_work_1.runners.Home6;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Home6Test {

    private final Home6 whoAreYou = new Home6();
    @Test
    public void welcome(){
        Assertions.assertEquals("Привет. \nЯ тебя так долго ждал.", whoAreYou.welcome("Вася"));
        Assertions.assertEquals("\nЯ тебя так долго ждал.", whoAreYou.welcome("Анастасия"));
        Assertions.assertEquals("Добрый день,а Вы кто?", whoAreYou.welcome("Анна"));
        Assertions.assertEquals("Добрый день,а Вы кто?", whoAreYou.welcome(""));
        Assertions.assertEquals("Добрый день,а Вы кто?", whoAreYou.welcome(null));
    }
}
