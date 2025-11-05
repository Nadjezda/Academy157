package home_work_2.loops;

import java.util.Scanner;

public class Vail1_1_2 {
    //1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе. Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
    //        Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
    //    	1.1.2.* Используя рекурсию
    public static void main(String[] args) {

        int enterNumber = Integer.parseInt(args[0]);

        if (enterNumber >= 21 || enterNumber <= 0) { // ограничение для избежаничя ошибок
            System.out.println("Введите число от 1 до 21");
        } else {
            for (int i = 1; i <= enterNumber; i++) { // запускаем цикл для умножения и вывода в консоль
                if (i < enterNumber) {
                    System.out.print(i + " * ");
                } else {
                    System.out.print(i); // для вывода числа без знака
                }
            }
        }
        System.out.println(" = " + factorial(enterNumber));
    }

    public static int factorial(int a){
        if (a == 1) return 1;
        return a * factorial(a - 1);

    }

    }




