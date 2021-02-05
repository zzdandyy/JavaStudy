package day05.study5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        String file="src\\day5\\study5\\FileInputStreamDemo.java";
        FileInputStream fis=new FileInputStream(file);
        FileOutputStream fos=new FileOutputStream(file,true);
        byte[] bytes=new byte[1024];
        int len= fis.read(bytes);
        String s= new String(bytes,0,len);
        System.out.print(s);
        fos.write("//读数据和写数据".getBytes(StandardCharsets.UTF_8));
        fos.close();
    }
}