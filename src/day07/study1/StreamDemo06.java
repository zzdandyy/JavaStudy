package day07.study1;

import java.util.ArrayList;

public class StreamDemo06 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("dadaguai");
        array.add("xiaoxiaoguai");
        array.add("xiaoming");
        array.add("xiaowanger");
        array.add("daming");
        array.add("daliming");
        //按照字母顺序把数据在控制台输出
        array.stream().sorted().forEach(System.out::println);
        System.out.println("--------");
        //按照字符串长度把数据在控制台输出
        array.stream().sorted((s1, s2) -> s1.length() - s2.length()).forEach(System.out::println);
    }
}
