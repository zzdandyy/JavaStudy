package day07.study2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo04 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("day07.study2.Student");
        //获得无参构造方法创建对象
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        System.out.println(obj);
        System.out.println("--------");
        //获得成员变量的对象
        Field addressField = c.getField("address");
        //给obj的成员变量addressField赋值为 广州
        addressField.set(obj, "广州");

        Field nameField = c.getDeclaredField("name");
        nameField.setAccessible(true); //取消访问检查
        nameField.set(obj, "小王");

        Field ageField = c.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(obj, 22);

        System.out.println(obj);
    }
}
