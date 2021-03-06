package com.bioeasy.common.annotation;

import java.lang.annotation.*;

/**
 * api标示
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface API {
}
