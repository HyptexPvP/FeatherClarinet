package net.digitalingot.feather;

import java.util.Collection;
import java.util.HashSet;
import net.digitalingot.feather.command.CommandHandler;
import net.digitalingot.feather.event.Events;
import net.digitalingot.feather.event.PlayerEvent;
import net.digitalingot.feather.gui.CosmeticUI;
import net.digitalingot.feather.party.Party;
import net.digitalingot.feather.peertopeer.AcceptP2P;
import net.digitalingot.feather.peertopeer.P2PManager;
import net.digitalingot.feather.redstone.RedstoneManager;
import net.digitalingot.feather.util.Account;
import net.digitalingot.feather.util.CoreAPI;
import net.minecraft.client.Minecraft;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.client.network.NetworkPlayerInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class fq {
   @NotNull
   private final RedstoneManager a;
   @NotNull
   private final CosmeticUI b;
   @NotNull
   private final fb c;
   private int d;

   private fq(@NotNull RedstoneManager var1, @NotNull CosmeticUI var2, @NotNull fb var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   @Nullable
   public static fq a(@NotNull Account var0) {
      fo var1 = new fo();
      CosmeticUI var2 = new CosmeticUI();
      fb var3 = new fb(var0);
      P2PManager var4 = P2PManager.a();
      AcceptP2P var5 = new AcceptP2P(var4);
      CoreAPI var6 = var0.getCoreAPI();
      String var7 = var6.c();
      if (var7 == null) {
         return null;
      } else {
         RedstoneManager var8 = RedstoneManager.a(var1, var2.b().a(), var3.a().a(), var5, var6);
         var4.a(var8);
         fq var9 = new fq(var8, var2, var3);
         var2.a(var9);
         new fp(var8).a();
         Party var10 = new Party(var3.b(), var8, var3);
         CommandHandler.a.a(var10::a);
         PlayerEvent.b.a((var1x, var2x) -> var8.b().clear());
         Events.a.a(var2x -> {
            if (var2x == Events.c.START) {
               if (++var9.d == 20) {
                  var9.d = 0;
                  NetHandlerPlayClient var3x = Minecraft.func_71410_x().func_147114_u();
                  if (var3x != null) {
                     Collection var4x = var3x.func_175106_d();
                     HashSet var5x = new HashSet(var4x.size());

                     for(NetworkPlayerInfo var7x : var4x) {
                        var5x.add(var7x.func_178845_a().getId());
                     }

                     ht var8x = var8.c();
                     if (var8x != null) {
                        var8x.a(var5x);
                     }

                  }
               }
            }
         });
         return var9;
      }
   }

   @NotNull
   public RedstoneManager a() {
      return this.a;
   }

   @NotNull
   public CosmeticUI b() {
      return this.b;
   }

   @NotNull
   public fb c() {
      return this.c;
   }
}
