package net.digitalingot.feather.mods;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class ModsConponment implements Comparable<ModsConponment> {
   @SerializedName("name")
   @NotNull
   private final String a;
   @SerializedName("slug")
   @NotNull
   private final ModsConfig b;
   @SerializedName("icon")
   @NotNull
   private final String c;
   @SerializedName("description")
   @NotNull
   private final String d;
   @SerializedName("categories")
   @NotNull
   private final ModsConponment.Category[] e;
   @SerializedName("form")
   @NotNull
   private final List<ModSetting> f;

   public ModsConponment(
      @NotNull String var1,
      @NotNull ModsConfig var2,
      @NotNull String var3,
      @NotNull String var4,
      @NotNull ModsConponment.Category[] var5,
      @NotNull List<ModSetting> var6
   ) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
   }

   @NotNull
   public String a() {
      return this.a;
   }

   @NotNull
   public ModsConfig b() {
      return this.b;
   }

   @NotNull
   public String c() {
      return this.c;
   }

   @NotNull
   public String d() {
      return this.d;
   }

   @NotNull
   public ModsConponment.Category[] e() {
      return this.e;
   }

   @NotNull
   public List<ModSetting> f() {
      return this.f;
   }

   public int a(@NotNull ModsConponment var1) {
      return this.a.compareTo(var1.a());
   }

   public static enum Category {
      @SerializedName("HUD")
      HUD,
      @SerializedName("Hypixel")
      HYPIXEL,
      @SerializedName("PvP")
      PVP;
   }
}
