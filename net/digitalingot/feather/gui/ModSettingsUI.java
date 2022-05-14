package net.digitalingot.feather.gui;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import net.digitalingot.feather.cosmetic.Cosmetic;
import net.digitalingot.feather.mods.ModSetting;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ModSettingsUI {
   @SerializedName("name")
   @NotNull
   private final String a;
   @SerializedName("slug")
   @NotNull
   private final String b;
   @SerializedName("icon")
   @NotNull
   private final String c;
   @SerializedName("category")
   @NotNull
   private final Cosmetic.a d;
   @SerializedName("form")
   @Nullable
   private final List<ModSetting> e;

   public ModSettingsUI(@NotNull String var1, @NotNull String var2, @NotNull String var3, @NotNull Cosmetic.a var4, @Nullable List<ModSetting> var5) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
   }

   @NotNull
   public String a() {
      return this.a;
   }

   @NotNull
   public String b() {
      return this.b;
   }

   @NotNull
   public String c() {
      return this.c;
   }

   @NotNull
   public Cosmetic.a d() {
      return this.d;
   }

   @Nullable
   public List<ModSetting> e() {
      return this.e;
   }
}
