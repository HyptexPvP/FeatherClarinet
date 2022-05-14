package net.digitalingot.feather.cosmetic;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.HashMap;
import java.util.Map;
import net.digitalingot.feather.FeatherLogger;
import net.digitalingot.feather.hP;
import net.digitalingot.feather.s;
import net.digitalingot.feather.t;
import net.digitalingot.feather.v;
import net.digitalingot.feather.util.SystemUtil;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CosmeticAPI {
   private static final String a = SystemUtil.a("FEATHER_COSMETICS_JSON", "https://assets.feathercdn.net/cosmetics.json");
   private static final Gson b = new GsonBuilder().registerTypeAdapter(ResourceLocation.class, new v()).create();
   @NotNull
   private final Map<String, Cosmetic> c;
   @NotNull
   private final Map<String, t> d;
   @NotNull
   private final Map<String, Cosmetic> e = new HashMap();
   @NotNull
   private final Map<String, t> f = new HashMap();
   @NotNull
   private final CosmeticsSetting g;
   @NotNull
   private final CosmeticManager h;

   private CosmeticAPI(@NotNull Map<String, Cosmetic> var1, @NotNull Map<String, t> var2, @NotNull CosmeticManager var3) {
      this.c = var1;
      this.d = var2;
      this.g = new CosmeticsSetting();
      this.h = var3;
   }

   public static CosmeticAPI a(@NotNull CosmeticManager var0) {
      HashMap var1;
      HashMap var2;
      try {
         s var3 = hP.a(a).a(b, s.class);
         var1 = new HashMap(var3.a().size());

         for(Cosmetic var5 : var3.a()) {
            var1.put(var5.b(), var5);
         }

         var2 = new HashMap(var3.b().size());

         for(t var8 : var3.b()) {
            var2.put(var8.a(), var8);
         }
      } catch (Exception var6) {
         FeatherLogger.a.error("Error during cosmetics info fetch", var6);
         var1 = new HashMap();
         var2 = new HashMap();
      }

      return new CosmeticAPI(var1, var2, var0);
   }

   public CosmeticPacket a() {
      return new CosmeticPacket(this.h, this);
   }

   public CosmeticAPI.CosmeticEnum a(String var1) {
      return this.c.containsKey(var1)
         ? CosmeticAPI.CosmeticEnum.COSMETIC
         : (this.d.containsKey(var1) ? CosmeticAPI.CosmeticEnum.EMOTE : CosmeticAPI.CosmeticEnum.NONE);
   }

   @Nullable
   public Cosmetic b(String var1) {
      return (Cosmetic)this.c.get(var1);
   }

   @Nullable
   public t c(String var1) {
      return (t)this.d.get(var1);
   }

   @NotNull
   public Map<String, Cosmetic> b() {
      return this.c;
   }

   @NotNull
   public Map<String, t> c() {
      return this.d;
   }

   @NotNull
   public Map<String, Cosmetic> d() {
      return this.e;
   }

   @NotNull
   public Map<String, t> e() {
      return this.f;
   }

   @NotNull
   public CosmeticsSetting f() {
      return this.g;
   }

   public static enum CosmeticEnum {
      COSMETIC,
      EMOTE,
      NONE;
   }
}
