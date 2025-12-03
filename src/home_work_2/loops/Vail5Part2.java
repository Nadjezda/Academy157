package home_work_2.loops;

public class Vail5Part2 {
    //1.2. Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести ход вычислений в консоль.
    // Пользователь обязан ввести целое число. Если ввели не целое то выдать сообщение о том что пользователь ввёл некорректные данные.
    //		1.2.1 Пример: Ввели 181232375, должно получиться в консоли: 1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10 080
    //		1.2.2 Пример: Ввели 99.2, должно получиться в консоли: Введено не целое число
    //		1.2.3 Пример: Ввели Привет, должно получиться в консоли: Введено не число

    /**
     * Метод перемножает все цифри числа
     * @param enterNumber число цифры которого будем перемножать
     * @return результат перемножения цифр
     * если ввессти "" в качестве параметра или текс из нескольких слов, получим ошибку NumberFormatException
     */
    public static String multiplyAllNumbers (String enterNumber){
        if (enterNumber == null) {
            System.out.println("null");
            return null;
        }
        String reversedString = new StringBuilder(enterNumber).reverse().toString(); // переворачиваем строку
        long composition = 1; //для сбора результата умножения

        if (reversedString.contains(",") || reversedString.contains(".")) {
            System.out.println("Введено не целое число");// проверяем содержит ли строка запятую
            return "Введено не целое число";
        } else if (reversedString.matches("[a-zA-Z]+") || reversedString.matches("[а-яА-Я]+")
                || reversedString.matches("\\s+")) { // проверяем слово ли
            System.out.println("Введено не число");
            return "Введено не число";
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
            System.out.print(" = " + composition + "\n");
            return " = " + composition;
        }
    }
}





