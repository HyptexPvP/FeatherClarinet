package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

public class eO {
   @SerializedName("name")
   @NotNull
   private String a;
   @SerializedName("command")
   @NotNull
   private String b;
   @SerializedName("key")
   @NotNull
   private is c;

   public eO(@NotNull String var1, @NotNull String var2, @NotNull is var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public void a() {
      Minecraft.func_71410_x().field_71439_g.func_71165_d(this.b);
   }

   @NotNull
   public String b() {
      return this.a;
   }

   public void a(@NotNull String var1) {
      this.a = var1;
   }

   @NotNull
   public String c() {
      return this.b;
   }

   public void b(@NotNull String var1) {
      this.b = var1;
   }

   @NotNull
   public is d() {
      return this.c;
   }

   public void a(@NotNull is var1) {
      this.c = var1;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         eO var2 = (eO)var1;
         return this.a.equals(var2.a);
      } else {
         return false;
      }
   }

   public int hashCode() {
      return Objects.hash(new Object[]{this.a});
   }
}
