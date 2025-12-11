package home_work_5.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SorterReturnList {

    public List <Map.Entry<String, Integer>> sorterByValue (Map<String, Integer> map){
        List<Map.Entry<String, Integer>> list = new ArrayList<> (map.entrySet());
        list.sort(new ComparatorMap());

        return list;
    }
}
