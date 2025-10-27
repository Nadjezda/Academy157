package homeWork1;

import java.util.Scanner;

public class Branching4_1 {
    //4.1 Определить нечётное число: из двух случайных чисел, одно из которых четное определить и вывести на экран нечетное число
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое число и обязательно четное: ");
        int a = console.nextInt();
        System.out.println("Ваше число: " + a);
        System.out.println("Введите второе число ");
        int b = console.nextInt();
        System.out.println("Ваше число: " + b);
        console.close();

        if (a % 2 != 0) {
            System.out.println("Error");
        }else if (b % 2 == 0) {
            System.out.println("Нет нечетного числа");
        }else if (b % 2 != 0){
            System.out.println("Ваше число нечетное: " + b);
        }
    }
}

