package day02;
import java.util.Scanner;
public class MyString {
    public void getString(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line=sc.nextLine();
        for(int i=0;i<line.length();i++){
            System.out.println(line.charAt(i));
        }
    }
    public void countNumber(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line=sc.nextLine();
        int bigCount=0;
        int smallCount=0;
        int numberCount=0;
        for(int i=0;i<line.length();i++){
            if(line.charAt(i)>='A' && line.charAt(i)<='Z'){
                bigCount++;
            }
            else if(line.charAt(i)>='a' && line.charAt(i)<='z'){
                smallCount++;
            }
            else{
                numberCount++;
            }
        }
        System.out.println("大写字母有"+bigCount+"个");
        System.out.println("小写字母有"+smallCount+"个");
        System.out.println("数字有"+numberCount+"个");
    }
    public String stringBack(String st){
        String stBack="";
        for(int i=st.length()-1;i>=0;i--){
            stBack+=st.charAt(i);
        }
        return stBack;
    }
    public void sBulid(){
        StringBuilder sss=new StringBuilder("66655");
        sss.append("55");
        sss.reverse();
        System.out.println(sss);
    }
}
