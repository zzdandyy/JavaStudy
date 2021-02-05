package day06.study8;

public class LambdaDemo02 {
    public static void main(String[] args) {
        //主方法中调用useEatable方法
        Eatable e = new Eatablelmpl();
        useEatable(e);
        //匿名内部类
        Eatable e2 = new Eatable() {
            @Override
            public void eat() {
                System.out.println("一天一个苹果");
            }
        };
        //Lambda表达式
        useEatable(() -> {
            System.out.println("一天一个苹果");
        });
    }

    private static void useEatable(Eatable e) {
        e.eat();
    }
}
