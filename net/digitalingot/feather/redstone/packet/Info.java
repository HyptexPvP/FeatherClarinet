package net.digitalingot.feather.redstone.packet;

import java.util.Map;
import java.util.UUID;
import net.digitalingot.feather.fb;
import net.digitalingot.feather.hG;
import net.digitalingot.feather.hd;
import net.digitalingot.feather.redstone.Redstone;
import net.digitalingot.feather.redstone.RedstoneManager;
import net.digitalingot.feather.util.Account;
import net.digitalingot.feather.util.PlayerUtil;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.ChatComponentTranslation;
import org.jetbrains.annotations.NotNull;

public class Info extends Redstone {
   public Info(@NotNull Account var1, @NotNull RedstoneManager var2, @NotNull fb var3) {
      super(var1, var3, var2, Redstone.a.IN_PARTY);
   }

   @Override
   public void a(EntityPlayerSP var1, String[] var2) {
      hd var3 = this.c.a().c();
      String var4 = this.getParty.a(var3.a());
      Map var5 = this.getParty.a((UUID[])var3.b().toArray(new UUID[0]));
      ChatComponentTranslation var6 = new ChatComponentTranslation("feather.commands.featherparty.info.heading", new Object[0]);
      ChatComponentTranslation var7 = new ChatComponentTranslation(
         var3.c() == hG.b.EVERYONE ? "feather.commands.featherparty.info.modeEveryone" : "feather.commands.featherparty.info.modeProximity", new Object[0]
      );
      ChatComponentTranslation var8 = new ChatComponentTranslation("feather.commands.featherparty.info.owner", new Object[]{var4});
      PlayerUtil.a(var1, var6);
      PlayerUtil.a(var1, var7);
      PlayerUtil.a(var1, var8);

      for(String var10 : var5.values()) {
         ChatComponentTranslation var11 = new ChatComponentTranslation("feather.commands.featherparty.info.member", new Object[]{var10});
         PlayerUtil.a(var1, var11);
      }

   }
}
