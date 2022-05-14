package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class cN implements cP {
   @SerializedName("choices")
   @NotNull
   private final List<cJ> a;

   public cN(@NotNull List<cJ> var1) {
      this.a = var1;
   }

   @NotNull
   public List<cJ> a() {
      return this.a;
   }
}
