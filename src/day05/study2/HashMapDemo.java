package day05.study2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Student> hm=new HashMap();
        Student s1=new Student("001","小王",23);
        Student s2=new Student("002","小红",21);
        Student s3=new Student("003","小刚",22);

        hm.put(s1.getSid(),s1);
        hm.put(s2.getSid(),s2);
        hm.put(s3.getSid(),s3);

        Set<String> set=hm.keySet();
        for(String key:set){
            Student s=hm.get(key);
            System.out.println(key+","+s.getName()+","+s.getAge());
        }
        System.out.println("--------");

        Set<Map.Entry<String, Student>> entries = hm.entrySet();
        for (Map.Entry<String, Student> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
