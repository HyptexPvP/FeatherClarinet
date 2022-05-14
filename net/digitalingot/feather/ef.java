package net.digitalingot.feather;

public enum ef {
   @dw(
      a = "black",
      b = "Black"
   )
   BLACK('0'),
   @dw(
      a = "darkBlue",
      b = "Dark Blue"
   )
   DARK_BLUE('1'),
   @dw(
      a = "darkGreen",
      b = "Dark Green"
   )
   DARK_GREEN('2'),
   @dw(
      a = "darkAqua",
      b = "Dark Aqua"
   )
   DARK_AQUA('3'),
   @dw(
      a = "darkRed",
      b = "Dark Red"
   )
   DARK_RED('4'),
   @dw(
      a = "darkPurple",
      b = "Dark Purple"
   )
   DARK_PURPLE('5'),
   @dw(
      a = "gold",
      b = "Gold"
   )
   GOLD('6'),
   @dw(
      a = "gray",
      b = "Gray"
   )
   GRAY('7'),
   @dw(
      a = "darkGray",
      b = "Dark Gray"
   )
   DARK_GRAY('8'),
   @dw(
      a = "blue",
      b = "Blue"
   )
   BLUE('9'),
   @dw(
      a = "green",
      b = "Green"
   )
   GREEN('a'),
   @dw(
      a = "aqua",
      b = "Aqua"
   )
   AQUA('b'),
   @dw(
      a = "red",
      b = "Red"
   )
   RED('c'),
   @dw(
      a = "lightPurple",
      b = "Light Purple"
   )
   LIGHT_PURPLE('d'),
   @dw(
      a = "yellow",
      b = "Yellow"
   )
   YELLOW('e'),
   @dw(
      a = "white",
      b = "White"
   )
   WHITE('f');

   public static final String PREFIX_CHAR = "§";
   public final char code;
   public final String toString;

   private ef(char var3) {
      this.code = var3;
      this.toString = "§" + var3;
   }
}
