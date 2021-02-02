package day4.study8;
import java.util.List;
import java.util.ArrayList;

public class GenericDemo {
    public static void main(String[] args) {
        //所有
        List<?> l1= new ArrayList<Object>();
        List<?> l2=new ArrayList<Number>();
        List<?> l3=new ArrayList<Integer>();

        //通配符的上限
        List<? extends Number> l4= new ArrayList<Integer>();

        //通配符的下限
        List<? super Number> l5= new ArrayList<Object>();
    }
}
