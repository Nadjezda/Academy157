package home_work_2.arrays;
import home_work_2.utils.ArraysUtils;

import java.util.Arrays;

public class Dz2_1_1_1 {
    //2.1.1.1. Пример в отдельном классе с main. int[] container = arrayFromConsole(). Результат: В методе arrayFromConsole
    // будет запрошена информация у пользователя, пользователь вводит размер (3) и его элементы по порядку {4, 17, 32}.
    // Соответсвенно будет создан массив размером 3 с элементами {4, 17, 32} и сохранён в переменную container.
    public static void main(String[] args) {
        int [] container = ArraysUtils.arrayFromConsole();// вызываем метод заполнения массива через консоль
        System.out.println(Arrays.toString(container)); // печатаем результат
    }
}
