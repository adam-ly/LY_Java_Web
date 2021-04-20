package Java类.类.内部类_匿名类.内部类的作用;

//通过匿名内部类来优化简单的接口实现
public class demo3 {



    public static void main(String[] args) {
        //定义了一个没有名字的内部类，并且这个类实现了Runable接口，在一个类
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();
    }
}
