package net.digitalingot.feather.mixin.client.util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.IntBuffer;
import javax.imageio.ImageIO;
import net.digitalingot.feather.event.ChatEvent;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.event.ClickEvent;
import net.minecraft.event.ClickEvent.Action;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ScreenShotHelper;
import org.apache.logging.log4j.Logger;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin({ScreenShotHelper.class})
public abstract class MixinScreenShotHelper {
   @Shadow
   @Final
   private static Logger field_148261_a;
   @Shadow
   private static IntBuffer field_74293_b;
   @Shadow
   private static int[] field_74294_c;

   @Shadow
   private static File func_74290_a(File var0) {
      return null;
   }

   @Overwrite
   public static IChatComponent func_148259_a(File var0, String var1, int var2, int var3, Framebuffer var4) {
      ChatEvent.a.a().screenshot();

      try {
         File var5 = new File(var0, "screenshots");
         var5.mkdir();
         if (OpenGlHelper.func_148822_b()) {
            var2 = var4.field_147622_a;
            var3 = var4.field_147620_b;
         }

         int var6 = var2 * var3;
         if (field_74293_b == null || field_74293_b.capacity() < var6) {
            field_74293_b = BufferUtils.createIntBuffer(var6);
            field_74294_c = new int[var6];
         }

         GL11.glPixelStorei(3333, 1);
         GL11.glPixelStorei(3317, 1);
         field_74293_b.clear();
         if (OpenGlHelper.func_148822_b()) {
            GlStateManager.func_179144_i(var4.field_147617_g);
            GL11.glGetTexImage(3553, 0, 32993, 33639, field_74293_b);
         } else {
            GL11.glReadPixels(0, 0, var2, var3, 32993, 33639, field_74293_b);
         }

         field_74293_b.get(field_74294_c);
         TextureUtil.func_147953_a(field_74294_c, var2, var3);
         BufferedImage var7;
         if (OpenGlHelper.func_148822_b()) {
            var7 = new BufferedImage(var4.field_147621_c, var4.field_147618_d, 1);
            int var8 = var4.field_147620_b - var4.field_147618_d;

            for(int var9 = var8; var9 < var4.field_147620_b; ++var9) {
               for(int var10 = 0; var10 < var4.field_147621_c; ++var10) {
                  var7.setRGB(var10, var9 - var8, field_74294_c[var9 * var4.field_147622_a + var10]);
               }
            }
         } else {
            var7 = new BufferedImage(var2, var3, 1);
            var7.setRGB(0, 0, var2, var3, field_74294_c, 0, var2);
         }

         File var12;
         if (var1 == null) {
            var12 = func_74290_a(var5);
         } else {
            var12 = new File(var5, var1);
         }

         ImageIO.write(var7, "png", var12);
         ChatComponentText var13 = new ChatComponentText(var12.getName());
         var13.func_150256_b().func_150241_a(new ClickEvent(Action.OPEN_FILE, var12.getAbsolutePath()));
         var13.func_150256_b().func_150228_d(Boolean.TRUE);
         Object var14 = ChatEvent.b.a().screenshot(var12, new ChatComponentTranslation("screenshot.success", new Object[]{var13}));
         if (var14 == null) {
            var14 = new ChatComponentText("");
         }

         return (IChatComponent)var14;
      } catch (Exception var11) {
         field_148261_a.warn("Couldn't save screenshot", var11);
         return new ChatComponentTranslation("screenshot.failure", new Object[]{var11.getMessage()});
      }
   }
}
