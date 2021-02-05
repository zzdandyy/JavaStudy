package day05.study3;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        ArrayList<String> array1 = new ArrayList<>();
        array1.add("小王");
        array1.add("小明");
        array1.add("小红");
        hm.put("001",array1);

        ArrayList<String> array2 = new ArrayList<>();
        array2.add("小花");
        array2.add("小刚");
        array2.add("小白");
        hm.put("002",array2);

        ArrayList<String> array3 = new ArrayList<>();
        array3.add("小青");
        array3.add("小菜");
        array3.add("小李");
        hm.put("003",array3);

        System.out.println(hm);

        System.out.println("hm = " + hm);

    }
}
