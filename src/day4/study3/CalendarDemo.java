package day4.study3;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();//多态的形式
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入年份");
        int year =sc.nextInt();
        //3月1日
        c.set(year,2,1);
        //往前推一天
        c.add(Calendar.DATE,-1);
        //获取2月份的天数
        int date=c.get(Calendar.DATE);
        //输出
        System.out.println(date);
    }
}
