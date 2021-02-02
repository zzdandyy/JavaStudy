package day3;

public class Student extends Person{
    public Student(){

    }
    public Student(String name,int age){
        super(name, age);
    }
    public void Study(){
        System.out.println("我爱学习");
    }

    @Override
    public void eat() {
        System.out.println("学生上课不能吃东西");
    }
}
