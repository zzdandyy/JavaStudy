package day06.study5;

public class Customer implements Runnable{
    private final Box box;
    public Customer(Box box) {
     this.box=box;
    }

    @Override
    public void run() {
        while(true){
            box.get();
        }
    }
}
