package 多线程.线程调度;

public class Demo {

    public static void main(String[] args) {
        //测试线程调度

//        normalPerformance();
        priorityTest();
    }

    static void normalPerformance(){
        Machine m1 = new Machine();
        Machine m2 = new Machine();
        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);

        t1.start();
        t2.start();
    }

    static void priorityTest(){
        Machine m1 = new Machine();
        Machine m2 = new Machine();
        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);
        t1.setPriority(1);
        t2.setPriority(10);
        t1.start();
        t2.start();
    }

    static void yiledTest(){

    }

    static void joinTest(){

    }
}

class Machine implements Runnable{
    private int a = 0;
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}