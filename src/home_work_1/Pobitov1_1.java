package home_work_1;

import java.util.Scanner;

public class Pobitov1_1 {
    //1.1 Создать класс и написать код с вводом двух чисел через консоль и
    // применением побитовых операций И и ИЛИ к этим двум числам. Результат операций распечатать.1.2 В комментариях напротив
    // каждого ввода значений написать пример выбранного числа в двоичном коде (8 бит), также написать комментарии
    // напротив каждой операции на примере этих двух чисел.
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);//используем класс Scanner  в котором используем класс System  в котором используем объект in
        System.out.println("Enter number1: ");//например 6 в двоичной 00000110
        int a = console.nextInt();// a = 00000110
        System.out.println("Enter number2: ");// например 8 в двоичной 00001000
        int b = console.nextInt();// b = 00001000

        int pobitAnd = a & b;// итог ноль
        int pobitOr = a | b;// итог 14 в двоичной 00001110

        System.out.println(pobitAnd);
        System.out.println(pobitOr);
    }
}
