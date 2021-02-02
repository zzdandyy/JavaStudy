package day6.study11;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        operatorString("小王", System.out::println);
        operatorString("小福贵", s -> System.out.println(new StringBuilder(s).reverse().toString()));
        System.out.println("--------");
        operatorString("王二小", s -> System.out.println(s), s -> System.out.println(new StringBuilder(s).reverse().toString()));
    }

    public static void operatorString(String name, Consumer<String> con) {
        con.accept(name);
    }

    public static void operatorString(String name, Consumer<String> con1, Consumer<String> con2) {
        con1.andThen(con2).accept(name);
    }
}
