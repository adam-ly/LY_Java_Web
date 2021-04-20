package Java类.类.内部类_匿名类.内部类的定义;

// 类比变量
// 变量 -> 成员变量 -> (实例变量 / 静态变量)
//     -> 局部变量

// 类 -> 成员内部类 -> (实例内部类 / 静态内部类)
//   -> 局部内部类

public class InnerClass {
    int A = 5;
    public static void main(String[] args) {

        //初始化内部类之前要先初始化其外部类
        OutterObj outter = new OutterObj();
        OutterObj.InnerObj inner = outter.new InnerObj();
        //等价于
        OutterObj.InnerObj obj = new OutterObj().new InnerObj();

        //非静态内部类在main中无法直接初始化，要先初始化其外部类
        //CLS cls = new CLS();
        InnerClass.CLS cls = new InnerClass().new CLS();

        //静态内部类可以直接初始化，不需要先初始化其外部类
        OutterObj.StaticInnerObj obj1 = new OutterObj.StaticInnerObj();
    }

    //要修饰成静态类 不然在静态方法main中无法初始化，在这里相当于成员内部类
    private class CLS {

    }
}

//相对于内部类InnerObj来讲 OutterObj就是外部类
class OutterObj {

    private int diff = 20;
    private int same = 10;
    private String privete_data = "privete_data";
    public String public_data = "public_data";
    static String static_str = "static_str";

    //1、在类内部定义的类就是内部类
    class InnerObj {
        int same = 5;//内部类与外部类可以有同名成员变量

        //2 内部类和外部类虽然在同个文件中，但还是会被编译成两个文件
        //  编译器会自动为内部类添加一个成员变量，类型与外部类一致，是指向外部类对象（this）的引用
        //  在调用内部类的构造函数初始化内部类对象时，会默认传入外部类的引用。

        //static int a = 5;// 非静态内部类不可以持有静态变量
        public InnerObj(){
            System.out.println(privete_data);
            System.out.println(public_data);
            testForSameProp();
        }

        //由于有外部类对象的引用，所以可以访问外部对象的实例
        void testForSameProp(){
            System.out.println("访问同名的内部和外部成员变量");
            System.out.println("inner same =" + this.same);
            System.out.println("outter same = " + OutterObj.this.same);
        }
    }

    // 静态内部类，不会自动生成外部类的引用，只能访问外部类的静态成员变量
    static class StaticInnerObj{

        //可以持有静态变量
        static int a = 5;

        public StaticInnerObj(){
            //编译失败 不会自动持有外部类特定实例的引用
            //System.out.println(Same);

           // 只能访问到外部静态属性
           System.out.println(static_str);
        }
    }

    // 私有内部类，只能在外部类中使用，无法被外界使用
    private class PrivateInnerObj {

    }
}
