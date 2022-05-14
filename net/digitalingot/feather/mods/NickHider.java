package net.digitalingot.feather.mods;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
import net.digitalingot.feather.dn;
import net.digitalingot.feather.eh;
import net.digitalingot.feather.event.ChatEvent;
import net.digitalingot.feather.event.Events;
import net.digitalingot.feather.gui.HUD;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.client.resources.SkinManager;
import net.minecraft.client.resources.SkinManager.SkinAvailableCallback;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.NotNull;

@FeatherModule(
   a = ModsConfig.NICK_HIDER,
   b = @dn(
   a = "Nick Hider",
   b = "https://assets.feathercdn.net/game/mods/nickhider.svg",
   c = "Hide your nick and skin",
   d = {}
)
)
public class NickHider extends Mod<NickHider.b> {
   private static final int a = 5000;
   private static final int c = 1000000000;
   private static final String d = "Player-";
   private static final String e = " ";
   private static final String f = "You";
   private Minecraft g;
   private ResourceLocation h;
   private String i;
   private ResourceLocation j;
   private boolean k;
   private final List<NickHider.a> l = Lists.newArrayList();
   private final Cache<String, Boolean> m = CacheBuilder.newBuilder().maximumSize(5000L).build();
   private final LoadingCache<String, String> n = CacheBuilder.newBuilder().maximumSize(5000L).build(new CacheLoader<String, String>() {
      public String a(@NotNull String var1) {
         String var2 = var1;

         for(NickHider.a var4 : NickHider.this.l) {
            var2 = var4.a.matcher(var2).replaceAll(var4.c);
         }

         return var2;
      }
   });

   @Override
   public void f() {
      this.g = Minecraft.func_71410_x();
      Events.a.a(var1 -> {
         if (var1 == Events.c.START && this.m()) {
            this.e();
         }

      });
      Events.d.a(var1 -> {
         if (var1 == Events.c.START && this.m()) {
            this.o();
         }

      });
      ChatEvent.a.a((ChatEvent)var1 -> this.m() ? this.e(var1) : var1);
   }

   private void d() {
   }

   private void e() {
   }

   private String c(String var1) {
      return null;
   }

   private void o() {
      if (this.b.b || this.b.j) {
         EntityPlayerSP var1 = this.g.field_71439_g;
         if (var1 != null) {
            NetHandlerPlayClient var2 = var1.field_71174_a;
            if (var2 != null) {
               UUID var3 = this.q().getId();
               boolean var4 = false;

               for(NetworkPlayerInfo var6 : var2.func_175106_d()) {
                  GameProfile var7 = var6.func_178845_a();
                  String var8 = var7.getName();
                  UUID var9 = var7.getId();
                  if (var3.equals(var9)) {
                     if (this.b.b) {
                        var4 |= this.a(var8, "You");
                     }
                  } else if (this.b.c) {
                     var4 |= this.a(var8, this.d(var8));
                  }
               }

               if (var4) {
                  this.n.invalidateAll();
               }

            }
         }
      }
   }

   private String d(String var1) {
      int var2 = Math.abs(var1.hashCode());
      return "Player-" + var2 % 1000000000;
   }

   private boolean a(String var1, String var2) {
      if (!var1.isEmpty() && !var1.contains(" ")) {
         var1 = var1.toLowerCase(Locale.ROOT);
         if (this.m.getIfPresent(var1) != null) {
            return false;
         } else {
            this.m.put(var1, true);
            String var3 = var1.length() > 2 ? var2 : var1;
            NickHider.a var4 = new NickHider.a(Pattern.compile(Pattern.quote(var1), 2), var1, var3);
            this.l.add(var4);
            Comparator var5 = Comparator.comparingInt(var0 -> var0.b.length());
            this.l.sort(var5.reversed());
            return true;
         }
      } else {
         return false;
      }
   }

   public ResourceLocation a() {
      this.p();
      return this.h;
   }

   private void p() {
      if (this.i == null && !this.k) {
         this.a(this.q(), (var1, var2, var3) -> {
            switch(var1) {
               case SKIN:
                  this.h = var2;
                  this.i = var3.getMetadata("model");
                  if (this.i == null) {
                     this.i = "default";
                  }
                  break;
               case CAPE:
                  this.j = var2;
            }

            this.k = false;
         }, false);
      }
   }

   private void a(GameProfile var1, SkinAvailableCallback var2, boolean var3) {
      SkinManager var4 = this.g.func_152342_ad();
      var4.func_152790_a(var1, var2, var3);
   }

   public String b() {
      return this.i;
   }

   public ResourceLocation c() {
      return this.j;
   }

   private String e(String var1) {
      if (this.r()) {
         for(NickHider.a var3 : this.l) {
            if (!var3.c.equals("You")) {
               var1 = Pattern.compile(var3.c, 2).matcher(var1).replaceAll(var3.b);
            }
         }
      }

      return var1;
   }

   public String a(String var1) {
      return var1;
   }

   public String b(String var1) {
      return this.r() ? (String)this.n.getUnchecked(var1) : var1;
   }

   public String[] a(String[] var1, String var2) {
      if (!this.r()) {
         return var1;
      } else {
         for(int var3 = 0; var3 < var1.length; ++var3) {
            var1[var3] = this.b(var1[var3]);
         }

         String[] var9 = var2.split(" ");
         String var4 = var9[var9.length - 1];
         String var5 = var4.toLowerCase(Locale.ROOT);
         ArrayList var6 = new ArrayList();

         for(NickHider.a var8 : this.l) {
            if (var8.d.startsWith(var5)) {
               var6.add(var8.c);
            }
         }

         HashSet var10 = Sets.newHashSet(var1);
         var10.addAll(var6);
         return (String[])var10.toArray(new String[0]);
      }
   }

   private GameProfile q() {
      return this.g.func_110432_I().func_148256_e();
   }

   private boolean r() {
      return (this.b.b || this.b.c) && !this.l.isEmpty();
   }

   static class a {
      public Pattern a;
      public String b;
      public String c;
      public String d;

      public a(Pattern var1, String var2, String var3) {
         this.a = var1;
         this.b = var2;
         this.c = var3;
         this.d = var3.toLowerCase(Locale.ROOT);
      }
   }

   public static class b extends HUD {
      @ModConfigValueAnnotation(
         a = 0
      )
      public eh a = new eh("Name Options");
      @ModConfigAnnotation(
         a = "hideOwnName",
         b = "Hide Your Own Name",
         c = "false",
         e = @ModConfigValueAnnotation(
   a = 1
)
      )
      public boolean b;
      @ModConfigAnnotation(
         a = "hideOtherNames",
         b = "Hide Other Names",
         c = "false",
         e = @ModConfigValueAnnotation(
   a = 2
)
      )
      public boolean c;
      @ModConfigValueAnnotation(
         a = 10
      )
      public eh d = new eh("Skin Options");
      @ModConfigAnnotation(
         a = "hideSkin",
         b = "Hide Your Skin",
         c = "false",
         e = @ModConfigValueAnnotation(
   a = 11
)
      )
      public boolean e;
      @ModConfigAnnotation(
         a = "showRealSkin",
         b = "Show Real Skin",
         c = "false",
         e = @ModConfigValueAnnotation(
   a = 12
)
      )
      public boolean i;
      @ModConfigAnnotation(
         a = "hideOtherSkins",
         b = "Hide Other Skins",
         c = "false",
         e = @ModConfigValueAnnotation(
   a = 13
)
      )
      public boolean j;
   }
}
