package com.zben.test.annotations;

import java.lang.annotation.*;

/**
 * @Author: zben
 * @Description:水果供应者
 * @Date: 下午2:27 2018/4/17
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitProvider {
    /**
     * 供应商编号
     */
    public int id() default -1;

    /**
     * 供应商名称
     */
    public String name() default "";

    /**
     * 供应商地址
     */
    public String address() default "";

}




























