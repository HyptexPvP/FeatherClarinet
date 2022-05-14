package net.digitalingot.feather;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Field;
import net.digitalingot.feather.mods.ModConfigAnnotation;

public class bB implements FieldNamingStrategy {
   public String translateName(Field var1) {
      ModConfigAnnotation var2 = (ModConfigAnnotation)var1.getDeclaredAnnotation(ModConfigAnnotation.class);
      if (var2 != null) {
         return var2.a();
      } else {
         SerializedName var3 = (SerializedName)var1.getDeclaredAnnotation(SerializedName.class);
         if (var3 != null) {
            return var3.value();
         } else {
            if (!var1.getType().isAssignableFrom(eh.class)) {
               FeatherLogger.a.error(var1 + " translated using FieldNamingPolicy.IDENTITY");
            }

            return FieldNamingPolicy.IDENTITY.translateName(var1);
         }
      }
   }
}
