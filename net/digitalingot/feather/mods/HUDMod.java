package net.digitalingot.feather.mods;

import net.digitalingot.feather.gui.HUDPosition;
import net.digitalingot.feather.util.MatrixUtils;
import org.jetbrains.annotations.NotNull;

public abstract class HUDMod<C extends HUDPosition> extends Mod<C> {
   @NotNull
   protected final ModPosition a = new ModPosition(this);

   public int a() {
      return 0;
   }

   public int b() {
      return 0;
   }

   public double c() {
      return (double)this.a() * this.k().h();
   }

   public double d() {
      return (double)this.b() * this.k().h();
   }

   public void a(HUDMod.a var1, MatrixUtils var2) {
   }

   @NotNull
   public final ModPosition e() {
      return this.a;
   }

   public static enum a {
      HUD_OVERLAY,
      MOD_LAYOUT;
   }
}
