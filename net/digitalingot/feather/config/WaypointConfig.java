package net.digitalingot.feather.config;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import net.digitalingot.feather.mods.Waypoints;
import net.digitalingot.feather.util.ChromaColor;
import net.minecraft.entity.Entity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class WaypointConfig {
   @SerializedName("name")
   @NotNull
   private String a;
   @SerializedName("toggled")
   private boolean b;
   @SerializedName("color")
   @NotNull
   private ChromaColor c;
   @SerializedName("server")
   @Nullable
   private String d;
   @SerializedName("world")
   private String e;
   @SerializedName("location")
   @NotNull
   private WaypointConfig.a f;

   public WaypointConfig(@NotNull String var1, boolean var2, @NotNull ChromaColor var3, @NotNull WaypointConfig.a var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.f = var4;
   }

   public boolean a(@NotNull Waypoints var1) {
      String var2 = var1.b();
      if (var2 == null) {
         return false;
      } else if (!var2.equals(this.e)) {
         return false;
      } else {
         String var3 = var1.c();
         return var3 == null ? true : var3.equals(this.d);
      }
   }

   @NotNull
   public String a() {
      return this.a;
   }

   public void a(@NotNull String var1) {
      this.a = var1;
   }

   public void a(boolean var1) {
      this.b = var1;
   }

   public boolean b() {
      return this.b;
   }

   public void a(@NotNull ChromaColor var1) {
      this.c = var1;
   }

   @NotNull
   public ChromaColor c() {
      return this.c;
   }

   public void b(@Nullable String var1) {
      this.d = var1;
   }

   @Nullable
   public String d() {
      return this.d;
   }

   public void c(String var1) {
      this.e = var1;
   }

   public String e() {
      return this.e;
   }

   public void a(@NotNull WaypointConfig.a var1) {
      this.f = var1;
   }

   @NotNull
   public WaypointConfig.a f() {
      return this.f;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         WaypointConfig var2 = (WaypointConfig)var1;
         return this.a.equals(var2.a);
      } else {
         return false;
      }
   }

   public int hashCode() {
      return Objects.hash(new Object[]{this.a});
   }

   public static class a {
      @SerializedName("x")
      private final int a;
      @SerializedName("y")
      private final int b;
      @SerializedName("z")
      private final int c;

      public a(int var1, int var2, int var3) {
         this.a = var1;
         this.b = var2;
         this.c = var3;
      }

      public double a(@NotNull Entity var1) {
         double var2 = (double)this.a - var1.field_70169_q;
         double var4 = (double)this.b - var1.field_70167_r;
         double var6 = (double)this.c - var1.field_70166_s;
         return Math.sqrt(var2 * var2 + var4 * var4 + var6 * var6);
      }

      public int a() {
         return this.a;
      }

      public int b() {
         return this.b;
      }

      public int c() {
         return this.c;
      }
   }
}
