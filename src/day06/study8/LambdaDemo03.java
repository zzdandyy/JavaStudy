package day06.study8;

public class LambdaDemo03 {
    public static void main(String[] args) {
        //匿名内部类
        useFlyable(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println(s);
                System.out.println("飞机自驾游");
            }
        });
        System.out.println("--------");

        useFlyable((String s) -> {
            System.out.println(s);
            System.out.println("飞机自驾游");
        });
    }

    private static void useFlyable(Flyable f) {
        f.fly("风和日丽，晴空万里");
    }
}
