package Java类.类.内部类_匿名类.匿名类;

public class Demo {
    public static void main(String[] args) {
        System.out.println("12123");
        AnonymousDemo d = new AnonymousDemo();
        d.createClass();
        d.extentTest();
    }
}
interface Polygon {
    public void display();
}

class TestClass{
    public void doSomething(){
        System.out.println("do something");
    }
}

class AnonymousDemo {
    public void createClass() {
        //定义了一个匿名类，而且匿名类实现一个接口
        Polygon p1 = new Polygon() {
            public void display() {
                System.out.println("在匿名类内部-01");
            }
        };
        p1.display();

        //上面可以简写为
        new Polygon(){
            public void display(){
                System.out.println("在匿名类内部-02");
            }
        }.display();
    }

    public void extentTest() {
        //定义了一个继承于TestClass的匿名类
        TestClass t1 = new TestClass(){
            public void doSomething(){
                System.out.println("do something");
            }
        };
        t1.doSomething();

        //上面可以简写为
        new TestClass(){
            public void doSomething(){
                System.out.println("do another thing");
            }
        }.doSomething();
    }
}
