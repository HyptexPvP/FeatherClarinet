package net.digitalingot.feather.util;

import java.awt.Color;
import org.jetbrains.annotations.NotNull;

public class ChromaColor {
   private boolean a;
   @NotNull
   private Color b;

   public ChromaColor(boolean var1, @NotNull Color var2) {
      this.a = var1;
      this.b = var2;
   }

   public int a() {
      return this.b.getRGB();
   }

   public void a(boolean var1) {
      this.a = var1;
   }

   public void a(@NotNull Color var1) {
      this.b = var1;
   }

   public boolean b() {
      return this.a;
   }

   @NotNull
   public Color c() {
      return this.b;
   }
}
