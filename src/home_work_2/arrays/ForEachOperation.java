package home_work_2.arrays;

import home_work_2.arrays.api.IArraysOperation;

import java.util.Arrays;

public class ForEachOperation implements IArraysOperation {
    //2.3.4. ForEachOperation - во всех методах можно использовать только foreach
    //2.2.1. Вывести все элементы в консоль.
    //		2.2.2. Вывести каждый второй элемент массива в консоль.
    //		2.2.3. Вывести все элементы массива в консоль в обратном порядке.
    // вывод массива в консоль
    @Override
    public String output(int[] container) {
        for (int elements : container) {
            System.out.print(elements + " ");
        }
        System.out.println();
        return Arrays.toString(container);
    }

    //вывод каждого второго элемента в консоль
    @Override
    public String everySecond(int[] container) {
        int [] everySecondContainer = new int [container.length / 2 + (container.length % 2)];
        int i = 0, index = 0;
        for (int elements : container) {
            if (i % 2 != 0) {
                System.out.print(container[i] + " ");
                everySecondContainer[index ] = container[i];
                index++;
                i++;
            } else {
                i++;
            }
        }
        System.out.println();
        return Arrays.toString(everySecondContainer);
    }

    // вывод элементов массива в обратном порядке
    @Override
     public String reversArray (int[] container){
        int i = container.length - 1;
         int [] reversArray = new int [container.length];

         for(i = container.length - 1; i >= 0; i--){
             reversArray[(container.length - 1) - i] = container[i];}
             for (int elements : reversArray) {
                 System.out.print(elements + " ");
             }
                 return Arrays.toString(reversArray);

        }
    }




