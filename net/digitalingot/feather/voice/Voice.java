package net.digitalingot.feather.voice;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioDatagramChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import java.io.Closeable;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import net.digitalingot.feather.FeatherLogger;
import net.digitalingot.feather.gG;
import net.digitalingot.feather.gK;
import net.digitalingot.feather.gM;
import net.digitalingot.feather.gN;
import net.digitalingot.feather.gO;
import net.digitalingot.feather.gr;
import net.digitalingot.feather.gs;
import net.digitalingot.feather.gv;
import net.digitalingot.feather.hP;
import net.digitalingot.feather.hf;
import net.digitalingot.feather.iP;
import net.digitalingot.feather.iQ;
import net.digitalingot.feather.util.CoreAPI;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Voice implements Closeable {
   @NotNull
   private final hf b;
   @NotNull
   private final gv c;
   @NotNull
   private final AudioPlayer d;
   @NotNull
   private final gr e;
   @NotNull
   private final NioEventLoopGroup f;
   @NotNull
   private final Map<UUID, Audio> g = new HashMap();
   @NotNull
   private final List<gM> h = new ArrayList();
   @Nullable
   private FeatherRecording i;
   @Nullable
   private FeatherPlayback j;
   @Nullable
   private gG k;

   private Voice(@NotNull hf var1, @NotNull gv var2, @NotNull AudioPlayer var3) {
      this.b = var1;
      this.c = var2;
      this.d = var3;
      this.e = new gs(this);
      this.f = new NioEventLoopGroup();
   }

   public static Voice initVoice(@NotNull CoreAPI var0, @NotNull hf var1, @NotNull gv var2, @NotNull AudioPlayer var3) {
      FeatherLogger.a.info("Initializing voice...");
      Voice var4 = new Voice(var1, var2, var3);
      var4.a(var0);
      var4.e().scheduleAtFixedRate(() -> {
         for(gM var2x : var4.k()) {
            var2x.a();
         }

      }, 60L, 60L, TimeUnit.SECONDS);
      FeatherRecording var5 = new FeatherRecording(var4);
      var5.start();
      FeatherPlayback var6 = new FeatherPlayback(var4);
      var6.start();
      var4.a(var5);
      var4.a(var6);
      return var4;
   }

   public void a() {
      if (this.k != null) {
         this.k.c().close();
      }

   }

   private void a(@NotNull CoreAPI var1) {
      Bootstrap var3 = new Bootstrap();
      var3.group(this.f);
      var3.channel(NioSocketChannel.class);
      var3.option(ChannelOption.SO_KEEPALIVE, true);
      var3.remoteAddress(VoiceURL.e, 5433);
      var3.handler(new ChannelInitializer<Channel>() {
         protected void initChannel(Channel var1) {
            VoiceAuthenticator var2 = new VoiceAuthenticator(var1, Voice.this);
            var1.attr(VoiceURL.a).set(var2);
            ChannelPipeline var3 = var1.pipeline();
            var3.addLast("packetProcessor", new iP());
            var3.addLast("controlPacketProcessor", new gK());
            var3.addLast("unauthenticatedHandler", new VoiceError(var2));
            var3.addLast("inboundExceptionHandler", new iQ.a());
            var3.addLast("outboundExceptionHandler", new iQ.b());
         }
      });
      ChannelFuture var4 = var3.connect();
      var4.addListener(var2 -> {
         if (!var2.isSuccess()) {
            FeatherLogger.a.warn("Couldn't establish connection to voice control connection", var2.cause());
         } else {
            Channel var3x = var4.channel();
            var3x.config().setOption(ChannelOption.SO_RCVBUF, 65536);
            var3x.config().setOption(ChannelOption.SO_SNDBUF, 65536);
            FeatherLogger.a.info("Established voice control connection to " + var3x.remoteAddress());
            VoiceAuthenticator var4x = (VoiceAuthenticator)var3x.attr(VoiceURL.a).get();
            var4x.authenticate(var1.c());
         }
      });
      var4.channel().closeFuture().addListener(var3x -> {
         if (this.k != null) {
            FeatherLogger.a.info("Control connection stopped.", var3x.cause());
            this.k = null;
         }

         for(gM var5 : this.k()) {
            var5.c().close();
         }

         if (!this.f.isShuttingDown()) {
            this.f.schedule(() -> {
               FeatherLogger.a.info("Reconnecting to voice control server...");
               this.a(var1);
            }, 5L, TimeUnit.SECONDS);
         }

      });
   }

   public void b() {
      assert this.k != null;

      String[] var1;
      try {
         var1 = this.n();
      } catch (IOException var10) {
         FeatherLogger.a.error("Error while fetching voice IPs", var10);
         var1 = new String[]{((InetSocketAddress)this.k.c().remoteAddress()).getAddress().getHostAddress()};
      }

      final Voice var2 = this;

      for(String var6 : var1) {
         Bootstrap var7 = new Bootstrap();
         var7.group(this.f);
         var7.channel(NioDatagramChannel.class);
         var7.remoteAddress(var6, 5432);
         var7.handler(new ChannelInitializer<Channel>() {
            protected void initChannel(Channel var1) {
               ChannelPipeline var2x = var1.pipeline();
               var2x.addLast("packetProcessor", new iP());
               var2x.addLast("voicePacketProcessor", new gO());
               var2x.addLast("voiceConnectionHandler", new gN(var2));
               var2x.addLast("inboundExceptionHandler", new iQ.a());
               var2x.addLast("outboundExceptionHandler", new iQ.b());
            }
         });
         ChannelFuture var8 = var7.connect();
         Channel var9 = var8.channel();
         var8.addListener(
            var3 -> {
               InetSocketAddress var4 = (InetSocketAddress)var9.remoteAddress();
               InetAddress var5 = var4.getAddress();
               InetAddress var6x = ((InetSocketAddress)this.k.c().remoteAddress()).getAddress();
               boolean var7x = var5.equals(var6x);
               gM var8x = new gM(var2, var9, var7x);
               synchronized(this) {
                  var2.k().add(var8x);
               }
   
               var9.attr(VoiceURL.b).set(var8x);
               FeatherLogger.a
                  .info(
                     "Established voice connection to "
                        + var4
                        + " - connected: "
                        + var2.k().stream().map(gM::c).map(Channel::remoteAddress).collect(Collectors.toList())
                  );
               var8x.a();
            }
         );
         var9.closeFuture().addListener(var3 -> {
            gM var4 = (gM)var9.attr(VoiceURL.b).get();
            if (var4 != null) {
               FeatherLogger.a.info("Voice connection to " + var4.c().remoteAddress() + " closed");
               synchronized(this) {
                  var2.k().remove(var4);
               }

               if (var4.b()) {
                  var2.a();
               }
            }

         });
      }

   }

   private String[] n() {
      String var1 = hP.a(VoiceURL.c).c();
      return var1.split("\n");
   }

   @NotNull
   public hf c() {
      return this.b;
   }

   @NotNull
   Map<UUID, Audio> d() {
      return this.g;
   }

   @NotNull
   public NioEventLoopGroup e() {
      return this.f;
   }

   @NotNull
   public gv f() {
      return this.c;
   }

   @NotNull
   public AudioPlayer g() {
      return this.d;
   }

   @NotNull
   public Set<UUID> h() {
      Iterator var1 = this.g.values().iterator();

      while(var1.hasNext()) {
         Audio var2 = (Audio)var1.next();
         if (var2.b() + 500L < System.currentTimeMillis()) {
            var1.remove();
            var2.close();
         }
      }

      return this.g.keySet();
   }

   @NotNull
   public gr i() {
      return this.e;
   }

   @Nullable
   public gM j() {
      for(gM var2 : this.h) {
         if (var2.b()) {
            return var2;
         }
      }

      return null;
   }

   @NotNull
   public List<gM> k() {
      return this.h;
   }

   @Nullable
   public gG l() {
      return this.k;
   }

   public void a(@Nullable gG var1) {
      this.k = var1;
   }

   private void a(@NotNull FeatherRecording var1) {
      this.i = var1;
   }

   public void a(@NotNull FeatherPlayback var1) {
      this.j = var1;
   }

   @Nullable
   FeatherPlayback m() {
      return this.j;
   }

   public void close() {
      this.f.shutdownGracefully();
      if (this.i != null) {
         this.i.close();
      }

      this.d.close();
   }
}
