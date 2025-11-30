package home_work_1;

public class ForMath3 {
    public static void main(String[] args) {
        //3. Изучить библиотеку (класс) Math из jdk. Отразить эксперименты в сданной домашней работе. Материалов в интернете очень много
        double a = 12;
        double b = 87;
        System.out.println(Math.max(a,b)); // находим максимальное значение
        System.out.println(Math.min(a,b));// находим минимальное

        double c = - 138;
        System.out.println(Math.abs(c)); //находим модуль

        // Задача: Есть прямоугольный треугольник, знаем размер катетов, найти гипотенузу.
        double d = 16; // первый катет
        double e = 8; //второй катет
        double f = (Math.sqrt(Math.pow(d,2) + Math.pow(e,2))); // гипотенуза
        System.out.printf(" The hypotenus is : %.2f cm \n ", f);

        //Задача: Найдем длину окружности и её площадь. Знаем, что радиус равен 6.
        double g = 6; // радиус
        double h = 2 * Math.PI * g;// длина окружности С = 2*пи*r
        double j = Math.PI * Math.pow(g,2); //S = пи*r в квадрате
        System.out.printf("The circumference is: %.2f cm\n" , h);
        System.out.printf(" The arie is: %.2f cm² \n", j);

        double k = 2.478957;
        System.out.println(Math.round(k));
        System.out.println(Math.floor(k));
        System.out.println(Math.ceil(k));
    }
}
