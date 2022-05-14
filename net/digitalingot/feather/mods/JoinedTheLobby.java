package net.digitalingot.feather.mods;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.digitalingot.feather.fW;
import net.digitalingot.feather.ib;
import net.digitalingot.feather.event.ReceiveMessageEvent;
import org.jetbrains.annotations.NotNull;

public class JoinedTheLobby extends fW<HypixelMod.a> {
   private static final Pattern c = Pattern.compile("^.*\\[.+] \\S{1,16} joined the lobby!.*$");

   protected JoinedTheLobby(@NotNull Mod<HypixelMod.a> var1) {
      super(var1);
   }

   @Override
   public void a() {
      ReceiveMessageEvent.a.a(var1 -> {
         if (!this.g()) {
            return var1;
         } else {
            Matcher var2 = c.matcher(ib.a(var1.func_150260_c()));
            return var2.matches() ? null : var1;
         }
      });
   }

   @Override
   public boolean b() {
      return this.a.k().p;
   }
}
