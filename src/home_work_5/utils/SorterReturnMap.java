package home_work_5.utils;

import java.util.*;

public class SorterReturnMap {

    public Map <String,Integer> sorterByValue (Map<String, Integer> map){
        List<Map.Entry<String, Integer>> list = new ArrayList<> (map.entrySet());
        list.sort(new ComparatorMap());
        Map <String, Integer> sortedByValueMap = new LinkedHashMap<>();

        for(Map.Entry<String, Integer> entry: list){
            sortedByValueMap.put(entry.getKey(), entry.getValue());
        }
        return sortedByValueMap;
    }
}
