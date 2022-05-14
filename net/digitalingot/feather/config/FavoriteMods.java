package net.digitalingot.feather.config;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class FavoriteMods {
   @SerializedName("compact")
   private Boolean a;
   @SerializedName("favorites")
   private Boolean b;
   @SerializedName("favoriteMods")
   private List<String> c;

   public FavoriteMods(boolean var1, boolean var2, List<String> var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public Boolean a() {
      return this.a;
   }

   public void a(Boolean var1) {
      this.a = var1;
   }

   public Boolean b() {
      return this.b;
   }

   public void b(Boolean var1) {
      this.b = var1;
   }

   public List<String> c() {
      return this.c;
   }

   public void a(List<String> var1) {
      this.c = var1;
   }
}
