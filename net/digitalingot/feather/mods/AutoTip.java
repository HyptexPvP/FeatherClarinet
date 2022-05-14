package net.digitalingot.feather.mods;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import net.digitalingot.feather.e;
import net.digitalingot.feather.fW;
import net.digitalingot.feather.util.CurrentServer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.network.NetHandlerPlayClient;
import org.jetbrains.annotations.NotNull;

public class AutoTip extends fW<HypixelMod.a> {
   private Timer c = new Timer();

   AutoTip(@NotNull Mod<HypixelMod.a> var1) {
      super(var1);
   }

   @Override
   public boolean b() {
      return this.a.k().e;
   }

   @Override
   public void c() {
      if (this.g()) {
         this.f();
      }
   }

   @Override
   public void d() {
      super.d();
      this.f();
   }

   @Override
   public void e() {
      super.e();
      this.c.cancel();
   }

   public void f() {
      this.c.cancel();
      this.c = new Timer();
      this.c.scheduleAtFixedRate(new TimerTask() {
         public void run() {
            Minecraft var1 = Minecraft.func_71410_x();
            NetHandlerPlayClient var2 = var1.func_147114_u();
            if (var2 != null) {
               if (e.c().g() == CurrentServer.HYPIXEL) {
                  var1.func_152344_a(() -> var1.field_71439_g.func_71165_d("/tip all"));
               }
            }
         }
      }, TimeUnit.MINUTES.toMillis(1L), TimeUnit.SECONDS.toMillis((long)this.a.k().i));
   }
}
