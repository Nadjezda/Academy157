package home_work_5.tests;

import home_work_5.seachers.RegExSearch;
import home_work_5.seachers.SearchEngineDecorator;
import home_work_5.seachers.api.ISearchEngine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SearchEngineDecoratorRedTest {
    ISearchEngine re = new RegExSearch();
    ISearchEngine search = new SearchEngineDecorator(re);

    @Test
    @DisplayName("Проверяем слово учить")
    public void search() {
        Assertions.assertEquals(4,
                search.search("Учить. Учить! И еще раз учить, учить?", "учить"));
    }

    @Test
    @DisplayName("Проверяем слово мел")
    public void search1() {
        Assertions.assertEquals(2,
                search.search("Мел мелованный этим мелом, мел смел и мелок.", "мел"));
    }

    @Test
    @DisplayName("Проверяем слово как")
    public void seache2() {
        Assertions.assertEquals(2,
                search.search("Как-то было это так, как, как-то как.", "как"));
    }

    @Test
    @DisplayName("Проверяем слово Как")
    public void seache3() {
        Assertions.assertEquals(2,
                search.search("Как-то было это так, как, как-то как.", "Как"));
    }
    @Test
    @DisplayName("Проверяем слово как-то")
    public void seache4() {
        Assertions.assertEquals(2,
                search.search("Как-то было это так, как, как-то как.", "как-то"));
    }



    @Test
    @DisplayName("Проверяем на слова")
    public void searchAll (){
        Assertions.assertEquals(1, search.search("привет, как дела!", "как"));
        Assertions.assertEquals(0, search.search("привет,какдела!", "как"));
        Assertions.assertEquals(0, search.search("привет;какдела!", "как"));
        Assertions.assertEquals(0, search.search("привет;какдела!", "как"));
        Assertions.assertEquals(1, search.search("как дела!.Что делаешь?", "как"));
        Assertions.assertEquals(2, search.search("Привет - привет", "привет"));
        Assertions.assertEquals(1, search.search("Привет -привет", "-привет"));
        Assertions.assertEquals(0, search.search("4-x", "-х"));
        Assertions.assertEquals(1, search.search("один и 1", "1"));
        Assertions.assertEquals(1, search.search("бабушка бабушке бабушку", "бабушка"));
        Assertions.assertEquals(1 ,search.search("123-456,789!", "789"));
        Assertions.assertEquals(1, search.search("This--is a test--string!", "a"));
        Assertions.assertEquals(3, search.search("!@#$%^&*()", " "));
        Assertions.assertEquals(0, search.search("", "а"));
        Assertions.assertEquals(2, search.search("     ", " "));
        Assertions.assertEquals(1, search.search("A1, B2. C3!", "A1"));
        Assertions.assertEquals(-1, search.search("This--is a test--string!", null));
        Assertions.assertEquals(-1, search.search(null, "a"));
        Assertions.assertEquals(-1, search.search(null, null));
    }
}
