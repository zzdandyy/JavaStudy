package day04.study5;

public class Student {
    private String sid;
    private String name;
    private int age;

    public Student(){

    }
    public Student(String sid,String name,int age){
        this.sid=sid;
        this.name=name;
        this.age=age;
    }

    public String getSid() {
        return sid;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
