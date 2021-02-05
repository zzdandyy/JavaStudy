package day07.study2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo03 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("day07.study2.Student");
        Constructor<?> con1 = c.getConstructor(String.class, int.class, String.class); //基本类型也有.class
        Object obj1 = con1.newInstance("小王", 20, "广州");
        System.out.println(obj1);  //Student{name='小王', age=20, address='广州'}

        Constructor<?> con2 = c.getDeclaredConstructor(String.class);
        //暴力反射，使用私有构造方法
        con2.setAccessible(true);
        Object obj2 = con2.newInstance("小李");
        System.out.println(obj2);
    }
}
