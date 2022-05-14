package net.digitalingot.feather.event;

public class EventManager {
   public static void init() {
      for(EventForge var3 : EventRegistry.events) {
         var3.on();
      }

   }
}
