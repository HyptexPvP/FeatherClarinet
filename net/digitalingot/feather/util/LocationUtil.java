package net.digitalingot.feather.util;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.hP;

public class LocationUtil {
   @SerializedName("lat")
   private final double a;
   @SerializedName("lon")
   private final double b;

   public static LocationUtil a() {
      return hP.a("http://ip-api.com/json/?fields=192").a(LocationUtil.class);
   }

   public LocationUtil(double var1, double var3) {
      this.a = var1;
      this.b = var3;
   }

   public double b() {
      return this.a;
   }

   public double c() {
      return this.b;
   }
}
