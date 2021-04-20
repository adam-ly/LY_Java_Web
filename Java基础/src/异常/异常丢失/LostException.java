package 异常.异常丢失;

public class LostException{
    public static void main(String[] args) {
        test();
    }

    static void test(){
        try {
            new LostExceptionDemo().work();
        }catch (Exception e){
            System.out.println("捕获到的异常为：" + e.getMessage());
            Throwable[] ex = e.getSuppressed();
            for (Throwable exc : ex){
                System.out.println("没有被抛出的异常为：" + exc.getMessage());
            }
        }
    }
}


///测试异常丢失用的类
class LostExceptionDemo {

    Exception exc = null;

    public void work() throws Exception {
        try {
            Integer.parseInt("hello");
        }catch (NumberFormatException e){
            exc = e; //保存数字格式化错误的异常
        }finally {
            // 如果在finally这里也恰好出现了异常，那么由于throw已经抛出了异常，那么这里的异常可能会丢失。
            try{
                int result = 2/0;
            }catch (ArithmeticException e){
                if (exc == null){
                    exc = e;
                }else{
                    exc.addSuppressed(e);//保存多个异常
                }
                throw exc;
            }
        }
    }
}
