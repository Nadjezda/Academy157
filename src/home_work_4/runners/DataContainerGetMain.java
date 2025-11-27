package home_work_4.runners;

import home_work_4.generics.DataContainer;

import java.util.Arrays;

public class DataContainerGetMain {
    public static void main(String[] args) {
        // создаем объект
        DataContainer<Integer> container1 = new DataContainer<>(new Integer[]{});

       //5.1 Пример: data = []. Вызвали add(9999). Получили data = [9999]. Метод add вернул число 0.
        // Вызываем get(0). Метод get возвращает 9999
        int indexOfFifthNumber = container1.add(9999);
        System.out.println(Arrays.toString(container1.getItems()));
        System.out.println(indexOfFifthNumber);
        System.out.println(container1.get(indexOfFifthNumber));

       //5.2 Пример: data = [9999]. Вызываем get(1). Метод get возвращает null
        System.out.println(container1.get(1));
    }
}
