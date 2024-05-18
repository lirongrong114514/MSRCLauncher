import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 启动主方法
 */

public class launcherMain {
    static {
        boolean $$loginit = log.initLog();
        boolean $$clinetinit = api.initClient();
        if ($$loginit == false) {
            System.out.println("日志系统初始化失败");
            if ($$clinetinit == false) {
                System.out.println("客户端初始化失败，已创建错误文件。");
                File $file = new File("error.txt");
                try {
                    $file.createNewFile();
                    FileWriter fileWriter = new FileWriter($file);
                    fileWriter.write("尝试创建必要文件是失败！");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                System.gc();
                System.exit(50);
            }
        }
    }

    public static void main(String[] args) {

    }
}