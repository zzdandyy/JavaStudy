package day6.study1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetToTxtDemo {
    public static void main(String[] args) throws IOException {
        TreeSet<Student> ts = new TreeSet<>((s1, s2) -> {
            int num = s2.getSum() - s1.getSum();
            int num2 = num == 0 ? s1.getChinese() - s2.getChinese() : num;
            int num3 = num2 == 0 ? s1.getEnglish() - s2.getEnglish() : num2;
            return num3 == 0 ? s1.getName().compareTo(s2.getName()) : num3;
        });
        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入第" + (i + 1) + "个学生信息");
            System.out.println("姓名：");
            String name = sc.nextLine();
            System.out.println("语文成绩：");
            int chinese = sc.nextInt();
            System.out.println("数学成绩：");
            int math = sc.nextInt();
            System.out.println("英语成绩：");
            int english = sc.nextInt();

            Student st = new Student();
            st.setName(name);
            st.setChinese(chinese);
            st.setMath(math);
            st.setEnglish(english);
            ts.add(st);
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\day6\\study1\\student.txt"));
        for (Student s : ts) {
            bw.write(s.getName() + "," + s.getChinese() + "," + s.getMath() + "," + s.getEnglish() + " 总分" + s.getSum());
            bw.newLine();
            bw.flush();
        }
        bw.close();
        System.out.println("录入结束");
    }
}
