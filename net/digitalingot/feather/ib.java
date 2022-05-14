package net.digitalingot.feather;

import java.awt.Color;
import java.util.regex.Pattern;
import net.digitalingot.feather.util.ChromaColor;
import org.jetbrains.annotations.NotNull;

public class ib {
   public static final char a = '§';
   private static final Pattern b = Pattern.compile("(?i)§[0-9A-FK-OR]");

   private ib() {
   }

   public static ChromaColor a(@NotNull ChromaColor var0, @NotNull ChromaColor var1, float var2) {
      var2 = ij.a(var2);
      if (var0.b() && var1.b()) {
         return new ChromaColor(true, var0.c());
      } else {
         Color var3 = var0.b() ? new Color(hH.a().c(), true) : var0.c();
         Color var4 = var1.b() ? new Color(hH.a().c(), true) : var1.c();
         return new ChromaColor(false, a(var3, var4, var2));
      }
   }

   public static Color a(@NotNull Color var0, @NotNull Color var1, float var2) {
      var2 = ij.a(var2);
      return new Color(
         (int)((float)var0.getRed() + (float)(var1.getRed() - var0.getRed()) * var2),
         (int)((float)var0.getGreen() + (float)(var1.getGreen() - var0.getGreen()) * var2),
         (int)((float)var0.getBlue() + (float)(var1.getBlue() - var0.getBlue()) * var2),
         (int)((float)var0.getAlpha() + (float)(var1.getAlpha() - var0.getAlpha()) * var2)
      );
   }

   public static String a(String var0) {
      return var0 == null ? null : b.matcher(var0).replaceAll("");
   }
}
