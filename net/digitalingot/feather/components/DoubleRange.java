package net.digitalingot.feather.components;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface DoubleRange {
   double a() default 5.0;

   double b() default 0.0;

   double c() default 0.05;
}
