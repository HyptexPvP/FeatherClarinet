package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class cQ implements cP {
   @SerializedName("dataType")
   @NotNull
   private final String a = "int";
   @SerializedName("range")
   private final int[] b;
   @SerializedName("step")
   @Nullable
   private final Integer c;

   public cQ(int var1, int var2, @Nullable Integer var3) {
      this.b = new int[]{var1, var2};
      this.c = var3;
   }

   @NotNull
   public String a() {
      return this.a;
   }

   public int[] b() {
      return this.b;
   }

   @Nullable
   public Integer c() {
      return this.c;
   }
}
