package day06.study9;

public class MyInterfaceDemo {
    public static void main(String[] args) {
        MyInterface my = new MyInterfaceImplOne();
        my.show1();
        my.show2();
        my.show3();
        my.show4();
        MyInterface.show5();
    }
}
