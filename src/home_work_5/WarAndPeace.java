package home_work_5;

import home_work_5.seachers.EasySearch;
import home_work_5.seachers.RegExSearch;
import home_work_5.seachers.SearchEngineDecorator;
import home_work_5.utils.SorterReturnList;
import home_work_5.utils.SorterReturnMap;
import home_work_5.utils.StringByBuffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WarAndPeace {
    public static void main(String[] args) {
        Set<String> setWords = new TreeSet();
        List<String> listWords = new ArrayList();
        EasySearch es = new EasySearch();
        RegExSearch re = new RegExSearch();
        SearchEngineDecorator esDecorator = new SearchEngineDecorator(es);
        try(BufferedReader reader =
                    new BufferedReader(new FileReader("Warandpeace.txt"))) {
            String string = reader.readLine();
            while (string != null) {
                string = reader.readLine();
                if (string == null) {
                    break;
                } else {
                    String string1 = string.replaceAll
                            ("[^a-zA-Zа-яА-ЯёЁ\\s]", "");
                    String[] wordsArray = string1.split("\\s+");
                    for (String elements : wordsArray) {
                        if (!elements.isEmpty()) {
                            setWords.add(elements);
                            listWords.add(elements);
                        }
                    }
                }
            }

        } catch (IOException e){
            System.out.println("Нет такого файла");
        }
        System.out.println("Всего слов: " + listWords.size());
        System.out.println("Неповторяющихся слов: " + setWords.size());

        String result = StringByBuffer.stringByBuffer(listWords);
        es.search(result, " война ");
        re.search(result, "война");
        esDecorator.search(result, " война ");
        System.out.println("Easy word война: " + es.getCount() + " Reg word война: " + re.getCount() +
                 " Без регистра слово война: " + esDecorator.getCount());
        es.search(result, " и ");
        re.search(result, "и");
        esDecorator.search(result, " и ");
        System.out.println("Easy word и: " + es.getCount() + " Reg word и: " + re.getCount() +
                " Без регистра слово и: " + esDecorator.getCount());
        es.search(result, " мир ");
        re.search(result, "мир");
        esDecorator.search(result, " мир ");
        System.out.println("Easy word мир: " + es.getCount() + " Reg word мир: " + re.getCount() +
                " Без регистра слово мир: " + esDecorator.getCount());
        Map<String, Integer> countForRepeatedWords =
                wordsCount(listWords, setWords);
        SorterReturnList sorter = new SorterReturnList();
        SorterReturnMap sorter1 = new SorterReturnMap();
        List<Map.Entry<String, Integer>> sortedCountForRepeatedWords = sorter.sorterByValue(countForRepeatedWords);
        Map <String, Integer> sortedCount = sorter1.sorterByValue(countForRepeatedWords);

        tonWordsFromList(10, sortedCountForRepeatedWords);
        tonWordsFromMap(10, sortedCount);

    }
    public static Map<String, Integer> wordsCount(List<String> words, Set<String> count) {
        Map<String, Integer> countWords = new HashMap<>();
        // устанавливаем в Мар все счетчики слов на ноль
        for (String word : count) {
            countWords.put(word, 0);
        }

        //считаем слова, опираясь на слова в Set
        for (String word : words) {
            if (count.contains(word)) {
                countWords.put(word, countWords.get(word) + 1);
            }
        }
        return countWords;
    }

    public static void tonWordsFromList(int top, List<Map.Entry<String, Integer>> map) {
        for (int i = 0; i < Math.min(top, map.size()); i++) {
            System.out.print(map.get(i) + ", ");
        }
        System.out.println();
    }
    public static void tonWordsFromMap(int top, Map <String, Integer> map) {
        Iterator <Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        int count =0;
        while (iterator.hasNext() && count < Math.min(top, map.size())){
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.print(entry.getKey() + " = " + entry.getValue() + ", ");
            count++;
        }
        System.out.println();
    }
}


