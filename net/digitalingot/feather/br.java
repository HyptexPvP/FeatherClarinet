package net.digitalingot.feather;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;

public class br extends iq {
   public br(ClassVisitor var1) {
      super(var1);
   }

   public MethodVisitor visitMethod(int var1, String var2, String var3, String var4, String[] var5) {
      MethodVisitor var6 = super.visitMethod(var1, var2, var3, var4, var5);
      return (MethodVisitor)((var1 & 8) != 0
            && var2.equals("getAccessorMethod")
            && var3.equals(
               "(Lorg/spongepowered/asm/mixin/transformer/MixinInfo;Lorg/spongepowered/asm/lib/tree/MethodNode;Lorg/spongepowered/asm/mixin/transformer/ClassInfo;)Lorg/spongepowered/asm/mixin/transformer/ClassInfo$Method;"
            )
         ? new br.a(var6)
         : var6);
   }

   static class a extends ir {
      private a(MethodVisitor var1) {
         super(var1);
      }

      public void visitTypeInsn(int var1, String var2) {
         if (var1 == 187 && var2.equals("org/spongepowered/asm/mixin/transformer/throwables/MixinTransformerError")) {
            super.visitVarInsn(25, 2);
            super.visitMethodInsn(
               182, "org/spongepowered/asm/mixin/transformer/ClassInfo", "getMethodMapper", "()Lorg/spongepowered/asm/mixin/transformer/MethodMapper;", false
            );
            super.visitVarInsn(25, 0);
            super.visitVarInsn(25, 1);
            super.visitVarInsn(25, 3);
            super.visitMethodInsn(
               182,
               "org/spongepowered/asm/mixin/transformer/MethodMapper",
               "remapHandlerMethod",
               "(Lorg/spongepowered/asm/mixin/transformer/MixinInfo;Lorg/spongepowered/asm/lib/tree/MethodNode;Lorg/spongepowered/asm/mixin/transformer/ClassInfo$Method;)V",
               false
            );
            super.visitVarInsn(25, 3);
            super.visitInsn(176);
         } else {
            super.visitTypeInsn(var1, var2);
         }
      }
   }
}
