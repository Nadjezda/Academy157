package home_work_2.loops;

public class Comp1_6 {
    public static void main(String[] args) {
        // Заголовок
        System.out.println("ТАБЛИЦА УМНОЖЕНИЯ");
        printRow(2, 5);
        System.out.println();
        printRow(6, 9) ;
    }

        public static void printRow ( int from, int to){
            for (int i = 1; i <= 10; i++) {
                for (int j = from; j <= to; j++) {
                    System.out.print("|" + j + " * " + i + " = " + (j * i) + "\t");
                }
                System.out.println("\n");
            }
        }
    }




