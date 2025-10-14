package homeWork1;

import java.util.Scanner;

public class Branching4_4 {
    public static void main(String[] args) {
        //4.4 Перевести байты в килобайты или наоборот. Перевести число введенное пользователем в байти или килобайты
        // в зависимости от его выбора.
        double quantity;
        double bytes;
        double kilobytes;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter 1 if you want to convert bytes to kilobytes \n" +
                "Enter 2 if you want to convert kilobytes to bytes \n" + "Make your choice\n");// выбираем что во что будем конвертировать
        int choice = console.nextInt();
        System.out.println("Your choice is: " + choice);

        System.out.println("Enter the quantity you want to convert: ");//выбираем количество для конвертации
        quantity = console.nextFloat();
        System.out.println("Your quantity is: " + quantity);

        bytes = quantity * 1024;//перевод килобайты в байты
        kilobytes = quantity / 1024;// перевод байты в килобайты

        switch (choice) {
            case 1:
                System.out.println(quantity + "байт = " + kilobytes + "KБ");
                break;
            case 2:
                System.out.println(quantity + "KБ = " + bytes + "байт");
                    break;
            default:
                System.out.println("Вы ввели странные данные");
                }
            }
        }
