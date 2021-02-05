package day05.study6;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class BufferOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("src\\day5\\study6\\test.txt"));
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("src\\day5\\study6\\test.txt"));
        bos.write("hello\r\n".getBytes(StandardCharsets.UTF_8));
        bos.write("world\r\n".getBytes(StandardCharsets.UTF_8));
        bos.close();

        byte[] bytes =new byte[1024];
        int len;
        while ((len=bis.read(bytes))!=-1){
            System.out.println(new String(bytes));
        }
    }
}
