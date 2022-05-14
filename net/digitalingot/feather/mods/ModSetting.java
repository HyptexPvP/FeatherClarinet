package net.digitalingot.feather.mods;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.cL;
import net.digitalingot.feather.cP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ModSetting {
   @SerializedName("type")
   @NotNull
   private final ModSetting.a a;
   @SerializedName("name")
   @NotNull
   private final String b;
   @SerializedName("slug")
   @Nullable
   private final String c;
   @SerializedName("parent")
   @Nullable
   private final cL d;
   @SerializedName("value")
   @Nullable
   private final cP e;
   @SerializedName("chroma")
   @Nullable
   private final Boolean f;
   @SerializedName("opacity")
   @Nullable
   private final Boolean g;

   public ModSetting(
      @NotNull ModSetting.a var1,
      @NotNull String var2,
      @Nullable String var3,
      @Nullable cL var4,
      @Nullable cP var5,
      @Nullable Boolean var6,
      @Nullable Boolean var7
   ) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
      this.g = var7;
   }

   @NotNull
   public ModSetting.a a() {
      return this.a;
   }

   @NotNull
   public String b() {
      return this.b;
   }

   @Nullable
   public String c() {
      return this.c;
   }

   @Nullable
   public cL d() {
      return this.d;
   }

   @Nullable
   public cP e() {
      return this.e;
   }

   @Nullable
   public Boolean f() {
      return this.f;
   }

   @Nullable
   public Boolean g() {
      return this.g;
   }

   public static enum a {
      @SerializedName("title")
      TITLE,
      @SerializedName("radio")
      RADIO,
      @SerializedName("dropdown")
      DROPDOWN,
      @SerializedName("bool")
      BOOLEAN,
      @SerializedName("colorpicker")
      COLOR_PICKER,
      @SerializedName("slider")
      SLIDER,
      @SerializedName("text")
      TEXT,
      @SerializedName("keyPicker")
      KEY_PICKER,
      @SerializedName("checkbox")
      CHECKBOX;
   }
}
