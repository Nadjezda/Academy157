package home_work_4.runners;

import home_work_4.generics.DataContainer;
import home_work_4.utils.IntegerComparator;
import home_work_4.utils.StringLengthComparator;

import java.util.Arrays;

public class DataContainerSorterMain {
    public static void main(String[] args) {
        //9.1 Пример data = [3, 1, 3, 777]. Вызывают sort(....) передавая компаратор чисел.
        // Должно получиться data = [1, 3, 3, 777]

        DataContainer<Integer> container = new DataContainer<>(new Integer[]{3, 1, 3, 777});
        container.sort(new IntegerComparator());
        System.out.println(Arrays.toString(container.getItems()));
        container = new DataContainer<>(new Integer[]{3, 1, 3, 777});
        DataContainer.sort(container);
        System.out.println(Arrays.toString(container.getItems()));
        container = new DataContainer<>(new Integer[]{3, 1, 3, 777});
        DataContainer.sort(container,new IntegerComparator());
        System.out.println(Arrays.toString(container.getItems()));


        //	9.2 Пример data = ["i", "hello", "1", "Как домашка"]. Вызывают sort(....)
        //	передавая компаратор строк по длинне. Должно получиться data = ["i", "1", "hello", "Как домашка"]

        DataContainer<String> container1 = new DataContainer<>(new String[]{"i", "hello", "1", "Как домашка"});
        container1.sort(new StringLengthComparator());
        System.out.println(Arrays.toString(container1.getItems()));
        container1 = new DataContainer<>(new String[]{"i", "hello", "1", "Как домашка"});
        DataContainer.sort(container1);
        System.out.println(Arrays.toString(container1.getItems()));
        container1 = new DataContainer<>(new String[]{"i", "hello", "1", "Как домашка"});
        DataContainer.sort(container1, new StringLengthComparator());
        System.out.println(Arrays.toString(container1.getItems()));
    }
}
