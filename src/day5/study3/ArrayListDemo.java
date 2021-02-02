package day5.study3;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<HashMap<String,String>> array=new ArrayList<>();
        HashMap<String,String> hm1=new HashMap<>();
        hm1.put("001","小王");
        hm1.put("002","小明");
        hm1.put("003","小红");
        array.add(hm1);

        HashMap<String,String> hm2=new HashMap<>();
        hm2.put("001","小花");
        hm2.put("002","小刚");
        hm2.put("003","小白");
        array.add(hm2);

        HashMap<String,String> hm3=new HashMap<>();
        hm3.put("001","小青");
        hm3.put("002","小菜");
        hm3.put("003","小李");
        array.add(hm3);

        System.out.println(array);
    }
}
