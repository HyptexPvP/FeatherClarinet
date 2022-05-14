package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public class cJ {
   @SerializedName("slug")
   @NotNull
   private final String a;
   @SerializedName("name")
   @NotNull
   private final String b;

   public cJ(@NotNull String var1, @NotNull String var2) {
      this.a = var1;
      this.b = var2;
   }

   @NotNull
   public String a() {
      return this.a;
   }

   @NotNull
   public String b() {
      return this.b;
   }
}
