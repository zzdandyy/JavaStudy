package day5.study5;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fo = new FileOutputStream("src\\day5\\study5\\test.txt");
        String s="hello world\n666";
        fo.write(s.getBytes());
        fo.close();
    }
}
