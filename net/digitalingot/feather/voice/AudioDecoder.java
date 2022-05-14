package net.digitalingot.feather.voice;

import java.io.Closeable;
import org.jitsi.impl.neomedia.codec.audio.opus.Opus;

public class AudioDecoder implements Closeable {
   private final long a = Opus.decoder_create(24000, 1);

   public AudioDecoder() {
      if (this.a == 0L) {
         throw new IllegalStateException("Error on creating opus decoder");
      }
   }

   public byte[] decode(byte[] var1) {
      byte[] var2 = new byte[960];
      int var3;
      byte[] var4;
      if (var1 != null && var1.length != 0) {
         var3 = var1.length;
         var4 = var1;
      } else {
         var3 = 0;
         var4 = null;
      }

      int var5 = Opus.decode(this.a, var4, 0, var3, var2, 0, 480, 0);
      if (var5 < 0) {
         throw new IllegalStateException("Failed to decode audio data");
      } else {
         byte[] var6 = new byte[var5 * 2];
         System.arraycopy(var2, 0, var6, 0, var5 * 2);
         return var6;
      }
   }

   public void close() {
      Opus.decoder_destroy(this.a);
   }
}
