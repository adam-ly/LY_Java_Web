package 多线程.Runable接口.Demo1;
import java.lang.Thread;

public class Machine implements Runnable {

    private int a = 0;

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
//            try{
//                Thread.sleep(100);
//            }catch (InterruptedException e){
//                throw new RuntimeException(e);
//            }
        }
    }
}
