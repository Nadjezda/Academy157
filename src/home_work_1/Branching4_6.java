package home_work_1;

import java.util.Scanner;

public class Branching4_6 {
    public static void main(String[] args) {
        //4.6 Определить високосный год или нет
        Scanner console = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = console.nextInt();
        System.out.println("Ваш год " + year);
        console.close();
        leapYear(year);
    }

public static int leapYear(int year){
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            return 1;
        }else {
            return 0;
        }
    }
}
