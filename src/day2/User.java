package day2;
import java.util.Scanner;
public class User {
    private final String  username="doublez";
    private final String password="aa2217117";

    public void lognIn(){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            System.out.println("请输入用户名");
            String un=sc.nextLine();
            System.out.println("请输入密码");
            String pw=sc.nextLine();
            if(un.equals(this.username) && pw.equals(this.password)){
                System.out.println("登录成功");
                break;
            }
            else {
                System.out.println("用户名或密码错误");
                if(i==2){
                    System.out.println("失败次数过多，账号被锁定");
                }
            }
        }
    }
}
