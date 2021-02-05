package day06.study4;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SellTicket implements Runnable {
    private int tickets = 100;
    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try {
                lock.lock(); //加锁
                if (tickets > 0) {
                    System.out.println(Thread.currentThread().getName() + "卖出票，剩余" + tickets + "张票");
                    tickets--;
                }
            } finally {
                lock.unlock(); //释放锁
            }
        }
    }
}
