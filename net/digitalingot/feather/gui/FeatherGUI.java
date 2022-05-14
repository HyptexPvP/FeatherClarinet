package net.digitalingot.feather.gui;

import net.digitalingot.feather.ac;
import net.digitalingot.feather.ad;

public class FeatherGUI {
   public static ac<FeatherGUI.b> a = ad.a(FeatherGUI.b.class, var0 -> (var1, var2, var3) -> {
         for(FeatherGUI.b var7 : var0) {
            var7.mouseInput(var1, var2, var3);
         }

      });
   public static ac<FeatherGUI.a> b = ad.a(FeatherGUI.a.class, var0 -> (var1, var2, var3, var4) -> {
         for(FeatherGUI.a var8 : var0) {
            var8.keyInput(var1, var2, var3, var4);
         }

      });

   public interface a {
      void keyInput(int var1, int var2, int var3, int var4);
   }

   public interface b {
      void mouseInput(int var1, int var2, int var3);
   }
}
