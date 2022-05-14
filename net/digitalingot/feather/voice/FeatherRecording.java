package net.digitalingot.feather.voice;

import java.io.Closeable;
import javax.sound.sampled.TargetDataLine;
import net.digitalingot.feather.gM;
import net.digitalingot.feather.gT;
import net.digitalingot.feather.gv;
import net.digitalingot.feather.gy;
import org.jetbrains.annotations.NotNull;

public class FeatherRecording extends Thread implements Closeable {
   @NotNull
   private final Voice voice;
   @NotNull
   private final AudioEncoder encoder = new AudioEncoder();
   private boolean isRecording = true;

   public FeatherRecording(@NotNull Voice var1) {
      this.voice = var1;
      this.setDaemon(true);
      this.setName("feather-recording");
   }

   public void run() {
      while(this.isRecording) {
         try {
            Thread.sleep(10L);
         } catch (InterruptedException var9) {
            return;
         }

         gv var1 = this.voice.f();
         gT.c[] var2 = var1.f();
         if (var2 != null) {
            TargetDataLine var3 = this.voice.g().getTargetDataLine();
            if (var3 != null) {
               try {
                  while(true) {
                     byte[] var4 = this.a(var3);
                     this.a(var2, var4);
                     if ((var2 = var1.f()) == null) {
                        break;
                     }
                  }
               } finally {
                  var3.stop();
                  var3.flush();
               }
            }
         }
      }

   }

   private byte[] a(@NotNull TargetDataLine var1) {
      var1.start();

      while(var1.available() < 960) {
         try {
            Thread.sleep(1L);
         } catch (InterruptedException var3) {
            return new byte[0];
         }
      }

      byte[] var2 = new byte[960];
      var1.read(var2, 0, 960);
      return var2;
   }

   private void a(gT.c[] var1, byte[] var2) {
      gy.a(var2, this.voice.f().a());
      gM var3 = this.voice.j();
      if (var3 != null) {
         byte[] var4 = this.encoder.encode(var2);

         for(gT.c var8 : var1) {
            var3.a(var4, var8);
         }

      }
   }

   public void close() {
      this.isRecording = false;
   }
}
