package home_work_1.runners;


public class ToBinaryString {
    //8.** Создать СТАТИЧЕСКИЙ метод String toBinaryString(byte number) и возвращает двоичное представление числа. В методе можно использовать только обычную математику которая описана в теории. Если число отрицательное то вернуть дополнительный код. Теория https://planetcalc.ru/747. Пример:
    //	8.1 Вводим: 42.  Возвращает: 00101010
    //	8.2 Вводим: 15.  Возвращает: 00001111
    //	8.3 Вводим: -42. Возвращает: 11010110
    //	8.4 Вводим: -15. Возвращает: 11110001
    public static void main(String[] args) {
        int[] arrayBinary42 = binaryPositiveNumbers(42);
        print(42, arrayBinary42);
        int[] arrayBinary15 = binaryPositiveNumbers(15);
        print(15, arrayBinary15);
        int [] invertNumber42 = invertNumber(arrayBinary42);
        int [] arrayBinary42negative = negativeBinaryNumber(invertNumber42);
        print(-42, arrayBinary42negative);
        int [] invertNumber15 = invertNumber(arrayBinary15);
        int [] arrayBinary15negative = negativeBinaryNumber(invertNumber15);
        print(-15, arrayBinary15negative);

    }
    public static int[] binaryPositiveNumbers(int number) {
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

    public static int[] invertNumber(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
            return arr;
        }

    public static int[] negativeBinaryNumber(int array[])  {
        for (int i = array.length-1; i >= 0; i--) {
            if (array[i] == 0) {
                array[i] = 1;
                break;
            } else {
                array[i - 1] = 1;
                array[i] = 0;
                break;
            }
        }
            return array;
    }

}









