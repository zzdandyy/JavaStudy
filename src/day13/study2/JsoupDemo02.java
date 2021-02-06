package day13.study2;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class JsoupDemo02 {
    public static void main(String[] args) throws IOException {
        //获取Document对象，根据xml文档获取
        Document document = Jsoup.parse(new File("src\\day13\\study2\\student.xml"), "utf-8");
        Elements students = document.getElementsByTag("student");
        for (Element student : students) {
            System.out.println(student.attr("number"));
        }
        System.out.println("--------");
        System.out.println(students.get(0).getElementsByTag("name"));
        System.out.println("--------");
        for (Element student : students) {
            System.out.println(student.text());
        }
        System.out.println("--------");
        for (Element student : students) {
            System.out.println(student.html());
        }
    }
}
