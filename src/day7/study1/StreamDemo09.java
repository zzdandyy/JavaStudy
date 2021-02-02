package day7.study1;

import java.util.*;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo09 {
    public static void main(String[] args) {
        List<String> array = new ArrayList<>();
        array.add("大大怪");
        array.add("小小怪");
        array.add("小明");
        array.add("小王儿");
        array.add("大铭");
        array.add("大黎明");
        //得到名字为3个子的流
        Stream<String> listStream = array.stream().filter(s -> s.length() == 3);
        //储存在集合中并遍历
        List<String> names = listStream.collect(Collectors.toList());
        for (String name : names) {
            System.out.println(name);
        }

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(60);
        //得到年龄大于25的流
        Stream<Integer> setStream = set.stream().filter(age -> age > 25);
        //储存在集合中并遍历
        Set<Integer> ages = setStream.collect(Collectors.toSet());
        for (Integer age : ages) {
            System.out.println(age);
        }

        //字符串数组，每个字符串数据由姓名和年龄组成
        String[] strArray = {"小王,20", "小青,26", "小明,33", "小刚,28", "小李,32", "小白,22"};
        //取字符串中年龄大于28的数据并存放到map中，姓名作键，年龄作值
        Stream<String> ageStream = Stream.of(strArray).filter(s -> Integer.parseInt(s.split(",")[1]) > 28);
        Map<String, Integer> map = ageStream.collect(Collectors.toMap(s -> s.split(",")[0], s -> Integer.parseInt(s.split(",")[1])));
        Set<String> key = map.keySet();
        for (String s : key) {
            Integer value = map.get(s);
            System.out.println(s + "," + value);
        }
    }
}
