package home_work_1.runners;

import home_work_1.enumchik.EWeekday;

import java.util.Scanner;

public class SleepOrGo {
    private final String StringToSleep = "Можно спать дальше.";
    private final String StringToGo = "Пора идти на работу.";

    public String getStringToGo() {
        return StringToGo;
    }

    public String getStringToSleep() {
        return StringToSleep;
    }

    //5.* Создать СТАТИЧЕСКИЙ метод sleepIn рядом с методом main. (Взято с https://codingbat.com/prob/p187868).
    //	5.1 Данный метод будет принима два параметра
    //	5.2 Будет отвечать на вопрос спать ли дальше (да\нет) (возвращать true либо false).
    //	5.3 Первый параметр boolean weekday обозначает рабочий день
    //	5.4 Второй параметр boolean vacation обозначает отпуск.
    //	5.5 Если у нас отпуск или не рабочий день то мы можем спать дальше
    //	5.6 На основании ответа от метода sleepIn вывести сообщение можем спать дальше или пора идти на работу
    public static void main(String[] args) {
        boolean vacation = false;
        boolean weekday = false;
        Scanner console = new Scanner(System.in);
        System.out.println("Вы в отпуске? Введите 'да' если правда.");
        String input = console.nextLine();
        System.out.println("Введите день недели");
        String nextInput = console.nextLine();
        console.close();
        try {
            vacation = OnVacation(input);
        } catch (IllegalArgumentException e) {
            System.out.print(e.getMessage());
        }
        try {
            weekday = dayOfWeek(nextInput);
        } catch (IllegalArgumentException e) {
            System.out.print(e.getMessage());
        }

        SleepOrGo sog = new SleepOrGo();
        if (!vacation && weekday) {
            System.out.print(sog.getStringToGo());
        } else {
            System.out.print(sog.getStringToSleep());
        }

    }
    public static boolean OnVacation (String string) {
        if (string.equalsIgnoreCase("да")) {
            return true;
        } else if (string.equalsIgnoreCase("нет")) {
            return false;
        } else {
            throw new IllegalArgumentException("Введенное слово не соответсвует слову 'да' или 'нет'");
        }
    }


    public static boolean dayOfWeek (String string) {
        EWeekday[] values = EWeekday.values();
        String upperCaseString = string.toUpperCase();
        for (EWeekday item : values) {
            if (upperCaseString.equalsIgnoreCase("SATURDAY") ||
                    upperCaseString.equalsIgnoreCase("SUNDAY")) {
                return false;
            } else if (upperCaseString.equals(item.name())) {
                return true;
            } else if (string.equalsIgnoreCase("Суббота") ||
                    string.equalsIgnoreCase("Воскресенье")){
                return false;
            } else if (string.equalsIgnoreCase(item.getRusName())){
                return true;
            }
        }
                throw new IllegalArgumentException("Нет такого дня недели.");
            }

}




