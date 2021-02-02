package day6.study3;

public class MyThreadPriorityDemo {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread("飞机");
        MyThread mt2 = new MyThread("高铁");
        MyThread mt3 = new MyThread("汽车");

        //线程优先级
        mt1.setPriority(10);
        mt2.setPriority(5); //5是默认的
        mt3.setPriority(1);
        System.out.println(mt1.getPriority());
        System.out.println(mt2.getPriority());
        System.out.println(mt3.getPriority());

        //start开始执行线程，自动调用run方法
        mt1.start();
        mt2.start();
        mt3.start();
    }
}
