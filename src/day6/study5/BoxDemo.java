package day6.study5;

import day6.study3.MyThread;

public class BoxDemo {
    public static void main(String[] args) {
        Box box=new Box();
        Producer producer =new Producer(box);
        Customer customer=new Customer(box);
        Thread t1=new Thread(producer);
        Thread t2=new Thread(customer);

        t1.start();
        t2.start();
    }

}
