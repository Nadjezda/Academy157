package home_work_2.arrays;

import home_work_2.arrays.api.IArraysOperation;

import java.util.Arrays;

//.3.2. WhileOperation - во всех методах можно использовать только while
//2.2.1. Вывести все элементы в консоль.
//		2.2.2. Вывести каждый второй элемент массива в консоль.
//		2.2.3. Вывести все элементы массива в консоль в обратном порядке.

public class WhileOperation implements IArraysOperation {

    // вывод массива в консоль
    @Override
    public  String output(int[] container) {
        int i = 0;
        while (i < container.length) {
            System.out.print(container[i] + " ");
            i++;
        }
        System.out.println();
        return Arrays.toString(container);
    }

    //вывод каждого второго элемента в консоль
    @Override
    public String everySecond(int[] container) {
        int i = 1, index = 0;
        int[] everySecondContainer = new int [container.length / 2 + (container.length % 2)];
        while (i < container.length) {
            System.out.print(container[i] + " ");
            everySecondContainer[index] = container[i];
            i += 2;
            index++;
        }
        System.out.println();
        return Arrays.toString(everySecondContainer);
    }

    // вывод элементов массива в обратном порядке
    @Override
    public String reversArray(int[] container) {
        int i = container.length - 1, index = 0;
        int[] reversContainer = new int [container.length];
        while (i >= 0) {
            System.out.print(container[i] + " ");
            reversContainer[index] = container[i];
            i--;
            index++;
        }
        System.out.println();
        return Arrays.toString(reversContainer);
    }
}
