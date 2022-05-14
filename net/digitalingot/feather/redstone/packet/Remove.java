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

public class Remove extends Redstone {
   public Remove(@NotNull Account var1, @NotNull RedstoneManager var2, @NotNull fb var3) {
      super(var1, var3, var2, Redstone.a.LEADER);
   }

   @Override
   public void a(EntityPlayerSP var1, String[] var2) {
      if (var2.length == 0) {
         PlayerUtil.a(var1, new ChatComponentTranslation("feather.commands.featherparty.remove.usage", new Object[0]));
      } else {
         String var3 = var2[0];
         UUID var4 = this.a.addAccount(var3);
         hd var5 = this.c.a().c();
         if (var5.b().contains(var4)) {
            PlayerUtil.a(var1, new ChatComponentTranslation("feather.commands.targetNotFound", new Object[0]));
         } else {
            this.b.c().c(var4);
            ChatComponentTranslation var6 = new ChatComponentTranslation("feather.commands.featherparty.remove.success", new Object[]{var3});
            PlayerUtil.a(var1, var6);
         }
      }
   }
}
