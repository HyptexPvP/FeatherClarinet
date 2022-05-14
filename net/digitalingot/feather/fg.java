package net.digitalingot.feather;

import net.digitalingot.feather.redstone.Redstone;
import net.digitalingot.feather.redstone.RedstoneManager;
import net.digitalingot.feather.util.Account;
import net.digitalingot.feather.util.PlayerUtil;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.ChatComponentTranslation;
import org.jetbrains.annotations.NotNull;

public class fg extends Redstone {
   protected fg(@NotNull Account var1, @NotNull RedstoneManager var2, @NotNull fb var3) {
      super(var1, var2, var3);
   }

   @Override
   public void a(EntityPlayerSP var1, String[] var2) {
      hg var3 = this.c.a(var2.length == 0 ? null : var2[0]);
      if (var3 == null) {
         PlayerUtil.a(var1, new ChatComponentTranslation("feather.commands.featherparty.inviteNotFound", new Object[0]));
      } else {
         this.b.c().a(var3.a(), false);
         ChatComponentTranslation var4 = new ChatComponentTranslation("feather.commands.featherparty.deny.success", new Object[0]);
         PlayerUtil.a(var1, var4);
      }
   }
}
