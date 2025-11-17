package home_work_2.arrays;

//2.3.3. ForOperation - во всех методах можно использовать только for
//2.2.1. Вывести все элементы в консоль.
//		2.2.2. Вывести каждый второй элемент массива в консоль.
//		2.2.3. Вывести все элементы массива в консоль в обратном порядке.

import home_work_2.arrays.api.IArraysOperation;

public class ForOperation implements IArraysOperation {

    // вывод массива в консоль
    public  void output(int[] container, int i) {

        for (i = 0; i < container.length; i++) {
            System.out.print(container[i] + " ");
        }
        System.out.println();
    }

    //вывод каждого второго элемента в консоль
    public void everySecond(int[] container, int i) {

        for (i = 1; i < container.length; i += 2) {
            System.out.print(container[i] + " ");
        }
        System.out.println();
    }

    // вывод элементов массива в обратном порядке
    public  void reversArray(int[] container, int i) {

        for (i = container.length - 1; i >= 0; i--) {

            System.out.print(container[i] + " ");
        }
        System.out.println();
    }
}
