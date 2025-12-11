package home_work_5.tests;

import home_work_5.seachers.EasySearch;
import home_work_5.seachers.SearchEngineDecorator;
import home_work_5.seachers.api.ISearchEngine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SearchEngineDecoratorTest {

    ISearchEngine es = new EasySearch();
    ISearchEngine esDecorated = new SearchEngineDecorator(es);

    @Test
    @DisplayName("Проверяем слово учить")
    public void search() {
        Assertions.assertEquals(4,
                esDecorated.search(" Учить Учить и еще раз учить учить ", " учить "));
    }

    @Test
    @DisplayName("Проверяем слово мел")
    public void search1() {
        Assertions.assertEquals(2,
                esDecorated.search("Мел мелованный этим мелом, мел смел и мелок.", " мел "));
    }

    @Test
    @DisplayName("Проверяем слово как")
    public void seache2() {
        Assertions.assertEquals(2,
                esDecorated.search("Как-то было это так, как, как-то как.", " как "));
    }

    @Test
    @DisplayName("Проверяем слово Как")
    public void seache3() {
        Assertions.assertEquals(2,
                esDecorated.search("Как-то было это так, как, как-то как.", " Как "));
    }
    @Test
    @DisplayName("Проверяем слово как-то")
    public void seache4() {
        Assertions.assertEquals(2,
                esDecorated.search("Как-то было это так, как, как-то как.", " как-то "));
    }
    @Test
    @DisplayName("Проверяем как.")
    public void seache5() {
        Assertions.assertEquals(0,
                esDecorated.search("Как-то было это так, как, как-то как.", " как. "));
    }


    @Test
    @DisplayName("Проверяем на слова")
    public void searchAll (){
        Assertions.assertEquals(1, esDecorated.search("привет, как дела!", " как "));
        Assertions.assertEquals(0, esDecorated.search("привет,какдела!", " как "));
        Assertions.assertEquals(0, esDecorated.search("привет;какдела!", " как "));
        Assertions.assertEquals(0, esDecorated.search("привет;какдела!", " как "));
        Assertions.assertEquals(1, esDecorated.search("как дела!.Что делаешь?", " как "));
        Assertions.assertEquals(0, esDecorated.search("Привет-привет", " привет "));
        Assertions.assertEquals(1, esDecorated.search("Привет -привет", " -привет "));
        Assertions.assertEquals(2, esDecorated.search("Привет - привет", " привет "));
        Assertions.assertEquals(0, esDecorated.search("4-x", " -х "));
        Assertions.assertEquals(1, esDecorated.search("один и 1", " 1 "));
        Assertions.assertEquals(1, esDecorated.search("бабушка бабушке бабушку", " бабушка "));
        Assertions.assertEquals(1, esDecorated.search("123-456,789!", " 789 "));
        Assertions.assertEquals(1, esDecorated.search("This--is a test--string!", " a "));
        Assertions.assertEquals(11, esDecorated.search("!@#$%^&*()", " "));
        Assertions.assertEquals(0, esDecorated.search("", " а "));
        Assertions.assertEquals(6, esDecorated.search("     ", " "));
        Assertions.assertEquals(1, esDecorated.search("A1, B2. C3!", " a1 "));
        Assertions.assertEquals(-1, esDecorated.search("A1, B2. C3!", null));
        Assertions.assertEquals(-1, esDecorated.search(null, " A1 "));
        Assertions.assertEquals(-1, esDecorated.search(null, null));

    }
}
