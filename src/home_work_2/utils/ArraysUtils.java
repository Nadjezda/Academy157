package home_work_2.utils;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class ArraysUtils {
    public static int[] arrayFromConsole() {
        Scanner console = new Scanner(System.in);// для ввода данных через консоль
        System.out.println("Введите количество элементов массива: ");
        int elements = console.nextInt();// сохраняем кол-во элементов
        int[] arrayFromConsole = new int[elements];// переменная для массива
        System.out.println("Введите числа для элементов массива: ");

        for (int i = 0; i < elements; i++) { // цикл для перебора элементов массива
            System.out.println("Ведите элемент[" + i + "]");
            arrayFromConsole[i] = console.nextInt(); // i-тая переменная массива
        }
        return arrayFromConsole;
    }
    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] container = new int[size]; //переменная для массива
        Random rand = new Random(maxValueExclusion);//для случайных данных

        for (int i = 0; i < container.length; i++) { // цикл для перебора элементов массива
            container[i] = rand.nextInt(maxValueExclusion);// i-тая переменная массива
        }
        return container;
    }
}
