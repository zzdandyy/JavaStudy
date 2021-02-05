package day07.study1;

import java.util.ArrayList;

public class StreamDemo04 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("大大怪");
        array.add("小小怪");
        array.add("小明");
        array.add("小王儿");
        array.add("大铭");
        array.add("大黎明");
        //取前三个元素在控制台输出
        array.stream().limit(3).forEach(System.out::println);
        //跳过三个元素，把剩下的元素在控制台输出
        array.stream().skip(3).forEach(System.out::println);
        //跳过两个元素，把剩下的元素的前两个在控制台输出
        array.stream().skip(2).limit(2).forEach(System.out::println);
    }
}
