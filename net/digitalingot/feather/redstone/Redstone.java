package net.digitalingot.feather.redstone;

import net.digitalingot.feather.fb;
import net.digitalingot.feather.util.Account;
import net.minecraft.client.entity.EntityPlayerSP;
import org.jetbrains.annotations.NotNull;

public abstract class Redstone {
   @NotNull
   protected final Account getParty;
   @NotNull
   protected final RedstoneManager b;
   @NotNull
   protected final fb c;
   @NotNull
   private final Redstone.a d;

   protected Redstone(@NotNull Account var1, @NotNull RedstoneManager var2, @NotNull fb var3) {
      this(var1, var3, var2, Redstone.a.NONE);
   }

   protected Redstone(@NotNull Account var1, @NotNull fb var2, @NotNull RedstoneManager var3, @NotNull Redstone.a var4) {
      this.getParty = var1;
      this.c = var2;
      this.b = var3;
      this.d = var4;
   }

   public abstract void a(EntityPlayerSP var1, String[] var2);

   @NotNull
   public Redstone.a a() {
      return this.d;
   }

   public static enum a {
      NONE,
      NOT_IN_PARTY,
      IN_PARTY,
      LEADER;
   }
}
