package 修饰符.访问修饰符.PACKAGE_01;

public class ClassA_Sub  extends ClassB {

    void method(){
        this.default_d = 1;
        //这里访问不到父类的 private 成员
        super.default_d = 1;
        super.protected_b = 1;
        super.public_a = 1;
    }
}
