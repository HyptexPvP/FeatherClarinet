package net.digitalingot.feather.browserEvent;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import net.digitalingot.feather.ce;
import net.digitalingot.feather.e;
import net.digitalingot.feather.is;
import net.digitalingot.feather.iv;
import net.digitalingot.feather.ix;
import net.digitalingot.feather.browser.BrowserNotification;
import net.digitalingot.feather.config.ConfigManager;
import net.digitalingot.feather.gui.BrowserUtils;
import net.digitalingot.feather.gui.GuiBrowser;
import net.digitalingot.feather.gui.HUD;
import net.digitalingot.feather.mods.Mod;
import net.digitalingot.feather.mods.ModConfigAnnotation;
import net.digitalingot.feather.util.PlayerUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.util.ChatComponentTranslation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class UpdateKey implements GuiBrowser<RecordKeyEvent, ce, BrowserNotification> {
   public void a(RecordKeyEvent var1, Consumer<ce> var2, Consumer<BrowserNotification> var3) {
      BrowserUtils.INSTANCE.getScreen().a(var3x -> {
         int[] var4 = Arrays.stream(var3x).mapToObj(ix::a).mapToInt(iv::c).toArray();
         if (Arrays.stream(var4).anyMatch(var0 -> var0 == 27)) {
            var2.accept(new ce(new int[0], "None"));
         } else {
            is var5 = new is(var3x);
            String var6 = this.a(var5.c());
            if (var6 != null) {
               var3.accept(new BrowserNotification(var6));
            } else {
               var2.accept(new ce(var4, var5.a()));
            }

         }
      });
   }

   @Nullable
   public String a(int[] var1) {
      String var2 = this.b(var1);
      return var2 != null ? var2 : this.c(var1);
   }

   @Nullable
   private String b(int[] var1) {
      for(KeyBinding var5 : Minecraft.func_71410_x().field_71474_y.field_74324_K) {
         int var6 = PlayerUtil.a(var5);
         if (var6 < 0) {
            var6 += 100101;
         }

         int var7 = var6;
         if (Arrays.stream(var1).allMatch(var1x -> var1x == var7)) {
            return new ChatComponentTranslation(var5.func_151464_g(), new Object[0]).func_150260_c();
         }
      }

      return null;
   }

   @Nullable
   private String c(int[] var1) {
      Map var2 = this.a();

      for(Entry var4 : var2.entrySet()) {
         is var5 = (is)var4.getKey();
         String var6 = (String)var4.getValue();
         if (Arrays.equals(var5.c(), var1)) {
            return var6;
         }
      }

      return null;
   }

   @NotNull
   private Map<is, String> a() {
      HashMap var1 = new HashMap();
      ConfigManager var2 = e.c().b();

      for(Mod var4 : var2.f().values()) {
         if (var4.m()) {
            HUD var5 = var4.k();

            for(Field var9 : var5.getClass().getDeclaredFields()) {
               if (var9.getType() == is.class) {
                  ModConfigAnnotation var11 = (ModConfigAnnotation)var9.getDeclaredAnnotation(ModConfigAnnotation.class);

                  is var10;
                  try {
                     var10 = (is)var9.get(var5);
                  } catch (IllegalAccessException var13) {
                     throw new IllegalStateException(var13);
                  }

                  var1.put(var10, var4.l().b().a() + ": " + var11.b());
               }
            }
         }
      }

      return var1;
   }

   public interface a {
      void respond(int[] var1);
   }
}
