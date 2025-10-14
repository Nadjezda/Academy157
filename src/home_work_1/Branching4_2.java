package homeWork1;

import java.util.Scanner;

public class Branching4_2 {
    public static void main(String[] args) {
        //4.2 Среди трёх чисел найти среднее, которое больше минимального, но меньше максимального
        Scanner console = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int a = console.nextInt();
        System.out.println("Enter number2: ");
        int b = console.nextInt();
        System.out.println("Enter number3: ");
        int c = console.nextInt();
        System.out.println("Your numbers are: " + a + "," + b + "," + c);
        int min = 0;
        int max = 0;
        int midle = 0;

        if (a < b && a < c) {// находим минимальное
            min = a;
            System.out.println("Min number is: " + min);
        }else if (b < a && b < c) {
            min = b;
            System.out.println("Min number is: " + min);
        }else if (c < a && c < b) {
            min = c;
            System.out.println("Min number is: " + min);
        }else{
            System.out.println("We have no one min number");
             }

        if (a > b && a > c) {//находим максимальное
            max = a;
            System.out.println("Max number is: " + max);
        }else if (b > a && b > c) {
            max = b;
            System.out.println("Max number is: " + max);
        }else if (c > a && c > b) {
            max = c;
            System.out.println("Max number is: " + max);
        }else{
            System.out.println("We have no one max number");
        }

        if ((a == b) || (a == c) || (b == c)) {//находим среднее
            System.out.println("Нет среднего");
        } else {
            midle = (a + b + c) - min - max;
            System.out.println("Среднее значение: " + midle);
        }
    }
}

