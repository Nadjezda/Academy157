package home_work_1.tests.runners;

import home_work_1.runners.Home6Part1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Home6Par1Test {

    private final Home6Part1 whoAreYou = new Home6Part1();
    @Test
    public void welcome(){
        Assertions.assertEquals("Привет. \nЯ тебя так долго ждал.", whoAreYou.welcome("Вася"));
        Assertions.assertEquals("\nЯ тебя так долго ждал.", whoAreYou.welcome("Анастасия"));
        Assertions.assertEquals("Добрый день,а Вы кто?", whoAreYou.welcome("Анна"));
        Assertions.assertEquals("Добрый день,а Вы кто?", whoAreYou.welcome(""));
        Assertions.assertEquals("Добрый день,а Вы кто?", whoAreYou.welcome(null));
    }
}
