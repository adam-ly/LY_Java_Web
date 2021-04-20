package 异常.异常转译和异常链;


//通常某些异常我们不需要抛出到用户端，比如上传图片时解码失败，用户不需要知道系统发生了什么，只需要知道上传图片失败即可。

import java.io.IOException;
import java.util.Date;

public class ExceptionTrans {

    public static void main(String[] args) {

    }

    static void uploadImage() throws Exception {
        try {
            //
        }catch(Exception e){ // try没有IO操作，所以用普通的异常代替一下IOException
            //记录IOException到日志中

            //抛出新的异常，并放入IO的错误信息做进一步的处理，比如转成错误码等等。
            throw new UploadException(e.getMessage());
        }
    }
}

class UploadException extends Exception{
    private String reason;
    public UploadException(String r){
        this.reason = r;
    }
}