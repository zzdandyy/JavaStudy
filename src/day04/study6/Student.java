package day04.study6;

public class Student implements Comparable<Student>{
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

    @Override
    public int compareTo(Student s) {
        int num = this.age-s.age;
        if(num==0){
            if(this.name.equals(s.name)){
                num=0;
            } else {
                num=1;
            }
        }
        return num;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid='" + sid + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
