package net.digitalingot.feather;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;

public class il {
   private static final char a = '§';
   private static final Pattern b = Pattern.compile("(?i)§[0-9A-FK-OR]");
   private static final char c = 'r';
   private static final char d = 'l';
   private static final char e = 'k';
   private static final char f = 'm';
   private static final char g = 'n';
   private static final char h = 'o';

   private il() {
      throw new AssertionError();
   }

   public static il.a a(String var0) {
      Matcher var1 = b.matcher(var0);
      ArrayList var2 = new ArrayList();
      il.b var3 = null;

      while(var1.find()) {
         int var4 = var1.start();
         char var5 = var0.charAt(var4 + 1);
         if (var5 == 'r') {
            if (var3 != null) {
               var3.i = var4;
               var2.add(var3);
               var3 = null;
            }
         } else if (a(var5)) {
            if (var3 != null) {
               if (!var3.a(var5)) {
                  var3.i = var4;
                  var2.add(var3);
                  var3 = il.b.d(var3);
                  var3.h = var4 + 2;
               }
            } else {
               var3 = new il.b();
               var3.h = var4 + 2;
            }

            var3.b(var5);
         } else {
            if (var3 != null) {
               var3.i = var4;
               var2.add(var3);
            }

            var3 = new il.b();
            var3.h = var4 + 2;
            var3.b = var5;
         }
      }

      if (var3 != null) {
         var3.i = var0.length();
         var2.add(var3);
      }

      return new il.a(var2);
   }

   private static boolean a(char var0) {
      switch(Character.toLowerCase(var0)) {
         case 'k':
         case 'l':
         case 'm':
         case 'n':
         case 'o':
            return true;
         default:
            return false;
      }
   }

   public static class a {
      private final List<il.b> a;

      private a(List<il.b> var1) {
         this.a = var1;
      }

      @NotNull
      public il.b a(int var1) {
         for(il.b var3 : this.a) {
            if (var1 >= var3.h && var1 < var3.i) {
               return var3;
            }
         }

         return il.b.a;
      }
   }

   public static class b {
      private static final il.b a = new il.b();
      private char b = '\uffff';
      private boolean c;
      private boolean d;
      private boolean e;
      private boolean f;
      private boolean g;
      private int h;
      private int i;

      public String a() {
         StringBuilder var1 = new StringBuilder();
         if (this.b()) {
            var1.append('§');
            var1.append(this.b);
         }

         if (this.c) {
            var1.append('§');
            var1.append('l');
         }

         if (this.d) {
            var1.append('§');
            var1.append('o');
         }

         if (this.e) {
            var1.append('§');
            var1.append('n');
         }

         if (this.f) {
            var1.append('§');
            var1.append('m');
         }

         if (this.g) {
            var1.append('§');
            var1.append('k');
         }

         return var1.toString();
      }

      public boolean b() {
         return this.b != '\uffff';
      }

      public char c() {
         return this.b;
      }

      private static il.b d(il.b var0) {
         il.b var1 = new il.b();
         if (var0 != null) {
            var1.b = var0.b;
            var1.c = var0.c;
            var1.e = var0.e;
            var1.f = var0.f;
            var1.g = var0.g;
         }

         return var1;
      }

      private boolean a(char var1) {
         switch(Character.toLowerCase(var1)) {
            case 'k':
               return this.g;
            case 'l':
               return this.c;
            case 'm':
               return this.f;
            case 'n':
               return this.e;
            case 'o':
               return this.d;
            default:
               return false;
         }
      }

      private void b(char var1) {
         switch(Character.toLowerCase(var1)) {
            case 'k':
               this.g = true;
               break;
            case 'l':
               this.c = true;
               break;
            case 'm':
               this.f = true;
               break;
            case 'n':
               this.e = true;
               break;
            case 'o':
               this.d = true;
         }

      }
   }
}
