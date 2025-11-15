package home_work_2.loops;

import java.util.Arrays;

public class Overflow1_4 {
    public static void main(String[] args) {
        long numberForOverflow = 1;
        int firstNumberToMultiply = 3;
        int secondNumberToMultiply = 188;
        int thirdNumberToMultiply = -19;
        int maxNumberToMultiply = Integer.MAX_VALUE;
        long[] results = new long[45];


        System.out.println("----------Умножение на 3----------");
    overflow(results, numberForOverflow, firstNumberToMultiply);

        System.out.println("----------Умноженеи на 188----------");
    overflow(results, numberForOverflow, secondNumberToMultiply);

        System.out.println("----------на максимальный инт----------");
    overflow(results, numberForOverflow, maxNumberToMultiply);

        System.out.println("----------Умножение на -19----------");
    overflow(results, numberForOverflow, thirdNumberToMultiply);



    }
public static void overflow (long [] arr, long a, int b) {
    for (int i = 0; i < arr.length - 1; i++) {
        if ((a < Long.MAX_VALUE / b)| (a < Long.MIN_VALUE / b)) {
            arr[i] = a * b;
            a = arr[i];
        } else {
            arr[i] = a * b;
            System.out.println("Произошло переполнение на итерации: " + i + "\nРезультат до   переполнения: "
            + arr[i - 1] + "\nРезультат после переполнения: " + arr[i]);
            break;
        }
    }

    }
}


