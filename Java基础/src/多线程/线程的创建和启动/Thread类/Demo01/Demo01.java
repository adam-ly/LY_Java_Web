package 多线程.线程的创建和启动.Thread类.Demo01;

public class Demo01 {

    public static void main(String[] args) {
        TicketSalesMachine machine1 = new TicketSalesMachine();
        TicketSalesMachine machine2 = new TicketSalesMachine();

        //注意：不要手动调用run方法，而是调用start
        machine1.start();
        machine2.start();

        //注意：一个线程只能启动一次，否则会抛出异常
        //machine2.start();
    }
}


