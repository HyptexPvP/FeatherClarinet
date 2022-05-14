package net.digitalingot.feather.components;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface IntegerRange {
   int a() default 100;

   int b() default 0;

   int c() default 1;
}
