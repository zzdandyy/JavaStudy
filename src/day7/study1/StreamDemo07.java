package day7.study1;

import java.util.ArrayList;

public class StreamDemo07 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("10");
        array.add("20");
        array.add("30");
        array.add("40");
        array.add("50");
        //把集合中的数据转换为整数之后输出
        array.stream().map(Integer::parseInt).forEach(System.out::println);
        System.out.println("--------");
        //利用mapToInt
        array.stream().mapToInt(Integer::parseInt).forEach(System.out::println);
        System.out.println("--------");
        //int sum 返回Int流中元素的和并输出
        System.out.println(array.stream().mapToInt(Integer::parseInt).sum());
    }
}
