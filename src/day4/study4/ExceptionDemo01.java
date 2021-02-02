package day4.study4;

public class ExceptionDemo01 {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }

    public static void method() {
        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[3]);//ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());//出现异常的原因
            System.out.println(e.toString());  //异常类和异常原因
            e.printStackTrace();               //控制台输出异常信息
        }
    }
}
