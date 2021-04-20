package 多线程.线程的创建和启动.Thread类.Demo02;


/// 不要随便覆盖 start 方法！
public class Demo02 {
    public static void main(String[] args) {
        Machine m = new Machine();
        m.start();//并没有开启新的线程
    }
}
