package 异常.自定义异常;

import com.sun.security.ntlm.Server;

import java.rmi.ServerException;

public class CustomExceptionDemo {

    public static void main(String[] args) {


    }

}

/// 通过自定义异常来处理相应的场景
class ServersException extends Exception {
    private String reason;
    private int port;
    public ServersException(String reason,int port){
        this.reason = reason;
        this.port = port;
    }

    public int getPort() {
        return port;
    }

    public String getReason() {
        return reason;
    }
}
