import java.util.Scanner;

public class api {
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
    //初始化
    public static void initClient(){
        if(key.protocol==true){
            if(key.login==true){

            }
        }else {
            //needUserYesToprotocol();
        }
    }
}