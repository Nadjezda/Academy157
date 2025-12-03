package home_work_1.branching;

import java.util.Scanner;

public class Branching4Part4 {
    public final static int SCALE = 1024;
    public static void main(String[] args) {
        //4.4 Перевести байты в килобайты или наоборот. Перевести число введенное пользователем в байти или килобайты
        // в зависимости от его выбора.

        Scanner console = new Scanner(System.in);
        System.out.print("Enter 1 if you want to convert bytes to kilobytes \n" +
                "Enter 2 if you want to convert kilobytes to bytes \n" + "Make your choice\n");// выбираем что во что будем конвертировать
        int choice = console.nextInt();
        System.out.println("Your choice is: " + choice);

        System.out.println("Enter the quantity you want to convert: ");//выбираем количество для конвертации
        double quantity = console.nextDouble();
        System.out.println("Your quantity is: " + quantity);
        console.close();

        convert(choice, quantity);
    }

    public static double convert(int a, double b){
        switch (a) {
            case 1:
                return b / SCALE;
            case 2:
                return b * SCALE;
            default:
                return 0;
                }
            }
        }
