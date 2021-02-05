package day07.study3;

import java.util.Date;

@MyAnno
@SuppressWarnings("all")  //压制所有警告
public class AnnoDemo {
    @Override  //重写
    public String toString() {
        return super.toString();
    }

    @Deprecated  //标注此方法已过时
    public void show() {
        System.out.println("有缺陷的show方法");
    }

    public void newShow() {
        System.out.println("新的show方法");
    }

    public void demo() {
        show();
        Date date = new Date();
        date.getYear();
    }
}