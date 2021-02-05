package day04.study1;

public class IntegerDemo {
    public static void main(String[] args) {
        //int->String
        int number = 100;
        String s=String.valueOf(number);
        System.out.println(s);

        //String->int
        String s1="200";
        int number1 = Integer.parseInt(s1);
        System.out.println(number1);
    }
}
