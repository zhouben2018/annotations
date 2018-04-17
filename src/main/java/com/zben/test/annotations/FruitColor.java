package com.zben.test.annotations;

import java.lang.annotation.*;

/**
 * @Author: zben
 * @Description:水果颜色注解
 * @Date: 下午2:25 2018/4/17
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitColor {
    /**
     * 颜色枚举
     */
    public enum Color{BLUE, RED, GREEN};

    /**
     * 颜色属性
     */
    Color fruitColor() default Color.GREEN;
}
