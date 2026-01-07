package home_work_5.seachers;

import home_work_5.seachers.api.IGetCount;
import home_work_5.seachers.api.ISearchEngine;
import home_work_5.utils.RemovePunctuation;
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
            String regex = "[\\p{Punct}\\p{Space}]" + Pattern.quote(word) + "[^a-zA-Zа-яА-ЯёЁ]";
            Pattern pattern = Pattern.compile(regex, 0);
            Matcher matcher = pattern.matcher(text.toLowerCase());
            count = 0;
            while (matcher.find()) {
                ++count;
            }
        }
            return count;
    }
}
