package day05.study8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class CallNameDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src\\day5\\study8\\className.txt"));
        ArrayList<String> array = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            array.add(line);
        }
        br.close();
        Random random = new Random();
        int getIndex = random.nextInt(array.size());
        System.out.println("幸运者是：" + array.get(getIndex));
    }
}
