package net.digitalingot.feather.redstone.packet;

import net.digitalingot.feather.fb;
import net.digitalingot.feather.hG;
import net.digitalingot.feather.redstone.Redstone;
import net.digitalingot.feather.redstone.RedstoneManager;
import net.digitalingot.feather.util.Account;
import net.digitalingot.feather.util.PlayerUtil;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.ChatComponentTranslation;
import org.jetbrains.annotations.NotNull;

public class Mode extends Redstone {
   public Mode(@NotNull Account var1, @NotNull RedstoneManager var2, @NotNull fb var3) {
      super(var1, var3, var2, Redstone.a.LEADER);
   }

   @Override
   public void a(EntityPlayerSP var1, String[] var2) {
      if (var2.length == 0) {
         PlayerUtil.a(var1, new ChatComponentTranslation("feather.commands.featherparty.mode.usage", new Object[0]));
      } else {
         String var3 = var2[0].toLowerCase();
         hG.b var4;
         String var5;
         switch(var3) {
            case "normal":
            case "n":
               var4 = hG.b.EVERYONE;
               var5 = "feather.commands.featherparty.mode.successNormal";
               break;
            case "proximity":
            case "p":
               var4 = hG.b.PROXIMITY;
               var5 = "feather.commands.featherparty.mode.successProximity";
               break;
            default:
               PlayerUtil.a(var1, new ChatComponentTranslation("feather.commands.featherparty.mode.usage", new Object[0]));
               return;
         }

         this.b.c().a(var4);
         ChatComponentTranslation var6 = new ChatComponentTranslation(var5, new Object[0]);
         PlayerUtil.a(var1, var6);
      }
   }
}
