package day7.study2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflectTest01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(10);
        array.add(20);
        //array.add("30");  肯定会报错

        Class<? extends ArrayList> c = array.getClass();
        Method m = c.getMethod("add", Object.class);
        m.invoke(array, "hello");
        m.invoke(array, "world");
        m.invoke(array, "java");
        for (Object i : array) {
            System.out.println(i);
        }
    }
}
