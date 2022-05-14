package net.digitalingot.feather;

public class e {
   private static e a;
   private f b;

   public static boolean a() {
      return a != null;
   }

   public static e b() {
      return a == null ? null : a;
   }

   public static f c() {
      return a == null ? null : b().b;
   }

   public static void a(e var0) {
      a = var0;
   }

   public void a(f var1) {
      this.b = var1;
   }

   public f d() {
      return this.b;
   }
}
