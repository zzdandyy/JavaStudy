package day04.study5;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo01 {
    public static void main(String[] args) {
        //创建Collection集合的对象
        Collection<String> c = new ArrayList<String>();
        //添加元素
        c.add("hello"); //添加元素
        c.add("world");
        c.add("java");
        c.add("aaa");
        System.out.println(c.size()); //集合元素个数
        System.out.println(c); //重写了toString方法
        c.remove("aaa"); //输出元素
        System.out.println(c); //重写了toString方法
        System.out.println(c.contains("java")); //是否存在某一元素
        System.out.println(c.isEmpty()); //集合是否为空
        c.clear();
        System.out.println(c.isEmpty());
    }
}
