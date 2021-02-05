package day07.study1;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo02 {
    public static void main(String[] args) {
//        Collection体系的集合可以使用默认的方法Stream()生成流
        List<String> list = new ArrayList<>();
        Stream<String> listStream = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> setStream = set.stream();
//        Map体系需要间接的生成流
        Map<Integer, String> map = new HashMap<>();
        Stream<Integer> keyStream = map.keySet().stream();
        Stream<String> valueStream = map.values().stream();
        Stream<Map.Entry<Integer, String>> entryStream = map.entrySet().stream();
//        数组可以通过Stream接口的静态方法of(T...values)生成流
        String[] strArray = {"hello", "world", "java"};
        Stream<String> strArrayStream = Stream.of(strArray);
        Stream<String> stringStream = Stream.of("hello", "world", "java");
        Stream<Integer> integerStream = Stream.of(10, 20, 30);
    }
}
