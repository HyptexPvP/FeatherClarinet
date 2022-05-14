package net.digitalingot.feather;

import net.digitalingot.feather.event.ChatEvent;
import net.digitalingot.feather.util.PlayerUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.ChatComponentTranslation;
import org.jetbrains.annotations.NotNull;

public class fo implements ChatEvent {
   public void a(@NotNull String var1) {
      ChatComponentTranslation var2 = new ChatComponentTranslation(var1, new Object[0]);
      EntityPlayerSP var3 = Minecraft.func_71410_x().field_71439_g;
      if (var3 != null) {
         PlayerUtil.a(var3, var2);
      }

   }
}
