package net.digitalingot.feather.voice;

import java.io.Closeable;
import org.jetbrains.annotations.NotNull;

public class Audio implements Closeable {
   @NotNull
   private final AudioDecoder audioDecoder = new AudioDecoder();
   private long b = System.currentTimeMillis();
   private long c = -1L;

   @NotNull
   public AudioDecoder getAudioDecoder() {
      return this.audioDecoder;
   }

   public long b() {
      return this.b;
   }

   public void a(long var1) {
      this.b = var1;
   }

   public long c() {
      return this.c;
   }

   public void b(long var1) {
      this.c = var1;
   }

   public void close() {
      this.audioDecoder.close();
   }
}
