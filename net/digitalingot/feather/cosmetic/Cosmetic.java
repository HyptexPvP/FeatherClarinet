package net.digitalingot.feather.cosmetic;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Cosmetic {
   @NotNull
   private final String a;
   @NotNull
   private final String b;
   @NotNull
   private final String c;
   @NotNull
   private final Cosmetic.a d;
   @NotNull
   private final ResourceLocation e;
   @Nullable
   private final JsonElement f;

   public Cosmetic(
      @NotNull String var1, @NotNull String var2, @NotNull String var3, @NotNull Cosmetic.a var4, @NotNull ResourceLocation var5, @Nullable JsonElement var6
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

   @NotNull
   public ResourceLocation e() {
      return this.e;
   }

   @Nullable
   public JsonElement f() {
      return this.f;
   }

   public static enum a {
      @SerializedName("Capes")
      CAPE,
      @SerializedName("Wings")
      WINGS,
      @SerializedName("Boots")
      BOOTS,
      @SerializedName("Hats")
      HATS;
   }
}
