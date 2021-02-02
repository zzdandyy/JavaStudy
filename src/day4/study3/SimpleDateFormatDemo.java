package day4.study3;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date d=new Date();
        //Date->String
        String s=sdf.format(d);
        System.out.println(s);

        //String->Date
        String ss="1999年01月28日 11:45:21";
        Date dd=sdf.parse(ss);
        System.out.println(dd);
    }
}
