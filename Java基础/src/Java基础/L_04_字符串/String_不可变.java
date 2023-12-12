package Java基础.L_04_字符串;

public class String_不可变 {
    public static void main(String[] args) {

        /** java中 string是不可变的，一个string对象在内存中被创建出来，
           它就无法被修改，而且string的所有方法并没有改变本身的值，而是返回一个新的string，
           如果需要修改字符串的值，那么需要用StringBuilder 或 StringBuffer */
        String a = "a";
        a = "b"; // 这里其实是指向了一个新的字符串了

        /** 字符串设计成不可变主要有以下几点理由：*/

        // 1、利用缓存，java中string是使用频率和次数极高的数据结构，缓存字符串可以节省内存资源
        String c = "c";
        String d = c; // 这里 c 和 d 都指向缓存中的 “c” .

        // 2、安全性，字符串广泛用于存储敏感信息，用户名 密码 等。如果字符串本身不可变。那么就可以相信它其中的内容

        // 3、线程安全，不可变的特性使得字符串变成线程安全的

        // 4、hashcode缓存， 哈希码在HashTable，HashMap. hashSet 等数据结构中使用。因此hashcode在string类中重写，以方便缓存。
          // private int hash;//this is used to cache hash code. 

    }
}

