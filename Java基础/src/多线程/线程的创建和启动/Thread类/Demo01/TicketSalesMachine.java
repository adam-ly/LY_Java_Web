package 多线程.线程的创建和启动.Thread类.Demo01;

public class TicketSalesMachine extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(currentThread().getName() + " : " + i);
            try{
                sleep(100);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
