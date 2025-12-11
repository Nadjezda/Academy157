package home_work_5.utils;

public class CleanText {
    public static String cleanText(String text) {
        if (text.contains(".") || text.contains(",") || text.contains("\n") || text.contains("!") || text.contains("?") || text.contains("-")) {
            return RemovePunctuation.removePunctuation(text);
        } else {
            return AddSpase.addSpase(text);
        }
    }
}
