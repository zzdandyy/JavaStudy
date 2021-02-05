package day06.study3;

public class MyThreadControlDemo {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread("关羽");
        MyThread mt2 = new MyThread("张飞");

        Thread.currentThread().setName("刘备");  //主线程

        mt1.setDaemon(true);  //设置为守护线程
        mt2.setDaemon(true);
        mt1.start();
        mt2.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
