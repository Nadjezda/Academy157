package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class SleepIn {
    public static void main(String[] args) {
        boolean workDay;
        boolean dayOff;

        Scanner console = new Scanner(System.in);
        String input = console.nextLine();


        if ((Objects.equals(input, "Monday") || Objects.equals(input, "Tuesday") || Objects.equals(input, "Wednesday") ||
                Objects.equals(input, "Thursday") || Objects.equals(input, "Friday"))) {
            workDay = true;
            dayOff = false;
            sleepIn(workDay, dayOff);

        } else if(Objects.equals(input, "Saturday") || Objects.equals(input, "Sunday") || Objects.equals(input, "vacation")) {
            workDay = false;
            dayOff = true;
            sleepIn(workDay, dayOff);
        } else {
            System.out.println("Error");
        }
    }
    public static boolean sleepIn(boolean weekday, boolean vacation) {
            if (!weekday && vacation) {
                System.out.println("Можем спать дальше");
                return true;
            } else {
                System.out.println("Пора идти на работу");
                return false;
            }
        }
    }

