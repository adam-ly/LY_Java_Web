package 修饰符.Static修饰符;

import Java类.类.内部类_匿名类.匿名类.Demo;

public class Demo01 {
     static int value = 33;

    public static void main(String[] args) {
        new Demo01().printValue();
    }

    static void staticMethod(){
        System.out.println("static method");
    }

    private void printValue(){
        int value = 55;
        //可以看到 局部的value并没有被使用，this此时引用的是 静态的value ，这是因为 static变量是被对象所享有的
        System.out.println(this.value);

        this.staticMethod();
    }
}
