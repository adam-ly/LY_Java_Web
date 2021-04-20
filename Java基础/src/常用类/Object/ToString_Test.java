package 常用类.Object;

public class ToString_Test {
    //ToString方法是用来打印类的相关信息，默认打印类的地址，可以重写该方法以返回更详细的内容
    public static void main(String[] args) {

        //默认打印地址
        System.out.println(new Cat());

        //打印自定义内容
        System.out.println(new Person());
    }
}

class Person {
    int age;
    String name;

    @Override
    public String toString() {
        return "This Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

class Cat {
    int age;
    String name;
}
