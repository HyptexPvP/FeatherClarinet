package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class cL {
   @SerializedName("field")
   @NotNull
   private final String a;
   @SerializedName("values")
   @Nullable
   private final List<String> b;

   public cL(@NotNull String var1, @Nullable List<String> var2) {
      this.a = var1;
      this.b = var2;
   }

   @NotNull
   public String a() {
      return this.a;
   }

   @Nullable
   public List<String> b() {
      return this.b;
   }
}
