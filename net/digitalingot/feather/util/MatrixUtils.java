package net.digitalingot.feather.util;

import java.nio.FloatBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;
import net.digitalingot.feather.hl;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Matrix3f;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;

public final class MatrixUtils {
   private static final FloatBuffer a = BufferUtils.createFloatBuffer(16);
   private final Deque<MatrixUtils.a> b = new ArrayDeque();

   private MatrixUtils(Consumer<Deque<MatrixUtils.a>> var1) {
      var1.accept(this.b);
   }

   public MatrixUtils() {
      this(var0 -> {
         Matrix4f var1 = new Matrix4f();
         var1.setIdentity();
         Matrix3f var2 = new Matrix3f();
         var2.setIdentity();
         var0.add(new MatrixUtils.a(var1, var2));
      });
   }

   public MatrixUtils(boolean var1) {
      this(var0 -> {
         a.rewind();
         GL11.glGetFloat(2982, a);
         Matrix4f var1x = new Matrix4f();
         var1x.load(a);
         Matrix3f var2 = new Matrix3f();
         var2.setIdentity();
         var0.add(new MatrixUtils.a(var1x, var2));
      });
   }

   public void a(double var1, double var3, double var5) {
      this.a((float)var1, (float)var3, (float)var5);
   }

   public void a(float var1, float var2, float var3) {
      if (var1 != 0.0F || var2 != 0.0F || var3 != 0.0F) {
         Matrix4f var4 = ((MatrixUtils.a)this.b.getLast()).a;
         Matrix4f.translate(new Vector3f(var1, var2, var3), var4, var4);
      }

   }

   public void b(double var1, double var3, double var5) {
      this.b((float)var1, (float)var3, (float)var5);
   }

   public void b(float var1, float var2, float var3) {
      if (var1 != 1.0F || var2 != 1.0F || var3 != 1.0F) {
         MatrixUtils.a var4 = (MatrixUtils.a)this.b.getLast();
         Matrix4f var5 = var4.a;
         Matrix3f var6 = var4.b;
         Matrix4f.scale(new Vector3f(var1, var2, var3), var5, var5);
         if (var1 != var2 || var2 != var3) {
            float var7 = 1.0F / var1;
            float var8 = 1.0F / var2;
            float var9 = 1.0F / var3;
            float var10 = hl.a(var7 * var8 * var9);
            Matrix3f var11 = new Matrix3f();
            var11.m00 = var10 * var7;
            var11.m11 = var10 * var8;
            var11.m22 = var10 * var9;
            Matrix3f.mul(var6, var11, var6);
         } else if (var1 < 0.0F) {
            Matrix3f.negate(var6, var6);
         }
      }

   }

   public void a() {
      this.b.addLast(((MatrixUtils.a)this.b.getLast()).c());
   }

   public void b() {
      this.b.removeLast();
   }

   public MatrixUtils.a c() {
      return (MatrixUtils.a)this.b.getLast();
   }

   public boolean d() {
      return this.b.size() == 1;
   }

   public void e() {
      a.rewind();
      ((MatrixUtils.a)this.b.getLast()).a.store(a);
      a.rewind();
      GL11.glMultMatrix(a);
   }

   private void f() {
      GL11.glLoadIdentity();
      this.e();
   }

   public void a(Runnable var1) {
      ScaleUtil.a();
      this.e();
      var1.run();
      ScaleUtil.b();
   }

   public static final class a {
      private final Matrix4f a;
      private final Matrix3f b;

      private a(Matrix4f var1, Matrix3f var2) {
         this.a = var1;
         this.b = var2;
      }

      public Matrix4f a() {
         return this.a;
      }

      public Matrix3f b() {
         return this.b;
      }

      public MatrixUtils.a c() {
         return new MatrixUtils.a(Matrix4f.load(this.a, null), Matrix3f.load(this.b, null));
      }
   }
}
