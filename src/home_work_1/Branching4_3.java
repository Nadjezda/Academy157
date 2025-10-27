package home_work1;

import java.util.Scanner;

public class Branching4_3 {
    public static void main(String[] args) {
        //4.3 Проверка делимости одного числа на другое. Вводится два числа, проверить делится ли первое на второе.
        // Вывести на экран сообщение об этом, результат и остаток если он есть.
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число которое будем делить: ");
        int delimoye = console.nextInt();
        System.out.println("Введите число на которое будем делить: ");
        int delitel = console.nextInt();
        System.out.println("Your numbers are: " + delimoye + "," + delitel);
        console.close();
        int answer = delimoye / delitel;
        int rest = delimoye % delitel;

        if (delitel == 0) {
            System.out.println("На ноль делить нельзя");
        }else if (delimoye == 0) {
            System.out.println("Результат деления равен нулю");
        }else if (rest == 0) {
            System.out.println("Разделили без остатка, результат: " + answer);
        }else{
            System.out.println("Разделили с остатком = " + rest + " и результатом = " + answer);
             }
    }
}

