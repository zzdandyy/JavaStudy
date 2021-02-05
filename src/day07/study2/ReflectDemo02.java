package day07.study2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("day07.study2.Student");   //得到字节码文件
        //获得所有的公共构造方法的对象数组
        Constructor<?>[] cons1 = c.getConstructors();
        for (Constructor<?> con : cons1) {
            System.out.println(con);
        }
        //所有的构造方法的对象数组
        Constructor<?>[] cons2 = c.getDeclaredConstructors();
        for (Constructor<?> con : cons2) {
            System.out.println(con);
        }
        //单个公共的构造方法对象
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();  //创建学生类对象
        System.out.println(obj);
        //单个构造方法对象
        c.getDeclaredConstructor();
    }
}
