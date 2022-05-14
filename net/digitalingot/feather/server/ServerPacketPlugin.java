package net.digitalingot.feather.server;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Collectors;
import net.digitalingot.feather.FeatherLogger;
import net.digitalingot.feather.e;
import net.digitalingot.feather.mods.FeatherModule;
import net.digitalingot.feather.mods.Mod;
import net.digitalingot.feather.mods.ModsConfig;
import net.digitalingot.featherserverapi.proto.ClientHello;
import net.digitalingot.featherserverapi.proto.ClientboundWrapper;
import net.digitalingot.featherserverapi.proto.DisableMods;
import net.digitalingot.featherserverapi.proto.ServerboundWrapper;
import net.digitalingot.featherserverapi.proto.SetWaypoints;
import net.digitalingot.featherserverapi.proto.models.PacketType.Clientbound;
import net.digitalingot.featherserverapi.proto.models.PacketType.Serverbound;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

public class ServerPacketPlugin {
   @NotNull
   public static final ServerPacketPlugin a = new ServerPacketPlugin();
   @NotNull
   private static final String b = "feather:client";
   @NotNull
   private final Gson c = new Gson();

   public void a() {
      ServerMessage.a("feather:client", this::a);
   }

   private void a(byte[] var1) {
      Minecraft.func_71410_x().func_152344_a(() -> {
         try {
            String var2 = new String(var1, StandardCharsets.UTF_8);
            ClientboundWrapper var3 = (ClientboundWrapper)this.c.fromJson(var2, ClientboundWrapper.class);
            Clientbound var4 = var3.getPacketType();
            switch(var4) {
               case DISABLE_MODS:
                  DisableMods var5 = (DisableMods)this.c.fromJson(var3.getPayload(), DisableMods.class);
                  e.c().b().loadConfig(var5.getMods());
                  FeatherLogger.a.info("Received instruction to disable mods from server: " + var5.getMods());
                  break;
               case SET_WAYPOINTS:
                  SetWaypoints var6 = (SetWaypoints)this.c.fromJson(var3.getPayload(), SetWaypoints.class);
            }
         } catch (Exception var7) {
            FeatherLogger.a.error("Exception during feather packet receive from server", var7);
         }

      });
   }

   public void b() {
      List var1 = (List)e.c().b().f().values().stream().filter(Mod::m).map(Mod::l).map(FeatherModule::a).map(ModsConfig::getSlug).collect(Collectors.toList());
      this.a(Serverbound.CLIENT_HELLO, new ClientHello(var1));
   }

   private void a(@NotNull Serverbound var1, @NotNull Object var2) {
      if (Minecraft.func_71410_x().func_147114_u() != null) {
         FeatherLogger.a.debug("Sending " + var1 + " to server over plugin messaging channel");
         JsonElement var3 = this.c.toJsonTree(var2);
         ServerboundWrapper var4 = new ServerboundWrapper(var1, var3);
         String var5 = this.c.toJson(var4);
         ServerMessage.a("feather:client", var5.getBytes(StandardCharsets.UTF_8));
      }
   }
}
