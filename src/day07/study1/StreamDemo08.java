package day07.study1;

import java.util.ArrayList;

public class StreamDemo08 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("大大怪");
        array.add("小小怪");
        array.add("小明");
        array.add("小王儿");
        array.add("大铭");
        array.add("大黎明");
        //把集合中的元素在控制台输出
        array.stream().forEach(System.out::println);
        //统计集合中有几个以“大”开头，把统计结果输出
        System.out.println(array.stream().filter(s -> s.startsWith("大")).count());
    }
}
