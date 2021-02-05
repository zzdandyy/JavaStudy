package day06.study2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesAndIoDemo {
    public static void main(String[] args) throws IOException {
        //集合中的数据保存到文件
        myStore();
        //文件数据保存到集合
        myLoad();
    }

    private static void myLoad() throws IOException {
        Properties prop = new Properties();
        FileReader fr = new FileReader("src\\day6\\study2\\test.txt");
        prop.load(fr);
        fr.close();
        System.out.println(prop);
    }

    private static void myStore() throws IOException {

        Properties prop = new Properties();
        FileWriter fw = new FileWriter("src\\day6\\study2\\test.txt");
        prop.setProperty("001", "小王");
        prop.setProperty("002", "小李");
        prop.setProperty("003", "小明");
        prop.store(fw, null);
        fw.close();
    }
}
