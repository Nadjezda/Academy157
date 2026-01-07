package home_work_5.seachers;


import home_work_5.seachers.api.IGetCount;
import home_work_5.seachers.api.ISearchEngine;

public class EasySearchEx implements ISearchEngine, IGetCount {

    private long count;

    @Override
    public long getCount() {
        return count;
    }

    @Override
    public long search(String text, String word) {
        if (text == null || word == null || text.length() < word.length()) {
            return 0;
        } else {
            count = 0;
            int indexOfWord = 0;

            do {
                indexOfWord = text.indexOf(word, indexOfWord);
                if(indexOfWord == -1){
                    return count;
                }else {
                    count++;
                    indexOfWord = indexOfWord + word.length()-1;

                }
            } while (indexOfWord <= text.length());
        }
        return count;
    }
}
