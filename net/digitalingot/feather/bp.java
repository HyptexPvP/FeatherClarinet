package net.digitalingot.feather;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;

public class bp extends iq {
   public bp(ClassVisitor var1) {
      super(var1);
   }

   public MethodVisitor visitMethod(int var1, String var2, String var3, String var4, String[] var5) {
      MethodVisitor var6 = super.visitMethod(var1, var2, var3, var4, var5);
      return (MethodVisitor)(var2.equals("buildEvents") && var3.equals("(Lorg/objectweb/asm/tree/ClassNode;)Z") ? new bp.a(var6) : var6);
   }

   static class a extends ir {
      private boolean a = false;
      private boolean b = false;

      private a(MethodVisitor var1) {
         super(var1);
      }

      public void visitTypeInsn(int var1, String var2) {
         if (!this.a && var1 == 187 && var2.equals("java/lang/RuntimeException")) {
            this.a = true;
         }

         super.visitTypeInsn(var1, var2);
      }

      public void visitMethodInsn(int var1, String var2, String var3, String var4, boolean var5) {
         if (this.a
            && !this.b
            && var1 == 184
            && var2.equals("org/objectweb/asm/Type")
            && var3.equals("getType")
            && var4.equals("(Ljava/lang/String;)Lorg/objectweb/asm/Type;")) {
            var3 = "getObjectType";
            this.b = true;
         }

         super.visitMethodInsn(var1, var2, var3, var4, var5);
      }
   }
}
