package Java基础.L_02_类.变量.访问修饰符.PACKAGE_02;

import Java基础.L_02_类.变量.访问修饰符.PACKAGE_01.ClassB;


public class ClassC {

    public static void main(String[] args) {
        ClassB b = new ClassB();
        // ClassC 不能访问 b 的protect 属性
//        b.pro
    }
}

class ClassE extends ClassB {
    void func() {
        // ClassE 是 B 的子类 可以访问其protect属性
        this.protected_b = 1;
    }
}

