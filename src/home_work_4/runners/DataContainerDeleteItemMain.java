package home_work_4.runners;

import home_work_4.generics.DataContainer;

import java.util.Arrays;

public class DataContainerDeleteItemMain {
    public static void main(String[] args) {

        //создаем объект
        DataContainer<Integer> container1 = new DataContainer<>(new Integer[]{1, 2, 3, 777});

        //8.1.1 Пример data = [1, 2, 3, 777]. Вызывают delete(null). Метод delete вернёт false a data = [1, 2, 3, 777]
        boolean firstDeleteItem = container1.delete(null);
        System.out.println(Arrays.toString(container1.getItems()));
        System.out.println(firstDeleteItem);

        // //8.2.1 Пример data = [1, 2, 3, 777]. Вызывают delete(777). Должно получиться data = [1, 2, 3].
        // Метод delete вернёт true
        boolean thirdDeleteItem = container1.delete((Integer) 777);
        System.out.println(Arrays.toString(container1.getItems()));
        System.out.println(thirdDeleteItem);

        //8.1.2 Пример data = [1, 2, 3, 777, null]. Вызывают delete(null).
        // Метод delete вернёт false a data = [1, 2, 3, 777, null]
        container1.setData(new Integer[]{1,2,3,777, null});
        boolean secondDeleteItem = container1.delete(null);
        System.out.println(Arrays.toString(container1.getItems()));
        System.out.println(secondDeleteItem);

       //8.3.1 Пример data = [1, 2, 3, 777]. Вызывают delete(111). Должно получиться data = [1, 2, 3, 777].
        // Метод delete вернёт false
        container1.setData(new Integer[]{1,2,3,777});
        boolean fourthDeleteItem = container1.delete((Integer)111);
        System.out.println(Arrays.toString(container1.getItems()));
        System.out.println(fourthDeleteItem);

        //8.4.1 Пример data = [1, 2, 3, 777, 3]. Вызывают delete(3). Должно получиться data = [1, 2, 777, 3].
        // Метод delete вернёт true
        container1.setData(new Integer[]{1,2,3,777,3});
        boolean fifthDeleteItem = container1.delete((Integer)3);
        System.out.println(Arrays.toString(container1.getItems()));
        System.out.println(fifthDeleteItem);
    }
}
