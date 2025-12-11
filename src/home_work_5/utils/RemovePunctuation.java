package home_work_5.utils;

public class RemovePunctuation {


    public static String removePunctuation(String text) {
        StringBuilder builder = new StringBuilder();
        builder.append(" ");
        for (char c : text.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                builder.append(c);
            } else if (c == ' ') {
                builder.append(c);
            } else if (c == '-') {
                builder.append(c);
            } else if (c == text.length()) {
                builder.append(c + ' ');
            } else {
                builder.append(' ');
            }
        }
        String result = builder.toString();
        if (!result.endsWith(" ")) {
            builder.append(" ");
            return builder.toString();
        } else {

            return result;
        }
    }
}
