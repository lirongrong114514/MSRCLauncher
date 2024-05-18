import java.io.File;
import java.io.IOException;

public class log extends Thread{
    public static boolean initLog() {
        try {
            //获取时间
            String $date = api.Date().split(" ")[0];
            String $$logPath = $date+"log.log";
            File logfile = new File("./log", $$logPath);
            //判断日志文件是否存在
            if (logfile.exists()) {
            } else {
                try {
                    logfile.createNewFile();
                } catch (IOException e) {
                    //抛出错误
                    byte errorByte = value.IOException;
                    api.Error(errorByte);
                    return false;
                }
            }
            //返回执行成功
            return true;
        }catch (Exception e){
            //返回执行失败
            return false;
        }
    }
    public static void main(String[] args) {
        //TODO
    }
}
