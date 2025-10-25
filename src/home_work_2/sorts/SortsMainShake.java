package home_work_2.sorts;

import home_work_2.utils.ArraysUtils;

import java.util.Arrays;

import static home_work_2.sorts.SortsUtils.shake;

import static home_work_2.utils.ArraysUtils.arrayRandom;

public class SortsMainShake {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] arr1 = {1,1,1,1};
        int[] arr2 = {9,1,5,99,9,9};
        int[] arr3 = {};
        int[] arr4 = {6,5,4,3,2,1};
        int[] arr5 = arrayRandom(5,100);
        int [] arr6 = ArraysUtils.arrayFromConsole();

        System.out.println("Массив до сортировки\n " + Arrays.toString(arr));
        shake(arr);
        System.out.println("Массив после сортировки\n " + Arrays.toString(arr));
        System.out.println();
        System.out.println("Массив до сортировки\n" + Arrays.toString(arr1));
        shake(arr1);
        System.out.println("Массив после сортировки\n" + Arrays.toString(arr1));
        System.out.println("Массив до сортировки\n" + Arrays.toString(arr2));
        shake(arr2);
        System.out.println("Массив после сортировки\n" + Arrays.toString(arr2));
        System.out.println("Массив до сортировки\n" + Arrays.toString(arr3));
        shake(arr3);
        System.out.println("Массив после сортировки\n" + Arrays.toString(arr3));
        System.out.println("Массив до сортировки\n" + Arrays.toString(arr4));
        shake(arr4);
        System.out.println("Массив после сортировки\n" + Arrays.toString(arr4));
        System.out.println("Массив до сортировки\n" + Arrays.toString(arr5));
        shake(arr5);
        System.out.println("Массив после сортировки\n" + Arrays.toString(arr5));
        System.out.println("Массив до сортировки\n" + Arrays.toString(arr6));
        shake(arr6);
        System.out.println("Массив после сортировки\n" + Arrays.toString(arr6));
    }
}
