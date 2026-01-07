package home_work_5;

import home_work_5.seachers.EasySearchEx;
import home_work_5.seachers.RegExSearchEx;
import home_work_5.seachers.SearchEngineDecorator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

import static home_work_5.utils.RemovePunctuation.removePunctuation;

public class WarAndPeace2 {
    public static void main(String[] args) throws IOException{
//        FileWriter writer = new FileWriter("homeWork\\src\\home_work_5\\hello.txt");
//        writer.write("Привет -привет, как жизнь? Как-то так...  и тебе привет");
//        writer.flush();
//        writer.close();

        String string = Files.readString(Path.of("homeWork\\src\\home_work_5\\Война и мир_книга.txt"));
        EasySearchEx ese = new EasySearchEx();
        RegExSearchEx rese = new RegExSearchEx();
        SearchEngineDecorator decRese = new SearchEngineDecorator (rese);
        SearchEngineDecorator decEse = new SearchEngineDecorator (ese);
        ese.search(removePunctuation(string), " война ");
        rese.search(string, "Война");
        decRese.search(string, "война");
        decEse.search(string, " война ");
        System.out.print("Слово война: (ese.getCount())-" + ese.getCount() + "\n(rese.getCount().aperCase)-" +
                rese.getCount() + "\n(decRese.getCount())-" + decRese.getCount()
                + "\n(decEse.getCount())-" + decEse.getCount() + "");
        ese.search(removePunctuation(string), " мир ");
        rese.search(string, "Mир");
        decRese.search(string, "мир");
        decEse.search(string, " мир ");
        System.out.println(" \nСлово мир: (ese.getCount())-" + ese.getCount() + "\n(rese.getCount().aperCase)-" +
                rese.getCount() + "\n(decRese.getCount())-" + decRese.getCount()
                + "\n(decEse.getCount())-" + decEse.getCount() + "");
        ese.search(removePunctuation(string), " и ");
        rese.search(string, "и");
        decRese.search(string, "и");
        decEse.search(string, " и ");
        System.out.println("\nСлово и: (ese.getCount())-" + ese.getCount() + "\n(rese.getCount().aperCase)-" +
                rese.getCount() + "\n(decRese.getCount())-" + decRese.getCount()
                + "\n(decEse.getCount())-" + decEse.getCount() + "");
        }

    }


