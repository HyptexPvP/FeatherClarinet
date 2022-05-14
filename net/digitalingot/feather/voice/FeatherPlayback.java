package net.digitalingot.feather.voice;

import java.io.Closeable;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.FloatControl.Type;
import net.digitalingot.feather.FeatherLogger;
import net.digitalingot.feather.gT;
import net.digitalingot.feather.gv;
import net.digitalingot.feather.gx;
import net.digitalingot.feather.gy;
import net.digitalingot.feather.hG;
import net.digitalingot.feather.hd;
import net.digitalingot.feather.iJ;
import net.digitalingot.feather.util.MathUtils;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FeatherPlayback extends Thread implements Closeable {
   @NotNull
   private final Voice voice;
   @NotNull
   private final BlockingQueue<gx> c = new ArrayBlockingQueue(1000);
   @Nullable
   private FloatControl floatControl;

   public FeatherPlayback(@NotNull Voice var1) {
      this.voice = var1;
      this.setDaemon(true);
      this.setName("feather-playback");
   }

   public void run() {
      SourceDataLine var1 = this.voice.g().getSourceDataLine();
      if (var1 != null) {
         this.floatControl = (FloatControl)var1.getControl(Type.MASTER_GAIN);

         assert this.floatControl != null;

         gv var2 = this.voice.f();
         this.floatControl.setValue(var2.c() * 40.0F / 100.0F - 35.0F);

         while(true) {
            gx var3;
            try {
               var3 = (gx)this.c.poll(10L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException var8) {
               var1.stop();
               this.close();
               return;
            }

            if (var3 != null) {
               Audio var4 = var3.a();
               if (var4 == null) {
                  return;
               }

               if (var1.getBufferSize() - var1.available() <= 0) {
                  byte[] var5 = new byte[Math.min(2880, var1.getBufferSize() - 960) * 3];
                  var1.write(var5, 0, var5.length);
               }

               this.a(var1, var3, var4);
               var4.b(var3.d());
               var4.a(System.currentTimeMillis());
               AudioDecoder var10 = var4.getAudioDecoder();

               byte[] var6;
               try {
                  var6 = var10.decode(var3.e());
               } catch (IllegalStateException var9) {
                  FeatherLogger.a.info("Failed to decode incoming audio from " + var3.b());
                  continue;
               }

               byte[] var7 = this.a(var3.b(), var6, var3.c());
               if (var7 != null) {
                  this.playFromBytes(var1, var7);
               }
            } else if (var1.getBufferSize() - var1.available() <= 0 && var1.isActive()) {
               var1.stop();
            }
         }
      }
   }

   private void playFromBytes(@NotNull SourceDataLine var1, byte[] var2) {
      var1.write(var2, 0, var2.length);
      var1.start();
   }

   private void a(@NotNull SourceDataLine var1, @NotNull gx var2, @NotNull Audio var3) {
      if (var3.c() != -1L) {
         int var4 = (int)(var2.d() - (var3.c() + 1L));

         for(int var5 = 0; var5 < var4; ++var5) {
            if (var1.available() < 960) {
               FeatherLogger.a.info("Voice: Compensation failed - could not compensate more than " + var5 + " audio packets");
               break;
            }

            byte[] var6 = var3.getAudioDecoder().decode(null);
            byte[] var7 = this.a(var2.b(), var6, var2.c());
            if (var7 != null) {
               this.playFromBytes(var1, var7);
            }
         }

      }
   }

   private byte[] a(@NotNull UUID var1, byte[] var2, @NotNull gT.c var3) {
      gv var4 = this.voice.f();
      boolean var5 = false;
      if (var3 == gT.c.PROXIMITY) {
         var5 = true;
      } else {
         hd var6 = this.voice.c().c();
         if (var6 == null) {
            return null;
         }

         if (var6.c() == hG.b.PROXIMITY) {
            var5 = true;
         }
      }

      iJ var13 = null;
      gv.a var7 = null;
      Object var8;
      if (var5) {
         var13 = var4.a(var1);
         if (var13 == null) {
            return null;
         }

         var7 = var4.g();
         if (var7 == null) {
            return null;
         }

         var8 = MathUtils.a(var13, var7);
      } else {
         var8 = ImmutablePair.of(1.0F, 1.0F);
      }

      float var9 = ((Pair)var8).getLeft();
      float var10 = ((Pair)var8).getRight();
      var9 *= var4.b();
      var10 *= var4.b();
      if (var5) {
         float var11 = iJ.b(var13, var7.a(), null).h();
         if ((double)var11 > 16.0) {
            float var12 = (float)(1.0 - Math.min(((double)var11 - 16.0) / 16.0, 1.0));
            var9 *= var12;
            var10 *= var12;
         }
      }

      return gy.a(var2, var9, var10);
   }

   public void close() {
      gx var1 = new gx(null, UUID.randomUUID(), gT.c._NOT_IN_SCHEMA, -1L, new byte[0]);
      this.c.clear();
      this.c.add(var1);
   }

   @NotNull
   public BlockingQueue<gx> a() {
      return this.c;
   }

   @Nullable
   public FloatControl getFloatControl() {
      return this.floatControl;
   }
}
