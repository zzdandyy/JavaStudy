package day07.study2;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        /*
        class.txt
        className=***
        methodName=***
         */

        //加载数据
        Properties prop = new Properties();
        FileReader fr = new FileReader("src\\day7\\study2\\class.txt");
        prop.load(fr);
        fr.close();
        String className = prop.getProperty("className");
        String methodName = prop.getProperty("methodName");

        Class<?> c = Class.forName(className);
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        Method m = c.getMethod(methodName);
        m.invoke(obj);
    }
}
