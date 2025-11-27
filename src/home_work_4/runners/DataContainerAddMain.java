package home_work_4.runners;

import home_work_4.generics.DataContainer;

import java.util.Arrays;

public class DataContainerAddMain {
    public static void main(String[] args) {
          //создаем объект
        DataContainer<Integer> container1 = new DataContainer<>(new Integer[]{1, 2, 3, null, null, null});
       //4.1.1 Пример: data = [1, 2, 3, null, null, null]. Вызвали add(777). Должно получиться data = [1, 2, 3, 777, null, null].
        // Метод add вернёт число 3.
        int indexOfFirstNumber = container1.add(777);
        System.out.println(Arrays.toString(container1.getItems()));
        System.out.println(indexOfFirstNumber);

       //4.1.2 Пример: data = [1, 2, 3, null, null, null]. Вызвали add(null). Должно получиться data = [1, 2, 3, null, null, null].
        // Метод add вернёт число -1. -1 будет индикатором того что данный элемент в наш контейнер вставлять нельзя.
        container1.setData(new Integer[] {1,2,3,null,null,null});
        System.out.println(Arrays.toString(container1.getItems()));
        int indexOfNull = container1.add(null);
        System.out.println(indexOfNull);

        //4.1.3 Пример: data = [1, null, 3, null, null, null]. Вызвали add(777).
        // Должно получиться data = [1, 777, 3, null, null, null]. Метод add вернёт число 1.
        container1.setData(new Integer[]{1, null, 3, null, null, null});
        int indexOfSecondNumber = container1.add(777);
        System.out.println(Arrays.toString(container1.getItems()));
        System.out.println(indexOfSecondNumber);

      //4.2.1 Пример: data = [1, 2, 3]. Вызвали add(777). Должно получиться data = [1, 2, 3, 777]. Метод add вернёт число 3.
        container1.setData(new Integer[]{1,2,3});
        int indexOfThirdNumber = container1.add(777);
        System.out.println(Arrays.toString(container1.getItems()));
        System.out.println(indexOfThirdNumber);

       //4.2.2 Пример: data = []. Вызвали add(777). Должно получиться data = [777]. Метод add вернёт число 0.
        container1.setData(new Integer[]{});
        int indexOfFourthNumber = container1.add(777);
        System.out.println(Arrays.toString(container1.getItems()));
        System.out.println(indexOfFourthNumber);
    }
}
