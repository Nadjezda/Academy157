package home_work_2.loops;

import java.util.Random;
import java.util.Scanner;

public class Hw5Part5 {
//    1.5. Задачи в презентации. На сайте есть пояснения по каждой из этих задач. Все задачи в одном классе, в отдельных методах.
//    	1.5.1. Найти наибольшую цифру натурального числа
//    	1.5.2. Вероятность четных случайных чисел
//    	1.5.3. Посчитать четные и нечетные цифры числа
//    	1.5.4. Ряд Фибоначчи
//    	1.5.5. Вывести ряд чисел в диапазоне с шагом
//    	1.5.6. Переворот числа
//5. Переделать задание 1, убрав оттуда точки входа, добавить класс для тестов протестировать
// примерами из задания и своими примерами обязательно.
    public static void main(String[] args) {

        revers(54781235);
        revers(-24875);
    }
   public static long max(long input) {
       long maxNumber = 0;// для сравнения и поиска максимального

       if (input <= 0) {
           System.out.println("Error");
           return 0;
       } else {
           while (input % 10 != 0) {// для поиска максимальной цифры в числе
               long result = 1; // временная переменная
               result = input % 10;
               maxNumber = Math.max(result, maxNumber);
               input = input / 10;
           }
           System.out.println("Max number is: " + maxNumber);
           return maxNumber;
       }
   }// для нахождения наибольшей цифры 1.5.1
   public static void probability(int numberOfInput){
        int evenNumbers = 0;
       Random random = new Random();

        for (int i = 0; i < numberOfInput ; i++) { //цикл для подсчета четных случайных чисел
            int randomNumber = random.nextInt(100);
            if (randomNumber % 2 == 0) {
                evenNumbers++;
            }
        }
        double probability = (double) evenNumbers / numberOfInput; // подсчет вероятности

            System.out.println("Количество испытаний: " + numberOfInput);
            System.out.println("Количество четных чисел в выборке: " + evenNumbers);
            System.out.println("Вероятность выпадения четных чисел: " + (probability * 100) + "%");
        } //Вероятность четных случайных чисел  1.5.2
   public static String evenAndOdd(long input) {

       long evenCount = 0; // для подсчета четный цифр
       long oddCount = 0; // для подсчета не четный цифр

       while (input > 0) {
           long result = 1; // временная переменная
           result = input % 10; // делим на цифры число
             if(result % 2 == 0) { // проверяем на четность
                 evenCount++;
             }else{
                 oddCount++;
             }
           input = input / 10;
       }

       System.out.println("even: " + evenCount + " " +  "odd: " + oddCount);
       return "even: " + evenCount + " " +  "odd: " + oddCount;
   } //Посчитать четные и нечетные цифры числа 1.5.3
   public static long rowFibonachi(int number) {
       long lastNumberFibonachi = 0;
       long firstFib = 0;// первое число ряда
       long secondFib = 1;//второе число ряда

       if(number <= 0) {
           System.out.println("Error");
           return 0;
       }else if(number == 1){
           System.out.println("The " + number + "number Fibonacci is 1");
           return 1;
       }else {
           for (int i = 0; i < number; i++) {// цикл для  вывода ряда
               if (( firstFib + secondFib) > 0){
                   lastNumberFibonachi = firstFib + secondFib;
                   System.out.print(lastNumberFibonachi + " ");
                   firstFib = secondFib;
                   secondFib = lastNumberFibonachi;
               } else {
                   System.out.println("Переполнение на " + (i+2) + "ой итерации");
                   return -1;
               }
           }
       }
           System.out.println();
           return lastNumberFibonachi;
    } //Ряд Фибоначчи 1.5.4
   public static long rowNumbersFromStep(long minNumber, long maxNumber,long step) {
       if (minNumber <= 0 |  step <= 0 | maxNumber <= 0) { //проверка на ошибки ввода данных
           System.out.println("Введите корректные данные");
           return 0;
       } else {
           System.out.print(minNumber + " ");// для начала вывода данных

           double tmp = Math.ceil(1.0 * maxNumber / step);
           long lastRowNumber = 1;

           for (int i = 1; i <= lastRowNumber; i++) {// цикл для вывода цифр с шагом
               if ((lastRowNumber + step) <= maxNumber) {
                   lastRowNumber = minNumber + step;
                   if (lastRowNumber <= maxNumber) {
                       System.out.print(lastRowNumber + " ");
                       minNumber = lastRowNumber;
                   }
               }
           }
               return lastRowNumber;

       }
   }//Вывести ряд чисел в диапазоне с шагом 1.5.5
   public static long revers(long input) {
        long reversEnterNumber = 0;
        if (input < 0) {
            input = -1 * input;
            while (input > 0) { // цикл для переворота
                reversEnterNumber = reversEnterNumber * 10 + input % 10;
                input /= 10;
            }
            System.out.println(-reversEnterNumber);
            return -reversEnterNumber;
        } else if (input >= 0){
            while (input > 0) { // цикл для переворота
                reversEnterNumber = reversEnterNumber * 10 + input % 10;
                input /= 10;
            }
            System.out.println(reversEnterNumber);
            return reversEnterNumber;
        }
       System.out.println();
        return reversEnterNumber;
   }//Переворот числа 1.5.6
}




