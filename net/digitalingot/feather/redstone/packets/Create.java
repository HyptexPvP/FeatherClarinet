package net.digitalingot.feather.redstone.packets;

import java.util.concurrent.TimeUnit;
import net.digitalingot.feather.fb;
import net.digitalingot.feather.redstone.Redstone;
import net.digitalingot.feather.redstone.RedstoneManager;
import net.digitalingot.feather.util.Account;
import net.digitalingot.feather.util.PlayerUtil;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.ChatComponentTranslation;
import org.jetbrains.annotations.NotNull;

public class Create extends Redstone {
   private long d = -1L;

   public Create(@NotNull Account var1, @NotNull RedstoneManager var2, @NotNull fb var3) {
      super(var1, var3, var2, Redstone.a.NOT_IN_PARTY);
   }

   @Override
   public void a(EntityPlayerSP var1, String[] var2) {
      if (System.currentTimeMillis() - this.d >= TimeUnit.SECONDS.toMillis(3L)) {
         this.d = System.currentTimeMillis();
         this.b.c().c();
         ChatComponentTranslation var3 = new ChatComponentTranslation("feather.commands.featherparty.create.success", new Object[0]);
         PlayerUtil.a(var1, var3);
      }
   }
}
