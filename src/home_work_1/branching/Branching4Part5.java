package home_work_1.branching;

import java.util.Scanner;

public class Branching4Part5 {
    //4.5 Буква или иной символ. Вводиться целое число, обозначающее код символа по ASCII.
    // Определить это код английской буквы или иной символ.
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int input = console.nextInt();
        console.close();

        ifLetter(input) ;
    }

    public static int ifLetter(int a) {
        if ((a >= 65 && a <= 90) || (a >= 97 && a <= 122)) {//  в десятичной большие латинские буквы от 65 до 90,  а маленькие от 97 до 122
            return 1;
        } else {
            return 0;
        }
    }
}


