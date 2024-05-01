import java.util.Scanner;

/**
 * 启动主方法
 */
public class launcherMain {
    //获取用户名和密码
    public static Object getUsernameAndPassword(){
        Scanner $$username = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String $username = $$username.nextLine();
        Scanner $$password = new Scanner(System.in);
        System.out.print("请输入密码：");
        String $password = $$password.nextLine();
        if($username!="" & $password!=""){
        }else {
            System.out.println("请重新输入账号和密码！");
            return getUsernameAndPassword();
        }
        return null;
    }
    public static void main(String[] args) {
        getUsernameAndPassword();
    }
}
