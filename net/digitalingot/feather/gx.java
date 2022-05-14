package net.digitalingot.feather;

import java.util.UUID;
import net.digitalingot.feather.voice.Audio;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class gx {
   @Nullable
   private final Audio a;
   @NotNull
   private final UUID b;
   @NotNull
   private final gT.c c;
   private final long d;
   private final byte[] e;

   public gx(@Nullable Audio var1, @NotNull UUID var2, @NotNull gT.c var3, long var4, byte[] var6) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var6;
   }

   @Nullable
   public Audio a() {
      return this.a;
   }

   @NotNull
   public UUID b() {
      return this.b;
   }

   @NotNull
   public gT.c c() {
      return this.c;
   }

   public long d() {
      return this.d;
   }

   public byte[] e() {
      return this.e;
   }
}
