package homeWork1;

import java.util.Scanner;

public class Branching4_2 {
    public static void main(String[] args) {
        //4.2 Среди трёх чисел найти среднее, которое больше минимального, но меньше максимального
        Scanner console = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int number1 = console.nextInt();
        System.out.println("Enter number2: ");
        int number2 = console.nextInt();
        System.out.println("Enter number3: ");
        int number3 = console.nextInt();
        System.out.println("Your numbers are: " + number1 + "," + number2 + "," + number3);
        console.close();

        if (number3 == number2 && number2 == number1) {
            System.out.println("We haven't middle number");
        } else {
            int max = Math.max(number1, number2);
            int max1 = Math.max(number2, number3);
            if (max1 == max) {
                System.out.println("The middle is: " + Math.max(number1, number3));
            } else {
                System.out.println("The middle is: " + Math.min(max, max1));
            }
        }
    }
}


