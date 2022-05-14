package net.digitalingot.feather;

import java.lang.reflect.Field;
import net.digitalingot.feather.util.FeatherError;
import org.jetbrains.annotations.NotNull;

public class dT implements dL<Enum<?>> {
   @NotNull
   public Enum<?> b(@NotNull String var1, @NotNull Class<? extends Enum<?>> var2) {
      for(Enum var6 : (Enum[])var2.getEnumConstants()) {
         Field var7;
         try {
            var7 = var2.getDeclaredField(var6.name());
         } catch (NoSuchFieldException var9) {
            throw new IllegalStateException(var9);
         }

         dw var8 = (dw)var7.getDeclaredAnnotation(dw.class);
         if (var8 == null) {
            throw new IllegalStateException("Enum constant \"" + var6.name() + "\" in enum \"" + var2.getName() + "\" not annotated with @EnumValue");
         }

         if (var8.a().equals(var1)) {
            return var6;
         }
      }

      throw new FeatherError("Enum constant \"" + var1 + "\" not found in enum \"" + var2.getName() + "\"");
   }

   @NotNull
   public String a(@NotNull Enum<?> var1) {
      Class var2 = var1.getDeclaringClass();

      Field var3;
      try {
         var3 = var2.getDeclaredField(var1.name());
      } catch (NoSuchFieldException var5) {
         throw new IllegalStateException(var5);
      }

      dw var4 = (dw)var3.getDeclaredAnnotation(dw.class);
      if (var4 == null) {
         throw new IllegalStateException("Enum constant \"" + var1.name() + "\" in enum \"" + var2.getName() + "\" not annotated with @EnumValue");
      } else {
         return var4.a();
      }
   }
}
