package net.digitalingot.feather;

import java.util.Collections;
import java.util.List;
import java.util.UUID;
import net.digitalingot.feather.mods.VoiceMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class gw implements gv {
   @NotNull
   private final VoiceMod a;

   public gw(@NotNull VoiceMod var1) {
      this.a = var1;
   }

   @Override
   public float a() {
      return (float)this.a.k().k;
   }

   @Override
   public float b() {
      return (float)this.a.k().n;
   }

   @Override
   public float c() {
      return (float)this.a.k().o;
   }

   @NotNull
   @Override
   public gT.a d() {
      return this.a.k().b.toCapnProto();
   }

   @NotNull
   @Override
   public List<UUID> e() {
      return Collections.emptyList();
   }

   @Nullable
   @Override
   public gT.c[] f() {
      Minecraft var1 = Minecraft.func_71410_x();
      if (!var1.field_71415_G) {
         return null;
      } else {
         boolean var2 = this.a.k().d.b();
         boolean var3 = this.a.k().e.b();
         gT.c[] var4;
         if (var3 && var2) {
            var4 = new gT.c[]{gT.c.PROXIMITY, gT.c.PARTY};
         } else if (var2) {
            var4 = new gT.c[]{gT.c.PROXIMITY};
         } else if (var3) {
            var4 = new gT.c[]{gT.c.PARTY};
         } else {
            var4 = null;
         }

         return var4;
      }
   }

   @Nullable
   @Override
   public gv.a g() {
      Minecraft var1 = Minecraft.func_71410_x();
      EntityPlayerSP var2 = var1.field_71439_g;
      if (var2 == null) {
         return null;
      } else {
         iJ var3 = new iJ((float)var2.field_70169_q, (float)var2.field_70167_r, (float)var2.field_70166_s);
         boolean var4 = var1.field_71474_y.field_74320_O != 0;
         float var5 = var1.field_71439_g.field_71109_bG;
         float var6 = var1.field_71439_g.field_70726_aT;
         return new gv.a(var3, var4, var5, var6);
      }
   }

   @Nullable
   @Override
   public iJ a(UUID var1) {
      Minecraft var2 = Minecraft.func_71410_x();
      EntityPlayerSP var3 = var2.field_71439_g;
      if (var3 == null) {
         return null;
      } else {
         EntityPlayer var4 = var2.field_71441_e.func_152378_a(var1);
         return var4 == null ? null : new iJ((float)var4.field_70169_q, (float)var4.field_70167_r, (float)var4.field_70166_s);
      }
   }
}
