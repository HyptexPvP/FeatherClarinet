package net.digitalingot.feather.event;

import net.digitalingot.feather.gui.FeatherGUI;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.MouseInputEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

@SideOnly(Side.CLIENT)
public class MouseEvent implements EventForge {
   @SubscribeEvent
   public void a(MouseInputEvent var1) {
      int var2 = Mouse.getEventButton();
      int var3 = Mouse.getEventButtonState() ? 1 : 0;
      byte var4 = 0;
      FeatherGUI.a.a().mouseInput(var2, var3, var4);
   }

   @SubscribeEvent
   public void a(KeyInputEvent var1) {
      int var2 = Keyboard.getEventKey();
      byte var3 = 0;
      int var4 = Keyboard.getEventKeyState() ? 1 : 0;
      byte var5 = 0;
      FeatherGUI.b.a().keyInput(var2, var3, var4, var5);
   }
}
