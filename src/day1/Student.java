package day1;

public class Student {
    String name;
    int age;

    public void study(){
        System.out.println("学习");
    }
    public void doHomeWork(){
        System.out.println("做作业");
    }

    public static void main(String[] args) {
        Student a=new Student();
        a.name="小王";
        a.age=22;
        System.out.println(a.name);
        System.out.println(a.age);
        a.study();
        a.doHomeWork();
    }
}
