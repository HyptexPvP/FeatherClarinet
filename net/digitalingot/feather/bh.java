package net.digitalingot.feather;

class bh {
   public static final int a = 1056964608;
   public static final int b = 1057002222;
   public static final int c = -16739602;
   public static final int d = -13585665;
   public static final int e = 1065320319;
   public static final int f = -8421505;
   public static final int g = 0;
   public static final bh.b h = bh.b.LEGACY;

   private bh() {
      throw new AssertionError();
   }

   public static enum a {
      SELECTED(1057002222, -16739602, -13585665),
      UNSELECTED(1065320319, -8421505, 0);

      public final int background;
      public final int border;
      public final int corner;

      private a(int var3, int var4, int var5) {
         this.background = var3;
         this.border = var4;
         this.corner = var5;
      }
   }

   public static enum b {
      LEGACY(
         new int[]{42, 54},
         new int[]{29, 157},
         new int[]{78},
         new int[]{74},
         new int[]{28, 57, 76},
         new int[]{30, 75, 203},
         new int[]{32, 77, 205},
         new int[]{17, 72, 200},
         new int[]{71},
         new int[]{73},
         new int[]{31, 80, 208},
         new int[]{79},
         new int[]{81},
         new int[]{15},
         new int[]{14},
         new int[]{19}
      ),
      MODERN(
         new int[]{340, 344},
         new int[]{341, 345},
         new int[]{334},
         new int[]{333},
         new int[]{257, 32, 325},
         new int[]{65, 324, 263},
         new int[]{68, 326, 262},
         new int[]{87, 328, 265},
         new int[]{326},
         new int[]{329},
         new int[]{83, 322, 264},
         new int[]{321},
         new int[]{323},
         new int[]{258},
         new int[]{259},
         new int[]{82}
      );

      public final int[] slowDown;
      public final int[] speedUp;
      public final int[] incScale;
      public final int[] decScale;
      public final int[] resetScale;
      public final int[] left;
      public final int[] right;
      public final int[] up;
      public final int[] upLeft;
      public final int[] upRight;
      public final int[] down;
      public final int[] downLeft;
      public final int[] downRight;
      public final int[] nextMod;
      public final int[] prevMod;
      public final int[] resetPos;

      private b(
         int[] var3,
         int[] var4,
         int[] var5,
         int[] var6,
         int[] var7,
         int[] var8,
         int[] var9,
         int[] var10,
         int[] var11,
         int[] var12,
         int[] var13,
         int[] var14,
         int[] var15,
         int[] var16,
         int[] var17,
         int[] var18
      ) {
         this.slowDown = var3;
         this.speedUp = var4;
         this.incScale = var5;
         this.decScale = var6;
         this.resetScale = var7;
         this.left = var8;
         this.right = var9;
         this.up = var10;
         this.upLeft = var11;
         this.upRight = var12;
         this.down = var13;
         this.downLeft = var14;
         this.downRight = var15;
         this.nextMod = var16;
         this.prevMod = var17;
         this.resetPos = var18;
      }
   }
}
