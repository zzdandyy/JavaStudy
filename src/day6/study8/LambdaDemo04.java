package day6.study8;

public class LambdaDemo04 {
    public static void main(String[] args) {
        //Lambda
        useAddable((int x, int y) -> {
            return x + y;
        });
    }

    private static void useAddable(Addable a) {
        int sum = a.add(10, 20);
        System.out.println(sum);
    }
}
