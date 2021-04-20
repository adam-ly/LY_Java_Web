package 修饰符.Static修饰符;

public class Demo02 {
    public static void main(String[] args) {
        /*
        结果解析：
        1、执行main函数之前要先加载Son类
        2、由于Son继承自Father，所以要优先加载Father类，然后发现static代码块，执行。
        3、然后加载Son,发现static代码块，执行。
        4、开始执行main函数
        5、初始化父类方法，初始化子类方法
        */
        new Son();
    }
}

class Son extends Father {
    static {
        System.out.println("Son static");
    }
    public Son(){
        System.out.println("Son init");
    }
}

class Father{
    static {
        System.out.println("Father static");
    }
    public Father(){
        System.out.println("Father init");
    }
}