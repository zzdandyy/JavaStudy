package day06.study11;

import java.util.ArrayList;
import java.util.Comparator;

public class MyInterfaceDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("cccc");
        array.add("aa");
        array.add("b");
        array.add("ddd");

        System.out.println("排序前：" + array);
        array.sort(getComparable());
        System.out.println("排序后：" + array);
    }

    public static Comparator<String> getComparable() {
        return (s1, s2) -> s1.length() - s2.length();
    }
}
