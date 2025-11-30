package home_work_1.tests;

import home_work_1.HomeIf6_1;
import home_work_1.HomeIf6_2;
import home_work_1.HomeIf6_3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeIfTest {

    private final HomeIf6_1 whoAreYou = new HomeIf6_1();
    @Test
    public void welcome(){
        Assertions.assertEquals("Привет. \nЯ тебя так долго ждал.", whoAreYou.welcome("Вася"));
        Assertions.assertEquals("\nЯ тебя так долго ждал.", whoAreYou.welcome("Анастасия"));
        Assertions.assertEquals("Добрый день,а Вы кто?", whoAreYou.welcome("Анна"));
        Assertions.assertEquals("Добрый день,а Вы кто?", whoAreYou.welcome(""));
        Assertions.assertEquals("Добрый день,а Вы кто?", whoAreYou.welcome(null));
    }
    private final HomeIf6_2 whoAreYou1 = new HomeIf6_2();
    @Test
    public void welcome1(){
        Assertions.assertEquals("Привет. \nЯ тебя так долго ждал.", whoAreYou1.welcome("Вася"));
        Assertions.assertEquals("\nЯ тебя так долго ждал.", whoAreYou1.welcome("Анастасия"));
        Assertions.assertEquals("Добрый день,а Вы кто?", whoAreYou1.welcome("Анна"));
        Assertions.assertEquals("Добрый день,а Вы кто?", whoAreYou1.welcome(""));
        Assertions.assertEquals("Добрый день,а Вы кто?", whoAreYou1.welcome(null));
    }

    private final HomeIf6_3 whoAreYou2 = new HomeIf6_3();
    @Test
    public void welcome2(){
        Assertions.assertEquals("Привет.\nЯ тебя так долго ждал.", whoAreYou2.welcome("Вася"));
        Assertions.assertEquals("\nЯ тебя так долго ждал.", whoAreYou2.welcome("Анастасия"));
        Assertions.assertEquals("Добрый день,а Вы кто?", whoAreYou2.welcome("Анна"));
        Assertions.assertEquals("Добрый день,а Вы кто?", whoAreYou2.welcome(""));
    }

    @Test
    public void welcomNull() {
        Assertions.assertThrows(NullPointerException.class, () -> {
                    whoAreYou2.welcome(null);
                }
        );
    }
}
