package day03;

public class Computer {
    private int num=10;


    public void method() {
        Inter i=new Inter(){
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };
        i.show();
    }
}
