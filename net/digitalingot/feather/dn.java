package net.digitalingot.feather;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import net.digitalingot.feather.mods.ModConfigValueAnnotation;
import net.digitalingot.feather.mods.ModsConponment;
import org.jetbrains.annotations.NotNull;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Inherited
public @interface dn {
   @NotNull
   String a();

   @NotNull
   String b();

   @NotNull
   String c();

   @NotNull
   ModsConponment.Category[] d();

   @NotNull
   dn.a e() default @dn.a;

   public @interface a {
      @NotNull
      String a() default "";

      @NotNull
      ModConfigValueAnnotation b() default @ModConfigValueAnnotation(
   a = 0
);
   }
}
