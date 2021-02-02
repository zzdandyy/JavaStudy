package day7.study2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo05 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("day7.study2.Student");
        Method[] m1s = c.getMethods();  //公共方法，这里包括了继承的方法
        Method[] m2s = c.getDeclaredMethods(); //所有方法，但是不包括继承的方法
        for (Method method : m1s) {
            System.out.println(method
            );
        }
        System.out.println("--------");
        for (Method method : m2s) {
            System.out.println(method);
        }
        System.out.println("--------");

        Method m1 = c.getMethod("method1");

        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
        m1.invoke(obj);
    }
}
