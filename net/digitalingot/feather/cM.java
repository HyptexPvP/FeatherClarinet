package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class cM implements cP {
   @SerializedName("columns")
   private final int a;
   @SerializedName("choices")
   @NotNull
   private final List<cJ> b;

   public cM(int var1, @NotNull List<cJ> var2) {
      this.a = var1;
      this.b = var2;
   }

   public int a() {
      return this.a;
   }

   @NotNull
   public List<cJ> b() {
      return this.b;
   }
}
