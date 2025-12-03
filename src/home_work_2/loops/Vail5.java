package home_work_2.loops;

public class Vail5 {
    //1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
    // Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
    //        Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
    //    	1.1.1. Используя только цикл
//5. Переделать задание 1, убрав оттуда точки входа, добавить класс для тестов протестировать
// примерами из задания и своими примерами обязательно.

    public static String factiorial(long number) {
        long composition = 1; // для результата умножения
        for (int i = 1; i <= number; i++) { // запускаем цикл для умножения и вывода в консоль
            composition *= i;
            if (composition <= (Long.MAX_VALUE / (i+1))) {
                if (i < number) {
                    System.out.print(i + " * ");
                } else {
                    System.out.print(i); // для вывода числа без знака
                }
            } else {
                System.out.println("Переполнение");
                return "Переполнение";
            }
        }
        System.out.println(" = " + composition);
            return " = " + composition;
        }
    }





