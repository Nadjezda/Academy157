package home_work_4.runners;

import home_work_4.generics.DataContainer;

import java.util.Arrays;

public class DataContainerDeleteIndexMain {
    public static void main(String[] args) {

        //создаем объект
        DataContainer<Integer> container1 = new DataContainer<>(new Integer[]{1, 2, 3, 777});
        //7.1.1 Пример data = [1, 2, 3, 777]. Вызывают delete(3). Должно получиться data = [1, 2, 3]. Метод delete вернёт true
        boolean firstDelete = container1.delete(3);
        System.out.println(Arrays.toString(container1.getItems()));
        System.out.println(firstDelete);

       //7.2.1 Пример data = [1, 2, 3, 777]. Вызывают delete(9). Должно получиться data = [1, 2, 3, 777]. Метод delete вернёт false
        container1.setData(new Integer[]{1,2,3,777});
        boolean secondDeleteNumber = container1.delete(9);
        System.out.println(Arrays.toString(container1.getItems()));
        System.out.println(secondDeleteNumber);

       //7.3.1 Пример data = [1, 2, 3, 777]. Вызывают delete(2). Должно получиться data = [1, 2, 777]. Метод delete вернёт true
        boolean thirdDeleteNumber = container1.delete(2);
        System.out.println(Arrays.toString(container1.getItems()));
        System.out.println(thirdDeleteNumber);

    }
}
