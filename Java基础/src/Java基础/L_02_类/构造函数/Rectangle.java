package Java基础.L_02_类.构造函数;

/**
 * 1、构造函数没有返回类型
 * 2、一个类可以有多个构造函数
 * 3、构造函数中会给变量提供初始值（如果构造函数没有传参给变量赋值的情况下）
 * */
public class Rectangle {
    int width;
    int length;
    public Rectangle() {}

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }
}
