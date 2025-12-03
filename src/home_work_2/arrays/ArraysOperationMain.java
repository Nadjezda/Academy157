package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

//		2.2.1. Вывести все элементы в консоль.
//		2.2.2. Вывести каждый второй элемент массива в консоль.
//		2.2.3. Вывести все элементы массива в консоль в обратном порядке.
//	2.3* Выполнить задание 2.2 иным способом. Создать интерфейс IArraysOperation с методами из задания,
//	каждый метод должен принимать массив с которым он будет работать. Написать 4 отдельных класса и реализовать данный интерфейс:
//		2.3.1. DoWhileOperation - во всех методах можно использовать только do....while
//		2.3.2. WhileOperation - во всех методах можно использовать только while
//		2.3.3. ForOperation - во всех методах можно использовать только for
//		2.3.4. ForEachOperation - во всех методах можно использовать только foreach
public class ArraysOperationMain {
    public static void main(String[] args) {

        int [] container = ArraysUtils.arrayRandom(10,100);
        System.out.println(" do while ");
        DoWhileOperation doshka = new DoWhileOperation();
        doshka.output(container);
        doshka.everySecond(container);
        doshka.reversArray(container);

        System.out.println(" while ");
        WhileOperation whilushka = new WhileOperation();
        whilushka.output(container);
        whilushka.everySecond(container);
        whilushka.reversArray(container);

        System.out.println(" for ");
        ForOperation forushka = new ForOperation();
        forushka.output(container);
        forushka.everySecond(container);
        forushka.reversArray(container);

        System.out.println(" foreach ");
        ForEachOperation forechka = new ForEachOperation();
        forechka.output(container);
        forechka.everySecond(container);
        forechka.reversArray(container);
    }
}
