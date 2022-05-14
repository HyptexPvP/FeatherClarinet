package net.digitalingot.feather.redstone.packet;

import java.util.UUID;
import net.digitalingot.feather.fb;
import net.digitalingot.feather.redstone.Redstone;
import net.digitalingot.feather.redstone.RedstoneManager;
import net.digitalingot.feather.util.Account;
import net.digitalingot.feather.util.PlayerUtil;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.ChatComponentTranslation;
import org.jetbrains.annotations.NotNull;

public class Invite extends Redstone {
   public Invite(@NotNull Account var1, @NotNull RedstoneManager var2, @NotNull fb var3) {
      super(var1, var3, var2, Redstone.a.LEADER);
   }

   @Override
   public void a(EntityPlayerSP var1, String[] var2) {
      if (var2.length == 0) {
         PlayerUtil.a(var1, new ChatComponentTranslation("feather.commands.featherparty.invite.usage", new Object[0]));
      } else {
         String var3 = var2[0];
         UUID var4 = this.getParty.addAccount(var3);
         if (var4 == null) {
            PlayerUtil.a(var1, new ChatComponentTranslation("feather.commands.targetNotFound", new Object[0]));
         } else {
            this.b.c().b(var4);
            ChatComponentTranslation var5 = new ChatComponentTranslation("feather.commands.featherparty.invite.success", new Object[]{var3});
            PlayerUtil.a(var1, var5);
         }
      }
   }
}
