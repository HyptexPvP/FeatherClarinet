package net.digitalingot.feather.redstone.packet;

import net.digitalingot.feather.fb;
import net.digitalingot.feather.hg;
import net.digitalingot.feather.redstone.Redstone;
import net.digitalingot.feather.redstone.RedstoneManager;
import net.digitalingot.feather.util.Account;
import net.digitalingot.feather.util.PlayerUtil;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.ChatComponentTranslation;
import org.jetbrains.annotations.NotNull;

public class Accept extends Redstone {
   public Accept(@NotNull Account var1, @NotNull RedstoneManager var2, @NotNull fb var3) {
      super(var1, var3, var2, Redstone.a.NOT_IN_PARTY);
   }

   @Override
   public void a(EntityPlayerSP var1, String[] var2) {
      hg var3 = this.c.a(var2.length == 0 ? null : var2[0]);
      if (var3 == null) {
         PlayerUtil.a(var1, new ChatComponentTranslation("feather.commands.featherparty.error.inviteNotFound", new Object[0]));
      } else {
         this.b.c().a(var3.a(), true);
         ChatComponentTranslation var4 = new ChatComponentTranslation("feather.commands.featherparty.accept.success", new Object[0]);
         PlayerUtil.a(var1, var4);
      }
   }
}
