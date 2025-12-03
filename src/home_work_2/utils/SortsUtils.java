package home_work_2.sorts;

//4.1. Создать класс SortsUtils. В этом классе не должно быть main метода. В этом классе написать следующие методы:
//		4.1.1. Написать метод public static void sort(int[] arr). Данный метод будет сортировать переданный ему массив
//		при помощи алгоритма пузырьковая сортировка. Описание алгоритма: https://prog-cpp.ru/sort-bubble/
//		4.1.2. Написать метод public static void shake(int[] arr). Данный метод будет сортировать переданный ему массив
//		при помощи алгоритма шейкерная сортировка. Описание алгоритма: https://prog-cpp.ru/sort-shaker/

import java.util.Arrays;

public class SortsUtils {
    public static String sort(int[] arr) {//пузырьковая сортиторка
        for (int j = arr.length - 1; j >= 1; j--) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
            }
        }
        return Arrays.toString(arr);
    }



    public static String shake(int[] arr) {// шейкерная сортировка
        int left = 0;
        int right = arr.length - 1;
        int isSorted = 1;
        while (left < right) {
            isSorted = 0;
            for (int i = left; i < right; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    isSorted = i;
                }
            }
            right = isSorted;
            for (int i = right - 1; i >= left; i--) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    isSorted = i;
                }
            }
            left = isSorted + 1;
        }
        return Arrays.toString(arr);
    }
}
