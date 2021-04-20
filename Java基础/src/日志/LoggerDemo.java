package 日志;
import java.io.IOException;
import java.util.logging.*;

public class LoggerDemo {

    static {
        System.setProperty("java.util.logging.config.file",System.getProperty("C:\\代码\\Java基础\\src\\日志")+"\\logging.properties");
    }

    public static void main(String[] args) {
         //consoleLog();

        //
        try {
            logToLocal();
        }catch (IOException e){

        }

    }

    static void consoleLog(){
        Logger log = Logger.getLogger("MyLogger");
        log.setLevel(Level.WARNING); // 设置为WARNING级别，那么包括info在内的更低级别的日志都会被打印出来
        log.severe("severe");
        log.warning("warninig");
        log.info("info");

        //默认情况下，config及更高的日志是不会输出到控制台或文件中
        log.config("config");
        log.fine("fine");
        log.finer("finer");
        log.finest("finest");
    }

    static void logToLocal() throws IOException {
        //默认情况下 日志是输出到控制台的 我们可以将它写入到本地文件中

        FileHandler handler = new FileHandler("C:\\代码\\Java基础\\src\\日志\\LocalLogTest.txt");
        handler.setLevel(Level.ALL); //设置写入到日志的级别
        Logger log = Logger.getLogger("local");
        log.addHandler(handler);
        log.severe("severe日志");
        log.warning("warninig日志");
        log.info("info日志");

        //默认情况下，config及更高的日志是不会输出到控制台或文件中
        log.config("config日志");
        log.fine("fine日志");
        log.finer("finer日志");
        log.finest("finest日志");
    }


}
