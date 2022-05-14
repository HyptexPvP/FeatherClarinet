package net.digitalingot.feather.party;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import net.digitalingot.feather.fb;
import net.digitalingot.feather.fg;
import net.digitalingot.feather.h;
import net.digitalingot.feather.hd;
import net.digitalingot.feather.redstone.Redstone;
import net.digitalingot.feather.redstone.RedstoneManager;
import net.digitalingot.feather.redstone.packet.Accept;
import net.digitalingot.feather.redstone.packet.Info;
import net.digitalingot.feather.redstone.packet.Invite;
import net.digitalingot.feather.redstone.packet.Leader;
import net.digitalingot.feather.redstone.packet.Leave;
import net.digitalingot.feather.redstone.packet.Mode;
import net.digitalingot.feather.redstone.packet.Remove;
import net.digitalingot.feather.redstone.packets.Create;
import net.digitalingot.feather.util.Account;
import net.digitalingot.feather.util.PlayerUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.ChatComponentTranslation;
import org.jetbrains.annotations.NotNull;

public class Party extends h {
   @NotNull
   private final Map<String, Redstone> redstonePackets = new HashMap();
   @NotNull
   private final fb b;

   public Party(@NotNull Account var1, @NotNull RedstoneManager var2, @NotNull fb var3) {
      super("featherparty", Collections.singletonList("fparty"));
      this.b = var3;
      this.redstonePackets.put("create", new Create(var1, var2, var3));
      this.redstonePackets.put("accept", new Accept(var1, var2, var3));
      this.redstonePackets.put("deny", new fg(var1, var2, var3));
      Info var4 = new Info(var1, var2, var3);
      this.redstonePackets.put("info", var4);
      this.redstonePackets.put("list", var4);
      this.redstonePackets.put("leave", new Leave(var1, var2, var3));
      this.redstonePackets.put("mode", new Mode(var1, var2, var3));
      this.redstonePackets.put("leader", new Leader(var1, var2, var3));
      this.redstonePackets.put("remove", new Remove(var1, var2, var3));
      this.redstonePackets.put("invite", new Invite(var1, var2, var3));
   }

   @Override
   public void a(@NotNull String[] var1) {
      EntityPlayerSP var2 = Minecraft.func_71410_x().field_71439_g;
      if (var1.length == 0) {
         PlayerUtil.a(var2, new ChatComponentTranslation("feather.commands.featherparty.base.usage", new Object[0]));
      } else {
         String var3 = var1[0].toLowerCase();
         Redstone var4 = (Redstone)this.redstonePackets.get(var3);
         if (var4 == null) {
            PlayerUtil.a(var2, new ChatComponentTranslation("feather.commands.featherparty.base.usage", new Object[0]));
         } else {
            switch(var4.a()) {
               case NOT_IN_PARTY:
                  if (this.a()) {
                     PlayerUtil.a(var2, new ChatComponentTranslation("feather.commands.featherparty.error.alreadyInParty", new Object[0]));
                     return;
                  }
                  break;
               case IN_PARTY:
                  if (!this.a()) {
                     PlayerUtil.a(var2, new ChatComponentTranslation("feather.commands.featherparty.notInParty", new Object[0]));
                     return;
                  }
                  break;
               case LEADER:
                  if (!this.b()) {
                     PlayerUtil.a(var2, new ChatComponentTranslation("feather.commands.featherparty.notLeader", new Object[0]));
                     return;
                  }
            }

            String[] var5 = new String[var1.length - 1];
            System.arraycopy(var1, 1, var5, 0, var5.length);
            var4.a(var2, var5);
         }
      }
   }

   private boolean a() {
      return this.b.a().c() != null;
   }

   private boolean b() {
      hd var1 = this.b.a().c();
      if (var1 == null) {
         return false;
      } else {
         UUID var2 = Minecraft.func_71410_x().func_110432_I().func_148256_e().getId();
         return var1.a().equals(var2);
      }
   }
}
