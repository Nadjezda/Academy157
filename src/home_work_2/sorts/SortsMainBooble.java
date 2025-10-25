package home_work_2.sorts;

import home_work_2.utils.ArraysUtils;

import java.util.Arrays;

import static home_work_2.sorts.SortsUtils.sort;
import static home_work_2.utils.ArraysUtils.arrayRandom;

public class SortsMainBooble {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] arr1 = {1,1,1,1};
        int[] arr2 = {9,1,5,99,9,9};
        int[] arr3 = {};
        int[] arr4 = {6,5,4,3,2,1};
        int[] arr5 = arrayRandom(5,100);
        int [] arr6 = ArraysUtils.arrayFromConsole();

        System.out.print("Массив до сортировки\n " + Arrays.toString(arr));
        sort(arr,0);
        System.out.print("Массив после сортировки\n " + Arrays.toString(arr));
        System.out.println();
        System.out.println("Массив до сортировки\n" + Arrays.toString(arr1));
        sort(arr1,0);
        System.out.println("Массив после сортировки\n" + Arrays.toString(arr1));
        System.out.println("Массив до сортировки\n" + Arrays.toString(arr2));
        sort(arr2,0);
        System.out.println("Массив после сортировки\n" + Arrays.toString(arr2));
        System.out.println("Массив до сортировки\n" + Arrays.toString(arr3));
        sort(arr3,0);
        System.out.println("Массив после сортировки\n" + Arrays.toString(arr3));
        System.out.println("Массив до сортировки\n" + Arrays.toString(arr4));
        sort(arr4,0);
        System.out.println("Массив после сортировки\n" + Arrays.toString(arr4));
        System.out.println("Массив до сортировки\n" + Arrays.toString(arr5));
        sort(arr5,0);
        System.out.println("Массив после сортировки\n" + Arrays.toString(arr5));
        System.out.println("Массив до сортировки\n" + Arrays.toString(arr6));
        sort(arr6,0);
        System.out.println("Массив после сортировки\n" + Arrays.toString(arr6));
    }
}
