package day5.study7;

import java.io.*;

public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("src\\day5\\study7\\test.txt"));
        InputStreamReader isr = new InputStreamReader(new FileInputStream("src\\day5\\study7\\OutputStreamWriterDemo.java"));
        osw.write("666");
        osw.close();
        char[] chars = new char[1024];
        int len;
        while ((len = isr.read(chars)) != -1) {
            System.out.println(chars);
        }
    }
}
