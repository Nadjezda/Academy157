package home_work_5.utils;

import java.util.List;

public class StringByBuffer {


    public static String stringByBuffer (List<String> list) {
        StringBuffer buffer = new StringBuffer();
        buffer.append(" ");
        for (String c : list) {
            buffer.append(c).append(" ");
            }
            return buffer.toString();
    }
}
