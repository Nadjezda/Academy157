package home_work_2.loops;

import java.util.Random;
import java.util.Scanner;

public class Hw1_5 {
//    1.5. Задачи в презентации. На сайте есть пояснения по каждой из этих задач. Все задачи в одном классе, в отдельных методах.
//    	1.5.1. Найти наибольшую цифру натурального числа
//    	1.5.2. Вероятность четных случайных чисел
//    	1.5.3. Посчитать четные и нечетные цифры числа
//    	1.5.4. Ряд Фибоначчи
//    	1.5.5. Вывести ряд чисел в диапазоне с шагом
//    	1.5.6. Переворот числа
    public static void main(String[] args) {
        max();
        probability();
        evenAndOdd();
        fibonachi();
        step();
        revers();
    }
   public static void max() {
       Scanner console = new Scanner(System.in);
       System.out.println("Input the number");
       long input = console.nextLong();
       long maxNumber = 0;// для сравнения и поиска максимального

       if (input <= 0) {
           System.out.println("Error");
       } else {
           while (input % 10 != 0) {// для поиска максимальной цифры в числе
               long result = 1; // временная переменная
               result = input % 10;
               maxNumber = Math.max(result, maxNumber);
               input = input / 10;
           }
           System.out.println("Max number is: " + maxNumber);
       }
   }
        // для нахождения наибольшей цифры 1.5.1
   public static void probability(){
       int numberOfInput = 1000;//выборка
       int evenNumbers = 0;//четные в выборке
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
   public static void evenAndOdd() {
       Scanner console = new Scanner(System.in); // для ввода информации пользователем
       System.out.println("Input the number");
       long input = console.nextLong();
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
       System.out.println("Even numbers = " + evenCount);
       System.out.println("Odd numbers = " + oddCount);
   } //Посчитать четные и нечетные цифры числа 1.5.3
   public static void fibonachi() {
       Scanner console = new Scanner(System.in); // для ввода информации
       System.out.println("Enter the number");
       int number = console.nextInt();

       int firstFib = 0;// первое число ряда
       int secondFib = 1;//второе число ряда

       if(number <= 0) {
           System.out.println("Enter positive number");
       }else if(number == 1){
           System.out.println("The " + number + "number Fibonacci is 1");
       }else {
           for (int i = 0; i < number; i++) { // цикл для  вывода ряда
               int tmp = firstFib + secondFib;
               System.out.print(tmp + " ");
               firstFib = secondFib;
               secondFib = tmp;
           }
           System.out.println();
       }
    } //Ряд Фибоначчи 1.5.4
   public static void step() {
       Scanner console = new Scanner(System.in); // для ввода информации
       System.out.println("Введите минимальное натуральное число");
       long minNumber = console.nextLong();
       System.out.println("Введите максимальное натуральное число");
       long maxNumber = console.nextLong();
       System.out.println("Введите шаг");
       double step = console.nextDouble();

       if (minNumber <= 0 |  step <= 0) { //проверка на ошибки ввода данных
           System.out.println("Введите корректные данные");
       } else {
           System.out.print(minNumber + " ");// для начала вывода данных

           double tmp = Math.ceil(maxNumber / step);
           for (int i = 1; i < tmp; i++) {// цикл для вывода цифр с шагом
               long tmp1 = (long) (minNumber + step);// в данном случае точность данных не имеет значения
               if ((tmp1) <= maxNumber) {
                   System.out.print((tmp1) + " ");
                   minNumber = tmp1;
               }
           }
       }
              System.out.println();
   }//Вывести ряд чисел в диапазоне с шагом 1.5.5
   public static void revers() {
       Scanner console = new Scanner(System.in); // для ввода информации
       System.out.println("Enter the number");
       long input = console.nextLong();
       long reversEnterNumber = 0; // для хранения перевернутого числа

       while(input > 0){ // цикл для переворота
           reversEnterNumber = reversEnterNumber * 10 + input % 10;
           input /= 10;
       }
       System.out.println(reversEnterNumber);
   } //Переворот числа 1.5.6
}




