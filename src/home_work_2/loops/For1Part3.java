package home_work_2.loops;

import java.util.Scanner;

public class For1Part3 {
    //1.3. Возведение в степень. Через консоль пользователь вводит два числа. Первое число это число которое мы будем возводить, Второе число это степень в которую возводят первое число. Степень - только положительная и целая. Возводимое число - может быть отрицательным и оно будет дробным. Math использовать нельзя.
    //		1.3.1 Пример: Ввели 18 и 5, должно получиться в консоли: 18.0 ^ 5 = 1 889 568.0
    //		1.3.2 Пример: Ввели 7.5 и 2, должно получиться в консоли: 7.5 ^ 2 = 56.25
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число, которое " +
                "будем возводить в степень (дробное через ',')");
        double firstNumber = console.nextDouble();
        System.out.println("Введите целое положительное число, " +
                "будем возводить первое число в эту степень");
        int secondNumber = console.nextInt();

        if (secondNumber < 0) {
            System.out.println("Вы ввели отрицательное число");
        } else if (secondNumber == 0) {
            System.out.println("Результат будет  = 1");
        }else if (firstNumber == 0) {
            System.out.println("Резудьтат не имеет смысла");
        } else {

            double result = 1;

            for (int i = 0; i < secondNumber; i++) {
                result *= firstNumber;
            }
            System.out.println(firstNumber + " ^ " + secondNumber + " = " + result);

        }

    }
}


