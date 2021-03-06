package day02;
import java.util.Scanner;
import java.util.ArrayList;
public class StudentManger {

    public static void main(String[] args) {
        ArrayList<Student> studentList=new ArrayList<>();
        while(true){
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1: 添加学生");
            System.out.println("2: 删除学生");
            System.out.println("3: 修改学生信息");
            System.out.println("4: 显示所有学生信息");
            System.out.println("5: 退出");
            System.out.println("请输入你的选择");

            Scanner sc =new Scanner(System.in);
            String line=sc.nextLine();
            switch (line){
                case "1":
                    addStudent(studentList);
                    break;
                case "2":
                    deleteStudent(studentList);
                    break;
                case "3":
                    changeStudent(studentList);
                    break;
                case "4":
                    showStudent(studentList);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    System.exit(0);
            }
        }
    }
    public static void addStudent(ArrayList<Student> array){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入学生学号");
        String sid=sc.nextLine();
        System.out.println("请输入学生姓名");
        String name=sc.nextLine();
        System.out.println("请输入学生年龄");
        String age=sc.nextLine();
        System.out.println("请输入学生居住地");
        String address=sc.nextLine();

        Student s=new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        array.add(s);
        System.out.println("添加学生成功");
    }
    public static void showStudent(ArrayList<Student> array){
        if(array.size()==0){
            System.out.println("无学生信息，请先添加");
        }
        else {
            System.out.println("学号\t姓名\t年龄\t居住地");
            for (int i = 0; i < array.size(); i++) {
                Student s = array.get(i);
                System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getAddress());
            }
        }
    }
    public static void deleteStudent(ArrayList<Student> array){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要删除的学生的学号");
        String sid=sc.nextLine();
        for(int i=0;i<array.size();i++){
            Student s=array.get(i);
            if(s.getSid().equals(sid)){
                array.remove(i);
                System.out.println("删除成功");
                break;
            }
            else{
                System.out.println("不存在此学号");
            }
        }
    }
    public static void changeStudent(ArrayList<Student> array){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要修改的学生的学号");
        String sid=sc.nextLine();
        for(int i=0;i<array.size();i++){
            Student s=array.get(i);
            if(s.getSid().equals(sid)){
                System.out.println("请输入学生的新姓名");
                String name=sc.nextLine();
                s.setName(name);
                System.out.println("请输入学生的新年龄");
                String age=sc.nextLine();
                s.setAge(age);
                System.out.println("请输入学生的新居住地");
                String address=sc.nextLine();
                s.setAddress(address);
                //array.add(i,s);
                System.out.println("修改成功");
                break;
            }
            else{
                System.out.println("不存在此学号");
            }
        }
    }
}

