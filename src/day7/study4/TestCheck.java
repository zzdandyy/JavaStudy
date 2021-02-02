package day7.study4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * 简单的测试框架
 * 执行加了@Check注解的方法
 * 若方法有异常，将异常信息记录到bug.txt文件中
 */
public class TestCheck {
    public static void main(String[] args) throws IOException {

        Calculator c = new Calculator();
        Class<? extends Calculator> cal = c.getClass();
        Method[] methods = cal.getMethods();//获取所有的方法
        int number = 0;//出现异常的次数
        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\day7\\study4\\bug.txt"));
        for (Method method : methods) {
            if (method.isAnnotationPresent(Check.class)) {
                try {
                    method.invoke(c);
                } catch (Exception e) {
                    //捕获异常
                    //记录在文件中
                    bw.write(method.getName() + "方法出现异常了");
                    bw.newLine();
                    bw.newLine();
                    bw.write("异常名称：" + e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常原因：" + e.getCause().getMessage());
                    bw.newLine();
                    bw.write("----------------------------");
                    bw.newLine();
                    number++;
                }
            }
        }
        bw.write("本次测试一共出现" + number + "处异常");
        bw.flush();
        bw.close();
    }
}
