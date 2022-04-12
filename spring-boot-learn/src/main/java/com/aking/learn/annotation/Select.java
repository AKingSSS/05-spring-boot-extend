package com.aking.learn.annotation;

import java.lang.annotation.*;

/**
 * @author yangkang
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Select {
    String value() default "";
}
