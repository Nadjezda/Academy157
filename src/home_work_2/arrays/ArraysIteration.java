package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

import java.util.Arrays;

public class ArraysIteration {
    public static void main(String[] args) {
        int[] container = ArraysUtils.arrayFromConsole();// вызываем метод заполнения массива через консоль
        int i = 0; // переменная для цикла
        System.out.println(Arrays.toString(container));
        output(container, i);
        everySecond(container, i);
        reversArray(container,i);
    }
    // вывод массива в консоль

    public static void output(int[] container, int i) {
        do {
            System.out.print(container[i] + " ");
            i++;
        } while (i < container.length);
        System.out.println("do");
        i = 0;
        while (i < container.length) {
            System.out.print(container[i] + " ");
            i++;
        }
        System.out.println("while");

        for (i = 0; i < container.length; i++) {
            System.out.print(container[i] + " ");
        }
        System.out.println("for");

        for (int elements : container) {
            System.out.print(elements + " ");
        }
        System.out.println("foreach");
    }

    //вывод каждого второго элемента в консоль
    public static void everySecond(int[] container, int i) {
        i = 1;
        do {
            System.out.print(container[i] + " ");
            i += 2;
        } while (i < container.length);
        System.out.println("do");
        i = 1;
        while (i < container.length) {
            System.out.print(container[i] + " ");
            i += 2;
        }
        System.out.println("while");

        for (i = 1; i < container.length; i += 2) {
            System.out.print(container[i] + " ");
        }
        System.out.println("for");
        // foreach здесь работать не будет т.к. он перебирает элементы массива а не их индексы
    }

    // вывод элементов массива в обратном порядке
    public static void reversArray(int[] container, int i)  {
        i = container.length -1;
        do{
            System.out.print(container[i] + " ");
            i--;
        }while(i >=  0);
        System.out.println("do");

        i = container.length -1;
        while(i >= 0) {
            System.out.print(container[i] + " ");
            i--;
        }
        System.out.println("while");

        for(i = container.length -1; i >= 0; i --) {

            System.out.print(container[i] + " ");
        }
        System.out.println("for");
        // foreach здесь работать не будет т.к. он перебирает элементы массива а не их индексы
    }


}

