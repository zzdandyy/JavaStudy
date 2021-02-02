package day5.study5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("src\\day5\\study5\\test.jpg");
        FileOutputStream fos =new FileOutputStream("src\\day5\\study5\\testCopy.jpg");

        byte[] bytes=new byte[1024];
        int len;
        while((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fis.close();
        fos.close();
    }
}
