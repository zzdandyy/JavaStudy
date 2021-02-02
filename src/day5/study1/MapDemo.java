package day5.study1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();

        m.put("001", "小王");
        m.put("002", "小红");
        m.put("003", "小刚");
        Set<Map.Entry<String, String>> entries = m.entrySet();

        for (Map.Entry<String, String> me:entries){
            String key=me.getKey();
            String value=me.getValue();
            System.out.println(key+","+value);

        }

    }
}
