package 修饰符.访问修饰符.PACKAGE_01;

public class ClassA {
    public int public_a = 1;
    protected int protected_b = 1;
    private int private_c = 1;
    int default_d = 1;


    void method(){
        //同一包内的类不能访问其 private 成员
        ClassB b = new ClassB();
        b.default_d = 2;
        b.protected_b = 2;
        b.protected_b = 2;

    }
}
