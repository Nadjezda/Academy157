package home_work_1;


import java.util.Arrays;


public class ToBinaryString {
    //8.** Создать СТАТИЧЕСКИЙ метод String toBinaryString(byte number) и возвращает двоичное представление числа. В методе можно использовать только обычную математику которая описана в теории. Если число отрицательное то вернуть дополнительный код. Теория https://planetcalc.ru/747. Пример:
    //	8.1 Вводим: 42.  Возвращает: 00101010
    //	8.2 Вводим: 15.  Возвращает: 00001111
    //	8.3 Вводим: -42. Возвращает: 11010110
    //	8.4 Вводим: -15. Возвращает: 11110001
    public static void main(String[] args) {
        ;
        int[] arr = binaryPositivNumbers(42);
        print(42, arr);
        int[] arr1 = binaryPositivNumbers(15);
        print(15, arr1);

    }
    //8.3 Вводим: -42. Возвращает: 11010110
    //8.4 Вводим: -15. Возвращает: 11110001

    public static int[] binaryPositivNumbers(int number) {
        int[] binaryNumber = new int[8];
        for (int i = binaryNumber.length - 1; i >= 0; i--) {
            if (number >= 0) {
                int tmp = number % 2;
                if (tmp != 0) {
                    binaryNumber[i] = 1;
                } else {
                    binaryNumber[i] = 0;
                }
                number = number / 2;
            }
        }
        return binaryNumber;
    }

    public static void print(int a, int[] arr) {
        System.out.println("Десятичное число: " + a);
        for (int element : arr) {
            System.out.print(element);
        }
        System.out.println("- двоичное число ");
    }




}




