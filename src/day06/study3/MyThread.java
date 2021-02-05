package day06.study3;

public class MyThread extends Thread{
    public MyThread(){}
    public MyThread(String s) {
        super(s);
    }

    @Override
    public void run() {
        for(int i =0;i<100;i++){
            System.out.println(getName()+":"+i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
