package net.digitalingot.feather.mods;

import net.digitalingot.feather.dn;
import net.digitalingot.feather.components.IntegerRange;
import net.digitalingot.feather.event.AttackEvent;
import net.digitalingot.feather.gui.HUD;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;

@FeatherModule(
   a = ModsConfig.PARTICLES,
   b = @dn(
   a = "Particles",
   b = "https://assets.feathercdn.net/game/mods/particles.svg",
   c = "Customize particle settings",
   d = {ModsConponment.Category.PVP}
)
)
public class ParticalMod extends Mod<ParticalMod.a> {
   private static final Potion a = Potion.func_180142_b("blindness");

   @Override
   public void f() {
      AttackEvent.a
         .a(
            (var1, var2) -> {
               if (this.m()) {
                  if (var2 instanceof EntityLivingBase) {
                     boolean var3 = var1.field_70143_R > 0.0F
                        && !var1.field_70122_E
                        && !var1.func_70617_f_()
                        && !var1.func_70090_H()
                        && !var1.func_70644_a(a)
                        && var1.field_70154_o == null;
                     float var4 = EnchantmentHelper.func_152377_a(var1.func_70694_bm(), ((EntityLivingBase)var2).func_70668_bt());
                     if (this.b.a && !(var4 > 0.0F)) {
                        var1.func_71047_c(var2);
                     }
      
                     if (var3 || var4 > 0.0F || this.b.a) {
                        for(int var5 = 1; var5 < this.b.b; ++var5) {
                           if (var3) {
                              var1.func_71009_b(var2);
                           }
      
                           if (var4 > 0.0F || this.b.a) {
                              var1.func_71047_c(var2);
                           }
                        }
                     }
      
                  }
               }
            }
         );
   }

   public static class a extends HUD {
      @ModConfigAnnotation(
         a = "alwaysSharpParticles",
         b = "Always Sharp Particles",
         e = @ModConfigValueAnnotation(
   a = 0
)
      )
      public boolean a;
      @ModConfigAnnotation(
         a = "multiplier",
         b = "Multiplier",
         c = "1",
         e = @ModConfigValueAnnotation(
   a = 1
)
      )
      @IntegerRange(
         b = 1,
         a = 25
      )
      public int b;
   }
}
