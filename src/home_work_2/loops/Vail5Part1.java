package home_work_2.loops;

public class Vail5Part1 {
    //1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе. Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
    //        Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
    //    	1.1.2.* Используя рекурсию
    //5. Переделать задание 1, убрав оттуда точки входа, добавить класс для тестов протестировать
    // примерами из задания и своими примерами обязательно.

    /**
     * Высчитывает факториал числа
     * @param number число факториал которого надо вычислить
     * @return факториал числа
     */

    public static long factiorial(long number) {
        if (number >= 20 || number <= 0) { // ограничение для избежаничя ошибок
            System.out.println("Введите число от 1 до 19");
            return 0;
        } else {
        long composition = 1; // для результата умножения
        for (int i = 1; i <= number; i++) { // запускаем цикл для умножения и вывода в консоль
            composition *= i;
            if (i < number) {
                System.out.print(i + " * ");
            } else {
                System.out.print(i); // для вывода числа без знака
            }
        }
        }
        System.out.println(" = " + factorialRecurs(number));
        return factorialRecurs(number);
    }

    public static long factorialRecurs(long a){
        if (a == 1) return 1;
        return a * factorialRecurs(a - 1);// рекурсивный спуск

    }

    }




