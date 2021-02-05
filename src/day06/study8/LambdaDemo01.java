package day06.study8;

public class LambdaDemo01 {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("多线程程序启动了");
        }).start();
    }
}
