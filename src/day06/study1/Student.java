package day06.study1;

public class Student {
    private String name;
    private int chinese;
    private int english;
    private int math;

    public Student(){

    }
    public Student(String name,int chinese,int english,int math){
        this.name=name;
        this.chinese=chinese;
        this.english=english;
        this.math=math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public int getEnglish() {
        return english;
    }

    public int getMath() {
        return math;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public void setMath(int math) {
        this.math = math;
    }
    public int getSum(){
        return this.chinese+this.math+this.english;
    }
}
