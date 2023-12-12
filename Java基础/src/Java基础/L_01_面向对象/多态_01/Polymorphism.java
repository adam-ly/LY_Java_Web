package Java基础.L_01_面向对象.多态_01;

/**
 * 面向对象三大特性中的《多态》: 为不同数据类型的实体提供统一的接口,或用单一的符号表示多个不同的类型。
 * Java中的多态概念就是用 同一操作 作用于不同对象，产生不同的结果，为了实现多态，需要满足几个条件：
 * 1、继承父类或实现接口
 * 2、子类重写父类方法
 * 3、父类的引用指向子类的对象
 */
 public class Polymorphism {
    public static void main(String[] args) {
        /*父类的引用指向子类的对象 并且子类也重写了父类的方法*/
        Parent p1 = new Son();
        Parent p2 = new Daughter();
    }
}

class Parent{
    public void call(){
        System.out.println("im Parent");
    }
}

class Son extends Parent{// 1.有类继承或者接口实现
    public void call(){// 2.子类要重写父类的方法
        System.out.println("im Son");
    }
}

class Daughter extends Parent{// 1.有类继承或者接口实现
    public void call(){// 2.子类要重写父类的方法
        System.out.println("im Daughter");
    }
}