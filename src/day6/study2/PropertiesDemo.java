package day6.study2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();

        FileReader fr = new FileReader("src\\day6\\study2\\game.txt");
        prop.load(fr);
        fr.close();

        int number = Integer.parseInt(prop.getProperty("count"));
        if (number >= 3) {
            System.out.println("次数已达上限(https://www.baidu.com)");
        } else {
            GameDemo.play(); //游戏类
            number++;
            prop.setProperty("count", String.valueOf(number));
            FileWriter fw = new FileWriter("src\\day6\\study2\\game.txt");
            prop.store(fw, null);
            fw.close();
        }
    }
}
