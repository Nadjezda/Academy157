package home_work_5.seachers;

import home_work_5.seachers.api.IGetCount;
import home_work_5.seachers.api.ISearchEngine;
import home_work_5.utils.RemovePunctuation;
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

        if (text == null || word == null) {
            return -1;
        } else if (searcher instanceof EasySearch) {
            String cleanText = RemovePunctuation.removePunctuation(text);
            count = ReturnCount.returnCount(cleanText.toLowerCase(), word.toLowerCase());
        } else if (searcher instanceof RegExSearch) {
            String cleanText = RemovePunctuation.removePunctuation(text);
            Pattern pattern = Pattern.compile("\\s" + word.toLowerCase() + "\\s");
            Matcher matcher = pattern.matcher(cleanText.toLowerCase());
            count = 0;
            while (matcher.find()) {
                count++;
            }
        }
            return count;
    }
}
