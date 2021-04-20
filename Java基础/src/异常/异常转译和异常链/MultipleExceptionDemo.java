package 异常.异常转译和异常链;

import java.util.ArrayList;
import java.util.List;

//由于方法中只能throw一个异常，为了一个以上的异常，可以通过自定义的方式去保存其他异常
public class MultipleExceptionDemo {

    static void dealWithMoreThanOneException() throws Exception,CustomException {
        CustomException exception = new CustomException();
        try { }catch (Exception e){ exception.addException(e); }
        try { }catch (Exception e){ exception.addException(e); }
        if (exception.exceptions.size() > 0) throw exception;
    }
}

class CustomException extends Exception{
    protected List<Exception> exceptions = new ArrayList<>();
    void addException(Exception e){
        exceptions.add(e);
    }

}
