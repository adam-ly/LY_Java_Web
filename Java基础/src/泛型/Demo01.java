package 泛型;
import java.util.*;

//泛型的定义
public class Demo01 {

    //系统中泛型的使用
    public <T extends  Comparable<T>> T max(T t,T t1){
        return t.compareTo(t1) > 0 ? t : t1;
    }
}

//1、泛型一般用大写字符表示,可以是一个或多个字母,
class Human<KEY,VALUE>{
    KEY k;
    VALUE v;
    public Human(KEY key,VALUE value){
        k = key;
        v = value;
    }
}
//2、泛型可以指定类 或接口的《实现类》
interface Work{}
class Man<T extends Human,W extends Work>{

}


