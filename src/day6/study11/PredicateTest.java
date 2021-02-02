package day6.study11;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        String[] strArray = {"小王,30", "小钱钱,20", "大红花,35", "小青,25", "小葵花,22"};
        ArrayList<String> arrayList = myFilter(strArray, s -> s.split(",")[0].length() > 2, s -> Integer.parseInt(s.split(",")[1]) > 33);
        System.out.println(arrayList);

    }

    private static ArrayList<String> myFilter(String[] strings, Predicate<String> pre1, Predicate<String> pre2) {
        ArrayList<String> array = new ArrayList<>();
        for (String string : strings) {
            if (pre1.and(pre2).test(string)) {
                array.add(string);
            }
        }
        return array;
    }
}
