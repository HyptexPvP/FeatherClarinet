package net.digitalingot.feather;

import org.capnproto.Data;
import org.capnproto.DataList;
import org.capnproto.GeneratedClassSupport;
import org.capnproto.SegmentBuilder;
import org.capnproto.SegmentReader;
import org.capnproto.StructBuilder;
import org.capnproto.StructFactory;
import org.capnproto.StructReader;
import org.capnproto.StructSize;
import org.capnproto.Text;
import org.capnproto.TextList;
import org.capnproto.Void;
import org.capnproto.StructList.Builder;
import org.capnproto.StructList.Factory;
import org.capnproto.StructList.Reader;

public final class hE {
   public static class a {
      public static final StructSize a = new StructSize((short)0, (short)1);
      public static final hE.a.b b = new hE.a.b();
      public static final Factory<hE.a.a, hE.a.d> c = new Factory(b);

      public static final class a extends StructBuilder {
         a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            super(var1, var2, var3, var4, var5);
         }

         public final hE.a.d a() {
            return new hE.a.d(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
         }

         public final boolean b() {
            return !this._pointerFieldIsNull(0);
         }

         public final Builder<hE.a.c.a> c() {
            return (Builder<hE.a.c.a>)this._getPointerField(hE.a.c.c, 0, null, 0);
         }

         public final void a(Reader<hE.a.c.e> var1) {
            this._setPointerField(hE.a.c.c, 0, var1);
         }

         public final Builder<hE.a.c.a> a(int var1) {
            return (Builder<hE.a.c.a>)this._initPointerField(hE.a.c.c, 0, var1);
         }
      }

      public static final class b extends StructFactory<hE.a.a, hE.a.d> {
         public final hE.a.d a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return new hE.a.d(var1, var2, var3, var4, var5, var6);
         }

         public final hE.a.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return new hE.a.a(var1, var2, var3, var4, var5);
         }

         public final StructSize structSize() {
            return hE.a.a;
         }

         public final hE.a.d a(hE.a.a var1) {
            return var1.a();
         }
      }

      public static class c {
         public static final StructSize a = new StructSize((short)1, (short)2);
         public static final hE.a.c.c b = new hE.a.c.c();
         public static final Factory<hE.a.c.a, hE.a.c.e> c = new Factory(b);

         public static final class a extends StructBuilder {
            a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
               super(var1, var2, var3, var4, var5);
            }

            public final hE.a.c.e a() {
               return new hE.a.c.e(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
            }

            public final boolean b() {
               return !this._pointerFieldIsNull(0);
            }

            public final org.capnproto.Data.Builder c() {
               return (org.capnproto.Data.Builder)this._getPointerField(Data.factory, 0, null, 0, 0);
            }

            public final void a(org.capnproto.Data.Reader var1) {
               this._setPointerField(Data.factory, 0, var1);
            }

            public final void a(byte[] var1) {
               this._setPointerField(Data.factory, 0, new org.capnproto.Data.Reader(var1));
            }

            public final org.capnproto.Data.Builder a(int var1) {
               return (org.capnproto.Data.Builder)this._initPointerField(Data.factory, 0, var1);
            }

            public final hE.a.c.b.a d() {
               return new hE.a.c.b.a(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
            }

            public final hE.a.c.b.a e() {
               this._setShortField(0, (short)0);
               this._clearPointerField(1);
               return new hE.a.c.b.a(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
            }
         }

         public static class b {
            public static final StructSize a = new StructSize((short)1, (short)2);
            public static final hE.a.c.b.b b = new hE.a.c.b.b();
            public static final Factory<hE.a.c.b.a, hE.a.c.b.c> c = new Factory(b);

            public static final class a extends StructBuilder {
               a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
                  super(var1, var2, var3, var4, var5);
               }

               public hE.a.c.b.d a() {
                  switch(this._getShortField(0)) {
                     case 0:
                        return hE.a.c.b.d.FEATHER;
                     case 1:
                        return hE.a.c.b.d.OTHER;
                     default:
                        return hE.a.c.b.d._NOT_IN_SCHEMA;
                  }
               }

               public final hE.a.c.b.c b() {
                  return new hE.a.c.b.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
               }

               public final boolean c() {
                  return this.a() == hE.a.c.b.d.FEATHER;
               }

               public final hE.a.c.d.a d() {
                  assert this.a() == hE.a.c.b.d.FEATHER : "Must check which() before get()ing a union member.";

                  return (hE.a.c.d.a)this._getPointerField(hE.a.c.d.b, 1, null, 0);
               }

               public final void a(hE.a.c.d.d var1) {
                  this._setShortField(0, (short)hE.a.c.b.d.FEATHER.ordinal());
                  this._setPointerField(hE.a.c.d.b, 1, var1);
               }

               public final hE.a.c.d.a e() {
                  this._setShortField(0, (short)hE.a.c.b.d.FEATHER.ordinal());
                  return (hE.a.c.d.a)this._initPointerField(hE.a.c.d.b, 1, 0);
               }

               public final boolean f() {
                  return this.a() == hE.a.c.b.d.OTHER;
               }

               public final Void g() {
                  assert this.a() == hE.a.c.b.d.OTHER : "Must check which() before get()ing a union member.";

                  return Void.VOID;
               }

               public final void a(Void var1) {
                  this._setShortField(0, (short)hE.a.c.b.d.OTHER.ordinal());
               }
            }

            public static final class b extends StructFactory<hE.a.c.b.a, hE.a.c.b.c> {
               public final hE.a.c.b.c a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
                  return new hE.a.c.b.c(var1, var2, var3, var4, var5, var6);
               }

               public final hE.a.c.b.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
                  return new hE.a.c.b.a(var1, var2, var3, var4, var5);
               }

               public final StructSize structSize() {
                  return hE.a.c.b.a;
               }

               public final hE.a.c.b.c a(hE.a.c.b.a var1) {
                  return var1.b();
               }
            }

            public static final class c extends StructReader {
               c(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
                  super(var1, var2, var3, var4, var5, var6);
               }

               public hE.a.c.b.d a() {
                  switch(this._getShortField(0)) {
                     case 0:
                        return hE.a.c.b.d.FEATHER;
                     case 1:
                        return hE.a.c.b.d.OTHER;
                     default:
                        return hE.a.c.b.d._NOT_IN_SCHEMA;
                  }
               }

               public final boolean b() {
                  return this.a() == hE.a.c.b.d.FEATHER;
               }

               public boolean c() {
                  return !this._pointerFieldIsNull(1);
               }

               public hE.a.c.d.d d() {
                  assert this.a() == hE.a.c.b.d.FEATHER : "Must check which() before get()ing a union member.";

                  return (hE.a.c.d.d)this._getPointerField(hE.a.c.d.b, 1, null, 0);
               }

               public final boolean e() {
                  return this.a() == hE.a.c.b.d.OTHER;
               }

               public final Void f() {
                  assert this.a() == hE.a.c.b.d.OTHER : "Must check which() before get()ing a union member.";

                  return Void.VOID;
               }
            }

            public static enum d {
               FEATHER,
               OTHER,
               _NOT_IN_SCHEMA;
            }
         }

         public static final class c extends StructFactory<hE.a.c.a, hE.a.c.e> {
            public final hE.a.c.e a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
               return new hE.a.c.e(var1, var2, var3, var4, var5, var6);
            }

            public final hE.a.c.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
               return new hE.a.c.a(var1, var2, var3, var4, var5);
            }

            public final StructSize structSize() {
               return hE.a.c.a;
            }

            public final hE.a.c.e a(hE.a.c.a var1) {
               return var1.a();
            }
         }

         public static class d {
            public static final StructSize a = new StructSize((short)1, (short)0);
            public static final hE.a.c.d.b b = new hE.a.c.d.b();
            public static final Factory<hE.a.c.d.a, hE.a.c.d.d> c = new Factory(b);

            public static final class a extends StructBuilder {
               a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
                  super(var1, var2, var3, var4, var5);
               }

               public final hE.a.c.d.d a() {
                  return new hE.a.c.d.d(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
               }

               public final hE.a.c.d.c b() {
                  switch(this._getShortField(0)) {
                     case 0:
                        return hE.a.c.d.c.OWNER;
                     case 1:
                        return hE.a.c.d.c.DEVELOPER;
                     case 2:
                        return hE.a.c.d.c.STAFF;
                     case 3:
                        return hE.a.c.d.c.PARTNER;
                     case 4:
                        return hE.a.c.d.c.CREATOR;
                     case 5:
                        return hE.a.c.d.c.PRO;
                     case 6:
                        return hE.a.c.d.c.USER;
                     default:
                        return hE.a.c.d.c._NOT_IN_SCHEMA;
                  }
               }

               public final void a(hE.a.c.d.c var1) {
                  this._setShortField(0, (short)var1.ordinal());
               }
            }

            public static final class b extends StructFactory<hE.a.c.d.a, hE.a.c.d.d> {
               public final hE.a.c.d.d a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
                  return new hE.a.c.d.d(var1, var2, var3, var4, var5, var6);
               }

               public final hE.a.c.d.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
                  return new hE.a.c.d.a(var1, var2, var3, var4, var5);
               }

               public final StructSize structSize() {
                  return hE.a.c.d.a;
               }

               public final hE.a.c.d.d a(hE.a.c.d.a var1) {
                  return var1.a();
               }
            }

            public static enum c {
               OWNER,
               DEVELOPER,
               STAFF,
               PARTNER,
               CREATOR,
               PRO,
               USER,
               _NOT_IN_SCHEMA;
            }

            public static final class d extends StructReader {
               d(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
                  super(var1, var2, var3, var4, var5, var6);
               }

               public final hE.a.c.d.c a() {
                  switch(this._getShortField(0)) {
                     case 0:
                        return hE.a.c.d.c.OWNER;
                     case 1:
                        return hE.a.c.d.c.DEVELOPER;
                     case 2:
                        return hE.a.c.d.c.STAFF;
                     case 3:
                        return hE.a.c.d.c.PARTNER;
                     case 4:
                        return hE.a.c.d.c.CREATOR;
                     case 5:
                        return hE.a.c.d.c.PRO;
                     case 6:
                        return hE.a.c.d.c.USER;
                     default:
                        return hE.a.c.d.c._NOT_IN_SCHEMA;
                  }
               }
            }
         }

         public static final class e extends StructReader {
            e(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
               super(var1, var2, var3, var4, var5, var6);
            }

            public boolean a() {
               return !this._pointerFieldIsNull(0);
            }

            public org.capnproto.Data.Reader b() {
               return (org.capnproto.Data.Reader)this._getPointerField(Data.factory, 0, null, 0, 0);
            }

            public hE.a.c.b.c c() {
               return new hE.a.c.b.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, this.nestingLimit);
            }
         }
      }

      public static final class d extends StructReader {
         d(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            super(var1, var2, var3, var4, var5, var6);
         }

         public final boolean a() {
            return !this._pointerFieldIsNull(0);
         }

         public final Reader<hE.a.c.e> b() {
            return (Reader<hE.a.c.e>)this._getPointerField(hE.a.c.c, 0, null, 0);
         }
      }
   }

   public static class b {
      public static final StructSize a = new StructSize((short)0, (short)1);
      public static final hE.b.b b = new hE.b.b();
      public static final Factory<hE.b.a, hE.b.c> c = new Factory(b);

      public static final class a extends StructBuilder {
         a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            super(var1, var2, var3, var4, var5);
         }

         public final hE.b.c a() {
            return new hE.b.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
         }

         public final boolean b() {
            return !this._pointerFieldIsNull(0);
         }

         public final org.capnproto.TextList.Builder c() {
            return (org.capnproto.TextList.Builder)this._getPointerField(TextList.factory, 0, null, 0);
         }

         public final void a(org.capnproto.TextList.Reader var1) {
            this._setPointerField(TextList.factory, 0, var1);
         }

         public final org.capnproto.TextList.Builder a(int var1) {
            return (org.capnproto.TextList.Builder)this._initPointerField(TextList.factory, 0, var1);
         }
      }

      public static final class b extends StructFactory<hE.b.a, hE.b.c> {
         public final hE.b.c a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return new hE.b.c(var1, var2, var3, var4, var5, var6);
         }

         public final hE.b.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return new hE.b.a(var1, var2, var3, var4, var5);
         }

         public final StructSize structSize() {
            return hE.b.a;
         }

         public final hE.b.c a(hE.b.a var1) {
            return var1.a();
         }
      }

      public static final class c extends StructReader {
         c(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            super(var1, var2, var3, var4, var5, var6);
         }

         public final boolean a() {
            return !this._pointerFieldIsNull(0);
         }

         public final org.capnproto.TextList.Reader b() {
            return (org.capnproto.TextList.Reader)this._getPointerField(TextList.factory, 0, null, 0);
         }
      }
   }

   public static class c {
      public static final StructSize a = new StructSize((short)0, (short)1);
      public static final hE.c.c b = new hE.c.c();
      public static final Factory<hE.c.a, hE.c.d> c = new Factory(b);

      public static final class a extends StructBuilder {
         a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            super(var1, var2, var3, var4, var5);
         }

         public final hE.c.d a() {
            return new hE.c.d(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
         }

         public final boolean b() {
            return !this._pointerFieldIsNull(0);
         }

         public final Builder<hE.c.b.a> c() {
            return (Builder<hE.c.b.a>)this._getPointerField(hE.c.b.c, 0, null, 0);
         }

         public final void a(Reader<hE.c.b.c> var1) {
            this._setPointerField(hE.c.b.c, 0, var1);
         }

         public final Builder<hE.c.b.a> a(int var1) {
            return (Builder<hE.c.b.a>)this._initPointerField(hE.c.b.c, 0, var1);
         }
      }

      public static class b {
         public static final StructSize a = new StructSize((short)0, (short)2);
         public static final hE.c.b.b b = new hE.c.b.b();
         public static final Factory<hE.c.b.a, hE.c.b.c> c = new Factory(b);

         public static final class a extends StructBuilder {
            a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
               super(var1, var2, var3, var4, var5);
            }

            public final hE.c.b.c a() {
               return new hE.c.b.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
            }

            public final boolean b() {
               return !this._pointerFieldIsNull(0);
            }

            public final org.capnproto.Data.Builder c() {
               return (org.capnproto.Data.Builder)this._getPointerField(Data.factory, 0, null, 0, 0);
            }

            public final void a(org.capnproto.Data.Reader var1) {
               this._setPointerField(Data.factory, 0, var1);
            }

            public final void a(byte[] var1) {
               this._setPointerField(Data.factory, 0, new org.capnproto.Data.Reader(var1));
            }

            public final org.capnproto.Data.Builder a(int var1) {
               return (org.capnproto.Data.Builder)this._initPointerField(Data.factory, 0, var1);
            }

            public final boolean d() {
               return !this._pointerFieldIsNull(1);
            }

            public final org.capnproto.TextList.Builder e() {
               return (org.capnproto.TextList.Builder)this._getPointerField(TextList.factory, 1, null, 0);
            }

            public final void a(org.capnproto.TextList.Reader var1) {
               this._setPointerField(TextList.factory, 1, var1);
            }

            public final org.capnproto.TextList.Builder b(int var1) {
               return (org.capnproto.TextList.Builder)this._initPointerField(TextList.factory, 1, var1);
            }
         }

         public static final class b extends StructFactory<hE.c.b.a, hE.c.b.c> {
            public final hE.c.b.c a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
               return new hE.c.b.c(var1, var2, var3, var4, var5, var6);
            }

            public final hE.c.b.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
               return new hE.c.b.a(var1, var2, var3, var4, var5);
            }

            public final StructSize structSize() {
               return hE.c.b.a;
            }

            public final hE.c.b.c a(hE.c.b.a var1) {
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

            public org.capnproto.Data.Reader b() {
               return (org.capnproto.Data.Reader)this._getPointerField(Data.factory, 0, null, 0, 0);
            }

            public final boolean c() {
               return !this._pointerFieldIsNull(1);
            }

            public final org.capnproto.TextList.Reader d() {
               return (org.capnproto.TextList.Reader)this._getPointerField(TextList.factory, 1, null, 0);
            }
         }
      }

      public static final class c extends StructFactory<hE.c.a, hE.c.d> {
         public final hE.c.d a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return new hE.c.d(var1, var2, var3, var4, var5, var6);
         }

         public final hE.c.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return new hE.c.a(var1, var2, var3, var4, var5);
         }

         public final StructSize structSize() {
            return hE.c.a;
         }

         public final hE.c.d a(hE.c.a var1) {
            return var1.a();
         }
      }

      public static final class d extends StructReader {
         d(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            super(var1, var2, var3, var4, var5, var6);
         }

         public final boolean a() {
            return !this._pointerFieldIsNull(0);
         }

         public final Reader<hE.c.b.c> b() {
            return (Reader<hE.c.b.c>)this._getPointerField(hE.c.b.c, 0, null, 0);
         }
      }
   }

   public static class d {
      public static final StructSize a = new StructSize((short)0, (short)2);
      public static final hE.d.b b = new hE.d.b();
      public static final Factory<hE.d.a, hE.d.c> c = new Factory(b);

      public static final class a extends StructBuilder {
         a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            super(var1, var2, var3, var4, var5);
         }

         public final hE.d.c a() {
            return new hE.d.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
         }

         public final boolean b() {
            return !this._pointerFieldIsNull(0);
         }

         public final org.capnproto.Data.Builder c() {
            return (org.capnproto.Data.Builder)this._getPointerField(Data.factory, 0, null, 0, 0);
         }

         public final void a(org.capnproto.Data.Reader var1) {
            this._setPointerField(Data.factory, 0, var1);
         }

         public final void a(byte[] var1) {
            this._setPointerField(Data.factory, 0, new org.capnproto.Data.Reader(var1));
         }

         public final org.capnproto.Data.Builder a(int var1) {
            return (org.capnproto.Data.Builder)this._initPointerField(Data.factory, 0, var1);
         }

         public final boolean d() {
            return !this._pointerFieldIsNull(1);
         }

         public final org.capnproto.Text.Builder e() {
            return (org.capnproto.Text.Builder)this._getPointerField(Text.factory, 1, null, 0, 0);
         }

         public final void a(org.capnproto.Text.Reader var1) {
            this._setPointerField(Text.factory, 1, var1);
         }

         public final void a(String var1) {
            this._setPointerField(Text.factory, 1, new org.capnproto.Text.Reader(var1));
         }

         public final org.capnproto.Text.Builder b(int var1) {
            return (org.capnproto.Text.Builder)this._initPointerField(Text.factory, 1, var1);
         }
      }

      public static final class b extends StructFactory<hE.d.a, hE.d.c> {
         public final hE.d.c a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return new hE.d.c(var1, var2, var3, var4, var5, var6);
         }

         public final hE.d.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return new hE.d.a(var1, var2, var3, var4, var5);
         }

         public final StructSize structSize() {
            return hE.d.a;
         }

         public final hE.d.c a(hE.d.a var1) {
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

         public org.capnproto.Data.Reader b() {
            return (org.capnproto.Data.Reader)this._getPointerField(Data.factory, 0, null, 0, 0);
         }

         public boolean c() {
            return !this._pointerFieldIsNull(1);
         }

         public org.capnproto.Text.Reader d() {
            return (org.capnproto.Text.Reader)this._getPointerField(Text.factory, 1, null, 0, 0);
         }
      }
   }

   public static class e {
      public static final StructSize a = new StructSize((short)0, (short)1);
      public static final hE.e.b b = new hE.e.b();
      public static final Factory<hE.e.a, hE.e.c> c = new Factory(b);

      public static final class a extends StructBuilder {
         a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            super(var1, var2, var3, var4, var5);
         }

         public final hE.e.c a() {
            return new hE.e.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
         }

         public final boolean b() {
            return !this._pointerFieldIsNull(0);
         }

         public final org.capnproto.Data.Builder c() {
            return (org.capnproto.Data.Builder)this._getPointerField(Data.factory, 0, null, 0, 0);
         }

         public final void a(org.capnproto.Data.Reader var1) {
            this._setPointerField(Data.factory, 0, var1);
         }

         public final void a(byte[] var1) {
            this._setPointerField(Data.factory, 0, new org.capnproto.Data.Reader(var1));
         }

         public final org.capnproto.Data.Builder a(int var1) {
            return (org.capnproto.Data.Builder)this._initPointerField(Data.factory, 0, var1);
         }
      }

      public static final class b extends StructFactory<hE.e.a, hE.e.c> {
         public final hE.e.c a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return new hE.e.c(var1, var2, var3, var4, var5, var6);
         }

         public final hE.e.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return new hE.e.a(var1, var2, var3, var4, var5);
         }

         public final StructSize structSize() {
            return hE.e.a;
         }

         public final hE.e.c a(hE.e.a var1) {
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

         public org.capnproto.Data.Reader b() {
            return (org.capnproto.Data.Reader)this._getPointerField(Data.factory, 0, null, 0, 0);
         }
      }
   }

   public static class f {
      public static final StructSize a = new StructSize((short)0, (short)2);
      public static final hE.f.b b = new hE.f.b();
      public static final Factory<hE.f.a, hE.f.c> c = new Factory(b);

      public static final class a extends StructBuilder {
         a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            super(var1, var2, var3, var4, var5);
         }

         public final hE.f.c a() {
            return new hE.f.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
         }

         public final boolean b() {
            return !this._pointerFieldIsNull(0);
         }

         public final org.capnproto.Data.Builder c() {
            return (org.capnproto.Data.Builder)this._getPointerField(Data.factory, 0, null, 0, 0);
         }

         public final void a(org.capnproto.Data.Reader var1) {
            this._setPointerField(Data.factory, 0, var1);
         }

         public final void a(byte[] var1) {
            this._setPointerField(Data.factory, 0, new org.capnproto.Data.Reader(var1));
         }

         public final org.capnproto.Data.Builder a(int var1) {
            return (org.capnproto.Data.Builder)this._initPointerField(Data.factory, 0, var1);
         }

         public final hG.a.a d() {
            return (hG.a.a)this._getPointerField(hG.a.b, 1, null, 0);
         }

         public final void a(hG.a.c var1) {
            this._setPointerField(hG.a.b, 1, var1);
         }

         public final hG.a.a e() {
            return (hG.a.a)this._initPointerField(hG.a.b, 1, 0);
         }
      }

      public static final class b extends StructFactory<hE.f.a, hE.f.c> {
         public final hE.f.c a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return new hE.f.c(var1, var2, var3, var4, var5, var6);
         }

         public final hE.f.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return new hE.f.a(var1, var2, var3, var4, var5);
         }

         public final StructSize structSize() {
            return hE.f.a;
         }

         public final hE.f.c a(hE.f.a var1) {
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

         public org.capnproto.Data.Reader b() {
            return (org.capnproto.Data.Reader)this._getPointerField(Data.factory, 0, null, 0, 0);
         }

         public boolean c() {
            return !this._pointerFieldIsNull(1);
         }

         public hG.a.c d() {
            return (hG.a.c)this._getPointerField(hG.a.b, 1, null, 0);
         }
      }
   }

   public static class g {
      public static final StructSize a = new StructSize((short)0, (short)2);
      public static final hE.g.b b = new hE.g.b();
      public static final Factory<hE.g.a, hE.g.c> c = new Factory(b);

      public static final class a extends StructBuilder {
         a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            super(var1, var2, var3, var4, var5);
         }

         public final hE.g.c a() {
            return new hE.g.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
         }

         public final boolean b() {
            return !this._pointerFieldIsNull(0);
         }

         public final org.capnproto.Data.Builder c() {
            return (org.capnproto.Data.Builder)this._getPointerField(Data.factory, 0, null, 0, 0);
         }

         public final void a(org.capnproto.Data.Reader var1) {
            this._setPointerField(Data.factory, 0, var1);
         }

         public final void a(byte[] var1) {
            this._setPointerField(Data.factory, 0, new org.capnproto.Data.Reader(var1));
         }

         public final org.capnproto.Data.Builder a(int var1) {
            return (org.capnproto.Data.Builder)this._initPointerField(Data.factory, 0, var1);
         }

         public final hG.a.a d() {
            return (hG.a.a)this._getPointerField(hG.a.b, 1, null, 0);
         }

         public final void a(hG.a.c var1) {
            this._setPointerField(hG.a.b, 1, var1);
         }

         public final hG.a.a e() {
            return (hG.a.a)this._initPointerField(hG.a.b, 1, 0);
         }
      }

      public static final class b extends StructFactory<hE.g.a, hE.g.c> {
         public final hE.g.c a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return new hE.g.c(var1, var2, var3, var4, var5, var6);
         }

         public final hE.g.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return new hE.g.a(var1, var2, var3, var4, var5);
         }

         public final StructSize structSize() {
            return hE.g.a;
         }

         public final hE.g.c a(hE.g.a var1) {
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

         public org.capnproto.Data.Reader b() {
            return (org.capnproto.Data.Reader)this._getPointerField(Data.factory, 0, null, 0, 0);
         }

         public boolean c() {
            return !this._pointerFieldIsNull(1);
         }

         public hG.a.c d() {
            return (hG.a.c)this._getPointerField(hG.a.b, 1, null, 0);
         }
      }
   }

   public static class h {
      public static final StructSize a = new StructSize((short)1, (short)2);
      public static final hE.h.b b = new hE.h.b();
      public static final Factory<hE.h.a, hE.h.c> c = new Factory(b);

      public static final class a extends StructBuilder {
         a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            super(var1, var2, var3, var4, var5);
         }

         public final hE.h.c a() {
            return new hE.h.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
         }

         public final boolean b() {
            return !this._pointerFieldIsNull(0);
         }

         public final org.capnproto.Data.Builder c() {
            return (org.capnproto.Data.Builder)this._getPointerField(Data.factory, 0, null, 0, 0);
         }

         public final void a(org.capnproto.Data.Reader var1) {
            this._setPointerField(Data.factory, 0, var1);
         }

         public final void a(byte[] var1) {
            this._setPointerField(Data.factory, 0, new org.capnproto.Data.Reader(var1));
         }

         public final org.capnproto.Data.Builder a(int var1) {
            return (org.capnproto.Data.Builder)this._initPointerField(Data.factory, 0, var1);
         }

         public final boolean d() {
            return !this._pointerFieldIsNull(1);
         }

         public final org.capnproto.DataList.Builder e() {
            return (org.capnproto.DataList.Builder)this._getPointerField(DataList.factory, 1, null, 0);
         }

         public final void a(org.capnproto.DataList.Reader var1) {
            this._setPointerField(DataList.factory, 1, var1);
         }

         public final org.capnproto.DataList.Builder b(int var1) {
            return (org.capnproto.DataList.Builder)this._initPointerField(DataList.factory, 1, var1);
         }

         public final hG.b f() {
            switch(this._getShortField(0)) {
               case 0:
                  return hG.b.EVERYONE;
               case 1:
                  return hG.b.PROXIMITY;
               default:
                  return hG.b._NOT_IN_SCHEMA;
            }
         }

         public final void a(hG.b var1) {
            this._setShortField(0, (short)var1.ordinal());
         }
      }

      public static final class b extends StructFactory<hE.h.a, hE.h.c> {
         public final hE.h.c a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return new hE.h.c(var1, var2, var3, var4, var5, var6);
         }

         public final hE.h.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return new hE.h.a(var1, var2, var3, var4, var5);
         }

         public final StructSize structSize() {
            return hE.h.a;
         }

         public final hE.h.c a(hE.h.a var1) {
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

         public org.capnproto.Data.Reader b() {
            return (org.capnproto.Data.Reader)this._getPointerField(Data.factory, 0, null, 0, 0);
         }

         public final boolean c() {
            return !this._pointerFieldIsNull(1);
         }

         public final org.capnproto.DataList.Reader d() {
            return (org.capnproto.DataList.Reader)this._getPointerField(DataList.factory, 1, null, 0);
         }

         public final hG.b e() {
            switch(this._getShortField(0)) {
               case 0:
                  return hG.b.EVERYONE;
               case 1:
                  return hG.b.PROXIMITY;
               default:
                  return hG.b._NOT_IN_SCHEMA;
            }
         }
      }
   }

   public static class i {
      public static final StructSize a = new StructSize((short)1, (short)1);
      public static final hE.i.b b = new hE.i.b();
      public static final Factory<hE.i.a, hE.i.c> c = new Factory(b);

      public static final class a extends StructBuilder {
         a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            super(var1, var2, var3, var4, var5);
         }

         public final hE.i.c a() {
            return new hE.i.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
         }

         public final int b() {
            return this._getIntField(0);
         }

         public final void a(int var1) {
            this._setIntField(0, var1);
         }

         public final boolean c() {
            return !this._pointerFieldIsNull(0);
         }

         public final org.capnproto.Data.Builder d() {
            return (org.capnproto.Data.Builder)this._getPointerField(Data.factory, 0, null, 0, 0);
         }

         public final void a(org.capnproto.Data.Reader var1) {
            this._setPointerField(Data.factory, 0, var1);
         }

         public final void a(byte[] var1) {
            this._setPointerField(Data.factory, 0, new org.capnproto.Data.Reader(var1));
         }

         public final org.capnproto.Data.Builder b(int var1) {
            return (org.capnproto.Data.Builder)this._initPointerField(Data.factory, 0, var1);
         }
      }

      public static final class b extends StructFactory<hE.i.a, hE.i.c> {
         public final hE.i.c a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return new hE.i.c(var1, var2, var3, var4, var5, var6);
         }

         public final hE.i.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return new hE.i.a(var1, var2, var3, var4, var5);
         }

         public final StructSize structSize() {
            return hE.i.a;
         }

         public final hE.i.c a(hE.i.a var1) {
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

         public boolean b() {
            return !this._pointerFieldIsNull(0);
         }

         public org.capnproto.Data.Reader c() {
            return (org.capnproto.Data.Reader)this._getPointerField(Data.factory, 0, null, 0, 0);
         }
      }
   }

   public static class j {
      public static final StructSize a = new StructSize((short)0, (short)1);
      public static final hE.j.b b = new hE.j.b();
      public static final Factory<hE.j.a, hE.j.c> c = new Factory(b);

      public static final class a extends StructBuilder {
         a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            super(var1, var2, var3, var4, var5);
         }

         public final hE.j.c a() {
            return new hE.j.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
         }

         public final boolean b() {
            return !this._pointerFieldIsNull(0);
         }

         public final org.capnproto.Data.Builder c() {
            return (org.capnproto.Data.Builder)this._getPointerField(Data.factory, 0, null, 0, 0);
         }

         public final void a(org.capnproto.Data.Reader var1) {
            this._setPointerField(Data.factory, 0, var1);
         }

         public final void a(byte[] var1) {
            this._setPointerField(Data.factory, 0, new org.capnproto.Data.Reader(var1));
         }

         public final org.capnproto.Data.Builder a(int var1) {
            return (org.capnproto.Data.Builder)this._initPointerField(Data.factory, 0, var1);
         }
      }

      public static final class b extends StructFactory<hE.j.a, hE.j.c> {
         public final hE.j.c a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return new hE.j.c(var1, var2, var3, var4, var5, var6);
         }

         public final hE.j.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return new hE.j.a(var1, var2, var3, var4, var5);
         }

         public final StructSize structSize() {
            return hE.j.a;
         }

         public final hE.j.c a(hE.j.a var1) {
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

         public org.capnproto.Data.Reader b() {
            return (org.capnproto.Data.Reader)this._getPointerField(Data.factory, 0, null, 0, 0);
         }
      }
   }

   public static class k {
      public static final StructSize a = new StructSize((short)0, (short)0);
      public static final hE.k.b b = new hE.k.b();
      public static final Factory<hE.k.a, hE.k.c> c = new Factory(b);

      public static final class a extends StructBuilder {
         a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            super(var1, var2, var3, var4, var5);
         }

         public final hE.k.c a() {
            return new hE.k.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
         }
      }

      public static final class b extends StructFactory<hE.k.a, hE.k.c> {
         public final hE.k.c a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return new hE.k.c(var1, var2, var3, var4, var5, var6);
         }

         public final hE.k.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return new hE.k.a(var1, var2, var3, var4, var5);
         }

         public final StructSize structSize() {
            return hE.k.a;
         }

         public final hE.k.c a(hE.k.a var1) {
            return var1.a();
         }
      }

      public static final class c extends StructReader {
         c(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            super(var1, var2, var3, var4, var5, var6);
         }
      }
   }

   public static final class l {
      public static final SegmentReader a = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u00000\u0088\u009auÀ\u009e\u0085·#\u0000\u0000\u0000\u0001\u0000\u0001\u0000é1ÀÖ\tÙðÈ\u0001\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000Z\u0001\u0000\u0000)\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000%\u0000\u0000\u0000?\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/clientbound_wrapper.capnp:Wrapper\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000ñaís\u009f«;\u008c\r\u0000\u0000\u0000Z\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000packetType\u0000\u0000\u0000\u0000\u0000\u0000"
      );
      public static final SegmentReader b = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000ñaís\u009f«;\u008c+\u0000\u0000\u0000\u0001\u0000\u0001\u00000\u0088\u009auÀ\u009e\u0085·\u0001\u0000\u0007\u0000\u0001\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000²\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000%\u0000\u0000\u0000ß\u0002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/clientbound_wrapper.capnp:Wrapper.packetType\u0000\u0000\u00004\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000ÿÿ\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000]\u0001\u0000\u0000²\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000`\u0001\u0000\u0000\u0003\u0000\u0001\u0000l\u0001\u0000\u0000\u0002\u0000\u0001\u0000\u0001\u0000þÿ\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000i\u0001\u0000\u0000R\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000h\u0001\u0000\u0000\u0003\u0000\u0001\u0000t\u0001\u0000\u0000\u0002\u0000\u0001\u0000\u0002\u0000ýÿ\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000q\u0001\u0000\u0000b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000p\u0001\u0000\u0000\u0003\u0000\u0001\u0000|\u0001\u0000\u0000\u0002\u0000\u0001\u0000\u0003\u0000üÿ\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0003\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000y\u0001\u0000\u0000¢\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000|\u0001\u0000\u0000\u0003\u0000\u0001\u0000\u0088\u0001\u0000\u0000\u0002\u0000\u0001\u0000\u0004\u0000ûÿ\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0085\u0001\u0000\u0000\u009a\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0088\u0001\u0000\u0000\u0003\u0000\u0001\u0000\u0094\u0001\u0000\u0000\u0002\u0000\u0001\u0000\u0005\u0000úÿ\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0005\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0091\u0001\u0000\u0000b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0090\u0001\u0000\u0000\u0003\u0000\u0001\u0000\u009c\u0001\u0000\u0000\u0002\u0000\u0001\u0000\u0006\u0000ùÿ\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0006\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0099\u0001\u0000\u0000r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0098\u0001\u0000\u0000\u0003\u0000\u0001\u0000¤\u0001\u0000\u0000\u0002\u0000\u0001\u0000\u0007\u0000øÿ\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000¡\u0001\u0000\u0000R\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000 \u0001\u0000\u0000\u0003\u0000\u0001\u0000¬\u0001\u0000\u0000\u0002\u0000\u0001\u0000\b\u0000÷ÿ\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000©\u0001\u0000\u0000b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000¨\u0001\u0000\u0000\u0003\u0000\u0001\u0000´\u0001\u0000\u0000\u0002\u0000\u0001\u0000\t\u0000öÿ\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\t\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000±\u0001\u0000\u0000\u0092\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000´\u0001\u0000\u0000\u0003\u0000\u0001\u0000À\u0001\u0000\u0000\u0002\u0000\u0001\u0000\n\u0000õÿ\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\n\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000½\u0001\u0000\u0000Z\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000¼\u0001\u0000\u0000\u0003\u0000\u0001\u0000È\u0001\u0000\u0000\u0002\u0000\u0001\u0000\u000b\u0000ôÿ\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u000b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000Å\u0001\u0000\u0000z\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000Ä\u0001\u0000\u0000\u0003\u0000\u0001\u0000Ð\u0001\u0000\u0000\u0002\u0000\u0001\u0000\f\u0000óÿ\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000Í\u0001\u0000\u0000\u0082\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000Ì\u0001\u0000\u0000\u0003\u0000\u0001\u0000Ø\u0001\u0000\u0000\u0002\u0000\u0001\u0000authenticationSuccess\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000softError\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000w]\u0006¦¸\u0006\u009dî\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000emoteUpdate\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000qÆì¨\u0081\u0088c\u009e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000optionRefreshPrompt\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000*ECÓÕÅy¯\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000bulkOptionResponse\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000u}I\u0081mD6Æ\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000cosmeticSet\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000ð\u0016,ô×j\u0092\u0092\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000cosmeticOwned\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000kñ'\u001d¼Ê]Ô\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000partyInfo\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000ù\u0014n\u000eý\u000f¡å\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000partyInvite\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00878\u00ad.H²e\u0093\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000partyInviteDenied\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0082\u009c]\u001a\u0007êGÝ\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000partyLeave\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0019:A&vûR¤\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000p2pJoinRequest\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0099ìóhlç¤Ê\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000p2pJoinAccepted\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\"º(ð¿½Dü\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
      );
      public static final SegmentReader c = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000w]\u0006¦¸\u0006\u009dî#\u0000\u0000\u0000\u0001\u0000\u0000\u0000é1ÀÖ\tÙðÈ\u0001\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000j\u0001\u0000\u0000)\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000%\u0000\u0000\u0000?\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/clientbound_wrapper.capnp:SoftError\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000B\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\b\u0000\u0000\u0000\u0003\u0000\u0001\u0000\u0014\u0000\u0000\u0000\u0002\u0000\u0001\u0000message\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
      );
      public static final SegmentReader d = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000qÆì¨\u0081\u0088c\u009e#\u0000\u0000\u0000\u0001\u0000\u0000\u0000é1ÀÖ\tÙðÈ\u0002\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000z\u0001\u0000\u0000)\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000%\u0000\u0000\u0000w\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/clientbound_wrapper.capnp:EmoteUpdate\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\b\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000*\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000$\u0000\u0000\u0000\u0003\u0000\u0001\u00000\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000-\u0000\u0000\u0000*\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000(\u0000\u0000\u0000\u0003\u0000\u0001\u00004\u0000\u0000\u0000\u0002\u0000\u0001\u0000uuid\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000slug\u0000\u0000\u0000\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
      );
      public static final SegmentReader e = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000*ECÓÕÅy¯#\u0000\u0000\u0000\u0001\u0000\u0000\u0000é1ÀÖ\tÙðÈ\u0001\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000º\u0001\u0000\u0000-\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000?\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/clientbound_wrapper.capnp:OptionRefreshPrompt\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000*\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\b\u0000\u0000\u0000\u0003\u0000\u0001\u0000\u0014\u0000\u0000\u0000\u0002\u0000\u0001\u0000uuid\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
      );
      public static final SegmentReader f = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000u}I\u0081mD6Æ#\u0000\u0000\u0000\u0001\u0000\u0000\u0000é1ÀÖ\tÙðÈ\u0001\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000²\u0001\u0000\u0000-\u0000\u0000\u0000\u0017\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00009\u0000\u0000\u0000?\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/clientbound_wrapper.capnp:BulkOptionResponse\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0007³\u009d$Xeîù\u0001\u0000\u0000\u0000z\u0000\u0000\u0000OptionResponse\u0000\u0000\u0004\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000R\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\f\u0000\u0000\u0000\u0003\u0000\u0001\u0000(\u0000\u0000\u0000\u0002\u0000\u0001\u0000responses\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0003\u0000\u0001\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0007³\u009d$Xeîù\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
      );
      public static final SegmentReader g = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000\u0007³\u009d$Xeîù6\u0000\u0000\u0000\u0001\u0000\u0001\u0000u}I\u0081mD6Æ\u0002\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000*\u0002\u0000\u00005\u0000\u0000\u0000\u0017\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000=\u0000\u0000\u0000w\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/clientbound_wrapper.capnp:BulkOptionResponse.OptionResponse\u0000\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0001\u0000\u0001\u0000Fë\f·ö\u008a\u009dÓ\u0001\u0000\u0000\u0000:\u0000\u0000\u0000Option\u0000\u0000\b\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000*\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000$\u0000\u0000\u0000\u0003\u0000\u0001\u00000\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000®\u008b\u000eöL`õ«-\u0000\u0000\u0000Z\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000uuid\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000clientType\u0000\u0000\u0000\u0000\u0000\u0000"
      );
      public static final SegmentReader h = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000Fë\f·ö\u008a\u009dÓE\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0007³\u009d$Xeîù\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000b\u0002\u0000\u00009\u0000\u0000\u0000\u0017\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000E\u0000\u0000\u0000?\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/clientbound_wrapper.capnp:BulkOptionResponse.OptionResponse.Option\u0000\u0000\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0001\u0000\u0001\u0000m\u0015\u00ad\u0095/\b\u009f©\u0001\u0000\u0000\u0000J\u0000\u0000\u0000IconType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000*\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\b\u0000\u0000\u0000\u0003\u0000\u0001\u0000\u0014\u0000\u0000\u0000\u0002\u0000\u0001\u0000icon\u0000\u0000\u0000\u0000\u000f\u0000\u0000\u0000\u0000\u0000\u0000\u0000m\u0015\u00ad\u0095/\b\u009f©\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u000f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
      );
      public static final SegmentReader i = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000m\u0015\u00ad\u0095/\b\u009f©L\u0000\u0000\u0000\u0002\u0000\u0000\u0000Fë\f·ö\u008a\u009dÓ\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000ª\u0002\u0000\u0000=\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00009\u0000\u0000\u0000¯\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/clientbound_wrapper.capnp:BulkOptionResponse.OptionResponse.Option.IconType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u001c\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000M\u0000\u0000\u00002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000E\u0000\u0000\u0000R\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0000\u0000\u0000\u0000A\u0000\u0000\u00002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0000\u0000\u0000\u00009\u0000\u0000\u0000B\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u00001\u0000\u0000\u0000B\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0005\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000\"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0006\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0000\u0000\u0000*\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000owner\u0000\u0000\u0000developer\u0000\u0000\u0000\u0000\u0000\u0000\u0000staff\u0000\u0000\u0000partner\u0000creator\u0000pro\u0000\u0000\u0000\u0000\u0000user\u0000\u0000\u0000\u0000"
      );
      public static final SegmentReader j = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000®\u008b\u000eöL`õ«E\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0007³\u009d$Xeîù\u0002\u0000\u0007\u0000\u0001\u0000\u0002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u0082\u0002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00001\u0000\u0000\u0000w\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/clientbound_wrapper.capnp:BulkOptionResponse.OptionResponse.clientType\u0000\b\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000ÿÿ\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000B\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000$\u0000\u0000\u0000\u0003\u0000\u0001\u00000\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0001\u0000þÿ\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000-\u0000\u0000\u00002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000(\u0000\u0000\u0000\u0003\u0000\u0001\u00004\u0000\u0000\u0000\u0002\u0000\u0001\u0000feather\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000Fë\f·ö\u008a\u009dÓ\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000other\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
      );
      public static final SegmentReader k = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000ð\u0016,ô×j\u0092\u0092#\u0000\u0000\u0000\u0001\u0000\u0000\u0000é1ÀÖ\tÙðÈ\u0001\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000z\u0001\u0000\u0000)\u0000\u0000\u0000\u0017\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00005\u0000\u0000\u0000?\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/clientbound_wrapper.capnp:CosmeticSet\u0000\u0000\u0004\u0000\u0000\u0000\u0001\u0000\u0001\u0000G»¡²\u0018!\u0017Ó\u0001\u0000\u0000\u0000r\u0000\u0000\u0000CosmeticEntry\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000B\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\b\u0000\u0000\u0000\u0003\u0000\u0001\u0000$\u0000\u0000\u0000\u0002\u0000\u0001\u0000updates\u0000\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0003\u0000\u0001\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000G»¡²\u0018!\u0017Ó\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
      );
      public static final SegmentReader l = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000G»¡²\u0018!\u0017Ó/\u0000\u0000\u0000\u0001\u0000\u0000\u0000ð\u0016,ô×j\u0092\u0092\u0002\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000ê\u0001\u0000\u00001\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000-\u0000\u0000\u0000w\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/clientbound_wrapper.capnp:CosmeticSet.CosmeticEntry\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\b\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000*\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000$\u0000\u0000\u0000\u0003\u0000\u0001\u00000\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000-\u0000\u0000\u00002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000(\u0000\u0000\u0000\u0003\u0000\u0001\u0000D\u0000\u0000\u0000\u0002\u0000\u0001\u0000uuid\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000slugs\u0000\u0000\u0000\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0003\u0000\u0001\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
      );
      public static final SegmentReader m = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000kñ'\u001d¼Ê]Ô#\u0000\u0000\u0000\u0001\u0000\u0000\u0000é1ÀÖ\tÙðÈ\u0001\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u008a\u0001\u0000\u0000-\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000?\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/clientbound_wrapper.capnp:CosmeticOwned\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u00002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\b\u0000\u0000\u0000\u0003\u0000\u0001\u0000$\u0000\u0000\u0000\u0002\u0000\u0001\u0000slugs\u0000\u0000\u0000\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0003\u0000\u0001\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
      );
      public static final SegmentReader n = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000ù\u0014n\u000eý\u000f¡å#\u0000\u0000\u0000\u0001\u0000\u0001\u0000é1ÀÖ\tÙðÈ\u0002\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000j\u0001\u0000\u0000)\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000%\u0000\u0000\u0000¯\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/clientbound_wrapper.capnp:PartyInfo\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\f\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000E\u0000\u0000\u00002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000@\u0000\u0000\u0000\u0003\u0000\u0001\u0000L\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000I\u0000\u0000\u0000B\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000D\u0000\u0000\u0000\u0003\u0000\u0001\u0000`\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000]\u0000\u0000\u0000Z\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\\\u0000\u0000\u0000\u0003\u0000\u0001\u0000h\u0000\u0000\u0000\u0002\u0000\u0001\u0000owner\u0000\u0000\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000members\u0000\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0003\u0000\u0001\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000speechMode\u0000\u0000\u0000\u0000\u0000\u0000\u000f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0018ûÎìÖ«SÏ\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u000f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
      );
      public static final SegmentReader o = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000\u00878\u00ad.H²e\u0093#\u0000\u0000\u0000\u0001\u0000\u0001\u0000é1ÀÖ\tÙðÈ\u0001\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000z\u0001\u0000\u0000)\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000%\u0000\u0000\u0000w\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/clientbound_wrapper.capnp:PartyInvite\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\b\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000B\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000$\u0000\u0000\u0000\u0003\u0000\u0001\u00000\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000-\u0000\u0000\u0000B\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000(\u0000\u0000\u0000\u0003\u0000\u0001\u00004\u0000\u0000\u0000\u0002\u0000\u0001\u0000partyId\u0000\b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000inviter\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
      );
      public static final SegmentReader p = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000\u0082\u009c]\u001a\u0007êGÝ#\u0000\u0000\u0000\u0001\u0000\u0000\u0000é1ÀÖ\tÙðÈ\u0001\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000ª\u0001\u0000\u0000-\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000?\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/clientbound_wrapper.capnp:PartyInviteDenied\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000*\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\b\u0000\u0000\u0000\u0003\u0000\u0001\u0000\u0014\u0000\u0000\u0000\u0002\u0000\u0001\u0000uuid\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
      );
      public static final SegmentReader q = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000\u0019:A&vûR¤#\u0000\u0000\u0000\u0001\u0000\u0000\u0000é1ÀÖ\tÙðÈ\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000r\u0001\u0000\u0000)\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/clientbound_wrapper.capnp:PartyLeave\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000"
      );
      public static final SegmentReader r = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000\u0099ìóhlç¤Ê#\u0000\u0000\u0000\u0001\u0000\u0000\u0000é1ÀÖ\tÙðÈ\u0002\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u0092\u0001\u0000\u0000-\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000w\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/clientbound_wrapper.capnp:P2pJoinRequest\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\b\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000*\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000$\u0000\u0000\u0000\u0003\u0000\u0001\u00000\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000-\u0000\u0000\u0000z\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000,\u0000\u0000\u0000\u0003\u0000\u0001\u00008\u0000\u0000\u0000\u0002\u0000\u0001\u0000from\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000rendezvousInfo\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u001e\u00171I#)T¶\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
      );
      public static final SegmentReader s = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000\"º(ð¿½Dü#\u0000\u0000\u0000\u0001\u0000\u0000\u0000é1ÀÖ\tÙðÈ\u0002\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u009a\u0001\u0000\u0000-\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000w\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/clientbound_wrapper.capnp:P2pJoinAccepted\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\b\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000*\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000$\u0000\u0000\u0000\u0003\u0000\u0001\u00000\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000-\u0000\u0000\u0000z\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000,\u0000\u0000\u0000\u0003\u0000\u0001\u00008\u0000\u0000\u0000\u0002\u0000\u0001\u0000from\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000rendezvousInfo\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u001e\u00171I#)T¶\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
      );
   }

   public static class m {
      public static final StructSize a = new StructSize((short)0, (short)1);
      public static final hE.m.b b = new hE.m.b();
      public static final Factory<hE.m.a, hE.m.c> c = new Factory(b);

      public static final class a extends StructBuilder {
         a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            super(var1, var2, var3, var4, var5);
         }

         public final hE.m.c a() {
            return new hE.m.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
         }

         public final boolean b() {
            return !this._pointerFieldIsNull(0);
         }

         public final org.capnproto.Text.Builder c() {
            return (org.capnproto.Text.Builder)this._getPointerField(Text.factory, 0, null, 0, 0);
         }

         public final void a(org.capnproto.Text.Reader var1) {
            this._setPointerField(Text.factory, 0, var1);
         }

         public final void a(String var1) {
            this._setPointerField(Text.factory, 0, new org.capnproto.Text.Reader(var1));
         }

         public final org.capnproto.Text.Builder a(int var1) {
            return (org.capnproto.Text.Builder)this._initPointerField(Text.factory, 0, var1);
         }
      }

      public static final class b extends StructFactory<hE.m.a, hE.m.c> {
         public final hE.m.c a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return new hE.m.c(var1, var2, var3, var4, var5, var6);
         }

         public final hE.m.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return new hE.m.a(var1, var2, var3, var4, var5);
         }

         public final StructSize structSize() {
            return hE.m.a;
         }

         public final hE.m.c a(hE.m.a var1) {
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

         public org.capnproto.Text.Reader b() {
            return (org.capnproto.Text.Reader)this._getPointerField(Text.factory, 0, null, 0, 0);
         }
      }
   }

   public static class n {
      public static final StructSize a = new StructSize((short)1, (short)1);
      public static final hE.n.b b = new hE.n.b();
      public static final Factory<hE.n.a, hE.n.d> c = new Factory(b);

      public static final class a extends StructBuilder {
         a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            super(var1, var2, var3, var4, var5);
         }

         public final hE.n.d a() {
            return new hE.n.d(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
         }

         public final hE.n.c.a b() {
            return new hE.n.c.a(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
         }

         public final hE.n.c.a c() {
            this._setShortField(0, (short)0);
            this._clearPointerField(0);
            return new hE.n.c.a(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
         }
      }

      public static final class b extends StructFactory<hE.n.a, hE.n.d> {
         public final hE.n.d a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return new hE.n.d(var1, var2, var3, var4, var5, var6);
         }

         public final hE.n.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return new hE.n.a(var1, var2, var3, var4, var5);
         }

         public final StructSize structSize() {
            return hE.n.a;
         }

         public final hE.n.d a(hE.n.a var1) {
            return var1.a();
         }
      }

      public static class c {
         public static final StructSize a = new StructSize((short)1, (short)1);
         public static final hE.n.c.b b = new hE.n.c.b();
         public static final Factory<hE.n.c.a, hE.n.c.c> c = new Factory(b);

         public static final class a extends StructBuilder {
            a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
               super(var1, var2, var3, var4, var5);
            }

            public hE.n.c.d a() {
               switch(this._getShortField(0)) {
                  case 0:
                     return hE.n.c.d.AUTHENTICATION_SUCCESS;
                  case 1:
                     return hE.n.c.d.SOFT_ERROR;
                  case 2:
                     return hE.n.c.d.EMOTE_UPDATE;
                  case 3:
                     return hE.n.c.d.OPTION_REFRESH_PROMPT;
                  case 4:
                     return hE.n.c.d.BULK_OPTION_RESPONSE;
                  case 5:
                     return hE.n.c.d.COSMETIC_SET;
                  case 6:
                     return hE.n.c.d.COSMETIC_OWNED;
                  case 7:
                     return hE.n.c.d.PARTY_INFO;
                  case 8:
                     return hE.n.c.d.PARTY_INVITE;
                  case 9:
                     return hE.n.c.d.PARTY_INVITE_DENIED;
                  case 10:
                     return hE.n.c.d.PARTY_LEAVE;
                  case 11:
                     return hE.n.c.d.P2P_JOIN_REQUEST;
                  case 12:
                     return hE.n.c.d.P2P_JOIN_ACCEPTED;
                  default:
                     return hE.n.c.d._NOT_IN_SCHEMA;
               }
            }

            public final hE.n.c.c b() {
               return new hE.n.c.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
            }

            public final boolean c() {
               return this.a() == hE.n.c.d.AUTHENTICATION_SUCCESS;
            }

            public final Void d() {
               assert this.a() == hE.n.c.d.AUTHENTICATION_SUCCESS : "Must check which() before get()ing a union member.";

               return Void.VOID;
            }

            public final void a(Void var1) {
               this._setShortField(0, (short)hE.n.c.d.AUTHENTICATION_SUCCESS.ordinal());
            }

            public final boolean e() {
               return this.a() == hE.n.c.d.SOFT_ERROR;
            }

            public final hE.m.a f() {
               assert this.a() == hE.n.c.d.SOFT_ERROR : "Must check which() before get()ing a union member.";

               return (hE.m.a)this._getPointerField(hE.m.b, 0, null, 0);
            }

            public final void a(hE.m.c var1) {
               this._setShortField(0, (short)hE.n.c.d.SOFT_ERROR.ordinal());
               this._setPointerField(hE.m.b, 0, var1);
            }

            public final hE.m.a g() {
               this._setShortField(0, (short)hE.n.c.d.SOFT_ERROR.ordinal());
               return (hE.m.a)this._initPointerField(hE.m.b, 0, 0);
            }

            public final boolean h() {
               return this.a() == hE.n.c.d.EMOTE_UPDATE;
            }

            public final hE.d.a i() {
               assert this.a() == hE.n.c.d.EMOTE_UPDATE : "Must check which() before get()ing a union member.";

               return (hE.d.a)this._getPointerField(hE.d.b, 0, null, 0);
            }

            public final void a(hE.d.c var1) {
               this._setShortField(0, (short)hE.n.c.d.EMOTE_UPDATE.ordinal());
               this._setPointerField(hE.d.b, 0, var1);
            }

            public final hE.d.a j() {
               this._setShortField(0, (short)hE.n.c.d.EMOTE_UPDATE.ordinal());
               return (hE.d.a)this._initPointerField(hE.d.b, 0, 0);
            }

            public final boolean k() {
               return this.a() == hE.n.c.d.OPTION_REFRESH_PROMPT;
            }

            public final hE.e.a l() {
               assert this.a() == hE.n.c.d.OPTION_REFRESH_PROMPT : "Must check which() before get()ing a union member.";

               return (hE.e.a)this._getPointerField(hE.e.b, 0, null, 0);
            }

            public final void a(hE.e.c var1) {
               this._setShortField(0, (short)hE.n.c.d.OPTION_REFRESH_PROMPT.ordinal());
               this._setPointerField(hE.e.b, 0, var1);
            }

            public final hE.e.a m() {
               this._setShortField(0, (short)hE.n.c.d.OPTION_REFRESH_PROMPT.ordinal());
               return (hE.e.a)this._initPointerField(hE.e.b, 0, 0);
            }

            public final boolean n() {
               return this.a() == hE.n.c.d.BULK_OPTION_RESPONSE;
            }

            public final hE.a.a o() {
               assert this.a() == hE.n.c.d.BULK_OPTION_RESPONSE : "Must check which() before get()ing a union member.";

               return (hE.a.a)this._getPointerField(hE.a.b, 0, null, 0);
            }

            public final void a(hE.a.d var1) {
               this._setShortField(0, (short)hE.n.c.d.BULK_OPTION_RESPONSE.ordinal());
               this._setPointerField(hE.a.b, 0, var1);
            }

            public final hE.a.a p() {
               this._setShortField(0, (short)hE.n.c.d.BULK_OPTION_RESPONSE.ordinal());
               return (hE.a.a)this._initPointerField(hE.a.b, 0, 0);
            }

            public final boolean q() {
               return this.a() == hE.n.c.d.COSMETIC_SET;
            }

            public final hE.c.a r() {
               assert this.a() == hE.n.c.d.COSMETIC_SET : "Must check which() before get()ing a union member.";

               return (hE.c.a)this._getPointerField(hE.c.b, 0, null, 0);
            }

            public final void a(hE.c.d var1) {
               this._setShortField(0, (short)hE.n.c.d.COSMETIC_SET.ordinal());
               this._setPointerField(hE.c.b, 0, var1);
            }

            public final hE.c.a s() {
               this._setShortField(0, (short)hE.n.c.d.COSMETIC_SET.ordinal());
               return (hE.c.a)this._initPointerField(hE.c.b, 0, 0);
            }

            public final boolean t() {
               return this.a() == hE.n.c.d.COSMETIC_OWNED;
            }

            public final hE.b.a u() {
               assert this.a() == hE.n.c.d.COSMETIC_OWNED : "Must check which() before get()ing a union member.";

               return (hE.b.a)this._getPointerField(hE.b.b, 0, null, 0);
            }

            public final void a(hE.b.c var1) {
               this._setShortField(0, (short)hE.n.c.d.COSMETIC_OWNED.ordinal());
               this._setPointerField(hE.b.b, 0, var1);
            }

            public final hE.b.a v() {
               this._setShortField(0, (short)hE.n.c.d.COSMETIC_OWNED.ordinal());
               return (hE.b.a)this._initPointerField(hE.b.b, 0, 0);
            }

            public final boolean w() {
               return this.a() == hE.n.c.d.PARTY_INFO;
            }

            public final hE.h.a x() {
               assert this.a() == hE.n.c.d.PARTY_INFO : "Must check which() before get()ing a union member.";

               return (hE.h.a)this._getPointerField(hE.h.b, 0, null, 0);
            }

            public final void a(hE.h.c var1) {
               this._setShortField(0, (short)hE.n.c.d.PARTY_INFO.ordinal());
               this._setPointerField(hE.h.b, 0, var1);
            }

            public final hE.h.a y() {
               this._setShortField(0, (short)hE.n.c.d.PARTY_INFO.ordinal());
               return (hE.h.a)this._initPointerField(hE.h.b, 0, 0);
            }

            public final boolean z() {
               return this.a() == hE.n.c.d.PARTY_INVITE;
            }

            public final hE.i.a A() {
               assert this.a() == hE.n.c.d.PARTY_INVITE : "Must check which() before get()ing a union member.";

               return (hE.i.a)this._getPointerField(hE.i.b, 0, null, 0);
            }

            public final void a(hE.i.c var1) {
               this._setShortField(0, (short)hE.n.c.d.PARTY_INVITE.ordinal());
               this._setPointerField(hE.i.b, 0, var1);
            }

            public final hE.i.a B() {
               this._setShortField(0, (short)hE.n.c.d.PARTY_INVITE.ordinal());
               return (hE.i.a)this._initPointerField(hE.i.b, 0, 0);
            }

            public final boolean C() {
               return this.a() == hE.n.c.d.PARTY_INVITE_DENIED;
            }

            public final hE.j.a D() {
               assert this.a() == hE.n.c.d.PARTY_INVITE_DENIED : "Must check which() before get()ing a union member.";

               return (hE.j.a)this._getPointerField(hE.j.b, 0, null, 0);
            }

            public final void a(hE.j.c var1) {
               this._setShortField(0, (short)hE.n.c.d.PARTY_INVITE_DENIED.ordinal());
               this._setPointerField(hE.j.b, 0, var1);
            }

            public final hE.j.a E() {
               this._setShortField(0, (short)hE.n.c.d.PARTY_INVITE_DENIED.ordinal());
               return (hE.j.a)this._initPointerField(hE.j.b, 0, 0);
            }

            public final boolean F() {
               return this.a() == hE.n.c.d.PARTY_LEAVE;
            }

            public final hE.k.a G() {
               assert this.a() == hE.n.c.d.PARTY_LEAVE : "Must check which() before get()ing a union member.";

               return (hE.k.a)this._getPointerField(hE.k.b, 0, null, 0);
            }

            public final void a(hE.k.c var1) {
               this._setShortField(0, (short)hE.n.c.d.PARTY_LEAVE.ordinal());
               this._setPointerField(hE.k.b, 0, var1);
            }

            public final hE.k.a H() {
               this._setShortField(0, (short)hE.n.c.d.PARTY_LEAVE.ordinal());
               return (hE.k.a)this._initPointerField(hE.k.b, 0, 0);
            }

            public final boolean I() {
               return this.a() == hE.n.c.d.P2P_JOIN_REQUEST;
            }

            public final hE.g.a J() {
               assert this.a() == hE.n.c.d.P2P_JOIN_REQUEST : "Must check which() before get()ing a union member.";

               return (hE.g.a)this._getPointerField(hE.g.b, 0, null, 0);
            }

            public final void a(hE.g.c var1) {
               this._setShortField(0, (short)hE.n.c.d.P2P_JOIN_REQUEST.ordinal());
               this._setPointerField(hE.g.b, 0, var1);
            }

            public final hE.g.a K() {
               this._setShortField(0, (short)hE.n.c.d.P2P_JOIN_REQUEST.ordinal());
               return (hE.g.a)this._initPointerField(hE.g.b, 0, 0);
            }

            public final boolean L() {
               return this.a() == hE.n.c.d.P2P_JOIN_ACCEPTED;
            }

            public final hE.f.a M() {
               assert this.a() == hE.n.c.d.P2P_JOIN_ACCEPTED : "Must check which() before get()ing a union member.";

               return (hE.f.a)this._getPointerField(hE.f.b, 0, null, 0);
            }

            public final void a(hE.f.c var1) {
               this._setShortField(0, (short)hE.n.c.d.P2P_JOIN_ACCEPTED.ordinal());
               this._setPointerField(hE.f.b, 0, var1);
            }

            public final hE.f.a N() {
               this._setShortField(0, (short)hE.n.c.d.P2P_JOIN_ACCEPTED.ordinal());
               return (hE.f.a)this._initPointerField(hE.f.b, 0, 0);
            }
         }

         public static final class b extends StructFactory<hE.n.c.a, hE.n.c.c> {
            public final hE.n.c.c a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
               return new hE.n.c.c(var1, var2, var3, var4, var5, var6);
            }

            public final hE.n.c.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
               return new hE.n.c.a(var1, var2, var3, var4, var5);
            }

            public final StructSize structSize() {
               return hE.n.c.a;
            }

            public final hE.n.c.c a(hE.n.c.a var1) {
               return var1.b();
            }
         }

         public static final class c extends StructReader {
            c(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
               super(var1, var2, var3, var4, var5, var6);
            }

            public hE.n.c.d a() {
               switch(this._getShortField(0)) {
                  case 0:
                     return hE.n.c.d.AUTHENTICATION_SUCCESS;
                  case 1:
                     return hE.n.c.d.SOFT_ERROR;
                  case 2:
                     return hE.n.c.d.EMOTE_UPDATE;
                  case 3:
                     return hE.n.c.d.OPTION_REFRESH_PROMPT;
                  case 4:
                     return hE.n.c.d.BULK_OPTION_RESPONSE;
                  case 5:
                     return hE.n.c.d.COSMETIC_SET;
                  case 6:
                     return hE.n.c.d.COSMETIC_OWNED;
                  case 7:
                     return hE.n.c.d.PARTY_INFO;
                  case 8:
                     return hE.n.c.d.PARTY_INVITE;
                  case 9:
                     return hE.n.c.d.PARTY_INVITE_DENIED;
                  case 10:
                     return hE.n.c.d.PARTY_LEAVE;
                  case 11:
                     return hE.n.c.d.P2P_JOIN_REQUEST;
                  case 12:
                     return hE.n.c.d.P2P_JOIN_ACCEPTED;
                  default:
                     return hE.n.c.d._NOT_IN_SCHEMA;
               }
            }

            public final boolean b() {
               return this.a() == hE.n.c.d.AUTHENTICATION_SUCCESS;
            }

            public final Void c() {
               assert this.a() == hE.n.c.d.AUTHENTICATION_SUCCESS : "Must check which() before get()ing a union member.";

               return Void.VOID;
            }

            public final boolean d() {
               return this.a() == hE.n.c.d.SOFT_ERROR;
            }

            public boolean e() {
               return !this._pointerFieldIsNull(0);
            }

            public hE.m.c f() {
               assert this.a() == hE.n.c.d.SOFT_ERROR : "Must check which() before get()ing a union member.";

               return (hE.m.c)this._getPointerField(hE.m.b, 0, null, 0);
            }

            public final boolean g() {
               return this.a() == hE.n.c.d.EMOTE_UPDATE;
            }

            public boolean h() {
               return !this._pointerFieldIsNull(0);
            }

            public hE.d.c i() {
               assert this.a() == hE.n.c.d.EMOTE_UPDATE : "Must check which() before get()ing a union member.";

               return (hE.d.c)this._getPointerField(hE.d.b, 0, null, 0);
            }

            public final boolean j() {
               return this.a() == hE.n.c.d.OPTION_REFRESH_PROMPT;
            }

            public boolean k() {
               return !this._pointerFieldIsNull(0);
            }

            public hE.e.c l() {
               assert this.a() == hE.n.c.d.OPTION_REFRESH_PROMPT : "Must check which() before get()ing a union member.";

               return (hE.e.c)this._getPointerField(hE.e.b, 0, null, 0);
            }

            public final boolean m() {
               return this.a() == hE.n.c.d.BULK_OPTION_RESPONSE;
            }

            public boolean n() {
               return !this._pointerFieldIsNull(0);
            }

            public hE.a.d o() {
               assert this.a() == hE.n.c.d.BULK_OPTION_RESPONSE : "Must check which() before get()ing a union member.";

               return (hE.a.d)this._getPointerField(hE.a.b, 0, null, 0);
            }

            public final boolean p() {
               return this.a() == hE.n.c.d.COSMETIC_SET;
            }

            public boolean q() {
               return !this._pointerFieldIsNull(0);
            }

            public hE.c.d r() {
               assert this.a() == hE.n.c.d.COSMETIC_SET : "Must check which() before get()ing a union member.";

               return (hE.c.d)this._getPointerField(hE.c.b, 0, null, 0);
            }

            public final boolean s() {
               return this.a() == hE.n.c.d.COSMETIC_OWNED;
            }

            public boolean t() {
               return !this._pointerFieldIsNull(0);
            }

            public hE.b.c u() {
               assert this.a() == hE.n.c.d.COSMETIC_OWNED : "Must check which() before get()ing a union member.";

               return (hE.b.c)this._getPointerField(hE.b.b, 0, null, 0);
            }

            public final boolean v() {
               return this.a() == hE.n.c.d.PARTY_INFO;
            }

            public boolean w() {
               return !this._pointerFieldIsNull(0);
            }

            public hE.h.c x() {
               assert this.a() == hE.n.c.d.PARTY_INFO : "Must check which() before get()ing a union member.";

               return (hE.h.c)this._getPointerField(hE.h.b, 0, null, 0);
            }

            public final boolean y() {
               return this.a() == hE.n.c.d.PARTY_INVITE;
            }

            public boolean z() {
               return !this._pointerFieldIsNull(0);
            }

            public hE.i.c A() {
               assert this.a() == hE.n.c.d.PARTY_INVITE : "Must check which() before get()ing a union member.";

               return (hE.i.c)this._getPointerField(hE.i.b, 0, null, 0);
            }

            public final boolean B() {
               return this.a() == hE.n.c.d.PARTY_INVITE_DENIED;
            }

            public boolean C() {
               return !this._pointerFieldIsNull(0);
            }

            public hE.j.c D() {
               assert this.a() == hE.n.c.d.PARTY_INVITE_DENIED : "Must check which() before get()ing a union member.";

               return (hE.j.c)this._getPointerField(hE.j.b, 0, null, 0);
            }

            public final boolean E() {
               return this.a() == hE.n.c.d.PARTY_LEAVE;
            }

            public boolean F() {
               return !this._pointerFieldIsNull(0);
            }

            public hE.k.c G() {
               assert this.a() == hE.n.c.d.PARTY_LEAVE : "Must check which() before get()ing a union member.";

               return (hE.k.c)this._getPointerField(hE.k.b, 0, null, 0);
            }

            public final boolean H() {
               return this.a() == hE.n.c.d.P2P_JOIN_REQUEST;
            }

            public boolean I() {
               return !this._pointerFieldIsNull(0);
            }

            public hE.g.c J() {
               assert this.a() == hE.n.c.d.P2P_JOIN_REQUEST : "Must check which() before get()ing a union member.";

               return (hE.g.c)this._getPointerField(hE.g.b, 0, null, 0);
            }

            public final boolean K() {
               return this.a() == hE.n.c.d.P2P_JOIN_ACCEPTED;
            }

            public boolean L() {
               return !this._pointerFieldIsNull(0);
            }

            public hE.f.c M() {
               assert this.a() == hE.n.c.d.P2P_JOIN_ACCEPTED : "Must check which() before get()ing a union member.";

               return (hE.f.c)this._getPointerField(hE.f.b, 0, null, 0);
            }
         }

         public static enum d {
            AUTHENTICATION_SUCCESS,
            SOFT_ERROR,
            EMOTE_UPDATE,
            OPTION_REFRESH_PROMPT,
            BULK_OPTION_RESPONSE,
            COSMETIC_SET,
            COSMETIC_OWNED,
            PARTY_INFO,
            PARTY_INVITE,
            PARTY_INVITE_DENIED,
            PARTY_LEAVE,
            P2P_JOIN_REQUEST,
            P2P_JOIN_ACCEPTED,
            _NOT_IN_SCHEMA;
         }
      }

      public static final class d extends StructReader {
         d(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            super(var1, var2, var3, var4, var5, var6);
         }

         public hE.n.c.c a() {
            return new hE.n.c.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, this.nestingLimit);
         }
      }
   }
}
