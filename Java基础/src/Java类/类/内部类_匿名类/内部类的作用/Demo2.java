package Java类.类.内部类_匿名类.内部类的作用;

//可以通过内部类实现多继承
public class Demo2 {

    public static void main(String[] args) {
        Demo2 demo = new Demo2();
        System.out.println(demo.name());
        System.out.println(demo.age());
    }

    public String name(){
        return new InnerOne().name();
    }

    public int age(){
        return new InnerTwo().age();
    }

    class InnerOne extends ExampleOne {
        @Override
        public String name() {
            return super.name();
        }
    }

    class InnerTwo extends ExampleTwo {
        @Override
        public int age() {
            return super.age();
        }
    }
}

class ExampleOne {
    public String name(){
        return "inner";
    }
}

class ExampleTwo {
    public int age(){
        return 10;
    }
}