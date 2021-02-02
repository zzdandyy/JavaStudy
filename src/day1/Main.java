package day1;

public class Main {
    public static void main(String[] args) {
        HelloWorld a=new HelloWorld();
        Array b=new Array();
        Method c =new Method();
        Phone p=new Phone();


        a.hello();
        System.out.println("----------");
        b.getArr();
        System.out.println("----------");
        b.maxArr();
        System.out.println("----------");
        b.minArr();
        System.out.println("----------");
        c.getMAxNum(3,5);
        System.out.println("----------");
        int minNum=c.getMinNum(6,8);
        System.out.println(minNum);
    }
}
