package day04.study5;

import java.util.LinkedList;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        LinkedList<String> link=new LinkedList<String>();
        array.add("hello");
        array.add("world");
        array.add("java");
        link.add("hello");
        link.add("world");
        link.add("java");
        for(String s1: array){
            System.out.println(s1);
        }
        for(String s2: link){
            System.out.println(s2);
        }
    }
}
