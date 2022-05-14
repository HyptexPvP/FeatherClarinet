package net.digitalingot.feather.emote;

import java.util.List;
import java.util.UUID;
import net.digitalingot.feather.cosmetic.CosmeticPlayer;

public interface Emote {
   void a(UUID var1, String var2);

   void a(List<CosmeticPlayer> var1);

   void b(List<String> var1);
}
