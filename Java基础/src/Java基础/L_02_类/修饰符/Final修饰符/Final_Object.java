package Java基础.L_02_类.修饰符.Final修饰符;

public class Final_Object {

     // Final作用
    // 1、被修饰的类不能被继承
    // 2、被修饰的方法不能被重写
    // 3、被修饰的变量的值不能被再次改变，只能被赋一次值
    // 4、定义单例


    //定义单例
    public final Final_Object single_obj = new Final_Object();
    public Final_Object shareInstance(){ return single_obj; }

    int num = 0;
    void method(){

        //1、被修饰的对象 a 可以修改其对象的内容
        final Final_Object a = new Final_Object();
        a.num = 1;

        //2、被final修饰的对象不可以修改
        //a = 10;

        //3、不能指向其他对象
//        a = new Object();
    }
}

