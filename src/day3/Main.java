package day3;

public class Main {
    public static void main(String[] args) {
        Student s=new Student("小王",20);
        Teacher t=new Teacher("老李",40);
        System.out.println(s.getName()+","+s.getAge());
        System.out.println(t.getName()+","+t.getAge());

        Person p=new Student();
        p.eat();

    }
}

