package home_work_2.utils;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
//2.1. Создать класс ArraysUtils. В этом классе не должно быть main метода.
// В этом классе написать следующие методы:
//		2.1.1. Написать метод public static int[] arrayFromConsole(). Данный метод размер массива и каждый его элемент
//		запрашивает у пользователя через консоль.
//2.1.2. Написать метод public static int[] arrayRandom(int size, int maxValueExclusion). Данный метод принимает два аргумента.
// Первый (size) указывает размер массива который мы хотим получить. Второй (maxValueExclusion) указывает до какого
//числа генерировать рандомные числа.
public class ArraysUtils {
    public static int[] arrayFromConsole() {

        Scanner console = new Scanner(System.in);// для ввода данных через консоль
        System.out.println("Введите количество элементов массива: ");
        int elements = console.nextInt();// сохраняем кол-во элементов

        int[] arrayFromConsole = new int[elements];// переменная для массива
        System.out.println("Введите числа для элементов массива: ");

        for (int i = 0; i < elements; i++) { // цикл для перебора элементов массива
            System.out.println("Введите элемент[" + i + "]");
            arrayFromConsole[i] = console.nextInt(); // i-тая переменная массива
        }
        console.close();
        return arrayFromConsole;
    }
    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] container = new int[size]; //переменная для массива

        ThreadLocalRandom rand = ThreadLocalRandom.current();// продвинутый для случайных данных

        for (int i = 0; i < container.length; i++) { // цикл для перебора элементов массива
            container[i] = rand.nextInt(10, maxValueExclusion);// i-тая переменная массива
        }
        return container;
    }
}

