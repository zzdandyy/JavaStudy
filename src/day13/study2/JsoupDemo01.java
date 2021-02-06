package day13.study2;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class JsoupDemo01 {
    //快速入门
    public static void main(String[] args) throws IOException {
        //获取Document对象，根据xml文档获取
        Document document = Jsoup.parse(new File("src\\day13\\study2\\student.xml"), "utf-8");
        //获取Element对象，返回的是一个集合
        Elements elements = document.getElementsByTag("name");
        Element element = elements.get(0);
        String name = element.text();
        System.out.println(name);
        System.out.println("--------");
        //属性名为id的对象
        Elements id = document.getElementsByAttribute("id");
        System.out.println(id);
        System.out.println("--------");
        //属性名为number且值为s001的对象
        Elements elementsByAttributeValue = document.getElementsByAttributeValue("number", "s001");
        System.out.println(elementsByAttributeValue);
        System.out.println("--------");
        //id属性值的元素对象
        Element name01 = document.getElementById("name01");
        System.out.println(name01);
    }
}
