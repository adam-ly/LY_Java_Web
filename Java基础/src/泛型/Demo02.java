package 泛型;

import java.util.ArrayList;
import java.util.Collection;

//通配符 ？ ，表示可以存放任意元素
public class Demo02 {

    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);

        Collection<Object> collection1 = new ArrayList<>();
        collection1.add(1);
        collection1.add("2");

        // foreachCollection(collection);//错误 integer不是Object类型
        foreachColleactionNew(collection); //正确，使用通配符可以适用任何类型
    }

    static void foreachCollection(Collection<Object> collection){

    }

    static void foreachColleactionNew( Collection<?> collection ){

    }
}
