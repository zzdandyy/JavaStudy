package day06.study5;

public class Box {
    private boolean state=false;

    //存储
    public synchronized void put() {
        if(state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("送奶工将牛奶放入奶箱");
        this.state=true;

        notifyAll(); //唤醒其他等待的线程
    }

    //获取
    public synchronized void get() {
        if (!state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("用户拿到牛奶");
        this.state=false;

        notifyAll(); //唤醒其他等待的线程
    }
}
