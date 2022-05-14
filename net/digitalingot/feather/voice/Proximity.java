package net.digitalingot.feather.voice;

import net.digitalingot.feather.gT;
import org.capnproto.Data;
import org.capnproto.GeneratedClassSupport;
import org.capnproto.SegmentBuilder;
import org.capnproto.SegmentReader;
import org.capnproto.StructBuilder;
import org.capnproto.StructFactory;
import org.capnproto.StructReader;
import org.capnproto.StructSize;
import org.capnproto.Data.Builder;
import org.capnproto.Data.Reader;
import org.capnproto.StructList.Factory;

public final class Proximity {
   public static final class a {
      public static final SegmentReader a = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000Ì¾´®È3y\u0093'\u0000\u0000\u0000\u0001\u0000\u0002\u0000Â~ÿ\u0095j\u008eÏ¥\u0002\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000j\u0001\u0000\u0000)\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000%\u0000\u0000\u0000ç\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/voice/clientbound_voice.capnp:Voice\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0010\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000a\u0000\u0000\u0000B\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\\\u0000\u0000\u0000\u0003\u0000\u0001\u0000h\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000e\u0000\u0000\u0000Z\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000d\u0000\u0000\u0000\u0003\u0000\u0001\u0000p\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0002\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000m\u0000\u0000\u0000z\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000l\u0000\u0000\u0000\u0003\u0000\u0001\u0000x\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0003\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0003\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000u\u0000\u0000\u0000*\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000p\u0000\u0000\u0000\u0003\u0000\u0001\u0000|\u0000\u0000\u0000\u0002\u0000\u0001\u0000speaker\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000speechMode\u0000\u0000\u0000\u0000\u0000\u0000\u000f\u0000\u0000\u0000\u0000\u0000\u0000\u0000k\u0004¹M0\rFÄ\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u000f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000sequenceNumber\u0000\u0000\t\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\t\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000data\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
      );
   }

   public static class b {
      public static final StructSize a = new StructSize((short)2, (short)2);
      public static final Proximity.b.b b = new Proximity.b.b();
      public static final Factory<Proximity.b.a, Proximity.b.c> c = new Factory(b);

      public static final class a extends StructBuilder {
         a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            super(var1, var2, var3, var4, var5);
         }

         public final Proximity.b.c a() {
            return new Proximity.b.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
         }

         public final boolean b() {
            return !this._pointerFieldIsNull(0);
         }

         public final Builder c() {
            return (Builder)this._getPointerField(Data.factory, 0, null, 0, 0);
         }

         public final void a(Reader var1) {
            this._setPointerField(Data.factory, 0, var1);
         }

         public final void a(byte[] var1) {
            this._setPointerField(Data.factory, 0, new Reader(var1));
         }

         public final Builder a(int var1) {
            return (Builder)this._initPointerField(Data.factory, 0, var1);
         }

         public final gT.c d() {
            switch(this._getShortField(0)) {
               case 0:
                  return gT.c.PROXIMITY;
               case 1:
                  return gT.c.PARTY;
               default:
                  return gT.c._NOT_IN_SCHEMA;
            }
         }

         public final void a(gT.c var1) {
            this._setShortField(0, (short)var1.ordinal());
         }

         public final long e() {
            return this._getLongField(1);
         }

         public final void a(long var1) {
            this._setLongField(1, var1);
         }

         public final boolean f() {
            return !this._pointerFieldIsNull(1);
         }

         public final Builder g() {
            return (Builder)this._getPointerField(Data.factory, 1, null, 0, 0);
         }

         public final void b(Reader var1) {
            this._setPointerField(Data.factory, 1, var1);
         }

         public final void b(byte[] var1) {
            this._setPointerField(Data.factory, 1, new Reader(var1));
         }

         public final Builder b(int var1) {
            return (Builder)this._initPointerField(Data.factory, 1, var1);
         }
      }

      public static final class b extends StructFactory<Proximity.b.a, Proximity.b.c> {
         public final Proximity.b.c a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return new Proximity.b.c(var1, var2, var3, var4, var5, var6);
         }

         public final Proximity.b.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return new Proximity.b.a(var1, var2, var3, var4, var5);
         }

         public final StructSize structSize() {
            return Proximity.b.a;
         }

         public final Proximity.b.c a(Proximity.b.a var1) {
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
            return (Reader)this._getPointerField(Data.factory, 0, null, 0, 0);
         }

         public final gT.c c() {
            switch(this._getShortField(0)) {
               case 0:
                  return gT.c.PROXIMITY;
               case 1:
                  return gT.c.PARTY;
               default:
                  return gT.c._NOT_IN_SCHEMA;
            }
         }

         public final long d() {
            return this._getLongField(1);
         }

         public boolean e() {
            return !this._pointerFieldIsNull(1);
         }

         public Reader f() {
            return (Reader)this._getPointerField(Data.factory, 1, null, 0, 0);
         }
      }
   }
}
