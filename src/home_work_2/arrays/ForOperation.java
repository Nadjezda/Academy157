package home_work_2.arrays;

//2.3.3. ForOperation - во всех методах можно использовать только for
//2.2.1. Вывести все элементы в консоль.
//		2.2.2. Вывести каждый второй элемент массива в консоль.
//		2.2.3. Вывести все элементы массива в консоль в обратном порядке.

import home_work_2.arrays.api.IArraysOperation;

import java.util.Arrays;

public class ForOperation implements IArraysOperation {

    // вывод массива в консоль
    @Override
    public  String output(int[] container) {

        for (int i = 0; i < container.length; i++) {
            System.out.print(container[i] + " ");
        }
        System.out.println();
        return Arrays.toString(container);
    }

    //вывод каждого второго элемента в консоль
    @Override
    public String everySecond(int[] container) {
        int[] everySecondContainer = new int [container.length / 2 + (container.length % 2)];
        int index = 0;
        for (int i = 1; i < container.length; i += 2) {
            System.out.print(container[i] + " ");
            everySecondContainer[index] = container[i];
            index++;
        }
        System.out.println();
        return Arrays.toString(everySecondContainer);
    }

    // вывод элементов массива в обратном порядке
    @Override
    public  String reversArray(int[] container) {
        int[] reversContainer = new int [container.length];
        int index = 0;
        for (int i = container.length - 1; i >= 0; i--) {
            reversContainer[index] = container[i];
            System.out.print(container[i] + " ");
            index++;
        }
        System.out.println();
        return Arrays.toString(reversContainer);
    }
}
