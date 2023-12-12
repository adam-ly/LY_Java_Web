package 多线程.线程的创建和启动.Thread类.Demo02;

public class Machine extends Thread {

    // 强制同步
    public synchronized void start() {
        run();
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(currentThread().getName() + ":" + i);
        }
    }
}
