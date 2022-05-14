package net.digitalingot.feather.event;

import java.lang.reflect.Field;

final class KeyEvent {
   private static final Field a;

   private KeyEvent() {
      throw new AssertionError();
   }

   public static void a(java.awt.event.KeyEvent var0, int var1) {
      try {
         a.set(var0, var1);
      } catch (Throwable var3) {
      }

   }

   static {
      try {
         a = java.awt.event.KeyEvent.class.getDeclaredField("scancode");
         a.setAccessible(true);
      } catch (Throwable var1) {
         throw new IllegalStateException(var1);
      }
   }
}
