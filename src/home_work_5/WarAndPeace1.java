package home_work_5;

import home_work_5.utils.SorterReturnMap;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

import static home_work_5.utils.RemovePunctuationEx.removePunctuation;

public class WarAndPeace1 {
    public static void main(String[] args) throws IOException{
        Map <String, Integer> wordCount = new TreeMap<>();
        String string = Files.readString(Path.of("homeWork\\src\\home_work_5\\Война и мир_книга.txt"));
        String [] words = removePunctuation(string).split("\\s+");
        for(String item: words){
            if (Objects.equals(item, "")){
                continue;
            }
            wordCount.compute(item, (word, oldValue) -> {
                if (oldValue == null) {
                    return 1;
                }
                return oldValue + 1;
            });
        }
         int allWordsInText = 0;
         int nonRepeatingWordsInText = wordCount.size();
                 for(Integer item: wordCount.values()){
                     allWordsInText += item;
                 }
        System.out.println("Всего слов: " + allWordsInText);
        System.out.println("Неповторимых слов: " + nonRepeatingWordsInText);

        tonWordsFromMap(20, new SorterReturnMap().sorterByValue(wordCount));
        }
    public static void tonWordsFromMap(int top, Map <String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        int count =0;
        while (iterator.hasNext() && count < Math.min(top, map.size())){
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.print(entry.getKey() + " = " + entry.getValue() + ", ");
            count++;
        }
        System.out.println();
    }
    }


