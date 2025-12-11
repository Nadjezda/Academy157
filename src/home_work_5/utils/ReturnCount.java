package home_work_5.utils;

public class ReturnCount {

    public static long returnCount (String text, String word){
        long count = 0;
        int indexOfWord = 0;

        while (indexOfWord != -1) {
            indexOfWord = text.indexOf(word, indexOfWord);
            if (indexOfWord == -1) {
                return count;
            } else {
                if (indexOfWord < text.length())
                    count++;
                if (word != " ") {
                    indexOfWord += word.length() - 1;
                } else {
                    indexOfWord += word.length();
                }
            }
        }

        return count;
    }

}
