package home_work_1.branching;

import java.util.Scanner;

public class Branching4Part1 {
    //4.1 Определить нечётное число: из двух случайных чисел, одно из которых четное определить и вывести на экран нечетное число
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое число и обязательно четное: ");
        int evenNumber = console.nextInt();
        System.out.println("Ваше число: " + evenNumber);
        System.out.println("Введите второе число ");
        int secondNumber = console.nextInt();
        System.out.println("Ваше число: " + secondNumber);
        console.close();
        if (evenNumber % 2 != 0) {
            System.out.println("Error");
        } else if (oddNumber(secondNumber) == 0) {
            System.out.println("Нет нечетного числа");
        } else {
            System.out.println("Нечетное число" + secondNumber);
        }
    }
    public static int oddNumber( int b) {
        if (b % 2 != 0) {
            return b;
        }
        return 0;
    }
}

