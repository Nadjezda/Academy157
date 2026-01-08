package home_work_5.seachers;

import home_work_5.seachers.api.IGetCount;
import home_work_5.seachers.api.ISearchEngine;
import home_work_5.utils.RemovePunctuationEx;
import home_work_5.utils.ReturnCount;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchEngineDecorator implements ISearchEngine, IGetCount {

    private final ISearchEngine searcher;
    private long count;

    public SearchEngineDecorator(ISearchEngine searcher) {
        this.searcher = searcher;
    }

    @Override
    public long getCount() {
        return count;
    }

    @Override
    public long search(String text, String word) {

        if (text == null || word == null || text.length() < word.length() ) {
            return -1;
        } else if (searcher instanceof EasySearchEx) {
            String cleanText = RemovePunctuationEx.removePunctuation(text);
            count = ReturnCount.returnCount(cleanText.toLowerCase(), word.toLowerCase());
        } else if (searcher instanceof RegExSearchEx) {
            String regex = "[\\p{Punct}\\s]" + "(?i)" +word + "[\\p{Punct}\\s]";
            String regex1 = "^" + word;
            Pattern pattern = Pattern.compile(regex,Pattern.UNICODE_CHARACTER_CLASS);
            Pattern pattern1 = Pattern.compile(regex1, Pattern.CASE_INSENSITIVE| Pattern.UNICODE_CHARACTER_CLASS);
            Matcher matcher = pattern.matcher(text);
            Matcher matcher1 = pattern1.matcher(text);
            if (matcher1.find() && matcher1.start() == 0) {
                count++;
            }
                while (matcher.find()){
                    count++;
                }
            }
            return count;
    }
}
