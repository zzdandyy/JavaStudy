package day3;
import java.util.Arrays;
public class cyAPI {
    public static void main(String[] args) {
        System.out.println(Math.abs(-88));
        System.out.println(Math.max(88, 66));
        System.out.println(Math.random());

        long start =System.currentTimeMillis();
        for (int i=0;i<10000;i++){
            System.out.println(i);
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);

        int[] a={1,2,6,3,5,11,2,6,4};
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));


    }
}

