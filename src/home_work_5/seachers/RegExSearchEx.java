package home_work_5.seachers;

import home_work_5.seachers.api.IGetCount;
import home_work_5.seachers.api.ISearchEngine;
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
        String regex = "[\\p{Punct}\\s]" + Pattern.quote(word) + "[^a-zA-Zа-яА-ЯёЁ]";
        String regex1 = "^" + word + "[^a-zA-Zа-яА-ЯёЁ]";
        Pattern pattern = Pattern.compile(regex);
        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher = pattern.matcher(text);
        Matcher matcher1 = pattern1.matcher(text);
        if (matcher1.find() && matcher1.start() == 0){
        count++;
        }
        while (matcher.find()) {
            count++;
        }

        return count;
    }
}
