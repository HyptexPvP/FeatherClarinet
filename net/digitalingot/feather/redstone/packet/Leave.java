package net.digitalingot.feather.redstone.packet;

import net.digitalingot.feather.fb;
import net.digitalingot.feather.redstone.Redstone;
import net.digitalingot.feather.redstone.RedstoneManager;
import net.digitalingot.feather.util.Account;
import net.digitalingot.feather.util.PlayerUtil;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.ChatComponentTranslation;
import org.jetbrains.annotations.NotNull;

public class Leave extends Redstone {
   public Leave(@NotNull Account var1, @NotNull RedstoneManager var2, @NotNull fb var3) {
      super(var1, var3, var2, Redstone.a.IN_PARTY);
   }

   @Override
   public void a(EntityPlayerSP var1, String[] var2) {
      this.c.a().a(null);
      this.b.c().d();
      ChatComponentTranslation var3 = new ChatComponentTranslation("feather.commands.featherparty.leave.success", new Object[0]);
      PlayerUtil.a(var1, var3);
      this.c.a(System.currentTimeMillis());
   }
}
