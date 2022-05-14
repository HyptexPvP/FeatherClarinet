package net.digitalingot.feather;

import org.capnproto.DataList;
import org.capnproto.GeneratedClassSupport;
import org.capnproto.SegmentBuilder;
import org.capnproto.SegmentReader;
import org.capnproto.StructBuilder;
import org.capnproto.StructFactory;
import org.capnproto.StructReader;
import org.capnproto.StructSize;
import org.capnproto.Text;
import org.capnproto.StructList.Factory;
import org.capnproto.Text.Builder;
import org.capnproto.Text.Reader;

public final class gR {
   public static class a {
      public static final StructSize a = new StructSize((short)0, (short)1);
      public static final gR.a.b b = new gR.a.b();
      public static final Factory<gR.a.a, gR.a.c> c = new Factory(b);

      public static final class a extends StructBuilder {
         a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            super(var1, var2, var3, var4, var5);
         }

         public final gR.a.c a() {
            return new gR.a.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
         }

         public final boolean b() {
            return !this._pointerFieldIsNull(0);
         }

         public final Builder c() {
            return (Builder)this._getPointerField(Text.factory, 0, null, 0, 0);
         }

         public final void a(Reader var1) {
            this._setPointerField(Text.factory, 0, var1);
         }

         public final void a(String var1) {
            this._setPointerField(Text.factory, 0, new Reader(var1));
         }

         public final Builder a(int var1) {
            return (Builder)this._initPointerField(Text.factory, 0, var1);
         }
      }

      public static final class b extends StructFactory<gR.a.a, gR.a.c> {
         public final gR.a.c a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return new gR.a.c(var1, var2, var3, var4, var5, var6);
         }

         public final gR.a.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return new gR.a.a(var1, var2, var3, var4, var5);
         }

         public final StructSize structSize() {
            return gR.a.a;
         }

         public final gR.a.c a(gR.a.a var1) {
            return var1.a();
         }
      }

      public static final class c extends StructReader {
         c(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            super(var1, var2, var3, var4, var5, var6);
         }

         public boolean a() {
            return !this._pointerFieldIsNull(0);
         }

         public Reader b() {
            return (Reader)this._getPointerField(Text.factory, 0, null, 0, 0);
         }
      }
   }

   public static class b {
      public static final StructSize a = new StructSize((short)1, (short)1);
      public static final gR.b.b b = new gR.b.b();
      public static final Factory<gR.b.a, gR.b.c> c = new Factory(b);

      public static final class a extends StructBuilder {
         a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            super(var1, var2, var3, var4, var5);
         }

         public final gR.b.c a() {
            return new gR.b.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
         }

         public final gT.a b() {
            switch(this._getShortField(0)) {
               case 0:
                  return gT.a.PARTY_ONLY;
               case 1:
                  return gT.a.EVERYONE;
               default:
                  return gT.a._NOT_IN_SCHEMA;
            }
         }

         public final void a(gT.a var1) {
            this._setShortField(0, (short)var1.ordinal());
         }

         public final boolean c() {
            return !this._pointerFieldIsNull(0);
         }

         public final org.capnproto.DataList.Builder d() {
            return (org.capnproto.DataList.Builder)this._getPointerField(DataList.factory, 0, null, 0);
         }

         public final void a(org.capnproto.DataList.Reader var1) {
            this._setPointerField(DataList.factory, 0, var1);
         }

         public final org.capnproto.DataList.Builder a(int var1) {
            return (org.capnproto.DataList.Builder)this._initPointerField(DataList.factory, 0, var1);
         }
      }

      public static final class b extends StructFactory<gR.b.a, gR.b.c> {
         public final gR.b.c a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return new gR.b.c(var1, var2, var3, var4, var5, var6);
         }

         public final gR.b.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return new gR.b.a(var1, var2, var3, var4, var5);
         }

         public final StructSize structSize() {
            return gR.b.a;
         }

         public final gR.b.c a(gR.b.a var1) {
            return var1.a();
         }
      }

      public static final class c extends StructReader {
         c(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            super(var1, var2, var3, var4, var5, var6);
         }

         public final gT.a a() {
            switch(this._getShortField(0)) {
               case 0:
                  return gT.a.PARTY_ONLY;
               case 1:
                  return gT.a.EVERYONE;
               default:
                  return gT.a._NOT_IN_SCHEMA;
            }
         }

         public final boolean b() {
            return !this._pointerFieldIsNull(0);
         }

         public final org.capnproto.DataList.Reader c() {
            return (org.capnproto.DataList.Reader)this._getPointerField(DataList.factory, 0, null, 0);
         }
      }
   }

   public static final class c {
      public static final SegmentReader a = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000éqÔ\u009c\u008a'O\u00ad'\u0000\u0000\u0000\u0001\u0000\u0001\u0000ü\u008cØ\u0087TÛÑ\u008d\u0001\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000z\u0001\u0000\u0000)\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000%\u0000\u0000\u0000?\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/tcp/serverbound_wrapper.capnp:Wrapper\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000ÝÁ\u0004\u0011 @!º\r\u0000\u0000\u0000Z\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000packetType\u0000\u0000\u0000\u0000\u0000\u0000"
      );
      public static final SegmentReader b = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000ÝÁ\u0004\u0011 @!º/\u0000\u0000\u0000\u0001\u0000\u0001\u0000éqÔ\u009c\u008a'O\u00ad\u0001\u0000\u0007\u0000\u0001\u0000\u0002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000Ò\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000w\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/tcp/serverbound_wrapper.capnp:Wrapper.packetType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\b\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000ÿÿ\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000R\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000(\u0000\u0000\u0000\u0003\u0000\u0001\u00004\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0001\u0000þÿ\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00001\u0000\u0000\u0000\u0082\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00000\u0000\u0000\u0000\u0003\u0000\u0001\u0000<\u0000\u0000\u0000\u0002\u0000\u0001\u0000handshake\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000H\u0082\\\u0097ªÉgÈ\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000receiveSettings\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000ÄB<ãT\u001b\t³\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
      );
      public static final SegmentReader c = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000H\u0082\\\u0097ªÉgÈ'\u0000\u0000\u0000\u0001\u0000\u0000\u0000ü\u008cØ\u0087TÛÑ\u008d\u0001\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u008a\u0001\u0000\u0000-\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000?\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/tcp/serverbound_wrapper.capnp:Handshake\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000J\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\f\u0000\u0000\u0000\u0003\u0000\u0001\u0000\u0018\u0000\u0000\u0000\u0002\u0000\u0001\u0000jwtToken\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
      );
      public static final SegmentReader d = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000ÄB<ãT\u001b\t³'\u0000\u0000\u0000\u0001\u0000\u0001\u0000ü\u008cØ\u0087TÛÑ\u008d\u0001\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000º\u0001\u0000\u0000-\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000w\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/tcp/serverbound_wrapper.capnp:ReceiveSettings\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\b\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000(\u0000\u0000\u0000\u0003\u0000\u0001\u00004\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00001\u0000\u0000\u00002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000,\u0000\u0000\u0000\u0003\u0000\u0001\u0000H\u0000\u0000\u0000\u0002\u0000\u0001\u0000receiveMode\u0000\u0000\u0000\u0000\u0000\u000f\u0000\u0000\u0000\u0000\u0000\u0000\u0000u3¸ÞZ\n0î\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u000f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000muted\u0000\u0000\u0000\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0003\u0000\u0001\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
      );
   }

   public static class d {
      public static final StructSize a = new StructSize((short)1, (short)1);
      public static final gR.d.b b = new gR.d.b();
      public static final Factory<gR.d.a, gR.d.d> c = new Factory(b);

      public static final class a extends StructBuilder {
         a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            super(var1, var2, var3, var4, var5);
         }

         public final gR.d.d a() {
            return new gR.d.d(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
         }

         public final gR.d.c.a b() {
            return new gR.d.c.a(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
         }

         public final gR.d.c.a c() {
            this._setShortField(0, (short)0);
            this._clearPointerField(0);
            return new gR.d.c.a(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
         }
      }

      public static final class b extends StructFactory<gR.d.a, gR.d.d> {
         public final gR.d.d a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return new gR.d.d(var1, var2, var3, var4, var5, var6);
         }

         public final gR.d.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return new gR.d.a(var1, var2, var3, var4, var5);
         }

         public final StructSize structSize() {
            return gR.d.a;
         }

         public final gR.d.d a(gR.d.a var1) {
            return var1.a();
         }
      }

      public static class c {
         public static final StructSize a = new StructSize((short)1, (short)1);
         public static final gR.d.c.b b = new gR.d.c.b();
         public static final Factory<gR.d.c.a, gR.d.c.c> c = new Factory(b);

         public static final class a extends StructBuilder {
            a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
               super(var1, var2, var3, var4, var5);
            }

            public gR.d.c.d a() {
               switch(this._getShortField(0)) {
                  case 0:
                     return gR.d.c.d.HANDSHAKE;
                  case 1:
                     return gR.d.c.d.RECEIVE_SETTINGS;
                  default:
                     return gR.d.c.d._NOT_IN_SCHEMA;
               }
            }

            public final gR.d.c.c b() {
               return new gR.d.c.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
            }

            public final boolean c() {
               return this.a() == gR.d.c.d.HANDSHAKE;
            }

            public final gR.a.a d() {
               assert this.a() == gR.d.c.d.HANDSHAKE : "Must check which() before get()ing a union member.";

               return (gR.a.a)this._getPointerField(gR.a.b, 0, null, 0);
            }

            public final void a(gR.a.c var1) {
               this._setShortField(0, (short)gR.d.c.d.HANDSHAKE.ordinal());
               this._setPointerField(gR.a.b, 0, var1);
            }

            public final gR.a.a e() {
               this._setShortField(0, (short)gR.d.c.d.HANDSHAKE.ordinal());
               return (gR.a.a)this._initPointerField(gR.a.b, 0, 0);
            }

            public final boolean f() {
               return this.a() == gR.d.c.d.RECEIVE_SETTINGS;
            }

            public final gR.b.a g() {
               assert this.a() == gR.d.c.d.RECEIVE_SETTINGS : "Must check which() before get()ing a union member.";

               return (gR.b.a)this._getPointerField(gR.b.b, 0, null, 0);
            }

            public final void a(gR.b.c var1) {
               this._setShortField(0, (short)gR.d.c.d.RECEIVE_SETTINGS.ordinal());
               this._setPointerField(gR.b.b, 0, var1);
            }

            public final gR.b.a h() {
               this._setShortField(0, (short)gR.d.c.d.RECEIVE_SETTINGS.ordinal());
               return (gR.b.a)this._initPointerField(gR.b.b, 0, 0);
            }
         }

         public static final class b extends StructFactory<gR.d.c.a, gR.d.c.c> {
            public final gR.d.c.c a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
               return new gR.d.c.c(var1, var2, var3, var4, var5, var6);
            }

            public final gR.d.c.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
               return new gR.d.c.a(var1, var2, var3, var4, var5);
            }

            public final StructSize structSize() {
               return gR.d.c.a;
            }

            public final gR.d.c.c a(gR.d.c.a var1) {
               return var1.b();
            }
         }

         public static final class c extends StructReader {
            c(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
               super(var1, var2, var3, var4, var5, var6);
            }

            public gR.d.c.d a() {
               switch(this._getShortField(0)) {
                  case 0:
                     return gR.d.c.d.HANDSHAKE;
                  case 1:
                     return gR.d.c.d.RECEIVE_SETTINGS;
                  default:
                     return gR.d.c.d._NOT_IN_SCHEMA;
               }
            }

            public final boolean b() {
               return this.a() == gR.d.c.d.HANDSHAKE;
            }

            public boolean c() {
               return !this._pointerFieldIsNull(0);
            }

            public gR.a.c d() {
               assert this.a() == gR.d.c.d.HANDSHAKE : "Must check which() before get()ing a union member.";

               return (gR.a.c)this._getPointerField(gR.a.b, 0, null, 0);
            }

            public final boolean e() {
               return this.a() == gR.d.c.d.RECEIVE_SETTINGS;
            }

            public boolean f() {
               return !this._pointerFieldIsNull(0);
            }

            public gR.b.c g() {
               assert this.a() == gR.d.c.d.RECEIVE_SETTINGS : "Must check which() before get()ing a union member.";

               return (gR.b.c)this._getPointerField(gR.b.b, 0, null, 0);
            }
         }

         public static enum d {
            HANDSHAKE,
            RECEIVE_SETTINGS,
            _NOT_IN_SCHEMA;
         }
      }

      public static final class d extends StructReader {
         d(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            super(var1, var2, var3, var4, var5, var6);
         }

         public gR.d.c.c a() {
            return new gR.d.c.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, this.nestingLimit);
         }
      }
   }
}
