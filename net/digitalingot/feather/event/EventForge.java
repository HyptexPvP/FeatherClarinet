package net.digitalingot.feather.event;

import net.minecraftforge.common.MinecraftForge;

public interface EventForge {
   default void on() {
      MinecraftForge.EVENT_BUS.register(this);
   }
}
