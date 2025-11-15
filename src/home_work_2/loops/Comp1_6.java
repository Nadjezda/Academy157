package home_work_2.loops;

import java.util.Scanner;

public class Comp1_6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите начальное число для таблицы умножения");
        int startNumber = console.nextInt(); // число с которого начинается таблица
        System.out.println("Введите количество столбцов в ряду");
        int countColums = console.nextInt(); // количество столбцов в ряду
        System.out.println("Введите количество рядов");
        int countRows = console.nextInt(); // количество рядов

        //Заголовок
        System.out.println("ТАБЛИЦА УМНОЖЕНИЯ");
        for (int i = 0; i < countRows; i++){ // делаем фор для разделения колонок на ряды
            int finishNumber = startNumber + countColums * countRows -1; // определяем финальное число
            if(finishNumber > countColums){
                finishNumber = startNumber + countColums -1; // определяем финальное число первого ряда
            }
            printRow(startNumber, finishNumber);
            startNumber = finishNumber + 1;
            System.out.println();
        }
    }

        public static void printRow ( int from, int to){
            for (int i = 1; i <= 10; i++) {
                for (int j = from; j <= to; j++) {
                    if (i < 10) {
                        System.out.print("|" + j + " * " + i + " = " + (j * i) + "\t");
                    } else {
                        System.out.print("|" + j + " * " + i + " = " + (j * i) );
                    }
                }
                System.out.println("\n");
            }
        }


    }





