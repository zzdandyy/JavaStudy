package day04.study7;

public class Genericlmpl<T> implements Generic2<T>{
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
