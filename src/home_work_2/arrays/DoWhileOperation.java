package home_work_2.arrays;

import home_work_2.arrays.api.IArraysOperation;

// 2.3.1. DoWhileOperation - во всех методах можно использовать только do....while
// 2.2.1. Вывести все элементы в консоль.
//		2.2.2. Вывести каждый второй элемент массива в консоль.
//		2.2.3. Вывести все элементы массива в консоль в обратном порядке.
public class DoWhileOperation implements IArraysOperation {

    // вывод массива в консоль
    public  void output(int [] container, int i) {
        do {
            System.out.print(container[i] + " ");
            i++;
        } while (i < container.length);
        System.out.println();
    }

    //вывод каждого второго элемента в консоль
    public  void everySecond(int[] container, int i) {
        i = 1;
        do {
            System.out.print(container[i] + " ");
            i += 2;
        } while (i < container.length);
        System.out.println();
    }

    // вывод элементов массива в обратном порядке
    public void reversArray(int[] container, int i) {
        i = container.length - 1;
        do {
            System.out.print(container[i] + " ");
            i--;
        } while (i >= 0);
        System.out.println();
    }

}
