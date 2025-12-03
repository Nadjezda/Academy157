package home_work_2.arrays;

import home_work_2.arrays.api.IArraysOperation;

import java.util.Arrays;

// 2.3.1. DoWhileOperation - во всех методах можно использовать только do....while
// 2.2.1. Вывести все элементы в консоль.
//		2.2.2. Вывести каждый второй элемент массива в консоль.
//		2.2.3. Вывести все элементы массива в консоль в обратном порядке.
public class DoWhileOperation implements IArraysOperation {

    // вывод массива в консоль
    @Override
    public  String output(int [] container) {
        int i = 0;
        do {
            System.out.print(container[i] + " ");
            i++;
        } while (i < container.length);
        System.out.println();
        return Arrays.toString(container);
    }

    //вывод каждого второго элемента в консоль
    @Override
    public  String everySecond(int[] container) {
        int[] everSecondConteiner = new int[container.length/2 + (container.length % 2)];
        int i = 1, index = 0;
        do {
            everSecondConteiner[index] = container[i];
            System.out.print(container[i] + " ");
            i += 2;
            index++;
        } while (i < container.length);
        System.out.println();
        return Arrays.toString(everSecondConteiner);
    }

    // вывод элементов массива в обратном порядке
    @Override
    public String reversArray(int[] container) {
        int[] reversContainer = new int[container.length];
        int i = container.length - 1, index = 0;
        do {
            reversContainer[index] = container[i];
            System.out.print(container[i] + " ");
            i--;
            index++;
        } while (i >= 0);
        System.out.println();
        return Arrays.toString(reversContainer);
    }

}
