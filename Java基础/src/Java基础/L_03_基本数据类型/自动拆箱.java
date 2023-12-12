package Java基础.L_03_基本数据类型;

import java.util.ArrayList;
import java.util.List;

public class 自动拆箱 {
    public static void main(String[] args) {

        //数据溢出不会报异常，因此使用同类型的数据运算的时候，一定要注意数据溢出问题。
        demo1();

        // 基本数据类型在java中都有对应的包装类，使用包装类可以为基本数据类型提供方法和属性，以提供便利的操作。

        // 装箱：将基本数据类型转换成对应的包装类。
        Integer i = 10;  // Integer i = Integer.valueOf(10);

        // 拆箱：将包装类自动转化为基本数据类型。
        int j = i; // int j = integer.intValue();

        /** 什么情况下会自动装箱、拆箱？ */
        // java中集合只能存放对象，因此将基本数据类型放入集合的时候，其实java已经自动处理了装箱。
        List<Integer> list = new ArrayList<>();
        list.add(19);

        // 比较基本数据类型和包装类的大小时，会先对包装类进行拆箱然后进行比较
        int ii = 1333;
        Integer jj = 1333;
        System.out.println(ii == jj);
        System.out.println(jj.equals(ii)); // 这里ii被自动装箱，equals判断的是对象的引用，因此为false

        // 包装类进行运算时也会被拆箱
        Integer o = 10;
        Integer p = 20;

        System.out.println(o+p);

        /** 自动拆装箱与缓存，java5中，对【-128，+127】区间的对象进行了缓存。因此获取此范围内的整数比较时都是使用同一缓存对象，
         *  超出这个范围则是动态创建的对象， 因此尽量用《equals》来进行比较 */
        demo02();

        /** 注意01 包装类是一个类，那么要为它提供处理null的能力以防止各种情况 */
        boolean flag = true;
        Integer n = null;
        int m = 1;
        int k = flag ? n : m; // 如果n为null，那么这里n拆箱时会报错。

        /** 注意02 自动装箱是需要创建对象的，因此在循环中使用需要注意性能开销 */


    }

    static void demo1(){
        int i = Integer.MAX_VALUE;
        int j = Integer.MAX_VALUE;

        int k = i + j;
        System.out.println("i (" + i + ") + j (" + j + ") = k (" + k + ")");
    }

    static void demo02() {

        Integer integer1 = 3;
        Integer integer2 = 3;

        if (integer1 == integer2)
            System.out.println("integer1 == integer2");
        else
            System.out.println("integer1 != integer2");

        Integer integer3 = 300;
        Integer integer4 = 300;

        if (integer3 == integer4)
            System.out.println("integer3 == integer4");
        else
            System.out.println("integer3 != integer4");
    }
}
