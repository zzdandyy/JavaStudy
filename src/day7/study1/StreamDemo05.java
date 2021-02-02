package day7.study1;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo05 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("大大怪");
        array.add("小小怪");
        array.add("小明");
        array.add("小王儿");
        array.add("大铭");
        array.add("大黎明");
        //取前四个数据组成一个流
        Stream<String> s1 = array.stream().limit(4);
        //跳过两个数据组成一个流
        Stream<String> s2 = array.stream().skip(2);
        //合并两个流并的控制台输出
        //Stream.concat(s1,s2).forEach(System.out::println);
        //合并两个流并在控制台输出，但是输出的元素不能重复
        Stream.concat(s1, s2).distinct().forEach(System.out::println);
    }
}
