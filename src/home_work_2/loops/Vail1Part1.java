package home_work_2.loops;

public class Vail1Part1 {
    //1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе. Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
    //        Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
    //    	1.1.1. Используя только цикл

    public static void main(String[] args) {


        long enterNumber = Integer.parseInt(args[0]);

        long composition = 1; // для результата умножения
        if (enterNumber >= 20 || enterNumber <= 0) { // ограничение для избежаничя ошибок
            System.out.println("Введите число от 1 до 19");
        } else {
            for (int i = 1; i <= enterNumber; i++) { // запускаем цикл для умножения и вывода в консоль
                composition *= i;
                if (i < enterNumber) {
                    System.out.print(i + " * ");
                } else {
                    System.out.print(i); // для вывода числа без знака
                }
            }
            System.out.print(" = " + composition);
        }
    }
}



