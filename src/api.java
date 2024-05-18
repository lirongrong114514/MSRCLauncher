import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.Date;
public class api extends mapi{

    //
    File $plugins = new File("../plugins","init.plugins");


    //登录
    public static boolean login(){
        try {
            //mapi.initPlugins();
        }catch (Exception e){
            //initPlugins();
        }
        return false;
    }
    @Override
    public void initPlugins(){
    }
    //获取用户名和密码
    public static final Object getUsernameAndPassword(){
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
                //needUserYesToProtocol();
            }
            return true;
        }catch (Exception e){
            return false;
        }
    }
    //获取时间
    public static final String Date(){
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

    //debug方法
    protected static void debug(){
        //死循环交互
        for(;;){
            Scanner $input = new Scanner(System.in);
            System.out.println("################################################################");
            System.out.println();
            System.out.println("DEBUG MSRC INDEV 1.0 NOT LTS");
            System.out.println();
            System.out.println("################################################################");
            System.out.println("成功进入debug模式！使用-help命令获取使用方法！");
            //获取输入
            String $tmp = $input.nextLine();
            if(Objects.equals($tmp, "-var")){
                System.out.println("#################################################################");
                System.out.println("变量名"+"\t\t"+"变量解释"+"\t\t\t\t  "+"变量值类型"+"\t变量值");
                String[] $var = {"$$loginit","$$clientinit"};
                System.out.println("$$loginit"+"  "+"日志系统初始化状态"+"\tboolean"+"   "+launcherMain.$$loginit);
                System.out.println("$$clientinit"+"客户端主线程初始化状态"+"\tboolean"+"   "+launcherMain.$$clientinit);
                System.out.println("#################################################################");
                /*TODO 循环输出变量
                for (int i=0;i<$var.length;i++){
                    //循环输出变量
                    //缓存变量
                    int p = i;
                    String y =$var[p];
                    String c ="launcherMain."+y;
                    System.out.println("$$loginit"+"  "+"日志系统初始化状态"+"boolean"+"   "+c);
                }
                */
                /*TODO 长度优化输出
                   for (int i=0;i<$var.length;i++){
                    //如果长度小于十个字符
                    if ($var[i].length() <= 10) {
                        //直接输出
                        System.out.print($var[i]);
                    }else {
                        //对长度超过十个字符的变量进行处理处理
                        int j= ($var[i].length())/2;
                        String[] tmp = {}
                    }
                }
                 */
            } else if (Objects.equals($tmp,"-exit")) {
                //退出debug模式
                launcherMain.main(new String[]{"debug"});
            } else if (Objects.equals($tmp,"-kill")) {
                //退出程序
                System.exit(0);
            } else if (Objects.equals($tmp,"-help")) {
                //文档内容
                System.out.println("-var 查看变量追踪");
                System.out.println();
                System.out.println("-exit 退出debug模式");
                System.out.println();
                System.out.println("-kill 结束程序(包括子线程以及主线程)");
                System.out.println();
                System.out.println("-help 获取使用文档");
            }
        }
    }
}