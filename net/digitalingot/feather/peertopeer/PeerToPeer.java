package net.digitalingot.feather.peertopeer;

import java.util.UUID;
import net.digitalingot.feather.browserEvent.PeerToPeerEvent;
import org.jetbrains.annotations.NotNull;

public interface PeerToPeer {
   void a(@NotNull UUID var1, @NotNull PeerToPeerEvent.a var2);

   void b(@NotNull UUID var1, @NotNull PeerToPeerEvent.a var2);
}
