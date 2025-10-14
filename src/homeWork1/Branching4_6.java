package homeWork1;

import java.util.Scanner;

public class Branching4_6 {
    public static void main(String[] args) {
        //4.6 Определить високосный год или нет
        Scanner console = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = console.nextInt();
        System.out.println("Ваш год " + year);

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("Год високосный");
        }else {
            System.out.println("Год не високосный");
        }
    }
}
