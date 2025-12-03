package home_work_2.loops;


import java.util.Arrays;

//1.4.* Умножать число long a = 1; пока не произойдёт переполнение. В конце в консоль вывести сообщение
// со значением до переполнения и после переполнения. Умножать на:
//    	1.4.1. 3
//    	1.4.2. 188
//    	1.4.3. -19
//    	1.4.4. Да и вообще на любое целочисленное
//5. Переделать задание 1, убрав оттуда точки входа, добавить класс для тестов протестировать примерами
// из задания и своими примерами обязательно.
public class Overflow5Part4 {
    public static void main(String[] args) {

        long[] results = new long[42];


        System.out.println("----------Умножение на 3----------");
        overflow(results, 1, 3);

        System.out.println("----------Умноженеи на 188----------");
        overflow(results, 1, 188);

        System.out.println("----------на максимальный инт----------");
        overflow(results, 1, Integer.MAX_VALUE);

        System.out.println("----------Умножение на -19----------");
        overflow(results, 1, -19);
        overflow(results, 1, 0);
        overflow(results, -15l, 4);
        overflow(results, 0,158);


    }

    public static long overflow(long[] arr, long numberForOverflow, int numberToMultiply) {
        if (numberToMultiply == 0 || numberForOverflow == 0) {
            System.out.println("0");
            return 0;
        } else {
            for (int i = 0; i < arr.length - 1; i++) {
                if ((numberForOverflow < Long.MAX_VALUE / numberToMultiply) | (numberForOverflow < Long.MIN_VALUE / numberToMultiply)) {
                    arr[i] = numberForOverflow * numberToMultiply;
                    numberForOverflow = arr[i];
                } else {
                    arr[i] = numberForOverflow * numberToMultiply;
                    System.out.println("Произошло переполнение на итерации: " + i + "\nРезультат до   переполнения: "
                            + arr[i - 1] + "\nРезультат после переполнения: " + arr[i]);
                    break;
                }
            }
            System.out.println(numberForOverflow);
            return numberForOverflow;
        }
    }
}


