package home_work_2.loops;

import java.util.Scanner;

public class Vail1_2 {
    //1.2. Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести ход вычислений в консоль.
    // Пользователь обязан ввести целое число. Если ввели не целое то выдать сообщение о том что пользователь ввёл некорректные данные.
    //		1.2.1 Пример: Ввели 181232375, должно получиться в консоли: 1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10 080
    //		1.2.2 Пример: Ввели 99.2, должно получиться в консоли: Введено не целое число
    //		1.2.3 Пример: Ввели Привет, должно получиться в консоли: Введено не число
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое число ");
        String enterNumber = console.nextLine();// сохраняем число в строке
        String reversedString = new StringBuilder(enterNumber).reverse().toString(); // переворачиваем строку
        long composition = 1; //для сбора результата умножения

        if (reversedString.contains(",")) {
            System.out.println("Введено не целое число");// проверяем содержит ли строка запятую
        } else if (reversedString.matches("[a-zA-Z]+") || reversedString.matches("[а-яА-Я]+")) { // проверяем слово ли
            System.out.println("Введено не число");
        } else {
            long numberForWork = Long.parseLong(reversedString); // переводим строку в число

            for (int i = 0; i < reversedString.length(); i++) {
               long result = numberForWork % 10;// временная переменная
                composition *= result;
                if (i < reversedString.length() - 1) {
                    System.out.print(result + " * ");
                } else {
                    System.out.print(result);
                }
                numberForWork = numberForWork / 10;
            }
            System.out.print(" = " + composition);
        }
    }
}





