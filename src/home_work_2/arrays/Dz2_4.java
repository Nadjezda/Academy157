package home_work_2.arrays;

import java.util.ArrayList;
import java.util.Arrays;

import static home_work_2.utils.ArraysUtils.arrayRandom;

public class Dz2_4 {
    public static void main(String[] args) {
        int[] container = arrayRandom(8, 200);
        System.out.println(Arrays.toString(container));
        int i = 0;
        int sum = 0;
        sumEven(container, i);
        maxEven(container, i);
        lessArithmetic(container, i);
        twoMinElements(container, i);
        reNull(container, i);
        sumNumbersOfElements(container, i);
    }

    //Сумма четных положительных элементов массива
    public static void sumEven(int[] container, int i) {
        int sum = 0; // переменная для суммы
        for (i = 0; i < container.length; i++) { //перебор элементов массива
            if (container[i] <= 0) { // ищем положительный элемент
                continue;
            } else {
                if (container[i] % 2 != 0) {// ищем  не четный
                    continue;
                } else {
                    sum += container[i];// помещаем в сумму четный
                }
            }
        }
        System.out.println("Сумма положительных четных элементов = " + sum);// распечатываем результат
    }

    //Максимальный из элементов массива с четными индексами
    public static void maxEven(int[] container, int i) {
        int maxNumber = 0;// для хранения максимального значения
        for (i = 0; i < container.length; i++) { //перебираем элементы массива
            if (i % 2 != 0) { // ищем нечетный индекс
                continue;
            } else {
                if (container[i] > maxNumber) { // ищем максимальный среди четных
                    maxNumber = container[i];// если нашли сохраняем в переменную
                } else {
                    maxNumber = maxNumber;// не нашли переменная неизменна
                }
            }
        }
        System.out.println("Максимальное: " + maxNumber);// распечатываем результат
    }

    // Элементы массива, которые меньше среднего арифметического
    public static void lessArithmetic(int[] container, int i) {
        double sum = 0; // переменная для суммы

        for (i = 0; i < (container.length); i++) { //перебираем элементы массива
            sum += container[i]; // сохраняем в сумму
        }
        System.out.println("Среднеарифметическое= " + sum / container.length); // печатае среднеарифметическое

        for (i = 0; i < container.length; i++) { //перебираем элементы массива
            if (container[i] < sum / container.length) { // находим меньше среднеарифметического
                System.out.print("less: " + container[i] + " ");// печатаем результат
            }
        }
        System.out.println();// для красоты
    }

    // Найти два наименьших (минимальных) элемента массива
    public static void twoMinElements(int[] container, int i) {
        int minFirst = container[0]; // переменная для начального хранения элемента массива предположительно минимального
        int minSecond = container[1]; // переменная для начального хранения элемента массива предположительно минимального

        for (i = 0; i < container.length; i++) { // перебираем элементы массива
            if (container[i] < minFirst) { // если находим меньше первого сохраненного
                minSecond = minFirst; // меняем местами информацию о втором и первом
                minFirst = container[i];// сохраняем информацию о меньшем в первый
            } else if (container[i] < minSecond && container[i] != minFirst) {// если нажодим меньше второго и
                // не равный первому (нет смысла менять одинаковые значения)
                minSecond = container[i];// сохраняем информауию в переменную второго минимального
            }
        }
        System.out.print("Первый минимум: " + minFirst + "\nВторой минимум: " + minSecond);// печать результата
        System.out.println();//для красоты
    }

    //Сжать массив, удалив элементы, принадлежащие интервалу
    public static void reNull(int[] arr, int i) {
        int a = 1; // переменная для нижней границы интервала
        int b = 105; // переменная для верхней границы

        System.out.println("интервал " + a + " < " + " > " + b);
        for (i = 0; i < arr.length - 1; i++) { // перебираем массив
            if (arr[i] >= a && arr[i] <= b) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));// результат
    }


    //Сумма цифр массива
    public static void sumNumbersOfElements(int[] arr, int i) {
        int sum = 0;// переменная для суммы
        for (i = 0; i < arr.length; i++) {// перебираем элементы
            while (arr[i] > 0) {// цикл для разбивки номеров на цифры
                int tmp = arr[i] % 10;
                sum += tmp;
                arr[i] = arr[i] / 10;
            }
        }
        System.out.println("Сумма циффр = " + sum);
    }
}


