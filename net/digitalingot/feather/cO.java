package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class cO implements cP {
   @SerializedName("dataTypes")
   @NotNull
   private final String a = "decimal";
   @SerializedName("range")
   private final double[] b;
   @SerializedName("step")
   @Nullable
   private final Double c;

   public cO(double var1, double var3, @Nullable Double var5) {
      this.b = new double[]{var1, var3};
      this.c = var5;
   }

   @NotNull
   public String a() {
      return this.a;
   }

   public double[] b() {
      return this.b;
   }

   @Nullable
   public Double c() {
      return this.c;
   }
}
