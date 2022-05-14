package net.digitalingot.feather.mods;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface HUDConfig {
   double a() default 0.0;

   double b() default 0.0;

   double c() default 1.0;

   boolean d() default false;

   boolean e() default false;
}
