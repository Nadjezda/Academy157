package home_work_4.utils;

import home_work_2.sorts.SortsUtils;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}
