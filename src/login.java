import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class login extends Thread{
    public static boolean initLog() {
        try {
            String $date = api.Date().split(" ")[0];
            File logfile = new File("../MSRCLaincher/log", $date + "log.log");
            if (logfile.exists()) {
            } else {
                try {
                    logfile.createNewFile();
                } catch (IOException e) {
                    byte errorByte = key.IOException;
                    api.Error(errorByte);
                }
            }
            return true;
        }catch (Exception e){
            return false;
        }
    }
    public static void main(String[] args) {

    }
}
