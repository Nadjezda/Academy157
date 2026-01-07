package home_work_5.seachers;


import home_work_5.seachers.api.IGetCount;
import home_work_5.seachers.api.ISearchEngine;
import home_work_5.utils.CleanText;
import home_work_5.utils.ReturnCount;

public class EasySearch implements ISearchEngine, IGetCount {

    private long count;

    @Override
    public long getCount() {
        return count;
    }

    @Override
    public long search(String text, String word) {

        if (text == null || word == null) {
            return -1;
        }
        String result = CleanText.cleanText(text);
        count = ReturnCount.returnCount(result, word);

        return count;
    }
}
