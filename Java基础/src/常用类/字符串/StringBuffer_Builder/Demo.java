package 常用类.字符串.StringBuffer_Builder;

public class Demo {

    /**
     * 不同于普通的String对象，StringBiilder和StringBuffer可以修改并且不会产生新的对象
     *  StringBuffer 是线程安全的，效率低一些
     *  StringBuilder 是非线程安全的，性能更好，大多数情况下会用到这个
     *  
     *            charsequence          appendable
     *              |      |                |
     *           String   AbstractStringBuilder
     *                             |
     *                       ------ ------
     *                       |           |
     *                 StringBuilder  StringBuffer
     */

    public static void main(String[] args) {
             
        StringBuffer str = new StringBuffer("123");
        str.append(4.0);
        System.out.println(str);

        StringBuilder str1 = new StringBuilder("456");
        str1.append(4);
        System.out.println(str1);
    }


}
