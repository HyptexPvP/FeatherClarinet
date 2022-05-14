package net.digitalingot.feather;

import com.google.common.collect.ImmutableMap;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import net.minecraft.launchwrapper.IClassTransformer;
import org.apache.commons.io.FileUtils;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.util.CheckClassAdapter;

public class bl implements IClassTransformer {
   private static final Map<String, Class<? extends ClassVisitor>> a = ImmutableMap.builder()
      .put("net.minecraftforge.fml.common.asm.transformers.EventSubscriptionTransformer", bp.class)
      .put("org.spongepowered.asm.mixin.transformer.MixinPostProcessor", br.class)
      .build();

   private static void a(String var0, byte[] var1) {
      try {
         File var2 = new File(".tweaker");
         String var3 = var0.replace('.', File.separatorChar) + ".class";
         FileUtils.writeByteArrayToFile(new File(var2, var3), var1);
      } catch (IOException var4) {
      }

   }

   public byte[] transform(String var1, String var2, byte[] var3) {
      Class var4 = (Class)a.get(var1);
      if (var4 != null) {
         ClassReader var5 = new ClassReader(var3);
         ClassWriter var6 = new ClassWriter(var5, 2);

         ClassVisitor var7;
         try {
            Constructor var8 = var4.getConstructor(ClassVisitor.class);
            var7 = (ClassVisitor)var8.newInstance(new CheckClassAdapter(var6));
         } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException | InstantiationException var9) {
            var9.printStackTrace();
            throw new AssertionError();
         }

         var5.accept(var7, 4);
         a(var1, var6.toByteArray());
         return var6.toByteArray();
      } else {
         return var3;
      }
   }

   boolean a(String var1) {
      return a.containsKey(var1);
   }
}
