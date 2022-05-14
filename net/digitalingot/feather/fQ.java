package net.digitalingot.feather;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.digitalingot.feather.event.ReceiveMessageEvent;
import net.digitalingot.feather.mods.HypixelMod;
import net.digitalingot.feather.mods.Mod;
import org.jetbrains.annotations.NotNull;

public class fQ extends fW<HypixelMod.a> {
   private static final Pattern c = Pattern.compile("(:?(SHOUT|SPECTATOR|TEAM|) )?.+\\S{1,16}: .*gg.*");

   fQ(@NotNull Mod<HypixelMod.a> var1) {
      super(var1);
   }

   @Override
   public void a() {
      ReceiveMessageEvent.a.a(var1 -> {
         if (!this.g()) {
            return var1;
         } else {
            Matcher var2 = c.matcher(var1.func_150260_c());
            return var2.matches() ? null : var1;
         }
      });
   }

   @Override
   public boolean b() {
      return this.a.k().n;
   }
}
