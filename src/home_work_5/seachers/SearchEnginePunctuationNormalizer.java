package home_work_5.seachers;

import home_work_5.seachers.api.ISearchEngine;
import home_work_5.utils.RemovePunctuation;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {

    private final ISearchEngine searchEngine;


    public SearchEnginePunctuationNormalizer(ISearchEngine searchEngine){
        this.searchEngine = searchEngine;

    }
    @Override
    public long search(String text, String word) {
        if (text == null || word == null) {
            return -1;
        }
        String cleanText = RemovePunctuation.removePunctuation(text);
        return searchEngine.search(cleanText, word);
    }
}
