package net.digitalingot.feather;

import java.awt.Color;
import net.digitalingot.feather.util.BooleanUtil;
import net.digitalingot.feather.util.ChromaColor;
import net.digitalingot.feather.util.ColorUtil;
import net.digitalingot.feather.util.FeatherError;
import org.jetbrains.annotations.NotNull;

public class dQ implements dL<ChromaColor> {
   @NotNull
   private final BooleanUtil a = new BooleanUtil();
   @NotNull
   private final ColorUtil b = new ColorUtil();

   @NotNull
   public ChromaColor b(@NotNull String var1, @NotNull Class<? extends ChromaColor> var2) {
      String[] var3 = var1.split("/", 2);
      if (var3.length != 2) {
         throw new FeatherError("ChromaColor input does not contain a minimum of two /");
      } else {
         String var4 = var3[0];
         String var5 = var3[1];
         boolean var6 = this.a.b(var4, Boolean.class);
         Color var7 = this.b.b(var5, Color.class);
         return new ChromaColor(var6, var7);
      }
   }

   @NotNull
   public String a(@NotNull ChromaColor var1) {
      return var1.b() + "/" + this.b.a(var1.c());
   }
}
