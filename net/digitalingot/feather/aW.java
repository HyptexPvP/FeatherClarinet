package net.digitalingot.feather;

import java.nio.FloatBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class aW extends aU {
   private static final FloatBuffer f;

   @Override
   protected boolean c() {
      return GL11.glIsEnabled(3553);
   }

   public void render() {
      if (this.d()) {
         int var1 = GL11.glGetInteger(32873);
         int var2 = GL11.glGetTexEnvi(8960, 8704);
         int var3 = GL11.glGetInteger(3317);
         GL11.glPushAttrib(61440);
         GL11.glPushClientAttrib(2);
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 771);
         GL11.glDisable(2912);
         GL11.glDisable(2896);
         GL11.glDisable(2884);
         GL11.glDisable(2929);
         GL11.glDisable(2960);
         GL11.glDisable(2903);
         GL11.glEnable(3553);
         GL11.glTexEnvi(8960, 8704, 8448);
         GL11.glHint(3155, 4354);
         GL11.glClear(256);
         GL11.glMatrixMode(5889);
         GL11.glPushMatrix();
         GL11.glLoadIdentity();
         GL11.glMatrixMode(5888);
         GL11.glPushMatrix();
         GL11.glLoadIdentity();
         GL11.glPixelStorei(3317, 1);
         GL11.glBindTexture(3553, this.e);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glInterleavedArrays(10791, 0, f);
         GL11.glDrawArrays(7, 0, 4);
         GL11.glPixelStorei(3317, var3);
         GL11.glBindTexture(3553, var1);
         GL11.glMatrixMode(5888);
         GL11.glPopMatrix();
         GL11.glMatrixMode(5889);
         GL11.glPopMatrix();
         GL11.glPopAttrib();
         GL11.glPopClientAttrib();
         GL11.glTexEnvi(8960, 8704, var2);
      }
   }

   static {
      float[] var0 = new float[]{0.0F, 1.0F, -1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 1.0F, 0.0F};
      f = BufferUtils.createFloatBuffer(var0.length);
      f.put(var0, 0, var0.length);
      f.rewind();
   }
}
