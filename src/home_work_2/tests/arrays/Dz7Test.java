package home_work_2.tests.arrays;

import home_work_2.arrays.Dz7;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Dz7Test {
   // 7. Для заданий 2.4 написать тесты и протестировать различными своими примерами обязательно.
    @Test
    public void sumEven(){
        Assertions.assertEquals(6,Dz7.sumEven(new int []{1,2,3,4,5}));
        Assertions.assertEquals(14,Dz7.sumEven(new int []{2,4,0,-6,8}));
        Assertions.assertEquals(0,Dz7.sumEven(new int []{-1,-2,3,-4,-5}));
        Assertions.assertEquals(30,Dz7.sumEven(new int []{2,4,6,8,10}));
        Assertions.assertEquals(0,Dz7.sumEven(new int []{0,0,0,0,0}));
        Assertions.assertEquals(10,Dz7.sumEven(new int []{2,2,2,2,2}));
        Assertions.assertEquals(0,Dz7.sumEven(new int []{5,5,5,5,5}));
        Assertions.assertEquals(0,Dz7.sumEven(new int []{}));
    }

    @Test
    public void maxEven(){
        Assertions.assertEquals(0, Dz7.maxEven(new int []{}));
        Assertions.assertEquals(5, Dz7.maxEven(new int []{1,2,3,4,5}));
        Assertions.assertEquals(5, Dz7.maxEven(new int []{5,4,3,2,1}));
        Assertions.assertEquals(0, Dz7.maxEven(new int []{-1,2,-3,4,0}));
        Assertions.assertEquals(0, Dz7.maxEven(new int []{0,2,0,4,0}));
        Assertions.assertEquals(15, Dz7.maxEven(new int []{15}));
    }

    @Test
    public void lessArithmetic(){
        Assertions.assertEquals("[1, 2, 0, 0, 0]", Dz7.lessArithmetic(new int []{1,2,3,4,5}));
        Assertions.assertEquals("[0, 0, 0, 0, 0]", Dz7.lessArithmetic(new int []{5,5,5,5,5}));
        Assertions.assertEquals("[2, 1, 0, 0, 0]", Dz7.lessArithmetic(new int []{5,4,3,2,1}));
        Assertions.assertEquals("[-3, 0, -1, 0, 0]", Dz7.lessArithmetic(new int []{-3,0,2,-1,5}));
        Assertions.assertEquals("[]", Dz7.lessArithmetic(new int []{}));
        Assertions.assertEquals("[0, 0, 0, 0, 0]", Dz7.lessArithmetic(new int []{0,0,0,0,0}));
        Assertions.assertEquals("[0]", Dz7.lessArithmetic(new int []{5}));
    }

    @Test
    public void twoMinElements(){
        Assertions.assertEquals("1 and 2", Dz7.twoMinElements(new int []{1,2,3,4,5}));
        Assertions.assertEquals("1 and 2", Dz7.twoMinElements(new int []{5,4,3,2,1}));
        Assertions.assertEquals("1 and 2", Dz7.twoMinElements(new int []{5,1,3,2,4}));
        Assertions.assertEquals("1 and 2", Dz7.twoMinElements(new int []{2,2,3,1,1}));
        Assertions.assertEquals("7 and 10", Dz7.twoMinElements(new int []{10,7}));
        Assertions.assertEquals("0 and 0", Dz7.twoMinElements(new int []{0,0,0,0,0}));
    }

    @Test
    public void twoMinElementsIfLessThenTwo(){
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            Dz7.twoMinElements(new int []{14});
        }
        );
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
                    Dz7.twoMinElements(new int []{});
                }
        );
    }

    @Test
    public void reNull(){
        Assertions.assertEquals("[1, 10]", Dz7.reNull(new int []{1,5,3,8,2,10},
                2, 8));
        Assertions.assertEquals("[4, 4, 4, 4, 4]", Dz7.reNull(new int []{4,4,4,4,4}, 5,8));
        Assertions.assertEquals("[]", Dz7.reNull(new int []{2,4,5,6,7,8},
                2, 8));
        Assertions.assertEquals("[20, 25]", Dz7.reNull(new int []{5,10,15,20,25},
                5, 15));
        Assertions.assertEquals("[5, 10, 15]", Dz7.reNull(new int []{5,10,15,20,25},
                20, 25));
        Assertions.assertEquals("[1, 5]", Dz7.reNull(new int []{1,3,3,3,5},
                3, 3));
        Assertions.assertEquals("[10, -15, 20, -25]", Dz7.reNull(new int []{5,10,-15,20,-25},
                0, 5));
        Assertions.assertEquals("[10, 20, -25]", Dz7.reNull(new int []{5,10,-15,20,-25},
                -15, 5));
        Assertions.assertEquals("[1]", Dz7.reNull(new int []{1,-5,-3,-8,-2,-10},
                -20, 0));
        Assertions.assertEquals("[10, 20]", Dz7.reNull(new int []{-5,10,-15,20,-25},
                -25, -5));
    }

    @Test
    public void sumNumbersOfElements(){
        Assertions.assertEquals(21, Dz7.sumNumbersOfElements(new int []{123,45,6}));
        Assertions.assertEquals(0, Dz7.sumNumbersOfElements(new int []{}));
        Assertions.assertEquals(0, Dz7.sumNumbersOfElements(new int []{0,0,0}));
        Assertions.assertEquals(13, Dz7.sumNumbersOfElements(new int []{3,4,6}));
        Assertions.assertEquals(20, Dz7.sumNumbersOfElements(new int []{23,45,60}));
        Assertions.assertEquals(-21, Dz7.sumNumbersOfElements(new int []{-23,-145,-6}));
        Assertions.assertEquals(9, Dz7.sumNumbersOfElements(new int []{100,20,6}));
    }
}
