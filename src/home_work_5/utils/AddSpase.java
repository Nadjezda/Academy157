package home_work_5.utils;

public class AddSpase {

    public static String addSpase(String text) {
        StringBuilder builder = new StringBuilder();
        builder.append(" ");
        builder.append(text);
        if(!text.endsWith(" ")) {
            builder.append(" ");
        }
            return builder.toString();
        }
    }

