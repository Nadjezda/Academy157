package home_work_5.utils;

public class RemovePunctuationEx {


    public static String removePunctuation(String text) {
        StringBuilder builder = new StringBuilder();
        builder.append(" ");
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetterOrDigit(text.charAt(i)) &&  (i + 2) < text.length()) {
                char leftIndex = text.charAt(i);
                char middleIndex = text.charAt(i + 1);
                char rightIndex = text.charAt(i + 2);
                if(Character.isLetterOrDigit(leftIndex) && Character.isLetterOrDigit(rightIndex) && middleIndex == '-') {
                    builder.append(leftIndex);
                    builder.append(middleIndex);
                    builder.append(rightIndex);
                    i += 2;
                    continue;
                } else {
                    builder.append(leftIndex);
                }
            } else if (Character.isLetterOrDigit(text.charAt(i))) {
                builder.append(text.charAt(i));
            } else {
                builder.append(' ');
            }
        }
                return builder.toString();
        }
    }


