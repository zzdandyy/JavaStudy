package day6.study9;

public interface MyInterface {
    void show1();

    void show2();

    default void show3() {
        getName();
        System.out.println("默认方法1");
    }

    default void show4() {
        getName();
        System.out.println("默认方法2");
    }

    static void show5() {
        System.out.println("静态方法");
    }

    private void getName() {
        System.out.println("私有方法");
    }
}
