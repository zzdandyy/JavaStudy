package day05.study6;

import java.io.*;

public class CopyMp4Demo {
    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();

//        复制视频

        //method1();   //基本字节流一次读写一个字节，耗时：44349毫秒
        method2();   //基本字节流一次读写一个字节数组，耗时：62毫秒
        //method3();   //字节缓冲流一次读写一个字节，耗时：110毫秒
        //method4();   //字节缓冲流一次读写一个字节数组，耗时：16毫秒

        long endTime = System.currentTimeMillis();
        System.out.println("耗时：" + (endTime - startTime) + "毫秒");
    }

    private static void method1() throws IOException {
        FileInputStream fis = new FileInputStream("src\\day5\\study6\\test.mp4");
        FileOutputStream fos = new FileOutputStream("src\\day5\\study6\\testMethod1.mp4");

        int by;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }
        fis.close();
        fos.close();
    }

    private static void method2() throws IOException {
        FileInputStream fis = new FileInputStream("src\\day5\\study6\\test.mp4");
        FileOutputStream fos = new FileOutputStream("src\\day5\\study6\\testMethod2.mp4");

        byte[] bytes = new byte[1024];
        int len;
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        fis.close();
        fos.close();
    }

    private static void method3() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src\\day5\\study6\\test.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src\\day5\\study6\\testMethod3.mp4"));

        int by;
        while ((by = bis.read()) != -1) {
            bos.write(by);
        }
        bis.close();
        bos.close();
    }

    private static void method4() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src\\day5\\study6\\test.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src\\day5\\study6\\testMethod4.mp4"));

        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
        bis.close();
        bos.close();
    }
}
