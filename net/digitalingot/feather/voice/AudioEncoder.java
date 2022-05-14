package net.digitalingot.feather.voice;

import java.io.Closeable;
import org.jitsi.impl.neomedia.codec.audio.opus.Opus;

public class AudioEncoder implements Closeable {
   private final long encode = Opus.encoder_create(24000, 1);

   public AudioEncoder() {
      if (this.encode == 0L) {
         throw new IllegalStateException("Error on creating opus encoder");
      }
   }

   public byte[] encode(byte[] var1) {
      byte[] var2 = new byte[1276];
      int var3 = Opus.encode(this.encode, var1, 0, 480, var2, 0, var2.length);
      if (var3 < 0) {
         throw new IllegalStateException("Failed to encode audio data");
      } else {
         byte[] var4 = new byte[var3];
         System.arraycopy(var2, 0, var4, 0, var3);
         return var4;
      }
   }

   public void close() {
      Opus.encoder_destroy(this.encode);
   }
}
