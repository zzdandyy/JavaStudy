package day6.study11;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        convert("100", s -> Integer.parseInt(s));

        convert(100, i -> String.valueOf(i + 566));

        convert("100", s -> Integer.parseInt(s), i -> String.valueOf(i + 566));
    }

    //定义一个方法，把字符串类型转换为int，并在控制台输出
    private static void convert(String s, Function<String, Integer> fun) {
        int i = fun.apply(s);
        System.out.println(i);
    }

    //定义一个方法，把一个int类型的数据加上一个整数之后，转换成字符串后输出
    private static void convert(int i, Function<Integer, String> fun) {
        String s = fun.apply(i);
        System.out.println(s);
    }

    //定义一个方法，把字符串数据转换成int之后加上一个整数，再转换成字符串输出
    private static void convert(String s, Function<String, Integer> fun1, Function<Integer, String> fun2) {
        String ss = fun1.andThen(fun2).apply(s);
        System.out.println(ss);
    }
}
