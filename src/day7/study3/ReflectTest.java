package day7.study3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Pro(className = "day7.study3.Student", methodName = "show")
public class ReflectTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //可以创建任意类的对象，可以执行任意方法
        Class<ReflectTest> c = ReflectTest.class;
        Pro anno = c.getAnnotation(Pro.class); //其实就是在内存中生成了一个该注解接口的子类实现对象
        Class<?> cc = Class.forName(anno.className());
        Constructor<?> con = cc.getConstructor();
        Object obj = con.newInstance();
        Method m = cc.getMethod(anno.methodName());
        m.invoke(obj);
    }
}
