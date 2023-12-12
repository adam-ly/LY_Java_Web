package Java基础.L_02_类.变量;

public class Variables {
    // 类变量 （方法区）
    private static int a;

    //成员变量 （堆区）
    private int b;

    //局部变量 c d (存在于栈区)
    void func(int c) {
        int d;
    }
}
