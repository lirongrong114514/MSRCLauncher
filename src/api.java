import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
public class api {

    //登录
    public static boolean login(){

        return false;
    }
    //获取用户名和密码
    public static Object getUsernameAndPassword(){
        Scanner $$username = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String $username = $$username.nextLine();
        Scanner $$password = new Scanner(System.in);
        System.out.print("请输入密码：");
        String $password = $$password.nextLine();
        if($username!="" & $password!=""){
            String[] $user = {$username,$password};
            return $user;
        }else {
            System.out.println("请重新输入账号和密码！");
            return getUsernameAndPassword();
        }
    }
    //初始化客户端
    public static boolean initClient(){
        try{
            if(value.protocol==true){
                if(value.login==true){
                    getUsernameAndPassword();
                } else if (value.login==false) {
                    login();
                }
            }else {
                //needUserYesToprotocol();
            }
            return true;
        }catch (Exception e){
            return false;
        }
    }
    //获取时间
    public static String Date(){
        Date d = new Date();
        SimpleDateFormat sbf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sbf.format(d);
    }
    //错误方法
    public static void Error(byte errorByte){
        if(errorByte== value.IOException){
            System.out.println("I/O异常！");
            System.gc();
            System.exit(100);
        }else if(errorByte== value.Exception){
            System.out.println("出现了未知错误！");
            System.gc();
            System.exit(120);
        }
    }

}