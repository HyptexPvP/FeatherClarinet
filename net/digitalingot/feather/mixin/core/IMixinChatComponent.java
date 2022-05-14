package net.digitalingot.feather.mixin.core;

import java.util.List;
import net.minecraft.client.gui.ChatLine;
import net.minecraft.client.gui.GuiNewChat;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({GuiNewChat.class})
public interface IMixinChatComponent {
   @Accessor("chatLines")
   List<ChatLine> getAllMessages();

   @Accessor("drawnChatLines")
   List<ChatLine> getTrimmedMessages();
}
