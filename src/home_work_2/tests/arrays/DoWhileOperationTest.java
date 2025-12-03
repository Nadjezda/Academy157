package home_work_2.tests.arrays;

import home_work_2.arrays.DoWhileOperation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DoWhileOperationTest {
    //6. Выполнить задание 2.3, добавить класс для тестов протестировать своими примерами обязательно.
    DoWhileOperation operationDo = new DoWhileOperation();

    @Test
    public void output() {
        Assertions.assertEquals("[1, 2, 3, 4, 5]", operationDo.output(new int[]{1, 2, 3, 4, 5}));
        Assertions.assertEquals("[5, 4, 3, 2, 1]", operationDo.output(new int[]{5, 4, 3, 2, 1}));
        Assertions.assertEquals("[1, 1, 1, 1, 1]", operationDo.output(new int[]{1, 1, 1, 1, 1}));
        Assertions.assertEquals("[0, 0, 0, 0, 0]", operationDo.output(new int[]{0, 0, 0, 0, 0,}));
    }

    @Test
    public void everySecond() {
        Assertions.assertEquals("[2, 4, 6]", operationDo.everySecond(new int [] {1,2,3,4,5,6}));
        Assertions.assertEquals("[5, 3, 1]", operationDo.everySecond(new int [] {6,5,4,3,2,1}));
        Assertions.assertEquals("[1, 1, 0]", operationDo.everySecond(new int [] {1,1,1,1,1}));
        Assertions.assertEquals("[0, 0, 0]", operationDo.everySecond(new int [] {0,0,0,0,0}));
    }

    @Test
    public void reversArray(){
        Assertions.assertEquals("[6, 5, 4, 3, 2, 1]", operationDo.reversArray(new int [] {1,2,3,4,5,6}));
        Assertions.assertEquals("[1, 2, 3, 4, 5, 6]", operationDo.reversArray(new int [] {6,5,4,3,2,1}));
        Assertions.assertEquals("[1, 1, 1, 1, 1]", operationDo.reversArray(new int [] {1,1,1,1,1}));
        Assertions.assertEquals("[0, 0, 0, 0, 0]", operationDo.reversArray(new int [] {0,0,0,0,0}));

    }
}