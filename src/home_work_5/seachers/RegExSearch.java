package home_work_5.seachers;

import home_work_5.seachers.api.IGetCount;
import home_work_5.seachers.api.ISearchEngine;
import home_work_5.utils.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegExSearch implements ISearchEngine, IGetCount {

    private long count;

    @Override
    public long getCount() {
        return count;
    }

    @Override
    public long search(String text, String word) {
        if(text == null || word == null){
            return -1;
        }
        String textForWork = RemovePunctuation.removePunctuation(text);
        Pattern pattern = Pattern.compile("\\s" + word + "\\s");
        Matcher matcher = pattern.matcher(textForWork);
        count = 0;
        while (matcher.find()){
            count++;
        }

        return count;
    }
}
