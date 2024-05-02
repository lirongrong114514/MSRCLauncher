/**
 * 启动主方法
 */

public class launcherMain {
    public static void main(String[] args) {
        boolean $$loginit =log.initLog();
        boolean $$clinetinit = api.initClient();
        if($$loginit==false){
            System.out.println("日志系统初始化失败");
        }
        if($$clinetinit==false){
            System.out.println("客户端初始化失败");
            System.gc();
            System.exit(50);
        }
    }
}