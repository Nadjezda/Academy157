package home_work_2.arrays;

import home_work_2.arrays.api.IArraysOperation;

public class ForEachOperation implements IArraysOperation {
    //2.3.4. ForEachOperation - во всех методах можно использовать только foreach
    //2.2.1. Вывести все элементы в консоль.
    //		2.2.2. Вывести каждый второй элемент массива в консоль.
    //		2.2.3. Вывести все элементы массива в консоль в обратном порядке.
    // вывод массива в консоль
    public void output(int[] container, int i) {
        for (int elements : container) {
            System.out.print(elements + " ");
        }
        System.out.println();
    }

    //вывод каждого второго элемента в консоль
    public void everySecond(int[] container, int i) {
        i = 0;
        for (int elements : container) {
            if (i % 2 != 0) {
                System.out.print(container[i] + " ");
                i++;
            } else {
                i++;
            }
        }
        System.out.println();
    }

    // вывод элементов массива в обратном порядке
     public void reversArray (int[] container, int i){
         int [] reversArray = new int [container.length];

         for(i = container.length - 1; i >= 0; i--){
             reversArray[(container.length - 1) - i] = container[i];}
             for (int elements : reversArray) {
                System.out.print(elements + " ");
            }
        }
    }




