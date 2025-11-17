package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

import java.util.Arrays;

public class ArraysIteration {
    //2.2 Создать класс ArraysIteration. В этом классе написать перебор (итерирование) массива при помощи
    // do....while, while, for, foreach. Вызывая ранее созданный метод arrayFromConsole (ArraysUtils.arrayFromConsole()) получить массив.
    // Все задачи в одном классе, в отдельных методах, в каждом методе используется 4 разных цикла. Должно получиться 3 метода:
    //		2.2.1. Вывести все элементы в консоль.
    //		2.2.2. Вывести каждый второй элемент массива в консоль.
    //		2.2.3. Вывести все элементы массива в консоль в обратном порядке.
    public static void main(String[] args) {
        int[] container = ArraysUtils.arrayFromConsole();// вызываем метод заполнения массива через консоль
        System.out.println(Arrays.toString(container));
        output(container, 0);
        everySecond(container, 0);
        reversArray(container,0);
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
        // foreach здесь работать не будет т.к. он перебирает элементы массива а не их индексы, но можно так)):
        i = 0;
        for (int elements : container) {
            if (i % 2 != 0) {
                System.out.print(container[i] + " ");
                i++;
            } else {
                i++;
            }
        }
        System.out.println("foreach");
    }

    // вывод элементов массива в обратном порядке
    public static void reversArray(int[] container, int i) {
        i = container.length - 1;
        do {
            System.out.print(container[i] + " ");
            i--;
        } while (i >= 0);
        System.out.println("do");

        i = container.length - 1;
        while (i >= 0) {
            System.out.print(container[i] + " ");
            i--;
        }
        System.out.println("while");

        for (i = container.length - 1; i >= 0; i--) {

            System.out.print(container[i] + " ");
        }
        System.out.println("for");
        // foreach здесь работать не будет т.к. он перебирает элементы массива а не их индексы, но можно так)):
        int[] reversArray = new int[container.length];

        for (i = container.length - 1; i >= 0; i--) {
            reversArray[(container.length - 1) - i] = container[i];
        }   for (int elements : reversArray) {
            System.out.print(elements + " ");
        }
        System.out.println("foreach");
    }
    }

