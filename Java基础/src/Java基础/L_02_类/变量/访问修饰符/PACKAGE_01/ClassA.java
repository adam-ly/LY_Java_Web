package Java基础.L_02_类.变量.访问修饰符.PACKAGE_01;

public class ClassA {
    public int public_a = 1;
    protected int protected_b = 1; // 同一个包内可以访问，不同包内只能是子类访问。
    private int private_c = 1;
    int default_d = 1;


    void method(){
        //同一包内的类不能访问其 private 成员
        ClassB b = new ClassB();
        b.default_d = 2;
        b.protected_b = 2;
        b.public_a = 3;
    }
}
