package net.digitalingot.feather;

import java.util.UUID;
import net.digitalingot.feather.util.Account;
import net.digitalingot.feather.util.PlayerUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.ChatComponentTranslation;
import org.jetbrains.annotations.NotNull;

public class fc implements hh {
   @NotNull
   private final Account a;
   @NotNull
   private final fb b;

   public fc(@NotNull Account var1, @NotNull fb var2) {
      this.a = var1;
      this.b = var2;
   }

   @Override
   public void a(hd var1) {
   }

   @Override
   public void a(hg var1) {
      String var2 = this.a.a(var1.b());
      ChatComponentTranslation var3 = new ChatComponentTranslation("feather.commands.featherparty.receivedInvite", new Object[]{var2});
      EntityPlayerSP var4 = Minecraft.func_71410_x().field_71439_g;
      if (var4 != null) {
         PlayerUtil.a(var4, var3);
      }

   }

   @Override
   public void a(UUID var1) {
      String var2 = this.a.a(var1);
      ChatComponentTranslation var3 = new ChatComponentTranslation("feather.commands.featherparty.inviteDenied", new Object[]{var2});
      EntityPlayerSP var4 = Minecraft.func_71410_x().field_71439_g;
      if (var4 != null) {
         PlayerUtil.a(var4, var3);
      }

   }

   @Override
   public void a() {
      if (this.b.c()) {
         ChatComponentTranslation var1 = new ChatComponentTranslation("feather.commands.featherparty.kicked", new Object[0]);
         EntityPlayerSP var2 = Minecraft.func_71410_x().field_71439_g;
         if (var2 != null) {
            PlayerUtil.a(var2, var1);
         }

      }
   }
}
