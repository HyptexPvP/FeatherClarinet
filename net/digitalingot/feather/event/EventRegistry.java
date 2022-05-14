package net.digitalingot.feather.event;

import net.digitalingot.feather.ao;
import net.digitalingot.feather.at;
import net.digitalingot.feather.av;
import net.digitalingot.feather.ax;
import net.digitalingot.feather.ay;
import net.digitalingot.feather.az;

public class EventRegistry {
   public static final EventForge[] events = new EventForge[]{
      new AttackEvent(),
      new ChatReceiveEventn(),
      new DrawHighlight(),
      new EntityEvent(),
      new ao(),
      new FOVUpdate(),
      new GuiOpenEvent(),
      new GuiChangeEvent(),
      new MouseEvent(),
      new at(),
      new av(),
      new RenderEvent(),
      new ax(),
      new ay(),
      new ForgeEvents(),
      new az()
   };
}
