package net.digitalingot.feather;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.jetbrains.annotations.NotNull;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface dt {
   boolean a() default false;

   @NotNull
   dy b() default @dy(
   a = "",
   b = "",
   c = "",
   d = 0
);
}
