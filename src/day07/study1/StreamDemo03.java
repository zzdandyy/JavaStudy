package day07.study1;

import java.util.ArrayList;

public class StreamDemo03 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("大大怪");
        array.add("小小怪");
        array.add("小明");
        array.add("小王儿");
        array.add("大铭");
        array.add("大黎明");
        //集合中以“大”开头的元素在控制台输出
        array.stream().filter(s -> s.startsWith("大")).forEach(System.out::println);
        System.out.println("--------");
        //集合中名字长度为3的元素在控制台输出
        array.stream().filter(s -> s.length() == 3).forEach(System.out::println);
        System.out.println("--------");
        //集合中以大开头且长度为3的元素在控制台输出
        array.stream().filter(s -> s.startsWith("大")).filter(s -> s.length() == 3).forEach(System.out::println);
    }
}
