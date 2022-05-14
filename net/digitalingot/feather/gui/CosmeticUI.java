package net.digitalingot.feather.gui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import net.digitalingot.feather.e;
import net.digitalingot.feather.fa;
import net.digitalingot.feather.fq;
import net.digitalingot.feather.ht;
import net.digitalingot.feather.w;
import net.digitalingot.feather.z;
import net.digitalingot.feather.browser.Browser;
import net.digitalingot.feather.browserEvent.CosmeticReset;
import net.digitalingot.feather.cosmetic.Cosmetic;
import net.digitalingot.feather.cosmetic.CosmeticAPI;
import net.digitalingot.feather.event.BrowserEvents;
import net.digitalingot.feather.event.Events;
import net.digitalingot.feather.event.PlayerEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CosmeticUI {
   private fq a;
   @NotNull
   private final CosmeticAPI b;
   @NotNull
   private final Map<UUID, List<Cosmetic>> c = new HashMap();
   private int d = 0;

   public CosmeticUI() {
      this.b = CosmeticAPI.a(new fa(this));
      Browser var1 = e.c().a();
      var1.a(BrowserEvents.RESET_COSMETICS_SETTINGS, new CosmeticReset(this.b));
      var1.a(BrowserEvents.UPDATE_COSMETICS, new z(this));
      w.a(this);
      PlayerEvent.b.a((var1x, var2) -> {
         UUID var3 = Minecraft.func_71410_x().func_110432_I().func_148256_e().getId();
         this.c.keySet().removeIf(var1xx -> !var1xx.equals(var3));
         ht var4 = this.a();
         if (var4 != null) {
            var4.b();
         }

      });
      Events.a.a(var1x -> {
         if (var1x == Events.c.START) {
            EntityPlayerSP var2 = Minecraft.func_71410_x().field_71439_g;
            if (var2 != null) {
               if (++this.d == 20) {
                  this.d = 0;
                  ht var3 = this.a();
                  if (var3 != null) {
                     World var4 = var2.field_70170_p;
                     if (var4 != null) {
                        List var5 = var4.func_175661_b(EntityPlayer.class, var1xx -> var1xx != var2);
                        ArrayList var6 = new ArrayList(var5.size());

                        for(EntityPlayer var8 : var5) {
                           if (var8 != var2) {
                              var6.add(var8.func_110124_au());
                           }
                        }

                        var3.a(var6, this.c.keySet());
                     }
                  }
               }
            }
         }
      });
   }

   public void a(@NotNull fq var1) {
      this.a = var1;
   }

   @Nullable
   public ht a() {
      return this.a.a().c();
   }

   @NotNull
   public CosmeticAPI b() {
      return this.b;
   }

   @NotNull
   public Map<UUID, List<Cosmetic>> c() {
      return this.c;
   }
}
