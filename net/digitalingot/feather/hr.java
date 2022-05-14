package net.digitalingot.feather;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import net.digitalingot.feather.mods.Mod;
import net.digitalingot.feather.mods.ModsConfig;
import net.digitalingot.feather.util.ModUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.resources.ResourcePackRepository.Entry;
import org.capnproto.Text.Reader;
import org.capnproto.TextList.Builder;
import org.lwjgl.opengl.GL11;

public class hr {
   public static void a(ht var0) {
      Minecraft.func_71410_x().func_152344_a(() -> var0.a(a()));
   }

   private static Consumer<hF.f.e.a> a() {
      return var0 -> {
         a(var0);
         var0.a(Minecraft.func_71410_x().func_175600_c());
         b(var0);
         c(var0);
         d(var0);
      };
   }

   private static void a(hF.f.e.a var0) {
      Runtime var1 = Runtime.getRuntime();
      String var2 = System.getProperty("os.name");
      short var3 = (short)var1.availableProcessors();
      int var4 = a(var1.maxMemory());
      String var5 = OpenGlHelper.func_183029_j();
      String var6 = GL11.glGetString(7936) + " " + GL11.glGetString(7937);
      hF.f.e.c.a var7 = var0.c();
      var7.a(var2);
      var7.a(var3);
      var7.b(var4);
      var7.b(var5);
      var7.c(var6);
   }

   private static void b(hF.f.e.a var0) {
      List var1 = ModUtils.a();
      Builder var2 = var0.b(var1.size());

      for(int var3 = 0; var3 < var1.size(); ++var3) {
         String var4 = (String)var1.get(var3);
         var2.set(var3++, new Reader(var4));
      }

   }

   private static void c(hF.f.e.a var0) {
      int var1 = 0;
      Minecraft var2 = Minecraft.func_71410_x();
      List var3 = var2.func_110438_M().func_110613_c();
      Builder var4 = var0.c(var3.size());

      for(Entry var6 : var3) {
         String var7 = var6.func_110515_d();
         var4.set(var1, new Reader(var7));
         ++var1;
      }

   }

   private static void d(hF.f.e.a var0) {
      ArrayList var1 = new ArrayList();

      for(java.util.Map.Entry var3 : e.c().b().f().entrySet()) {
         Mod var4 = (Mod)var3.getValue();
         if (var4.m()) {
            ModsConfig var5 = (ModsConfig)var3.getKey();
            var1.add(var5);
         }
      }

      Builder var6 = var0.d(var1.size());

      for(int var7 = 0; var7 < var1.size(); ++var7) {
         ModsConfig var8 = (ModsConfig)var1.get(var7);
         var6.set(var7, new Reader(var8.getSlug()));
      }

   }

   private static int a(long var0) {
      return (int)(var0 / 1024L / 1024L);
   }
}
