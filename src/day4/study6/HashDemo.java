package day4.study6;

public class HashDemo {
    public static void main(String[] args) {
        Student s1 = new Student("001", "小王", 26);
        System.out.println(s1.hashCode());
        System.out.println(s1.hashCode());
        //同一对象的哈希值相同
        System.out.println("--------");
        Student s2 = new Student("001", "小王", 26);
        System.out.println(s2.hashCode());
        //默认情况下不同对象的哈希值不同
        //通过方法重写，可以让不同对象的哈希值相同
        System.out.println("--------");
        System.out.println("hello".hashCode());
        System.out.println("world".hashCode());
        System.out.println("java".hashCode());
        System.out.println("--------");
        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());
    }
}
