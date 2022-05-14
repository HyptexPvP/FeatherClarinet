package net.digitalingot.feather;

import org.objectweb.asm.MethodVisitor;

public abstract class ir extends MethodVisitor {
   public ir() {
      super(ip.a);
   }

   public ir(MethodVisitor var1) {
      super(ip.a, var1);
   }
}
