package day06.study10;

public class StudentDemo {
    public static void main(String[] args) {
        useStudentBuilder(Student::new);
    }

    public static void useStudentBuilder(StudentBuilder sb) {
        Student s = sb.build("小王", 26);
        System.out.println(s.getName() + "," + s.getAge());
    }
}
