package net.digitalingot.feather.mods;

import java.awt.Color;
import net.digitalingot.feather.dB;
import net.digitalingot.feather.dn;
import net.digitalingot.feather.eh;
import net.digitalingot.feather.hH;
import net.digitalingot.feather.event.RenderEvent;
import net.digitalingot.feather.gui.HUD;
import net.digitalingot.feather.util.ChromaColor;
import net.digitalingot.feather.util.RenderUtil;
import net.minecraft.entity.Entity;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;

@FeatherModule(
   a = ModsConfig.HITBOX,
   b = @dn(
   a = "Hitbox",
   b = "https://assets.feathercdn.net/game/mods/hitbox.svg",
   c = "Adds hitboxes around entities",
   d = {}
)
)
public class HitboxMod extends Mod<HitboxMod.a> {
   @Override
   public void f() {
      RenderEvent.a
         .a(
            (var1, var2, var4, var6) -> {
               if (this.m()) {
                  if (!var1.func_82150_aj()) {
                     Color var8 = this.a(var1);
                     if (var8 != null) {
                        RenderUtil.a(false);
                        RenderUtil.m();
                        RenderUtil.d();
                        RenderUtil.k();
                        RenderUtil.j();
                        AxisAlignedBB var9 = var1.func_174813_aQ();
                        AxisAlignedBB var10 = new AxisAlignedBB(
                           var9.field_72340_a - var1.field_70169_q + var2,
                           var9.field_72338_b - var1.field_70167_r + var4,
                           var9.field_72339_c - var1.field_70166_s + var6,
                           var9.field_72336_d - var1.field_70169_q + var2,
                           var9.field_72337_e - var1.field_70167_r + var4,
                           var9.field_72334_f - var1.field_70166_s + var6
                        );
                        hH.a()
                           .a(
                              var10,
                              (float)var8.getRed() / 255.0F,
                              (float)var8.getGreen() / 255.0F,
                              (float)var8.getBlue() / 255.0F,
                              (float)var8.getAlpha() / 255.0F
                           );
                        RenderUtil.n();
                        RenderUtil.c();
                        RenderUtil.l();
                        RenderUtil.j();
                        RenderUtil.a(true);
                     }
                  }
               }
            }
         );
   }

   private Color a(Entity var1) {
      Color var2 = null;
      boolean var3 = var1 instanceof IProjectile;
      if (var3) {
         var2 = this.b.p ? this.b.q : null;
      } else if (var1 instanceof EntityItem) {
         var2 = this.b.s ? this.b.t : null;
      } else if (var1 instanceof EntityAnimal) {
         var2 = this.b.m ? this.b.n : null;
      } else if (var1 instanceof EntityMob) {
         var2 = this.b.j ? this.b.k : null;
      } else if (var1 instanceof EntityPlayer) {
         var2 = this.b.d ? this.b.e : null;
      }

      if (var2 == null) {
         return null;
      } else {
         ChromaColor var4 = this.b.b;
         if (var4.b()) {
            var2 = new Color(hH.a().c());
         } else {
            var2 = var4.c();
         }

         return var2;
      }
   }

   public static class a extends HUD {
      @ModConfigValueAnnotation(
         a = 0
      )
      public eh a = new eh("General");
      @ModConfigAnnotation(
         a = "mainColor",
         b = "Main Color",
         c = "",
         e = @ModConfigValueAnnotation(
   a = 1
)
      )
      public ChromaColor b;
      @ModConfigValueAnnotation(
         a = 10
      )
      public eh c = new eh("Player Hitboxes");
      @ModConfigAnnotation(
         a = "playerHitboxes",
         b = "Player Hitboxes",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 11
)
      )
      public boolean d;
      @ModConfigAnnotation(
         a = "playerHitboxColor",
         b = "Color",
         d = @dB(
   a = "playerHitboxes"
),
         e = @ModConfigValueAnnotation(
   a = 12
)
      )
      public Color e;
      @ModConfigValueAnnotation(
         a = 20
      )
      public eh i = new eh("Monster Hitboxes");
      @ModConfigAnnotation(
         a = "monsterHitboxes",
         b = "Monster Hitboxes",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 21
)
      )
      public boolean j;
      @ModConfigAnnotation(
         a = "monsterHitboxColor",
         b = "Color",
         d = @dB(
   a = "monsterHitboxes"
),
         e = @ModConfigValueAnnotation(
   a = 22
)
      )
      public Color k;
      @ModConfigValueAnnotation(
         a = 30
      )
      public eh l = new eh("Animal Hitboxes");
      @ModConfigAnnotation(
         a = "animalHitboxes",
         b = "Animal Hitboxes",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 31
)
      )
      public boolean m;
      @ModConfigAnnotation(
         a = "animalHitboxColor",
         b = "Color",
         d = @dB(
   a = "animalHitboxes"
),
         e = @ModConfigValueAnnotation(
   a = 32
)
      )
      public Color n;
      @ModConfigValueAnnotation(
         a = 40
      )
      public eh o = new eh("Projectile Hitboxes");
      @ModConfigAnnotation(
         a = "projectileHitboxes",
         b = "Projectile Hitboxes",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 41
)
      )
      public boolean p;
      @ModConfigAnnotation(
         a = "projectileHitboxColor",
         b = "Color",
         d = @dB(
   a = "projectileHitboxes"
),
         e = @ModConfigValueAnnotation(
   a = 42
)
      )
      public Color q;
      @ModConfigValueAnnotation(
         a = 50
      )
      public eh r = new eh("Item Drop Hitboxes");
      @ModConfigAnnotation(
         a = "itemDropHitboxes",
         b = "Item Drop Hitboxes",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 51
)
      )
      public boolean s;
      @ModConfigAnnotation(
         a = "itemDropHitboxColor",
         b = "Color",
         d = @dB(
   a = "itemDropHitboxes"
),
         e = @ModConfigValueAnnotation(
   a = 52
)
      )
      public Color t;
   }
}
