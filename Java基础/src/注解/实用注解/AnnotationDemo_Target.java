package 注解.实用注解;

import java.lang.annotation.*;

//@Target: 指定注解适用的目标



//注解类型，用在注解上，比如Target本身就是注解类型，我们用它来修饰注解适用的目标.
@Target(ElementType.ANNOTATION_TYPE) // Target的类型是枚举，一个注解可以对应多个ElementType
@Retention(RetentionPolicy.RUNTIME) // 一个注解对应一个Retention
@Inherited
@interface BaseAnnotationType {

    //不包含任何成员的注解，为标识型注解
    //成员的可选类型包括：String、Class、Primitive(基本类型)、enumerated、annotation以及这些类型的数组。
}

//适用于各种java类型
@Target(ElementType.TYPE)
@interface AnnotationDemo_Target_TYPE {

    //如果只有一个成员，切名字为value，那么给注解赋值的时候不需要写上成员名。
    String value();
}

//适用于构造方法
@Target(ElementType.CONSTRUCTOR)
@interface AnnotationDemo_Target_CONSTRUCTOR {
    String value() default "默认构造方法";
}

//适用于方法
@Target(ElementType.METHOD)
@interface AnnotationDemo_Target_METHOD {

}

//适用于成员变量和枚举
@Target(ElementType.FIELD)
@interface AnnotationDemo_Target_FIELD {
    int minLength();
}

//适用于方法参数
@Target(ElementType.PARAMETER)
@interface AnnotationDemo_Target_PARAMETER {

}

//适用于局部变量
@Target(ElementType.LOCAL_VARIABLE)
@interface AnnotationDemo_Target_LOCAL_VARIABLE {
}




