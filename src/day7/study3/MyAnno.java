package day7.study3;

import java.lang.annotation.*;

/**
 *
 元注解：用于描述注解的注解

 1.@Target：描述注解能够作用的位置

 2.@Retention：描述注解能够被保留的阶段

 3.@Documented：描述注解能否被抽取到api文档中

 4.@Inherited：描述注解能否被子类继承
 *
 *
 */

@Target({ElementType.TYPE}) //只能作用于类上
@Retention(RetentionPolicy.RUNTIME)
@Documented()
public @interface MyAnno {

}
