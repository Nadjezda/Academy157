package home_work_2.sorts;

public class SortsUtils {
    public static int[] sort(int[] arr, int i) {//пузырьковая сортиторка
        for (int j = arr.length - 1; j >= 1; j--) {
            for (i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
            }
        }
        return arr;
    }


    public static int[] shake(int[] arr) {// шейкерная сортировка
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
            for (int i = right-1; i >= left; i--) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    isSorted = i;
                }
            }
            left = isSorted + 1;
            }
        return arr;
    }
}
