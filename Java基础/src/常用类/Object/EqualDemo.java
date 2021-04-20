package 常用类.Object;

import java.util.Objects;

public class EqualDemo {
    //
    public static void main(String[] args) {
        People p1 = new People("en","black",15,"123");
        People p2 = new People("en","black",15,"456");
        People p3 = new People("cn","white",52,"123");
        System.out.println(p1.equals(p3));
        System.out.println(p1.equals(p2));
    }
}

class People {
    String ID;
    String language;
    String skinColor;
    Integer age;

    public People(String language,String skinColor,Integer age,String ID){
        this.language = language;
        this.skinColor = skinColor;
        this.age = age;
        this.ID = ID;
    }

    //自定义equal方法
    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People human = (People) o;

        //身份证相同的就是同一个人
        return ID.equals(((People) o).ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(language, skinColor, age, ID);
    }
}

class Dog{
    String name;
    Integer age;
}