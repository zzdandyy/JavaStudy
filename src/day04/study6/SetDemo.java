package day04.study6;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        Random r=new Random();
        while(s.size()<10){
            int num = r.nextInt(20)+1;
            s.add(num);
        }
        for(Integer i:s){
            System.out.println(i);
        }

    }
}
