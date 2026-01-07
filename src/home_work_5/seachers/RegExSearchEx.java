package home_work_5.seachers;

import home_work_5.seachers.api.IGetCount;
import home_work_5.seachers.api.ISearchEngine;
import home_work_5.utils.RemovePunctuation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegExSearchEx implements ISearchEngine, IGetCount {

    private long count;

    @Override
    public long getCount() {
        return count;
    }

    @Override
    public long search(String text, String word) {
        count = 0;
        if(text == null || word == null || text.length() < word.length()){
            return 0;
        }
        String regex = "[\\p{Punct}\\p{Space}]" + Pattern.quote(word) + "[^a-zA-Zа-яА-ЯёЁ]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            count++;
        }

        return count;
    }
}
