package net.digitalingot.feather;

import org.capnproto.GeneratedClassSupport;
import org.capnproto.SegmentBuilder;
import org.capnproto.SegmentReader;
import org.capnproto.StructBuilder;
import org.capnproto.StructFactory;
import org.capnproto.StructReader;
import org.capnproto.StructSize;
import org.capnproto.Void;
import org.capnproto.StructList.Factory;

public final class gQ {
   public static class a {
      public static final StructSize a = new StructSize((short)1, (short)0);
      public static final gQ.a.b b = new gQ.a.b();
      public static final Factory<gQ.a.a, gQ.a.c> c = new Factory(b);

      public static final class a extends StructBuilder {
         a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            super(var1, var2, var3, var4, var5);
         }

         public final gQ.a.c a() {
            return new gQ.a.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
         }

         public final int b() {
            return this._getIntField(0);
         }

         public final void a(int var1) {
            this._setIntField(0, var1);
         }
      }

      public static final class b extends StructFactory<gQ.a.a, gQ.a.c> {
         public final gQ.a.c a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return new gQ.a.c(var1, var2, var3, var4, var5, var6);
         }

         public final gQ.a.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return new gQ.a.a(var1, var2, var3, var4, var5);
         }

         public final StructSize structSize() {
            return gQ.a.a;
         }

         public final gQ.a.c a(gQ.a.a var1) {
            return var1.a();
         }
      }

      public static final class c extends StructReader {
         c(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            super(var1, var2, var3, var4, var5, var6);
         }

         public final int a() {
            return this._getIntField(0);
         }
      }
   }

   public static final class b {
      public static final SegmentReader a = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000ÇÊ\u0090g'\u0087ë\u0098'\u0000\u0000\u0000\u0001\u0000\u0001\u0000öè{®ª\u007fá¢\u0001\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000z\u0001\u0000\u0000)\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000%\u0000\u0000\u0000?\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/tcp/clientbound_wrapper.capnp:Wrapper\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000Sÿ§IªÎ]\u0097\r\u0000\u0000\u0000Z\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000packetType\u0000\u0000\u0000\u0000\u0000\u0000"
      );
      public static final SegmentReader b = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000Sÿ§IªÎ]\u0097/\u0000\u0000\u0000\u0001\u0000\u0001\u0000ÇÊ\u0090g'\u0087ë\u0098\u0001\u0000\u0007\u0000\u0001\u0000\u0002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000Ò\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000w\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/tcp/clientbound_wrapper.capnp:Wrapper.packetType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\b\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000ÿÿ\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000z\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000(\u0000\u0000\u0000\u0003\u0000\u0001\u00004\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0001\u0000þÿ\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00001\u0000\u0000\u0000*\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000,\u0000\u0000\u0000\u0003\u0000\u0001\u00008\u0000\u0000\u0000\u0002\u0000\u0001\u0000authSuccessful\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000u\u0018µ§\u008b½\t\u0092\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000todo\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
      );
      public static final SegmentReader c = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000u\u0018µ§\u008b½\t\u0092'\u0000\u0000\u0000\u0001\u0000\u0001\u0000öè{®ª\u007fá¢\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000²\u0001\u0000\u0000-\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000?\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/tcp/clientbound_wrapper.capnp:AuthSuccessful\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000R\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\f\u0000\u0000\u0000\u0003\u0000\u0001\u0000\u0018\u0000\u0000\u0000\u0002\u0000\u0001\u0000sessionId\u0000\u0000\u0000\u0000\u0000\u0000\u0000\b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
      );
   }

   public static class c {
      public static final StructSize a = new StructSize((short)1, (short)1);
      public static final gQ.c.b b = new gQ.c.b();
      public static final Factory<gQ.c.a, gQ.c.d> c = new Factory(b);

      public static final class a extends StructBuilder {
         a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            super(var1, var2, var3, var4, var5);
         }

         public final gQ.c.d a() {
            return new gQ.c.d(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
         }

         public final gQ.c.c.a b() {
            return new gQ.c.c.a(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
         }

         public final gQ.c.c.a c() {
            this._setShortField(0, (short)0);
            this._clearPointerField(0);
            return new gQ.c.c.a(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
         }
      }

      public static final class b extends StructFactory<gQ.c.a, gQ.c.d> {
         public final gQ.c.d a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return new gQ.c.d(var1, var2, var3, var4, var5, var6);
         }

         public final gQ.c.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return new gQ.c.a(var1, var2, var3, var4, var5);
         }

         public final StructSize structSize() {
            return gQ.c.a;
         }

         public final gQ.c.d a(gQ.c.a var1) {
            return var1.a();
         }
      }

      public static class c {
         public static final StructSize a = new StructSize((short)1, (short)1);
         public static final gQ.c.c.b b = new gQ.c.c.b();
         public static final Factory<gQ.c.c.a, gQ.c.c.c> c = new Factory(b);

         public static final class a extends StructBuilder {
            a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
               super(var1, var2, var3, var4, var5);
            }

            public gQ.c.c.d a() {
               switch(this._getShortField(0)) {
                  case 0:
                     return gQ.c.c.d.AUTH_SUCCESSFUL;
                  case 1:
                     return gQ.c.c.d.TODO;
                  default:
                     return gQ.c.c.d._NOT_IN_SCHEMA;
               }
            }

            public final gQ.c.c.c b() {
               return new gQ.c.c.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
            }

            public final boolean c() {
               return this.a() == gQ.c.c.d.AUTH_SUCCESSFUL;
            }

            public final gQ.a.a d() {
               assert this.a() == gQ.c.c.d.AUTH_SUCCESSFUL : "Must check which() before get()ing a union member.";

               return (gQ.a.a)this._getPointerField(gQ.a.b, 0, null, 0);
            }

            public final void a(gQ.a.c var1) {
               this._setShortField(0, (short)gQ.c.c.d.AUTH_SUCCESSFUL.ordinal());
               this._setPointerField(gQ.a.b, 0, var1);
            }

            public final gQ.a.a e() {
               this._setShortField(0, (short)gQ.c.c.d.AUTH_SUCCESSFUL.ordinal());
               return (gQ.a.a)this._initPointerField(gQ.a.b, 0, 0);
            }

            public final boolean f() {
               return this.a() == gQ.c.c.d.TODO;
            }

            public final Void g() {
               assert this.a() == gQ.c.c.d.TODO : "Must check which() before get()ing a union member.";

               return Void.VOID;
            }

            public final void a(Void var1) {
               this._setShortField(0, (short)gQ.c.c.d.TODO.ordinal());
            }
         }

         public static final class b extends StructFactory<gQ.c.c.a, gQ.c.c.c> {
            public final gQ.c.c.c a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
               return new gQ.c.c.c(var1, var2, var3, var4, var5, var6);
            }

            public final gQ.c.c.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
               return new gQ.c.c.a(var1, var2, var3, var4, var5);
            }

            public final StructSize structSize() {
               return gQ.c.c.a;
            }

            public final gQ.c.c.c a(gQ.c.c.a var1) {
               return var1.b();
            }
         }

         public static final class c extends StructReader {
            c(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
               super(var1, var2, var3, var4, var5, var6);
            }

            public gQ.c.c.d a() {
               switch(this._getShortField(0)) {
                  case 0:
                     return gQ.c.c.d.AUTH_SUCCESSFUL;
                  case 1:
                     return gQ.c.c.d.TODO;
                  default:
                     return gQ.c.c.d._NOT_IN_SCHEMA;
               }
            }

            public final boolean b() {
               return this.a() == gQ.c.c.d.AUTH_SUCCESSFUL;
            }

            public boolean c() {
               return !this._pointerFieldIsNull(0);
            }

            public gQ.a.c d() {
               assert this.a() == gQ.c.c.d.AUTH_SUCCESSFUL : "Must check which() before get()ing a union member.";

               return (gQ.a.c)this._getPointerField(gQ.a.b, 0, null, 0);
            }

            public final boolean e() {
               return this.a() == gQ.c.c.d.TODO;
            }

            public final Void f() {
               assert this.a() == gQ.c.c.d.TODO : "Must check which() before get()ing a union member.";

               return Void.VOID;
            }
         }

         public static enum d {
            AUTH_SUCCESSFUL,
            TODO,
            _NOT_IN_SCHEMA;
         }
      }

      public static final class d extends StructReader {
         d(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            super(var1, var2, var3, var4, var5, var6);
         }

         public gQ.c.c.c a() {
            return new gQ.c.c.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, this.nestingLimit);
         }
      }
   }
}
