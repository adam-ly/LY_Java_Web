package 修饰符.Abstract;

public class Demo01 {

}

// 抽象类不能初始化
abstract class AbstactClass{
    //  一、
    //抽象方法没有方法体
    //抽象方法所在的类必须是抽象类
    abstract void abstact_method();

    abstract void abstact_method1();

    //  二、
    //静态方法可以存在与抽象类中，但必须提供实现
    static void static_method() {
        System.out.println("static method");
    }

    // 三、
    //不允许存在 静态+抽象 方法
//    static abstract method();

    // 四、
    //final 与 abstact不能公用。abstact必须由子类实现方法，final修饰的类则不允许创建子类

    // 五、
    //private 与 abstact不能共用
}

// 六
// 抽象类可以定义各种类型的成员变量
abstract class abst_Class{
    private int a = 1;
}


