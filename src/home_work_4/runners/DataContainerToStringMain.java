package home_work_4.runners;

import home_work_4.generics.DataContainer;

public class DataContainerToStringMain {
    public static void main(String[] args) {
//10.1 Пример data = [1, 2, 3, 777, 3]. Вызывают toString() у созданного DataContainer. Возвращается строка [1, 2, 3, 777, 3]
        DataContainer<Integer> container1 = new DataContainer<>(new Integer[]{1, 2, 3, 777, 3});
        System.out.println(container1);
        for(Integer items: container1) {
            System.out.println(items);
        }
//	10.2 Пример data = [1, 2, 3, null]. Вызывают toString() у созданного DataContainer. Возвращается строка [1, 2, 3]
        container1.setData(new Integer[] {1, 2, 3, null});
        System.out.println(container1);
        for(Integer items: container1) {
            System.out.println(items);
        }

//	10.3 Пример data = []. Вызывают toString() у созданного DataContainer. Возвращается строка []
        container1.setData(new Integer[] {});
        System.out.println(container1);

    }
}
