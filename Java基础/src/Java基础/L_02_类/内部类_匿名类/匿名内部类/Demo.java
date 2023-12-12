package Java基础.L_02_类.内部类_匿名类.匿名内部类;

//如果一个类在整个操作中，只使用《一次》的话，就可以将其定义成匿名内部类。可以用lambda替代匿名内部类

public class Demo {
    public static void main(String args[]){
        System.out.println("bbb");
        // 实例化X类的对象，并调用fun1()方法
        new X().fun1() ;

        //使用匿名内部类
        new X().func3();

        // 这里定义了一个匿名内部类，它实现了Runable接口。
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();

    }
}

interface A{
    public void printInfo() ;
}

class B implements A{    // 实现接口
    public void printInfo(){
        System.out.println("Hello World!!!") ;
    }
};

class X {
    public void func3(){
        //这里跟fun2的区别就是，没有类B的参与，而是直接初始化一个接口类，此类是匿名的形式，然后在其中实现了接口方法
        //这里定义的匿名类由于是在X中定义的，所以也叫匿名内部类
        this.fun2(new A(){
            public void printInfo(){
                System.out.println("PrintInfo");
            }
        });
    }

    public void fun1(){
        this.fun2(new B()) ;
    }
    public void fun2(A a){
        a.printInfo() ;
    }
};

