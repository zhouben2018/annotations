package com.zben.test.annotations;

import java.lang.annotation.*;

/**
 * @Author: zben
 * @Description:水果名称注解
 * @Date: 下午2:23 2018/4/17
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitName {
    String value() default "";
}
