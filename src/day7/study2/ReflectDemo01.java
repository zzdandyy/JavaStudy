package day7.study2;

public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException {
        //类的class属性
        Class<Student> c1 = Student.class;
        System.out.println(c1); //class day7.study2.Student
        Class<Student> c2 = Student.class;
        System.out.println(c1 == c2);
        System.out.println("--------");

        //对象的getClass方法
        Student s = new Student();
        Class<? extends Student> c3 = s.getClass();
        System.out.println(c3); //class day7.study2.Student

        //Class类中的静态方法forName
        Class<?> c4 = Class.forName("day7.study2.Student"); //class day7.study2.Student
        System.out.println(c4);
    }
}
