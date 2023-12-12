package Java基础.L_01_面向对象.重载和重写_03;

/**
 * 重载：指在同一个类中。有《同名》《不同参数》的函数。
 * 1、重载的方法，参数必须不同
 * 2、返回类型可以不同
 * 3、修饰符可以不同
 * 4、可以声明新的异常检查
 * */
public class OverLoad {
    public static void main(String[] args) {
        Parent f = new Parent();
        f.eat();
        f.eat(3);
    }
}

class Parent {
    // 同个类中重载
    void eat() {}
    void eat(Integer times) {}
}
