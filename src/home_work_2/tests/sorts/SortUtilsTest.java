package home_work_2.tests.sorts;

import home_work_2.utils.SortsUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//Протестировать класс SortsUtils из задания 4, добавить класс для тестов протестировать примерами из задания и своими примерами обязательно.

public class SortUtilsTest {

    SortsUtils sorter = new SortsUtils();


    @Test
    public void sort(){
        Assertions.assertEquals("[]", sorter.sort(new int []{}));
        Assertions.assertEquals("[1, 2, 3, 4, 5, 6]", sorter.sort(new int []{1,2,3,4,5,6}));
        Assertions.assertEquals("[1, 2, 3, 4, 5, 6]", sorter.sort(new int []{6,5,4,3,2,1}));
        Assertions.assertEquals("[1, 1, 1, 1]", sorter.sort(new int []{1,1,1,1}));
        Assertions.assertEquals("[1, 5, 9, 9, 9, 99]", sorter.sort(new int []{9,1,5,99,9,9}));
        Assertions.assertEquals("[5]", sorter.sort(new int []{5}));
        Assertions.assertEquals("[1, 2, 3, 4, 5]", sorter.sort(new int []{3,1,4,2,5}));
        Assertions.assertEquals("[1, 2, 2, 3, 3]", sorter.sort(new int []{2,3,2,1,3}));
        Assertions.assertEquals("[-3, -2, -1, 0, 2]", sorter.sort(new int []{-3,-1,-2,0,2}));
        Assertions.assertEquals("[-2147483648, -987654321, 0, 123456789, 2147483647]",
                sorter.sort(new int []{Integer.MAX_VALUE, Integer.MIN_VALUE, 0, -987_654_321, 123_456_789}));
    }

    @Test
    public void shake(){
        Assertions.assertEquals("[]", sorter.shake(new int []{}));
        Assertions.assertEquals("[1, 2, 3, 4, 5, 6]", sorter.shake(new int []{1,2,3,4,5,6}));
        Assertions.assertEquals("[1, 2, 3, 4, 5, 6]", sorter.shake(new int []{6,5,4,3,2,1}));
        Assertions.assertEquals("[1, 1, 1, 1]", sorter.shake(new int []{1,1,1,1}));
        Assertions.assertEquals("[1, 5, 9, 9, 9, 99]", sorter.shake(new int []{9,1,5,99,9,9}));
        Assertions.assertEquals("[5]", sorter.shake(new int []{5}));
        Assertions.assertEquals("[1, 2, 3, 4, 5]", sorter.shake(new int []{3,1,4,2,5}));
        Assertions.assertEquals("[1, 2, 2, 3, 3]", sorter.shake(new int []{2,3,2,1,3}));
        Assertions.assertEquals("[-3, -2, -1, 0, 2]", sorter.shake(new int []{-3,-1,-2,0,2}));
        Assertions.assertEquals("[-2147483648, -987654321, 0, 123456789, 2147483647]",
                sorter.shake(new int []{Integer.MAX_VALUE, Integer.MIN_VALUE, 0, -987_654_321, 123_456_789}));
    }
}
