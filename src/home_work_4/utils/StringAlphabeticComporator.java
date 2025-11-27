package home_work_4.utils;

import java.util.Comparator;

public class StringAlphabeticComporator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}
