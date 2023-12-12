package Java基础.L_01_面向对象.重载和重写_03;

/**
 * 重写: 子类对父类方法的重写， 需要注意以下几点：
 * 1、重写后的方法 访问级别不能高于父类方法
 * 2、只能抛出一样或更少的异常，比如原来的方法有抛出异常，重写的方法可以不抛出
 * 3、不能重写被 final 修饰的方法
 * */

public class OverWrite {

    public static void main(String[] args) {
        Dog dog = new Hound();
        dog.bark();
    }
}

class Dog{
    public void bark(){
        System.out.println("woof ");
    }
}
class Hound extends Dog{

    public void sniff(){
        System.out.println("sniff ");
    }

    public void bark(){
        System.out.println("bowl");
    }
}