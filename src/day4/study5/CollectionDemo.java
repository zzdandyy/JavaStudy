package day4.study5;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<Student> c=new ArrayList<Student>();
        c.add(new Student("001","小王",26));
        c.add(new Student("002","小明",22));
        c.add(new Student("003","小刚",20));

        for (Student s : c) {
            System.out.println(s.getSid() + "," + s.getName() + "," + s.getAge());
        }
    }
}
