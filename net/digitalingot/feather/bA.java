package net.digitalingot.feather;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;

public class bA implements ExclusionStrategy {
   public boolean shouldSkipField(FieldAttributes var1) {
      return var1.getDeclaredClass().isAssignableFrom(eh.class);
   }

   public boolean shouldSkipClass(Class<?> var1) {
      return var1.isAssignableFrom(eh.class);
   }
}
