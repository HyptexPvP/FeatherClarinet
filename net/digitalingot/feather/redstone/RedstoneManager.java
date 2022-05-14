package net.digitalingot.feather.redstone;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.util.AttributeKey;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import net.digitalingot.feather.FeatherLogger;
import net.digitalingot.feather.hA;
import net.digitalingot.feather.hC;
import net.digitalingot.feather.hE;
import net.digitalingot.feather.ht;
import net.digitalingot.feather.iP;
import net.digitalingot.feather.iQ;
import net.digitalingot.feather.iR;
import net.digitalingot.feather.emote.Emote;
import net.digitalingot.feather.event.ChatEvent;
import net.digitalingot.feather.peertopeer.PeerToPeer;
import net.digitalingot.feather.util.CoreAPI;
import net.digitalingot.feather.util.SystemUtil;
import net.digitalingot.feather.webscket.PacketError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class RedstoneManager {
   public static final AttributeKey<RedstoneAuthentication> a = AttributeKey.valueOf("unauthenticated-redstone-connection");
   @NotNull
   private static final String b = SystemUtil.a("FEATHER_REDSTONE", "redstone.lb.feathermc.com");
   private static final int c = 1668;
   @NotNull
   private final ChatEvent d;
   @NotNull
   private final Emote e;
   @NotNull
   private final hA f;
   @NotNull
   private final PeerToPeer g;
   @NotNull
   private final NioEventLoopGroup h;
   @Nullable
   private Channel i;
   @NotNull
   private final Map<UUID, hE.a.c.b.c> j = new HashMap();
   @Nullable
   private ht k;

   private RedstoneManager(@NotNull ChatEvent var1, @NotNull Emote var2, @NotNull hA var3, @NotNull PeerToPeer var4) {
      this.d = var1;
      this.e = var2;
      this.f = var3;
      this.g = var4;
      this.h = new NioEventLoopGroup();
   }

   public static RedstoneManager a(@NotNull ChatEvent var0, @NotNull Emote var1, @NotNull hA var2, @NotNull PeerToPeer var3, @NotNull CoreAPI var4) {
      FeatherLogger.a.info("Initializing Redstone...");
      RedstoneManager var5 = new RedstoneManager(var0, var1, var2, var3);
      var5.a(var4);
      return var5;
   }

   public void a() {
      if (this.i != null) {
         this.i.close();
      }

   }

   private void a(@NotNull CoreAPI var1) {
      Bootstrap var3 = new Bootstrap();
      var3.group(this.h);
      var3.channel(NioSocketChannel.class);
      var3.option(ChannelOption.SO_KEEPALIVE, true);
      var3.remoteAddress(b, 1668);
      var3.handler(new ChannelInitializer<Channel>() {
         protected void initChannel(Channel var1) {
            RedstoneAuthentication var2 = new RedstoneAuthentication(var1, RedstoneManager.this);
            var1.attr(RedstoneManager.a).set(var2);
            ChannelPipeline var3 = var1.pipeline();
            var3.addLast("packetLengthProcessor", new iR());
            var3.addLast("packetProcessor", new iP());
            var3.addLast("redstonePacketProcessor", new hC());
            var3.addLast("unauthenticatedHandler", new PacketError(var2));
            var3.addLast("inboundExceptionHandler", new iQ.a());
            var3.addLast("outboundExceptionHandler", new iQ.b());
         }
      });
      ChannelFuture var4 = var3.connect();
      var4.addListener(var3x -> {
         if (!var3x.isSuccess()) {
            FeatherLogger.a.warn("Couldn't establish connection to Redstone", var3x.cause());
         } else {
            String var4x = var1.c();
            if (var4x == null) {
               throw new IllegalArgumentException("Game token couldn't be fetched");
            } else {
               this.i = var4.channel();
               this.i.config().setOption(ChannelOption.SO_RCVBUF, 65536);
               this.i.config().setOption(ChannelOption.SO_SNDBUF, 65536);
               FeatherLogger.a.info("Established Redstone connection to " + this.i.remoteAddress());
               RedstoneAuthentication var5 = (RedstoneAuthentication)this.i.attr(a).get();
               var5.a(var1.c());
            }
         }
      });
      var4.channel().closeFuture().addListener(var2 -> {
         FeatherLogger.a.info("Redstone connection stopped.", var2.cause());
         this.i = null;
         if (this.k != null) {
            this.k = null;
         }

         if (!this.h.isShuttingDown()) {
            this.h.schedule(() -> {
               FeatherLogger.a.info("Reconnecting to Redstone...");
               this.a(var1);
            }, 5L, TimeUnit.SECONDS);
         }

      });
   }

   @NotNull
   public Map<UUID, hE.a.c.b.c> b() {
      return this.j;
   }

   @Nullable
   public ht c() {
      return this.k;
   }

   public void a(@NotNull ht var1) {
      this.k = var1;
   }

   @NotNull
   public ChatEvent d() {
      return this.d;
   }

   @NotNull
   public Emote e() {
      return this.e;
   }

   @NotNull
   public hA f() {
      return this.f;
   }

   @NotNull
   public PeerToPeer g() {
      return this.g;
   }
}
