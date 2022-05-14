package net.digitalingot.feather;

import org.jetbrains.annotations.Nullable;

public enum ih {
   BLACK("BLACK", '0', 0, 0),
   DARK_BLUE("DARK_BLUE", '1', 1, 170),
   DARK_GREEN("DARK_GREEN", '2', 2, 43520),
   DARK_AQUA("DARK_AQUA", '3', 3, 43690),
   DARK_RED("DARK_RED", '4', 4, 11141120),
   DARK_PURPLE("DARK_PURPLE", '5', 5, 11141290),
   GOLD("GOLD", '6', 6, 16755200),
   GRAY("GRAY", '7', 7, 11184810),
   DARK_GRAY("DARK_GRAY", '8', 8, 5592405),
   BLUE("BLUE", '9', 9, 5592575),
   GREEN("GREEN", 'a', 10, 5635925),
   AQUA("AQUA", 'b', 11, 5636095),
   RED("RED", 'c', 12, 16733525),
   LIGHT_PURPLE("LIGHT_PURPLE", 'd', 13, 16733695),
   YELLOW("YELLOW", 'e', 14, 16777045),
   WHITE("WHITE", 'f', 15, 16777215),
   OBFUSCATED("OBFUSCATED", 'k', true),
   BOLD("BOLD", 'l', true),
   STRIKETHROUGH("STRIKETHROUGH", 'm', true),
   UNDERLINE("UNDERLINE", 'n', true),
   ITALIC("ITALIC", 'o', true),
   RESET("RESET", 'r', -1, null);

   public static final String PREFIX_CHAR = "§";
   public final String name;
   public final char code;
   public final boolean isFormat;
   public final String toString;
   public final int id;
   @Nullable
   public final Integer color;

   private ih(String var3, char var4, int var5, @Nullable Integer var6) {
      this(var3, var4, false, var5, var6);
   }

   private ih(String var3, char var4, boolean var5) {
      this(var3, var4, var5, -1, null);
   }

   private ih(String var3, char var4, boolean var5, int var6, @Nullable Integer var7) {
      this.name = var3;
      this.code = var4;
      this.isFormat = var5;
      this.id = var6;
      this.color = var7;
      this.toString = "§" + var4;
   }

   public void apply(StringBuilder var1) {
      var1.append(this.toString);
   }

   public String toString() {
      return this.toString;
   }

   public static ih getByColor(int var0) {
      for(ih var4 : values()) {
         if (var4.color != null && var4.color == var0) {
            return var4;
         }
      }

      return null;
   }
}
