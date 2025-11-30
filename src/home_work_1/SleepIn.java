package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class SleepIn {
    //5.* Создать СТАТИЧЕСКИЙ метод sleepIn рядом с методом main. (Взято с https://codingbat.com/prob/p187868).
    //	5.1 Данный метод будет принима два параметра
    //	5.2 Будет отвечать на вопрос спать ли дальше (да\нет) (возвращать true либо false).
    //	5.3 Первый параметр boolean weekday обозначает рабочий день
    //	5.4 Второй параметр boolean vacation обозначает отпуск.
    //	5.5 Если у нас отпуск или не рабочий день то мы можем спать дальше
    //	5.6 На основании ответа от метода sleepIn вывести сообщение можем спать дальше или пора идти на работу
    public static void main(String[] args) {
        boolean weekday;
        boolean vacation;

        Scanner console = new Scanner(System.in);
        System.out.println("Enter the day of week or vacation");
        String input = console.nextLine();
        console.close();

        if (!(Objects.equals(input, "monday") || Objects.equals(input, "tuesday") || Objects.equals(input, "wednesday") ||
                Objects.equals(input, "thursday") || Objects.equals(input, "friday")
                || Objects.equals(input, "saturday") || Objects.equals(input, "sunday") || Objects.equals(input, "vacation"))) {
            System.out.println("ERROR");
        } else if (Objects.equals(input, "vacation")) {
            vacation = true;
            weekday = true;
            sleepIn(weekday, vacation);
        } else if (Objects.equals(input, "saturday") || Objects.equals(input, "sunday")) {
            weekday = false;
            vacation = false;
            sleepIn(weekday, vacation);
        } else if ((Objects.equals(input, "monday") || Objects.equals(input, "tuesday") || Objects.equals(input, "wednesday") ||
                Objects.equals(input, "thursday") || Objects.equals(input, "friday"))) {
            weekday = true;
            vacation = false;
            sleepIn(weekday, vacation);
        }
    }
    public static boolean sleepIn(boolean weekday, boolean vacation) {
            if (vacation || (!weekday && !vacation)) {
                System.out.println("Можем спать дальше");
                return true;
            } else {
                System.out.println("Пора идти на работу");
                return false;
            }
        }
    }

