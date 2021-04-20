package Java类.类.内部类_匿名类.内部类的作用;

/*
关于内部类的第二个好处其实很显而易见，我们都知道外部类即普通的类不能使用 private protected
访问权限符来修饰的，而内部类则可以使用 private 和 protected 来修饰。
当我们使用 private 来修饰内部类的时候这个类就对外隐藏了。
这看起来没什么作用，但是当内部类实现某个接口的时候，在进行向上转型，对外部来说，就完全隐藏了接口的实现了
* */

public class Demo01 {
    public static void main(String[] args) {
        System.out.println("ccc");
        //可以看到 全程都隐藏了内部类，都是通过接口去调用
        Demo01 demo = new Demo01();
        InnerInterface innerObj = demo.getInner();
        innerObj.innerMethod();
    }

    private class InnerObj implements InnerInterface {
        @Override
        public void innerMethod() {
            System.out.println("隐藏了内部类");
        }
    }

    public InnerInterface getInner() {

        return new InnerObj();

    }
}

interface InnerInterface {
    void innerMethod();
}