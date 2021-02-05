package day04.study5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo02 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.add("hello");
        c.add("world");
        c.add("java");
        Iterator<String> it = c.iterator();

        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
    }
}
