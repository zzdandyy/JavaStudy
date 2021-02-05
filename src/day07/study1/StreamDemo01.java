package day07.study1;

import java.util.ArrayList;

public class StreamDemo01 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("大大怪");
        array.add("小小怪");
        array.add("小明");
        array.add("小王儿");
        array.add("大铭");
        array.add("大黎明");

        ArrayList<String> daArray = new ArrayList<>();
        for (String s : array) {
            if (s.startsWith("大")) {
                daArray.add(s);
            }
        }

        ArrayList<String> threeArray = new ArrayList<>();
        for (String s : daArray) {
            if (s.length() == 3) {
                threeArray.add(s);
            }
        }

        for (String s : threeArray) {
            System.out.println(s);
        }
        System.out.println("--------");
        //Stream流改写
        array.stream().filter(s -> s.startsWith("大")).filter(s -> s.length() == 3).forEach(System.out::println);
    }
}
