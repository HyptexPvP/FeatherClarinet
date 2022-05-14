package net.digitalingot.feather;

import org.capnproto.Data;
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

public final class hG {
   public static class a {
      public static final StructSize a = new StructSize((short)0, (short)2);
      public static final hG.a.b b = new hG.a.b();
      public static final Factory<hG.a.a, hG.a.c> c = new Factory(b);

      public static final class a extends StructBuilder {
         a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            super(var1, var2, var3, var4, var5);
         }

         public final hG.a.c a() {
            return new hG.a.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
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

         public final boolean d() {
            return !this._pointerFieldIsNull(1);
         }

         public final org.capnproto.Data.Builder e() {
            return (org.capnproto.Data.Builder)this._getPointerField(Data.factory, 1, null, 0, 0);
         }

         public final void a(org.capnproto.Data.Reader var1) {
            this._setPointerField(Data.factory, 1, var1);
         }

         public final void a(byte[] var1) {
            this._setPointerField(Data.factory, 1, new org.capnproto.Data.Reader(var1));
         }

         public final org.capnproto.Data.Builder b(int var1) {
            return (org.capnproto.Data.Builder)this._initPointerField(Data.factory, 1, var1);
         }
      }

      public static final class b extends StructFactory<hG.a.a, hG.a.c> {
         public final hG.a.c a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return new hG.a.c(var1, var2, var3, var4, var5, var6);
         }

         public final hG.a.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return new hG.a.a(var1, var2, var3, var4, var5);
         }

         public final StructSize structSize() {
            return hG.a.a;
         }

         public final hG.a.c a(hG.a.a var1) {
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

         public boolean c() {
            return !this._pointerFieldIsNull(1);
         }

         public org.capnproto.Data.Reader d() {
            return (org.capnproto.Data.Reader)this._getPointerField(Data.factory, 1, null, 0, 0);
         }
      }
   }

   public static enum b {
      EVERYONE,
      PROXIMITY,
      _NOT_IN_SCHEMA;
   }

   public static final class c {
      public static final SegmentReader a = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000\u0018ûÎìÖ«SÏ\u0015\u0000\u0000\u0000\u0002\u0000\u0000\u00006gúB\u0087>Ùò\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000*\u0001\u0000\u0000%\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0000\u0000\u00007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/types.capnp:PartySpeechMode\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\b\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0011\u0000\u0000\u0000J\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000R\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000everyone\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000proximity\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
      );
      public static final SegmentReader b = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000\u001e\u00171I#)T¶\u0015\u0000\u0000\u0000\u0001\u0000\u0000\u00006gúB\u0087>Ùò\u0002\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000:\u0001\u0000\u0000%\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0000\u0000\u0000w\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/types.capnp:P2pRendezvousInfo\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\b\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000\u0082\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000(\u0000\u0000\u0000\u0003\u0000\u0001\u00004\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00001\u0000\u0000\u0000R\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00000\u0000\u0000\u0000\u0003\u0000\u0001\u0000<\u0000\u0000\u0000\u0002\u0000\u0001\u0000externalAddress\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000publicKey\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
      );
   }
}
