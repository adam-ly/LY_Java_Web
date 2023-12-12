package Java基础.L_02_类.类的定义;

public class Human {

    public static void main(String[] args) {
        Human h  = new Human();
        Human h1 = new Human("adam");
        Human h2 = new Human("Kelly");
    }

    private String name = "";
    //初始化方法 01
    public Human(){
      System.out.println("构造器01");
    }

    //初始化方法 02
    public Human(String name){
        this.name = name;
        System.out.println("构造器02");
    }

    /*
      static代码块也叫静态代码块，是在类中独立于类成员的static语句块，可以有多个，位置可以随便放，
      它不在任何的方法体内，《JVM加载类时》会执行这些静态的代码块，
      如果static代码块有多个，JVM将按照它们在类中出现的先后顺序依次执行它们，每个代码块《只会被执行一次》。
      静态代码块在类加载时仅仅执行一次，而代码块在类加载时不执行，而是在每次对象创建时都会执行，并且先于构造函数执行
    */
    static { // 静态代码块只会被执行一次
        System.out.println("静态代码块-类被初始化01");
    }

    static { // 代码块执行顺序与代码顺序一致
        System.out.println("静态代码块-类被初始化02");
    }

    { //普通代码块在对象被创建时都会执行一次
        System.out.println("普通代码块-类被初始化03");
    }

}

