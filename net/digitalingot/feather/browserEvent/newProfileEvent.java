package net.digitalingot.feather.browserEvent;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class newProfileEvent {
   @SerializedName("favorites")
   private List<String> a;
   @SerializedName("lastUsed")
   private List<String> b;

   public newProfileEvent(List<String> var1, List<String> var2) {
      this.a = var1;
      this.b = var2;
   }

   public List<String> a() {
      return this.a;
   }

   public void a(List<String> var1) {
      this.a = var1;
   }

   public List<String> b() {
      return this.b;
   }

   public void b(List<String> var1) {
      this.b = var1;
   }
}
