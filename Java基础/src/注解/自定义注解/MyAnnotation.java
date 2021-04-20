package 注解.自定义注解;


public @interface MyAnnotation {
   String a() default ""; //使用default关键字给属性初始化时，使用注解的时候可以不用赋值
}
