package day13.study2;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class JsoupDemo03 {
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.parse(new File("src\\day13\\study2\\student.xml"), "utf-8");
        //获取标签为name的
        Elements elements01 = document.select("name");
        System.out.println(elements01);
        System.out.println("--------");
        //获取id值为name01的
        Elements elements02 = document.select("#name01");
        System.out.println(elements02);
        System.out.println("--------");
        //获取student标签number值为s0001下的age子标签
        Elements elements03 = document.select("student[number=\"s001\"] > age");
        System.out.println(elements03);
    }
}
