package net.digitalingot.feather;

import java.net.InetSocketAddress;
import net.digitalingot.feather.event.PlayerEvent;
import net.digitalingot.feather.redstone.RedstoneManager;
import net.minecraft.network.NetworkManager;
import org.jetbrains.annotations.NotNull;

public class fp {
   @NotNull
   private final RedstoneManager a;
   private boolean b;

   public fp(@NotNull RedstoneManager var1) {
      this.a = var1;
   }

   public void a() {
      PlayerEvent.a.a((var1, var2) -> {
         ht var3 = this.a.c();
         if (var3 != null) {
            NetworkManager var4 = var2.func_147298_b();
            this.b = var4.func_150731_c() || !(var4.func_74430_c() instanceof InetSocketAddress);
            if (!this.b) {
               InetSocketAddress var5 = (InetSocketAddress)var4.func_74430_c();
               String var6 = var5.getHostName();
               var6 = var6.endsWith(".") ? var6.substring(0, var6.length() - 1) : var6;
               short var7 = (short)var5.getPort();
               var3.a(var6, var7);
            }
         }
      });
      PlayerEvent.b.a((var1, var2) -> {
         ht var3 = this.a.c();
         if (var3 != null) {
            if (!this.b) {
               var3.a();
            }
         }
      });
   }
}
