import java.io.File;
import java.io.IOException;

public class log extends Thread{
    public static boolean initLog() {
        try {
            String $date = api.Date().split(" ")[0];
            File logfile = new File("../MSRCLauncher/log", $date + "log.log");
            if (logfile.exists()) {
            } else {
                try {
                    logfile.createNewFile();
                } catch (IOException e) {
                    byte errorByte = value.IOException;
                    api.Error(errorByte);
                    return false;
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
