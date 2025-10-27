package homeWork1;

import java.util.Scanner;

public class Branching4_5 {
    //4.5 Буква или иной символ. Вводиться целое число, обозначающее код символа по ASCII.
    // Определить это код английской буквы или иной символ.
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int input = console.nextInt();
        console.close();

        if ((input >= 65 && input <= 90 ) || (input >= 97 && input <= 122)) {//  в десятичной большие латинские буквы от 65 до 90,
            // маленькие от 97 до 122
            System.out.println("It is a letter");
        }else{
            System.out.println("It is another simbol");
        }

    }
}
