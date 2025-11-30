package home_work_1;

import java.util.Scanner;

public class Branching4_3 {
    public static void main(String[] args) {
        //4.3 Проверка делимости одного числа на другое. Вводится два числа, проверить делится ли первое на второе.
        // Вывести на экран сообщение об этом, результат и остаток если он есть.
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число которое будем делить: ");
        int dividend = console.nextInt();
        System.out.println("Введите число на которое будем делить: ");
        int divisor = console.nextInt();
        System.out.println("Your numbers are: " + dividend + "," + divisor);
        console.close();
        if (divisor == 0) {
            System.out.println("На ноль делить нельзя");
        }
        howDividedNumbers(dividend, divisor);
    }

    public static int howDividedNumbers(int a, int b){
        if (a == 0) {
            System.out.println("Результат ноль");
            return 0;
        }else if (a % b == 0) {
            System.out.println("Результат: " + a / b);
            return a / b;
        }else{
            System.out.println("Результат: " + a / b + " и остаток: " + a % b);
            return a % b;
        }
    }
}

