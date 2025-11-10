package home_work_3.runners;

public class WithoutCalculatorMain {
    //Создать класс WithoutCalculatorMain в котором необходимо посчитать следующие выражения:
   //1.1 4.1 + 15 * 7 + (28 / 5) ^ 2. Вывести сохранённый результат в консоль. Внимание, знак
    // "^" обозначает возведение в степень.

    public static void main(String[] args) {

        double allExample = 4.1 + 15 * 7 + Math.pow((28.0 / 5.0) , 2);//результат 140,46
        System.out.printf("%.2f\n", allExample);
    }
}
