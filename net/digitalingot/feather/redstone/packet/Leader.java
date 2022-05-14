package net.digitalingot.feather.redstone.packet;

import java.util.UUID;
import net.digitalingot.feather.fb;
import net.digitalingot.feather.hd;
import net.digitalingot.feather.redstone.Redstone;
import net.digitalingot.feather.redstone.RedstoneManager;
import net.digitalingot.feather.util.Account;
import net.digitalingot.feather.util.PlayerUtil;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.ChatComponentTranslation;
import org.jetbrains.annotations.NotNull;

public class Leader extends Redstone {
   public Leader(@NotNull Account var1, @NotNull RedstoneManager var2, @NotNull fb var3) {
      super(var1, var3, var2, Redstone.a.LEADER);
   }

   @Override
   public void a(EntityPlayerSP var1, String[] var2) {
      if (var2.length == 0) {
         PlayerUtil.a(var1, new ChatComponentTranslation("feather.commands.featherparty.leader.usage", new Object[0]));
      } else {
         UUID var3 = this.getParty.addAccount(var2[0]);
         if (var3 == null) {
            PlayerUtil.a(var1, new ChatComponentTranslation("feather.commands.targetNotFound", new Object[0]));
         } else {
            hd var4 = this.c.a().c();
            if (!var4.b().contains(var3)) {
               PlayerUtil.a(var1, new ChatComponentTranslation("feather.commands.featherparty.targetNotInParty", new Object[0]));
            } else {
               this.b.c().a(var3);
               ChatComponentTranslation var5 = new ChatComponentTranslation("feather.commands.featherparty.leader.success", new Object[]{var2[0]});
               PlayerUtil.a(var1, var5);
            }
         }
      }
   }
}
