package net.digitalingot.feather.voice;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.TargetDataLine;
import javax.sound.sampled.AudioFormat.Encoding;
import javax.sound.sampled.DataLine.Info;
import net.digitalingot.feather.FeatherLogger;
import org.jetbrains.annotations.Nullable;

public class AudioPlayer implements Closeable {
   private static final AudioFormat format = new AudioFormat(Encoding.PCM_SIGNED, 24000.0F, 16, 1, 2, 24000.0F, false);
   private static final AudioFormat format2 = new AudioFormat(Encoding.PCM_SIGNED, 24000.0F, 16, 2, 4, 24000.0F, false);
   @Nullable
   private SourceDataLine sourceLine;
   @Nullable
   private TargetDataLine targetLine;

   public AudioPlayer(@Nullable String var1, @Nullable String var2) {
      this.openFormat(var1, var2);
   }

   public void openFormat(@Nullable String var1, @Nullable String var2) {
      if (var1 != null && var1.isEmpty()) {
         var1 = null;
      }

      if (var2 != null && var2.isEmpty()) {
         var2 = null;
      }

      this.sourceLine = this.getSourceDataLineByName(var2);
      if (this.sourceLine != null) {
         try {
            this.sourceLine.open(format2);
         } catch (LineUnavailableException var5) {
            FeatherLogger.a.error("Couldn't access speaker line", var5);
            this.sourceLine = null;
         }
      }

      this.targetLine = this.getTargetLine(var1);
      if (this.targetLine != null) {
         try {
            this.targetLine.open(format);
         } catch (LineUnavailableException var4) {
            FeatherLogger.a.error("Couldn't access microphone line", var4);
            this.targetLine = null;
         }
      }

   }

   @Nullable
   private TargetDataLine getTargetLine(@Nullable String var1) {
      if (var1 != null && !var1.equals("Default")) {
         TargetDataLine var2 = this.a(var1);
         if (var2 != null) {
            return var2;
         }
      }

      return this.getDataLines(TargetDataLine.class);
   }

   @Nullable
   private SourceDataLine getSourceDataLineByName(@Nullable String var1) {
      if (var1 != null && !var1.equals("Default")) {
         SourceDataLine var2 = this.b(var1);
         if (var2 != null) {
            return var2;
         }
      }

      return this.getDataLines(SourceDataLine.class);
   }

   @Nullable
   public <T> T getDataLines(Class<T> var1) {
      Info var2 = new Info(var1, null);

      try {
         return (T)var1.cast(AudioSystem.getLine(var2));
      } catch (Exception var4) {
         return null;
      }
   }

   @Nullable
   public TargetDataLine a(String var1) {
      return this.a(TargetDataLine.class, var1);
   }

   @Nullable
   public SourceDataLine b(String var1) {
      return this.a(SourceDataLine.class, var1);
   }

   @Nullable
   private <T extends Line> T a(Class<T> var1, String var2) {
      javax.sound.sampled.Mixer.Info[] var3 = AudioSystem.getMixerInfo();

      for(javax.sound.sampled.Mixer.Info var7 : var3) {
         Mixer var8 = AudioSystem.getMixer(var7);
         javax.sound.sampled.Line.Info var9 = new javax.sound.sampled.Line.Info(var1);
         if (var8.isLineSupported(var9) && var7.getName().equals(var2)) {
            Line var10;
            try {
               var10 = var8.getLine(var9);
            } catch (LineUnavailableException var12) {
               continue;
            }

            if (var1.isAssignableFrom(var10.getClass())) {
               return (T)var10;
            }
         }
      }

      return null;
   }

   @Nullable
   public TargetDataLine getTargetDataLine() {
      return this.targetLine;
   }

   @Nullable
   public SourceDataLine getSourceDataLine() {
      return this.sourceLine;
   }

   public static List<String> getTargetLine() {
      return getLines(TargetDataLine.class);
   }

   public static List<String> getSourceLines() {
      return getLines(SourceDataLine.class);
   }

   public static List<String> getLines(Class<?> var0) {
      ArrayList var1 = new ArrayList();
      javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();

      for(javax.sound.sampled.Mixer.Info var6 : var2) {
         Mixer var7 = AudioSystem.getMixer(var6);
         javax.sound.sampled.Line.Info var8 = new javax.sound.sampled.Line.Info(var0);
         if (var7.isLineSupported(var8)) {
            var1.add(var6.getName());
         }
      }

      return var1;
   }

   public void close() {
      if (this.sourceLine != null) {
         this.sourceLine.close();
      }

      if (this.targetLine != null) {
         this.targetLine.close();
      }

   }
}
