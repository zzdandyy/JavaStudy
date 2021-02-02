package day4.study2;

public class IntegerDemo {
    public static void main(String[] args) {
        //自动装箱，基本数据类型自动转换成包装类类型
        Integer i=100;
        //自动拆箱，包装类类型自动转换成基本数据类型
        int ii=i+200;
        System.out.println(ii);
    }
}
