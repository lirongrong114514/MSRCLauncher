import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

/**
 * 启动主方法
 */

public class launcherMain {
    public static boolean $$loginit = false;
    public static boolean $$clientinit = false;
    static{
        $$loginit = log.initLog();
        $$clientinit = api.initClient();
        if ($$loginit == false) {
            System.out.println("日志系统初始化失败");
            if ($$clientinit == false) {
                System.out.println("客户端初始化失败，已创建错误文件。");
                File $file = new File("error.txt");
                try {
                    $file.createNewFile();
                    FileWriter fileWriter = new FileWriter($file);
                    fileWriter.write("尝试创建必要文件是失败！");
                } catch (IOException e) {
                }
                //System.gc();
                //System.exit(50);
            }
        }
    }

    public static void main(String[] args) {
        //判断启动参赛长度是否为零
        if(args.length!=0){
            //判断启动参赛是否为"debug"
            if (args[0]!="debug");
            {
                for(;;){
                    Scanner $$input = new Scanner(System.in);
                    System.out.print("请问如否进入DEBUG模式(Y/N)");
                    String $$tmp = $$input.next();
                    if (Objects.equals($$tmp, "Y")) {
                        api.debug();
                        break;
                    } else if (Objects.equals($$tmp, "N")) {
                        break;
                    }else {
                        System.out.println("请输入Y 或 N ！");
                    }
                }
            }
        }
    }
}