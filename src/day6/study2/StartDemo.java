package day6.study2;

import java.io.*;
import java.util.Scanner;

public class StartDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        System.out.println("请输入一个字符串");
        String s = br.readLine();
        System.out.println("你输入的字符串是:"+s);

        System.out.println("请输入一个整数");
        int i = Integer.parseInt(br.readLine());
        System.out.println("你输出的整数是: "+i);

        Scanner sc=new Scanner(System.in);
        sc.nextLine();
    }
}