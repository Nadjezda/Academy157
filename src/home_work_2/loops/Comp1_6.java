package home_work_2.loops;

public class Comp1_6 {
    public static void main(String[] args) {
        int result = 1;

        // Заголовок
        System.out.println("             ТАБЛИЦА \n             УМНОЖЕНИЯ");

        // Печать верхней части таблицы умножения
        for (int i = 1; i <= 10; i++) {
            for (int one = 2; one <= 5; one++) {
                result = one * i;
                System.out.print(one + "*" + i + "=" + result + " | ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------");
        // печать нижней части
        for (int i = 1; i <= 10; i++) {
            for (int one = 6; one > 5 && one <= 9; one++) {
                result = one * i;
                System.out.print(one + "*" + i + "=" + result + " | ");
            }
            System.out.println();
        }
        System.out.println("------------------------------------");
        System.out.print("ЭТО\nНАДО\nЗНАТЬ!\n");// печать слов внизу таблицы
    }
}


