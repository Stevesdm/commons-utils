package com.steve.commonloggeraction.annotation;


import java.lang.annotation.*;

/**
 * @Description: 日志注解
 * @Author: stevejobson
 * @CreateDate: 2017/11/23 下午2:58
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogActionAnnotation {

    /**
     * 操作动作
     *
     * @return
     */
    String action() default "";

    /**
     * 操作模块
     *
     * @return
     */
    String module() default "";

    /**
     * 自定义操作描述
     *
     * @return
     */
    String comment() default "";
}
