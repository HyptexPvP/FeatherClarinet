package net.digitalingot.feather;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;

public class bq extends iq {
   private static final int a = 327680;

   public bq(ClassVisitor var1) {
      super(var1);
   }

   public MethodVisitor visitMethod(int var1, String var2, String var3, String var4, String[] var5) {
      if (var2.equals("emptyIterator") && var3.equals("Lcom/google/common/collect/UnmodifiableIterator;") && (var1 & 8) != 0) {
         ++var1;
      }

      return super.visitMethod(var1, var2, var3, var4, var5);
   }
}
