package 注解.实用注解;


//@AnnotationDemo_Target_TYPE(value = "adam")
@AnnotationDemo_Target_TYPE("adam") //只有一个成员且名为value，所以不需要指定成员名，直接传值即可。
public class MyClass {

    @AnnotationDemo_Target_FIELD(minLength = 6)
    String name;

    @AnnotationDemo_Target_CONSTRUCTOR
    public MyClass(String name){
        this.name = name;
    }

    @AnnotationDemo_Target_METHOD
    void doSomething( @AnnotationDemo_Target_PARAMETER String t){
        @AnnotationDemo_Target_LOCAL_VARIABLE
        int a = 5;
    }
}
