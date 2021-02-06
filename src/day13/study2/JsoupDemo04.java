package day13.study2;

import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsoupDemo04 {
    public static void main(String[] args) throws IOException, XpathSyntaxErrorException {
        Document document = Jsoup.parse(new File("src\\day13\\study2\\student.xml"), "utf-8");
        //根据Document对象创建JXDocument对象
        JXDocument jxDocument = new JXDocument(document);
        //selN 查询某个标签，不考虑其在文档中的位置
        List<JXNode> jxNodes = jxDocument.selN("//student");
        for (JXNode jxNode : jxNodes) {
            System.out.println(jxNode);
        }
        System.out.println("--------");
        //查询student下的name标签
        List<JXNode> jxNodes1 = jxDocument.selN("//student/name");
        for (JXNode jxNode : jxNodes1) {
            System.out.println(jxNode);
        }
        System.out.println("--------");
        //查询student标签下带有id属性的name标签
        List<JXNode> jxNodes2 = jxDocument.selN("//student/name[@id]");
        for (JXNode jxNode : jxNodes2) {
            System.out.println(jxNode);
        }
        //查询student标签下带有id属性且值为name01的name标签
        System.out.println("--------");
        List<JXNode> jxNodes3 = jxDocument.selN("//student/name[@id='name01']");
        for (JXNode jxNode : jxNodes3) {
            System.out.println(jxNode);
        }
    }
}
