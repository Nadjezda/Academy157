package home_work_2.arrays;

import java.util.Arrays;

import static home_work_2.utils.ArraysUtils.arrayRandom;

//2.4 Задачи в презентации. На сайте есть пояснения по каждой из этих задач. Все задачи в одном классе,
// в отдельных методах. Для получения массивов вызывать ранее созданный метод arrayRandom (ArraysUtils.arrayRandom(50, 100))
//		2.4.1. Сумма четных положительных элементов массива
//		2.4.2. Максимальный из элементов массива с четными индексами
//		2.4.3. Элементы массива, которые меньше среднего арифметического
//		2.4.4. Найти два наименьших (минимальных) элемента массива
//		2.4.5. Сжать массив, удалив элементы, принадлежащие интервалу
//		2.4.6. Сумма цифр массива
//7. Для заданий 2.4 написать тесты и протестировать различными своими примерами обязательно.

public class Dz7 {
    public static void main(String[] args) {
        int[] container = arrayRandom(50, 100);
        System.out.println(Arrays.toString(container));

        sumEven(container);
        maxEven(container);
        lessArithmetic(container);
        twoMinElements(container);
        reNull(container, 15, 38);
        sumNumbersOfElements(container);
    }

    //Сумма четных положительных элементов массива
    public static int sumEven(int[] container) {
        int sum = 0; // переменная для суммы
        for (int elements : container) { //перебор элементов массива
            if (elements > 0 && elements % 2 == 0) { // ищем положительный элемент
                    sum += elements;// помещаем в сумму четный
                }
            }

        System.out.println("Сумма положительных четных элементов = " + sum);// распечатываем результат
        return sum;
    }

    //Максимальный из элементов массива с четными индексами
    public static int maxEven(int[] container) {
        int maxNumber = 0;// для хранения максимального значения
        for (int i = 0; i < container.length; i++) { //перебираем элементы массива
            if (i % 2 == 0) { // ищем нечетный индекс
                maxNumber = Math.max(container[i], maxNumber);// сравниваем и большую записываем в переменную max
            }
        }
        System.out.println("Максимальное: " + maxNumber);// распечатываем результат
        return maxNumber;
    }

    // Элементы массива, которые меньше среднего арифметического
    public static String lessArithmetic(int[] container) {
        double sum = 0; // переменная для суммы
        int[] lessArithmeticContainer = new int[container.length];
        int index = 0;// для нового массива

        for (int elements: container) { //перебираем элементы массива
            sum += elements; // сохраняем в сумму
        }
        System.out.println("Среднеарифметическое= " + sum / container.length); // печатае среднеарифметическое

        for (int j : container) { //перебираем элементы массива
            if (j < sum / container.length) {// находим меньше среднеарифметического
                lessArithmeticContainer[index] = j;
                System.out.print("less: " + j + " ");// печатаем результат
                index++;
            }
        }
        System.out.println(Arrays.toString(lessArithmeticContainer));// для красоты
        return Arrays.toString(lessArithmeticContainer);
    }

    // Найти два наименьших (минимальных) элемента массива

    /**
     * Метод возвращает два разных минимальных элемента массива
     * @param container массив
     * @return два разныч минимальных элемента массива
     * если длина массива меньше двух элементов выдаст ошибку ArrayIndexOutOfBoundsException
     */
    public static String twoMinElements(int[] container) {
        int minFirst = container[0]; // переменная для начального хранения элемента массива предположительно минимального
        int minSecond = container[1]; // переменная для начального хранения элемента массива предположительно минимального

        for (int j : container) { // перебираем элементы массива
            if (j < minFirst) { // если находим меньше первого сохраненного
                minSecond = minFirst; // меняем местами информацию о втором и первом
                minFirst = j;// сохраняем информацию о меньшем в первый
            } else if (j < minSecond && j != minFirst) {// если нажодим меньше второго и
                // не равный первому (нет смысла менять одинаковые значения)
                minSecond = j;// сохраняем информауию в переменную второго минимального
            }
        }
        System.out.print("Первый минимум: " + minFirst + "\nВторой минимум: " + minSecond);// печать результата
        System.out.println();//для красоты
        return minFirst + " and " + minSecond;
    }

    //Сжать массив, удалив элементы, принадлежащие интервалу
    public static String reNull(int[] arr, int start, int finish) {
        int count = 0;
        System.out.println(start + " < " + "интервал для обнуления" + " < " + finish);

        for (int i = 0; i < arr.length; i++) {// перебор массива для обнуления
            if (arr[i] >= start && arr[i] <= finish) {
                arr[i] = 0;
                count++;
            }
        }
        int[] arrWithoutZero = new int[arr.length - count];
        int index = 0;
        for (int j : arr) {
            if (j != 0) {
                arrWithoutZero[index] = j;
                index++;
            }
        }
        System.out.println(Arrays.toString(arrWithoutZero));
        return Arrays.toString(arrWithoutZero);
    }
    //Сумма цифр массива
    public static long sumNumbersOfElements(int[] arr) {
        int sum = 0;// переменная для суммы
        for (int i = 0; i < arr.length; i++) {// перебираем элементы
            while (arr[i] != 0) {// цикл для разбивки номеров на цифры
                int tmp = arr[i] % 10;
                sum += tmp;
                arr[i] = arr[i] / 10;
            }
        }
        System.out.println("Сумма циффр = " + sum);
        return sum;
    }
}


