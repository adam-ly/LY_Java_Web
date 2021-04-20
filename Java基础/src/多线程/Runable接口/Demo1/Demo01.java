package 多线程.Runable接口.Demo1;

import javax.crypto.Mac;

public class Demo01 {

    public static void main(String[] args) {
        demo1();
    }

    //在两条线程中，分别执行m的run方法，由于t1和t2都共享m的成员变量，那么（执行多次）可以看到，t1和t2的结果没有相等
    static void demo1(){
        Machine m = new Machine();
        Thread t1 = new Thread(m);
        Thread t2 = new Thread(m);
        t1.start();
        t2.start();
    }

    //这里由于t1和t2访问的是不同的对象，所以并没有共享资源。
    void demo2(){
        Machine m1 = new Machine();
        Machine m2 = new Machine();
        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);
        t1.start();
        t2.start();
    }
}
