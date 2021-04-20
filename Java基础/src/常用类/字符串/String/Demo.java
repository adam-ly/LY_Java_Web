package 常用类.字符串.String;

public class Demo {
    public static void main(String[] args) {

        /** String类是不可以修改的 */

        //s1 - s3 存储在常量区中
        String s1 = "123";
        String s2 = "123";
        String s3 = "456";

        // s4、s5 存在于堆区
        String s4 = new String(s1);
        String s5 = new String("456");

        // 通过字符数组创建字符串
        char[] helloArray = {'h','e','l','l','o'};
        String hello = new String(helloArray);
        System.out.println("通过字符数组创建字符串 = " + hello);

        // 拼接字符串
        String str1 = "Ni";
        String str2 = "Hao";
        System.out.println("字符串拼接1 = " + str1.concat(str2));
        
        String str3 = str1 + str2;
        System.out.println("字符串拼接2 = " + str1.concat(str2));


        System.out.println("-------------字符串比较------------");

        Boolean result = new String("bb").equals(new String("cc"));
        System.out.println("比较两个字符串是否相等 = " + result);

        int result1 = new String("fa").compareTo(new String("ca"));
        System.out.println("按照字典顺序比较字符串，区分大小写,返回结果为《参与比较的两个字母》ACII码的差值，" +
                "可以通过简单判断正负来决定大小 = " + result1);

        int result2 = new String("F").compareToIgnoreCase(new String("f"));
        System.out.println("按照字典顺序比较字符串，不区分大小写 = " + result2);

        System.out.println("-------------字符串比较------------");


    }
}
