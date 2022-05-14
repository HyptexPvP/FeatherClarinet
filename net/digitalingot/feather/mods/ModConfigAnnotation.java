package net.digitalingot.feather.mods;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import net.digitalingot.feather.dB;
import org.jetbrains.annotations.NotNull;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ModConfigAnnotation {
   @NotNull
   String a();

   @NotNull
   String b();

   @NotNull
   String c() default "";

   @NotNull
   dB d() default @dB(
   a = ""
);

   @NotNull
   ModConfigValueAnnotation e();
}
