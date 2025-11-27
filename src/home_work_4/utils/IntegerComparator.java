package home_work_4.utils;

import java.util.Comparator;

public class IntegerComparator implements Comparator <Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return Integer.compare(o1, o2);
    }
}
