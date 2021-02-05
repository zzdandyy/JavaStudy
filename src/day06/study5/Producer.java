package day06.study5;

public class Producer implements Runnable{
    private final Box box;
    public Producer(Box box) {
        this.box=box;
    }

    @Override
    public void run() {
        while (true){
            box.put();
        }

    }
}
