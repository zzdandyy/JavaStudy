package day6.study4;

public class MyRunnableDemo {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr, "小明");
        Thread t2 = new Thread(mr, "小王");
        t1.start();
        t2.start();
    }
}
