package 常用集合类.ArrayList;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo {

    public static void main(String[] args) {

        /**
         * 创建：不能存放基本数据类型，只能存放对象类型
         * 注意使用泛型指定类型
         */
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>(10);
        ArrayList<Integer> list2 = new ArrayList<>(list);

        /**
         * 添加
         * */
        ArrayList<String> append_list = new ArrayList<>();
        append_list.add("11");
        append_list.add("22");
        append_list.add("33");

        ArrayList<String> str_list = new ArrayList<>();
        str_list.add("aa");
        System.out.println("添加一个对象 - "+str_list);

        str_list.add(0,"bb");
        System.out.println("指定位置添加对象 - "+str_list);

        str_list.addAll(append_list);
        System.out.println("将数组对象复制并添加进来 - "+str_list);

        str_list.addAll(3,append_list);
        System.out.println("将数组对象复制并添加到指定位置 - "+str_list);

        System.out.println("--------------------------------------");
        /**
        * 删除
        * */
        ArrayList<String> remove_list = new ArrayList<>(str_list);

        remove_list.remove(3);
        System.out.println("删除对应位置的对象 - " + remove_list);

        //多个同样的对象只会移除第一个
        remove_list.remove("33");
        System.out.println("删除指定内容的对象，只会删第一个 - " + remove_list);

        //这里的匿名类实现了Predicate接口
        remove_list.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s == "22";
            }
        });
        System.out.println("删除指定条件的对象 - " + remove_list);

        remove_list.addAll(0,str_list);
        System.out.println("remove - " + remove_list);
        ArrayList<String> l = new ArrayList<>();
        l.add("aa");  l.add("bb");  l.add("11");

        //移除传入数组中所包含的内容相等的《所有》对象；
        remove_list.removeAll(l);
        System.out.println("删除于目标数组内容相等的《所有》对象 - " + remove_list);

        //清空
        remove_list.clear();
        System.out.println("清空数组 - " + remove_list);
    }

}
