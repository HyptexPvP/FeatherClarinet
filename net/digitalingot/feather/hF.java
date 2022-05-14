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
import org.capnproto.DataList.Builder;
import org.capnproto.DataList.Reader;
import org.capnproto.StructList.Factory;

public final class hF {
   public static class a {
      public static final StructSize a = new StructSize((short)0, (short)1);
      public static final hF.a.b b = new hF.a.b();
      public static final Factory<hF.a.a, hF.a.c> c = new Factory(b);

      public static final class a extends StructBuilder {
         a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            super(var1, var2, var3, var4, var5);
         }

         public final hF.a.c a() {
            return new hF.a.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
         }

         public final boolean b() {
            return !this._pointerFieldIsNull(0);
         }

         public final Builder c() {
            return (Builder)this._getPointerField(DataList.factory, 0, null, 0);
         }

         public final void a(Reader var1) {
            this._setPointerField(DataList.factory, 0, var1);
         }

         public final Builder a(int var1) {
            return (Builder)this._initPointerField(DataList.factory, 0, var1);
         }
      }

      public static final class b extends StructFactory<hF.a.a, hF.a.c> {
         public final hF.a.c a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return new hF.a.c(var1, var2, var3, var4, var5, var6);
         }

         public final hF.a.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return new hF.a.a(var1, var2, var3, var4, var5);
         }

         public final StructSize structSize() {
            return hF.a.a;
         }

         public final hF.a.c a(hF.a.a var1) {
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

         public final Reader b() {
            return (Reader)this._getPointerField(DataList.factory, 0, null, 0);
         }
      }
   }

   public static class b {
      public static final StructSize a = new StructSize((short)0, (short)1);
      public static final hF.b.b b = new hF.b.b();
      public static final Factory<hF.b.a, hF.b.c> c = new Factory(b);

      public static final class a extends StructBuilder {
         a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            super(var1, var2, var3, var4, var5);
         }

         public final hF.b.c a() {
            return new hF.b.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
         }

         public final boolean b() {
            return !this._pointerFieldIsNull(0);
         }

         public final Builder c() {
            return (Builder)this._getPointerField(DataList.factory, 0, null, 0);
         }

         public final void a(Reader var1) {
            this._setPointerField(DataList.factory, 0, var1);
         }

         public final Builder a(int var1) {
            return (Builder)this._initPointerField(DataList.factory, 0, var1);
         }
      }

      public static final class b extends StructFactory<hF.b.a, hF.b.c> {
         public final hF.b.c a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return new hF.b.c(var1, var2, var3, var4, var5, var6);
         }

         public final hF.b.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return new hF.b.a(var1, var2, var3, var4, var5);
         }

         public final StructSize structSize() {
            return hF.b.a;
         }

         public final hF.b.c a(hF.b.a var1) {
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

         public final Reader b() {
            return (Reader)this._getPointerField(DataList.factory, 0, null, 0);
         }
      }
   }

   public static class c {
      public static final StructSize a = new StructSize((short)0, (short)1);
      public static final hF.c.b b = new hF.c.b();
      public static final Factory<hF.c.a, hF.c.c> c = new Factory(b);

      public static final class a extends StructBuilder {
         a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            super(var1, var2, var3, var4, var5);
         }

         public final hF.c.c a() {
            return new hF.c.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
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

      public static final class b extends StructFactory<hF.c.a, hF.c.c> {
         public final hF.c.c a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return new hF.c.c(var1, var2, var3, var4, var5, var6);
         }

         public final hF.c.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return new hF.c.a(var1, var2, var3, var4, var5);
         }

         public final StructSize structSize() {
            return hF.c.a;
         }

         public final hF.c.c a(hF.c.a var1) {
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

   public static class d {
      public static final StructSize a = new StructSize((short)0, (short)1);
      public static final hF.d.b b = new hF.d.b();
      public static final Factory<hF.d.a, hF.d.c> c = new Factory(b);

      public static final class a extends StructBuilder {
         a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            super(var1, var2, var3, var4, var5);
         }

         public final hF.d.c a() {
            return new hF.d.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
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

      public static final class b extends StructFactory<hF.d.a, hF.d.c> {
         public final hF.d.c a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return new hF.d.c(var1, var2, var3, var4, var5, var6);
         }

         public final hF.d.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return new hF.d.a(var1, var2, var3, var4, var5);
         }

         public final StructSize structSize() {
            return hF.d.a;
         }

         public final hF.d.c a(hF.d.a var1) {
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

   public static class e {
      public static final StructSize a = new StructSize((short)0, (short)1);
      public static final hF.e.b b = new hF.e.b();
      public static final Factory<hF.e.a, hF.e.c> c = new Factory(b);

      public static final class a extends StructBuilder {
         a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            super(var1, var2, var3, var4, var5);
         }

         public final hF.e.c a() {
            return new hF.e.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
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

      public static final class b extends StructFactory<hF.e.a, hF.e.c> {
         public final hF.e.c a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return new hF.e.c(var1, var2, var3, var4, var5, var6);
         }

         public final hF.e.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return new hF.e.a(var1, var2, var3, var4, var5);
         }

         public final StructSize structSize() {
            return hF.e.a;
         }

         public final hF.e.c a(hF.e.a var1) {
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

   public static class f {
      public static final StructSize a = new StructSize((short)1, (short)1);
      public static final hF.f.b b = new hF.f.b();
      public static final Factory<hF.f.a, hF.f.c> c = new Factory(b);

      public static final class a extends StructBuilder {
         a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            super(var1, var2, var3, var4, var5);
         }

         public final hF.f.c a() {
            return new hF.f.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
         }

         public final hF.f.f.a b() {
            return new hF.f.f.a(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
         }

         public final hF.f.f.a c() {
            this._setShortField(0, (short)0);
            this._clearPointerField(0);
            return new hF.f.f.a(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
         }
      }

      public static final class b extends StructFactory<hF.f.a, hF.f.c> {
         public final hF.f.c a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return new hF.f.c(var1, var2, var3, var4, var5, var6);
         }

         public final hF.f.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return new hF.f.a(var1, var2, var3, var4, var5);
         }

         public final StructSize structSize() {
            return hF.f.a;
         }

         public final hF.f.c a(hF.f.a var1) {
            return var1.a();
         }
      }

      public static final class c extends StructReader {
         c(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            super(var1, var2, var3, var4, var5, var6);
         }

         public hF.f.f.c a() {
            return new hF.f.f.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, this.nestingLimit);
         }
      }

      public static class d {
         public static final StructSize a = new StructSize((short)1, (short)1);
         public static final hF.f.d.b b = new hF.f.d.b();
         public static final Factory<hF.f.d.a, hF.f.d.c> c = new Factory(b);

         public static final class a extends StructBuilder {
            a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
               super(var1, var2, var3, var4, var5);
            }

            public final hF.f.d.c a() {
               return new hF.f.d.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
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

            public final short d() {
               return this._getShortField(0);
            }

            public final void a(short var1) {
               this._setShortField(0, var1);
            }
         }

         public static final class b extends StructFactory<hF.f.d.a, hF.f.d.c> {
            public final hF.f.d.c a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
               return new hF.f.d.c(var1, var2, var3, var4, var5, var6);
            }

            public final hF.f.d.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
               return new hF.f.d.a(var1, var2, var3, var4, var5);
            }

            public final StructSize structSize() {
               return hF.f.d.a;
            }

            public final hF.f.d.c a(hF.f.d.a var1) {
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

            public final short c() {
               return this._getShortField(0);
            }
         }
      }

      public static class e {
         public static final StructSize a = new StructSize((short)0, (short)5);
         public static final hF.f.e.b b = new hF.f.e.b();
         public static final Factory<hF.f.e.a, hF.f.e.d> c = new Factory(b);

         public static final class a extends StructBuilder {
            a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
               super(var1, var2, var3, var4, var5);
            }

            public final hF.f.e.d a() {
               return new hF.f.e.d(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
            }

            public final hF.f.e.c.a b() {
               return (hF.f.e.c.a)this._getPointerField(hF.f.e.c.b, 0, null, 0);
            }

            public final void a(hF.f.e.c.c var1) {
               this._setPointerField(hF.f.e.c.b, 0, var1);
            }

            public final hF.f.e.c.a c() {
               return (hF.f.e.c.a)this._initPointerField(hF.f.e.c.b, 0, 0);
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

            public final org.capnproto.Text.Builder a(int var1) {
               return (org.capnproto.Text.Builder)this._initPointerField(Text.factory, 1, var1);
            }

            public final boolean f() {
               return !this._pointerFieldIsNull(2);
            }

            public final org.capnproto.TextList.Builder g() {
               return (org.capnproto.TextList.Builder)this._getPointerField(TextList.factory, 2, null, 0);
            }

            public final void a(org.capnproto.TextList.Reader var1) {
               this._setPointerField(TextList.factory, 2, var1);
            }

            public final org.capnproto.TextList.Builder b(int var1) {
               return (org.capnproto.TextList.Builder)this._initPointerField(TextList.factory, 2, var1);
            }

            public final boolean h() {
               return !this._pointerFieldIsNull(3);
            }

            public final org.capnproto.TextList.Builder i() {
               return (org.capnproto.TextList.Builder)this._getPointerField(TextList.factory, 3, null, 0);
            }

            public final void b(org.capnproto.TextList.Reader var1) {
               this._setPointerField(TextList.factory, 3, var1);
            }

            public final org.capnproto.TextList.Builder c(int var1) {
               return (org.capnproto.TextList.Builder)this._initPointerField(TextList.factory, 3, var1);
            }

            public final boolean j() {
               return !this._pointerFieldIsNull(4);
            }

            public final org.capnproto.TextList.Builder k() {
               return (org.capnproto.TextList.Builder)this._getPointerField(TextList.factory, 4, null, 0);
            }

            public final void c(org.capnproto.TextList.Reader var1) {
               this._setPointerField(TextList.factory, 4, var1);
            }

            public final org.capnproto.TextList.Builder d(int var1) {
               return (org.capnproto.TextList.Builder)this._initPointerField(TextList.factory, 4, var1);
            }
         }

         public static final class b extends StructFactory<hF.f.e.a, hF.f.e.d> {
            public final hF.f.e.d a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
               return new hF.f.e.d(var1, var2, var3, var4, var5, var6);
            }

            public final hF.f.e.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
               return new hF.f.e.a(var1, var2, var3, var4, var5);
            }

            public final StructSize structSize() {
               return hF.f.e.a;
            }

            public final hF.f.e.d a(hF.f.e.a var1) {
               return var1.a();
            }
         }

         public static class c {
            public static final StructSize a = new StructSize((short)1, (short)3);
            public static final hF.f.e.c.b b = new hF.f.e.c.b();
            public static final Factory<hF.f.e.c.a, hF.f.e.c.c> c = new Factory(b);

            public static final class a extends StructBuilder {
               a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
                  super(var1, var2, var3, var4, var5);
               }

               public final hF.f.e.c.c a() {
                  return new hF.f.e.c.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
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

               public final short d() {
                  return this._getShortField(0);
               }

               public final void a(short var1) {
                  this._setShortField(0, var1);
               }

               public final int e() {
                  return this._getIntField(1);
               }

               public final void b(int var1) {
                  this._setIntField(1, var1);
               }

               public final boolean f() {
                  return !this._pointerFieldIsNull(1);
               }

               public final org.capnproto.Text.Builder g() {
                  return (org.capnproto.Text.Builder)this._getPointerField(Text.factory, 1, null, 0, 0);
               }

               public final void b(org.capnproto.Text.Reader var1) {
                  this._setPointerField(Text.factory, 1, var1);
               }

               public final void b(String var1) {
                  this._setPointerField(Text.factory, 1, new org.capnproto.Text.Reader(var1));
               }

               public final org.capnproto.Text.Builder c(int var1) {
                  return (org.capnproto.Text.Builder)this._initPointerField(Text.factory, 1, var1);
               }

               public final boolean h() {
                  return !this._pointerFieldIsNull(2);
               }

               public final org.capnproto.Text.Builder i() {
                  return (org.capnproto.Text.Builder)this._getPointerField(Text.factory, 2, null, 0, 0);
               }

               public final void c(org.capnproto.Text.Reader var1) {
                  this._setPointerField(Text.factory, 2, var1);
               }

               public final void c(String var1) {
                  this._setPointerField(Text.factory, 2, new org.capnproto.Text.Reader(var1));
               }

               public final org.capnproto.Text.Builder d(int var1) {
                  return (org.capnproto.Text.Builder)this._initPointerField(Text.factory, 2, var1);
               }
            }

            public static final class b extends StructFactory<hF.f.e.c.a, hF.f.e.c.c> {
               public final hF.f.e.c.c a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
                  return new hF.f.e.c.c(var1, var2, var3, var4, var5, var6);
               }

               public final hF.f.e.c.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
                  return new hF.f.e.c.a(var1, var2, var3, var4, var5);
               }

               public final StructSize structSize() {
                  return hF.f.e.c.a;
               }

               public final hF.f.e.c.c a(hF.f.e.c.a var1) {
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

               public final short c() {
                  return this._getShortField(0);
               }

               public final int d() {
                  return this._getIntField(1);
               }

               public boolean e() {
                  return !this._pointerFieldIsNull(1);
               }

               public org.capnproto.Text.Reader f() {
                  return (org.capnproto.Text.Reader)this._getPointerField(Text.factory, 1, null, 0, 0);
               }

               public boolean g() {
                  return !this._pointerFieldIsNull(2);
               }

               public org.capnproto.Text.Reader h() {
                  return (org.capnproto.Text.Reader)this._getPointerField(Text.factory, 2, null, 0, 0);
               }
            }
         }

         public static final class d extends StructReader {
            d(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
               super(var1, var2, var3, var4, var5, var6);
            }

            public boolean a() {
               return !this._pointerFieldIsNull(0);
            }

            public hF.f.e.c.c b() {
               return (hF.f.e.c.c)this._getPointerField(hF.f.e.c.b, 0, null, 0);
            }

            public boolean c() {
               return !this._pointerFieldIsNull(1);
            }

            public org.capnproto.Text.Reader d() {
               return (org.capnproto.Text.Reader)this._getPointerField(Text.factory, 1, null, 0, 0);
            }

            public final boolean e() {
               return !this._pointerFieldIsNull(2);
            }

            public final org.capnproto.TextList.Reader f() {
               return (org.capnproto.TextList.Reader)this._getPointerField(TextList.factory, 2, null, 0);
            }

            public final boolean g() {
               return !this._pointerFieldIsNull(3);
            }

            public final org.capnproto.TextList.Reader h() {
               return (org.capnproto.TextList.Reader)this._getPointerField(TextList.factory, 3, null, 0);
            }

            public final boolean i() {
               return !this._pointerFieldIsNull(4);
            }

            public final org.capnproto.TextList.Reader j() {
               return (org.capnproto.TextList.Reader)this._getPointerField(TextList.factory, 4, null, 0);
            }
         }
      }

      public static class f {
         public static final StructSize a = new StructSize((short)1, (short)1);
         public static final hF.f.f.b b = new hF.f.f.b();
         public static final Factory<hF.f.f.a, hF.f.f.c> c = new Factory(b);

         public static final class a extends StructBuilder {
            a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
               super(var1, var2, var3, var4, var5);
            }

            public hF.f.f.d a() {
               switch(this._getShortField(0)) {
                  case 0:
                     return hF.f.f.d.START_METRICS;
                  case 1:
                     return hF.f.f.d.SERVER_JOIN;
                  case 2:
                     return hF.f.f.d.SERVER_QUIT;
                  default:
                     return hF.f.f.d._NOT_IN_SCHEMA;
               }
            }

            public final hF.f.f.c b() {
               return new hF.f.f.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
            }

            public final boolean c() {
               return this.a() == hF.f.f.d.START_METRICS;
            }

            public final hF.f.e.a d() {
               assert this.a() == hF.f.f.d.START_METRICS : "Must check which() before get()ing a union member.";

               return (hF.f.e.a)this._getPointerField(hF.f.e.b, 0, null, 0);
            }

            public final void a(hF.f.e.d var1) {
               this._setShortField(0, (short)hF.f.f.d.START_METRICS.ordinal());
               this._setPointerField(hF.f.e.b, 0, var1);
            }

            public final hF.f.e.a e() {
               this._setShortField(0, (short)hF.f.f.d.START_METRICS.ordinal());
               return (hF.f.e.a)this._initPointerField(hF.f.e.b, 0, 0);
            }

            public final boolean f() {
               return this.a() == hF.f.f.d.SERVER_JOIN;
            }

            public final hF.f.d.a g() {
               assert this.a() == hF.f.f.d.SERVER_JOIN : "Must check which() before get()ing a union member.";

               return (hF.f.d.a)this._getPointerField(hF.f.d.b, 0, null, 0);
            }

            public final void a(hF.f.d.c var1) {
               this._setShortField(0, (short)hF.f.f.d.SERVER_JOIN.ordinal());
               this._setPointerField(hF.f.d.b, 0, var1);
            }

            public final hF.f.d.a h() {
               this._setShortField(0, (short)hF.f.f.d.SERVER_JOIN.ordinal());
               return (hF.f.d.a)this._initPointerField(hF.f.d.b, 0, 0);
            }

            public final boolean i() {
               return this.a() == hF.f.f.d.SERVER_QUIT;
            }

            public final Void j() {
               assert this.a() == hF.f.f.d.SERVER_QUIT : "Must check which() before get()ing a union member.";

               return Void.VOID;
            }

            public final void a(Void var1) {
               this._setShortField(0, (short)hF.f.f.d.SERVER_QUIT.ordinal());
            }
         }

         public static final class b extends StructFactory<hF.f.f.a, hF.f.f.c> {
            public final hF.f.f.c a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
               return new hF.f.f.c(var1, var2, var3, var4, var5, var6);
            }

            public final hF.f.f.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
               return new hF.f.f.a(var1, var2, var3, var4, var5);
            }

            public final StructSize structSize() {
               return hF.f.f.a;
            }

            public final hF.f.f.c a(hF.f.f.a var1) {
               return var1.b();
            }
         }

         public static final class c extends StructReader {
            c(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
               super(var1, var2, var3, var4, var5, var6);
            }

            public hF.f.f.d a() {
               switch(this._getShortField(0)) {
                  case 0:
                     return hF.f.f.d.START_METRICS;
                  case 1:
                     return hF.f.f.d.SERVER_JOIN;
                  case 2:
                     return hF.f.f.d.SERVER_QUIT;
                  default:
                     return hF.f.f.d._NOT_IN_SCHEMA;
               }
            }

            public final boolean b() {
               return this.a() == hF.f.f.d.START_METRICS;
            }

            public boolean c() {
               return !this._pointerFieldIsNull(0);
            }

            public hF.f.e.d d() {
               assert this.a() == hF.f.f.d.START_METRICS : "Must check which() before get()ing a union member.";

               return (hF.f.e.d)this._getPointerField(hF.f.e.b, 0, null, 0);
            }

            public final boolean e() {
               return this.a() == hF.f.f.d.SERVER_JOIN;
            }

            public boolean f() {
               return !this._pointerFieldIsNull(0);
            }

            public hF.f.d.c g() {
               assert this.a() == hF.f.f.d.SERVER_JOIN : "Must check which() before get()ing a union member.";

               return (hF.f.d.c)this._getPointerField(hF.f.d.b, 0, null, 0);
            }

            public final boolean h() {
               return this.a() == hF.f.f.d.SERVER_QUIT;
            }

            public final Void i() {
               assert this.a() == hF.f.f.d.SERVER_QUIT : "Must check which() before get()ing a union member.";

               return Void.VOID;
            }
         }

         public static enum d {
            START_METRICS,
            SERVER_JOIN,
            SERVER_QUIT,
            _NOT_IN_SCHEMA;
         }
      }
   }

   public static class g {
      public static final StructSize a = new StructSize((short)0, (short)2);
      public static final hF.g.b b = new hF.g.b();
      public static final Factory<hF.g.a, hF.g.c> c = new Factory(b);

      public static final class a extends StructBuilder {
         a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            super(var1, var2, var3, var4, var5);
         }

         public final hF.g.c a() {
            return new hF.g.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
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

      public static final class b extends StructFactory<hF.g.a, hF.g.c> {
         public final hF.g.c a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return new hF.g.c(var1, var2, var3, var4, var5, var6);
         }

         public final hF.g.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return new hF.g.a(var1, var2, var3, var4, var5);
         }

         public final StructSize structSize() {
            return hF.g.a;
         }

         public final hF.g.c a(hF.g.a var1) {
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
      public static final StructSize a = new StructSize((short)0, (short)2);
      public static final hF.h.b b = new hF.h.b();
      public static final Factory<hF.h.a, hF.h.c> c = new Factory(b);

      public static final class a extends StructBuilder {
         a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            super(var1, var2, var3, var4, var5);
         }

         public final hF.h.c a() {
            return new hF.h.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
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

      public static final class b extends StructFactory<hF.h.a, hF.h.c> {
         public final hF.h.c a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return new hF.h.c(var1, var2, var3, var4, var5, var6);
         }

         public final hF.h.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return new hF.h.a(var1, var2, var3, var4, var5);
         }

         public final StructSize structSize() {
            return hF.h.a;
         }

         public final hF.h.c a(hF.h.a var1) {
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

   public static class i {
      public static final StructSize a = new StructSize((short)0, (short)0);
      public static final hF.i.b b = new hF.i.b();
      public static final Factory<hF.i.a, hF.i.c> c = new Factory(b);

      public static final class a extends StructBuilder {
         a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            super(var1, var2, var3, var4, var5);
         }

         public final hF.i.c a() {
            return new hF.i.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
         }
      }

      public static final class b extends StructFactory<hF.i.a, hF.i.c> {
         public final hF.i.c a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return new hF.i.c(var1, var2, var3, var4, var5, var6);
         }

         public final hF.i.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return new hF.i.a(var1, var2, var3, var4, var5);
         }

         public final StructSize structSize() {
            return hF.i.a;
         }

         public final hF.i.c a(hF.i.a var1) {
            return var1.a();
         }
      }

      public static final class c extends StructReader {
         c(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            super(var1, var2, var3, var4, var5, var6);
         }
      }
   }

   public static class j {
      public static final StructSize a = new StructSize((short)0, (short)1);
      public static final hF.j.b b = new hF.j.b();
      public static final Factory<hF.j.a, hF.j.c> c = new Factory(b);

      public static final class a extends StructBuilder {
         a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            super(var1, var2, var3, var4, var5);
         }

         public final hF.j.c a() {
            return new hF.j.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
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

      public static final class b extends StructFactory<hF.j.a, hF.j.c> {
         public final hF.j.c a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return new hF.j.c(var1, var2, var3, var4, var5, var6);
         }

         public final hF.j.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return new hF.j.a(var1, var2, var3, var4, var5);
         }

         public final StructSize structSize() {
            return hF.j.a;
         }

         public final hF.j.c a(hF.j.a var1) {
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
      public static final StructSize a = new StructSize((short)1, (short)0);
      public static final hF.k.b b = new hF.k.b();
      public static final Factory<hF.k.a, hF.k.c> c = new Factory(b);

      public static final class a extends StructBuilder {
         a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            super(var1, var2, var3, var4, var5);
         }

         public final hF.k.c a() {
            return new hF.k.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
         }

         public final int b() {
            return this._getIntField(0);
         }

         public final void a(int var1) {
            this._setIntField(0, var1);
         }

         public final boolean c() {
            return this._getBooleanField(32);
         }

         public final void a(boolean var1) {
            this._setBooleanField(32, var1);
         }
      }

      public static final class b extends StructFactory<hF.k.a, hF.k.c> {
         public final hF.k.c a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return new hF.k.c(var1, var2, var3, var4, var5, var6);
         }

         public final hF.k.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return new hF.k.a(var1, var2, var3, var4, var5);
         }

         public final StructSize structSize() {
            return hF.k.a;
         }

         public final hF.k.c a(hF.k.a var1) {
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

         public final boolean b() {
            return this._getBooleanField(32);
         }
      }
   }

   public static class l {
      public static final StructSize a = new StructSize((short)1, (short)1);
      public static final hF.l.b b = new hF.l.b();
      public static final Factory<hF.l.a, hF.l.c> c = new Factory(b);

      public static final class a extends StructBuilder {
         a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            super(var1, var2, var3, var4, var5);
         }

         public final hF.l.c a() {
            return new hF.l.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
         }

         public final hF.l.d.a b() {
            return new hF.l.d.a(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
         }

         public final hF.l.d.a c() {
            this._setShortField(0, (short)0);
            this._clearPointerField(0);
            return new hF.l.d.a(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
         }
      }

      public static final class b extends StructFactory<hF.l.a, hF.l.c> {
         public final hF.l.c a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return new hF.l.c(var1, var2, var3, var4, var5, var6);
         }

         public final hF.l.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return new hF.l.a(var1, var2, var3, var4, var5);
         }

         public final StructSize structSize() {
            return hF.l.a;
         }

         public final hF.l.c a(hF.l.a var1) {
            return var1.a();
         }
      }

      public static final class c extends StructReader {
         c(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            super(var1, var2, var3, var4, var5, var6);
         }

         public hF.l.d.c a() {
            return new hF.l.d.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, this.nestingLimit);
         }
      }

      public static class d {
         public static final StructSize a = new StructSize((short)1, (short)1);
         public static final hF.l.d.b b = new hF.l.d.b();
         public static final Factory<hF.l.d.a, hF.l.d.c> c = new Factory(b);

         public static final class a extends StructBuilder {
            a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
               super(var1, var2, var3, var4, var5);
            }

            public hF.l.d.d a() {
               switch(this._getShortField(0)) {
                  case 0:
                     return hF.l.d.d.ME;
                  case 1:
                     return hF.l.d.d.TARGET;
                  default:
                     return hF.l.d.d._NOT_IN_SCHEMA;
               }
            }

            public final hF.l.d.c b() {
               return new hF.l.d.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
            }

            public final boolean c() {
               return this.a() == hF.l.d.d.ME;
            }

            public final Void d() {
               assert this.a() == hF.l.d.d.ME : "Must check which() before get()ing a union member.";

               return Void.VOID;
            }

            public final void a(Void var1) {
               this._setShortField(0, (short)hF.l.d.d.ME.ordinal());
            }

            public final boolean e() {
               return this.a() == hF.l.d.d.TARGET;
            }

            public final boolean f() {
               if (this.a() != hF.l.d.d.TARGET) {
                  return false;
               } else {
                  return !this._pointerFieldIsNull(0);
               }
            }

            public final org.capnproto.Data.Builder g() {
               return (org.capnproto.Data.Builder)this._getPointerField(Data.factory, 0, null, 0, 0);
            }

            public final void a(org.capnproto.Data.Reader var1) {
               this._setShortField(0, (short)hF.l.d.d.TARGET.ordinal());
               this._setPointerField(Data.factory, 0, var1);
            }

            public final void a(byte[] var1) {
               this._setShortField(0, (short)hF.l.d.d.TARGET.ordinal());
               this._setPointerField(Data.factory, 0, new org.capnproto.Data.Reader(var1));
            }

            public final org.capnproto.Data.Builder a(int var1) {
               return (org.capnproto.Data.Builder)this._initPointerField(Data.factory, 0, var1);
            }
         }

         public static final class b extends StructFactory<hF.l.d.a, hF.l.d.c> {
            public final hF.l.d.c a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
               return new hF.l.d.c(var1, var2, var3, var4, var5, var6);
            }

            public final hF.l.d.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
               return new hF.l.d.a(var1, var2, var3, var4, var5);
            }

            public final StructSize structSize() {
               return hF.l.d.a;
            }

            public final hF.l.d.c a(hF.l.d.a var1) {
               return var1.b();
            }
         }

         public static final class c extends StructReader {
            c(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
               super(var1, var2, var3, var4, var5, var6);
            }

            public hF.l.d.d a() {
               switch(this._getShortField(0)) {
                  case 0:
                     return hF.l.d.d.ME;
                  case 1:
                     return hF.l.d.d.TARGET;
                  default:
                     return hF.l.d.d._NOT_IN_SCHEMA;
               }
            }

            public final boolean b() {
               return this.a() == hF.l.d.d.ME;
            }

            public final Void c() {
               assert this.a() == hF.l.d.d.ME : "Must check which() before get()ing a union member.";

               return Void.VOID;
            }

            public final boolean d() {
               return this.a() == hF.l.d.d.TARGET;
            }

            public boolean e() {
               if (this.a() != hF.l.d.d.TARGET) {
                  return false;
               } else {
                  return !this._pointerFieldIsNull(0);
               }
            }

            public org.capnproto.Data.Reader f() {
               return (org.capnproto.Data.Reader)this._getPointerField(Data.factory, 0, null, 0, 0);
            }
         }

         public static enum d {
            ME,
            TARGET,
            _NOT_IN_SCHEMA;
         }
      }
   }

   public static class m {
      public static final StructSize a = new StructSize((short)0, (short)1);
      public static final hF.m.b b = new hF.m.b();
      public static final Factory<hF.m.a, hF.m.c> c = new Factory(b);

      public static final class a extends StructBuilder {
         a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            super(var1, var2, var3, var4, var5);
         }

         public final hF.m.c a() {
            return new hF.m.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
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

      public static final class b extends StructFactory<hF.m.a, hF.m.c> {
         public final hF.m.c a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return new hF.m.c(var1, var2, var3, var4, var5, var6);
         }

         public final hF.m.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return new hF.m.a(var1, var2, var3, var4, var5);
         }

         public final StructSize structSize() {
            return hF.m.a;
         }

         public final hF.m.c a(hF.m.a var1) {
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

   public static class n {
      public static final StructSize a = new StructSize((short)1, (short)0);
      public static final hF.n.b b = new hF.n.b();
      public static final Factory<hF.n.a, hF.n.c> c = new Factory(b);

      public static final class a extends StructBuilder {
         a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            super(var1, var2, var3, var4, var5);
         }

         public final hF.n.c a() {
            return new hF.n.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
         }

         public final hF.n.d.a b() {
            return new hF.n.d.a(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
         }

         public final hF.n.d.a c() {
            this._setShortField(0, (short)0);
            this._setShortField(1, (short)0);
            return new hF.n.d.a(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
         }
      }

      public static final class b extends StructFactory<hF.n.a, hF.n.c> {
         public final hF.n.c a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return new hF.n.c(var1, var2, var3, var4, var5, var6);
         }

         public final hF.n.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return new hF.n.a(var1, var2, var3, var4, var5);
         }

         public final StructSize structSize() {
            return hF.n.a;
         }

         public final hF.n.c a(hF.n.a var1) {
            return var1.a();
         }
      }

      public static final class c extends StructReader {
         c(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            super(var1, var2, var3, var4, var5, var6);
         }

         public hF.n.d.c a() {
            return new hF.n.d.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, this.nestingLimit);
         }
      }

      public static class d {
         public static final StructSize a = new StructSize((short)1, (short)0);
         public static final hF.n.d.b b = new hF.n.d.b();
         public static final Factory<hF.n.d.a, hF.n.d.c> c = new Factory(b);

         public static final class a extends StructBuilder {
            a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
               super(var1, var2, var3, var4, var5);
            }

            public hF.n.d.d a() {
               switch(this._getShortField(1)) {
                  case 0:
                     return hF.n.d.d.SPEECH_MODE;
                  case 1:
                     return hF.n.d.d.PLACEHOLDER;
                  default:
                     return hF.n.d.d._NOT_IN_SCHEMA;
               }
            }

            public final hF.n.d.c b() {
               return new hF.n.d.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
            }

            public final boolean c() {
               return this.a() == hF.n.d.d.SPEECH_MODE;
            }

            public final hG.b d() {
               assert this.a() == hF.n.d.d.SPEECH_MODE : "Must check which() before get()ing a union member.";

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
               this._setShortField(1, (short)hF.n.d.d.SPEECH_MODE.ordinal());
               this._setShortField(0, (short)var1.ordinal());
            }

            public final boolean e() {
               return this.a() == hF.n.d.d.PLACEHOLDER;
            }

            public final Void f() {
               assert this.a() == hF.n.d.d.PLACEHOLDER : "Must check which() before get()ing a union member.";

               return Void.VOID;
            }

            public final void a(Void var1) {
               this._setShortField(1, (short)hF.n.d.d.PLACEHOLDER.ordinal());
            }
         }

         public static final class b extends StructFactory<hF.n.d.a, hF.n.d.c> {
            public final hF.n.d.c a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
               return new hF.n.d.c(var1, var2, var3, var4, var5, var6);
            }

            public final hF.n.d.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
               return new hF.n.d.a(var1, var2, var3, var4, var5);
            }

            public final StructSize structSize() {
               return hF.n.d.a;
            }

            public final hF.n.d.c a(hF.n.d.a var1) {
               return var1.b();
            }
         }

         public static final class c extends StructReader {
            c(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
               super(var1, var2, var3, var4, var5, var6);
            }

            public hF.n.d.d a() {
               switch(this._getShortField(1)) {
                  case 0:
                     return hF.n.d.d.SPEECH_MODE;
                  case 1:
                     return hF.n.d.d.PLACEHOLDER;
                  default:
                     return hF.n.d.d._NOT_IN_SCHEMA;
               }
            }

            public final boolean b() {
               return this.a() == hF.n.d.d.SPEECH_MODE;
            }

            public final hG.b c() {
               assert this.a() == hF.n.d.d.SPEECH_MODE : "Must check which() before get()ing a union member.";

               switch(this._getShortField(0)) {
                  case 0:
                     return hG.b.EVERYONE;
                  case 1:
                     return hG.b.PROXIMITY;
                  default:
                     return hG.b._NOT_IN_SCHEMA;
               }
            }

            public final boolean d() {
               return this.a() == hF.n.d.d.PLACEHOLDER;
            }

            public final Void e() {
               assert this.a() == hF.n.d.d.PLACEHOLDER : "Must check which() before get()ing a union member.";

               return Void.VOID;
            }
         }

         public static enum d {
            SPEECH_MODE,
            PLACEHOLDER,
            _NOT_IN_SCHEMA;
         }
      }
   }

   public static final class o {
      public static final SegmentReader a = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000\fñ\u008bfóã\u009c\u00ad#\u0000\u0000\u0000\u0001\u0000\u0001\u0000d©ïõè²ØÃ\u0001\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000Z\u0001\u0000\u0000)\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000%\u0000\u0000\u0000?\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:Wrapper\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001A+3KS\rð\r\u0000\u0000\u0000Z\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000packetType\u0000\u0000\u0000\u0000\u0000\u0000"
      );
      public static final SegmentReader b = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000\u0001A+3KS\rð+\u0000\u0000\u0000\u0001\u0000\u0001\u0000\fñ\u008bfóã\u009c\u00ad\u0001\u0000\u0007\u0000\u0001\u0000\u000f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000²\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000%\u0000\u0000\u0000O\u0003\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:Wrapper.packetType\u0000\u0000\u0000<\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000ÿÿ\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0095\u0001\u0000\u0000R\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0094\u0001\u0000\u0000\u0003\u0000\u0001\u0000 \u0001\u0000\u0000\u0002\u0000\u0001\u0000\u0001\u0000þÿ\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u009d\u0001\u0000\u0000B\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0098\u0001\u0000\u0000\u0003\u0000\u0001\u0000¤\u0001\u0000\u0000\u0002\u0000\u0001\u0000\u0002\u0000ýÿ\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000¡\u0001\u0000\u0000z\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000 \u0001\u0000\u0000\u0003\u0000\u0001\u0000¬\u0001\u0000\u0000\u0002\u0000\u0001\u0000\u0003\u0000üÿ\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0003\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000©\u0001\u0000\u0000\u0092\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000¬\u0001\u0000\u0000\u0003\u0000\u0001\u0000¸\u0001\u0000\u0000\u0002\u0000\u0001\u0000\u0004\u0000ûÿ\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000µ\u0001\u0000\u0000\u0082\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000´\u0001\u0000\u0000\u0003\u0000\u0001\u0000À\u0001\u0000\u0000\u0002\u0000\u0001\u0000\u0005\u0000úÿ\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0005\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000½\u0001\u0000\u0000b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000¼\u0001\u0000\u0000\u0003\u0000\u0001\u0000È\u0001\u0000\u0000\u0002\u0000\u0001\u0000\u0006\u0000ùÿ\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0006\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000Å\u0001\u0000\u0000j\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000Ä\u0001\u0000\u0000\u0003\u0000\u0001\u0000Ð\u0001\u0000\u0000\u0002\u0000\u0001\u0000\u0007\u0000øÿ\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000Í\u0001\u0000\u0000b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000Ì\u0001\u0000\u0000\u0003\u0000\u0001\u0000Ø\u0001\u0000\u0000\u0002\u0000\u0001\u0000\b\u0000÷ÿ\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000Õ\u0001\u0000\u0000r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000Ô\u0001\u0000\u0000\u0003\u0000\u0001\u0000à\u0001\u0000\u0000\u0002\u0000\u0001\u0000\t\u0000öÿ\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\t\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000Ý\u0001\u0000\u0000b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000Ü\u0001\u0000\u0000\u0003\u0000\u0001\u0000è\u0001\u0000\u0000\u0002\u0000\u0001\u0000\n\u0000õÿ\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\n\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000å\u0001\u0000\u0000¢\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000è\u0001\u0000\u0000\u0003\u0000\u0001\u0000ô\u0001\u0000\u0000\u0002\u0000\u0001\u0000\u000b\u0000ôÿ\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u000b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000ñ\u0001\u0000\u0000Z\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000ð\u0001\u0000\u0000\u0003\u0000\u0001\u0000ü\u0001\u0000\u0000\u0002\u0000\u0001\u0000\f\u0000óÿ\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000ù\u0001\u0000\u0000r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000ø\u0001\u0000\u0000\u0003\u0000\u0001\u0000\u0004\u0002\u0000\u0000\u0002\u0000\u0001\u0000\r\u0000òÿ\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000z\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0002\u0000\u0000\u0003\u0000\u0001\u0000\f\u0002\u0000\u0000\u0002\u0000\u0001\u0000\u000e\u0000ñÿ\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\t\u0002\u0000\u0000\u0082\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\b\u0002\u0000\u0000\u0003\u0000\u0001\u0000\u0014\u0002\u0000\u0000\u0002\u0000\u0001\u0000handshake\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001½\u008d,\u000e¨\u008dÞ\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000metrics\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000õ?\u0015\u009bLPjì\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000trackingUpdate\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u008cN$\u0088S×¹\u0097\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000bulkOptionRequest\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0017á\u0013\u008aL\u0087O\u0096\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000cosmeticRequest\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u00002<&·\u0010É\u000e\u0093\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000cosmeticSet\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000Â[eÂ\u0096<\u0082Ê\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000emoteExecute\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u000bZ\u0006÷ø\u0014\u0085Ç\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000partyCreate\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0012}²)\u000f/\u0098ª\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000partySetOwner\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000F\u001dæ¬¢^é·\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000partyInvite\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000æá±~\b\u0001=¿\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000partyInviteResponse\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000y\u0001ª@9?ôÑ\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000partyLeave\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\"ò`\u007f\u0016HôÌ\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000partySettings\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0099BwJçt¤\u0098\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000p2pJoinRequest\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u00005jº\u0097n\u0010%ä\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000p2pJoinAccepted\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000]o0l9b¶î\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
      );
      public static final SegmentReader c = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000\u0001½\u008d,\u000e¨\u008dÞ#\u0000\u0000\u0000\u0001\u0000\u0000\u0000d©ïõè²ØÃ\u0001\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000j\u0001\u0000\u0000)\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000%\u0000\u0000\u0000?\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:Handshake\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000J\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\f\u0000\u0000\u0000\u0003\u0000\u0001\u0000\u0018\u0000\u0000\u0000\u0002\u0000\u0001\u0000jwtToken\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
      );
      public static final SegmentReader d = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000õ?\u0015\u009bLPjì#\u0000\u0000\u0000\u0001\u0000\u0001\u0000d©ïõè²ØÃ\u0001\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000Z\u0001\u0000\u0000)\u0000\u0000\u0000'\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000A\u0000\u0000\u0000?\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:Metrics\u0000\u0000\u0000\u0000\u0000\u0000\b\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u007f?\u0081\u0004\u0098\u001b\u0094û\t\u0000\u0000\u0000j\u0000\u0000\u0000\tO=[ x\u0016\u008f\t\u0000\u0000\u0000:\u0000\u0000\u0000StartMetrics\u0000\u0000\u0000\u0000Server\u0000\u0000\u0004\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000©?A2¢Q-È\r\u0000\u0000\u0000*\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000type\u0000\u0000\u0000\u0000"
      );
      public static final SegmentReader e = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000\u007f?\u0081\u0004\u0098\u001b\u0094û+\u0000\u0000\u0000\u0001\u0000\u0000\u0000õ?\u0015\u009bLPjì\u0005\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000Â\u0001\u0000\u0000-\u0000\u0000\u0000\u0017\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00009\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:Metrics.StartMetrics\u0000\u0004\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0086AøRóîßæ\u0001\u0000\u0000\u0000b\u0000\u0000\u0000MachineInfo\u0000\u0000\u0000\u0000\u0000\u0014\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000}\u0000\u0000\u0000b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000|\u0000\u0000\u0000\u0003\u0000\u0001\u0000\u0088\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0085\u0000\u0000\u0000\u008a\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0088\u0000\u0000\u0000\u0003\u0000\u0001\u0000\u0094\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0091\u0000\u0000\u0000*\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u008c\u0000\u0000\u0000\u0003\u0000\u0001\u0000¨\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0003\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0003\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000¥\u0000\u0000\u0000r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000¤\u0000\u0000\u0000\u0003\u0000\u0001\u0000À\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0004\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000½\u0000\u0000\u0000z\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000¼\u0000\u0000\u0000\u0003\u0000\u0001\u0000Ø\u0000\u0000\u0000\u0002\u0000\u0001\u0000machineInfo\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0086AøRóîßæ\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000minecraftVersion\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000mods\u0000\u0000\u0000\u0000\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0003\u0000\u0001\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000resourcePacks\u0000\u0000\u0000\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0003\u0000\u0001\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000enabledModules\u0000\u0000\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0003\u0000\u0001\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
      );
      public static final SegmentReader f = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000\u0086AøRóîßæ8\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u007f?\u0081\u0004\u0098\u001b\u0094û\u0003\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000\"\u0002\u0000\u00005\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00001\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:Metrics.StartMetrics.MachineInfo\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0014\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000}\u0000\u0000\u0000\u0082\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000|\u0000\u0000\u0000\u0003\u0000\u0001\u0000\u0088\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0085\u0000\u0000\u0000Z\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0084\u0000\u0000\u0000\u0003\u0000\u0001\u0000\u0090\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0002\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u008d\u0000\u0000\u0000R\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u008c\u0000\u0000\u0000\u0003\u0000\u0001\u0000\u0098\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0003\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0003\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0095\u0000\u0000\u0000J\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0094\u0000\u0000\u0000\u0003\u0000\u0001\u0000 \u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0004\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u009d\u0000\u0000\u0000J\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u009c\u0000\u0000\u0000\u0003\u0000\u0001\u0000¨\u0000\u0000\u0000\u0002\u0000\u0001\u0000operatingSystem\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000jvmThreads\u0000\u0000\u0000\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000jvmMemory\u0000\u0000\u0000\u0000\u0000\u0000\u0000\b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000cpuModel\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000gpuModel\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
      );
      public static final SegmentReader g = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000\tO=[ x\u0016\u008f+\u0000\u0000\u0000\u0001\u0000\u0001\u0000õ?\u0015\u009bLPjì\u0001\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u0092\u0001\u0000\u0000-\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000w\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:Metrics.Server\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\b\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000B\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000$\u0000\u0000\u0000\u0003\u0000\u0001\u00000\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000-\u0000\u0000\u0000*\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000(\u0000\u0000\u0000\u0003\u0000\u0001\u00004\u0000\u0000\u0000\u0002\u0000\u0001\u0000address\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000port\u0000\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
      );
      public static final SegmentReader h = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000©?A2¢Q-È+\u0000\u0000\u0000\u0001\u0000\u0001\u0000õ?\u0015\u009bLPjì\u0001\u0000\u0007\u0000\u0001\u0000\u0003\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u0082\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0000\u0000\u0000¯\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:Metrics.type\u0000\f\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000ÿÿ\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000E\u0000\u0000\u0000j\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000D\u0000\u0000\u0000\u0003\u0000\u0001\u0000P\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0001\u0000þÿ\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000M\u0000\u0000\u0000Z\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000L\u0000\u0000\u0000\u0003\u0000\u0001\u0000X\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0002\u0000ýÿ\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000U\u0000\u0000\u0000Z\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000T\u0000\u0000\u0000\u0003\u0000\u0001\u0000`\u0000\u0000\u0000\u0002\u0000\u0001\u0000startMetrics\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u007f?\u0081\u0004\u0098\u001b\u0094û\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000serverJoin\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\tO=[ x\u0016\u008f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000serverQuit\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
      );
      public static final SegmentReader i = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000\u008cN$\u0088S×¹\u0097#\u0000\u0000\u0000\u0001\u0000\u0001\u0000d©ïõè²ØÃ\u0001\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u0092\u0001\u0000\u0000-\u0000\u0000\u0000\u0017\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00009\u0000\u0000\u0000?\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:TrackingUpdate\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0018§ÜMÊ-z¥\u0001\u0000\u0000\u0000Z\u0000\u0000\u0000ListUpdate\u0000\u0000\u0000\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000Ui¹Í\u009eÐº»\r\u0000\u0000\u0000Z\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000updateType\u0000\u0000\u0000\u0000\u0000\u0000"
      );
      public static final SegmentReader j = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000\u0018§ÜMÊ-z¥2\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u008cN$\u0088S×¹\u0097\u0002\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000ê\u0001\u0000\u00001\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000-\u0000\u0000\u0000w\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:TrackingUpdate.ListUpdate\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\b\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u00002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000$\u0000\u0000\u0000\u0003\u0000\u0001\u0000@\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000=\u0000\u0000\u0000B\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00008\u0000\u0000\u0000\u0003\u0000\u0001\u0000T\u0000\u0000\u0000\u0002\u0000\u0001\u0000added\u0000\u0000\u0000\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0003\u0000\u0001\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000removed\u0000\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0003\u0000\u0001\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
      );
      public static final SegmentReader k = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000Ui¹Í\u009eÐº»2\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u008cN$\u0088S×¹\u0097\u0001\u0000\u0007\u0000\u0001\u0000\u0002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000ê\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000w\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:TrackingUpdate.updateType\u0000\u0000\u0000\u0000\b\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000ÿÿ\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000Z\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000(\u0000\u0000\u0000\u0003\u0000\u0001\u00004\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0001\u0000þÿ\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00001\u0000\u0000\u0000R\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00000\u0000\u0000\u0000\u0003\u0000\u0001\u0000<\u0000\u0000\u0000\u0002\u0000\u0001\u0000listUpdate\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0018§ÜMÊ-z¥\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000removeAll\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
      );
      public static final SegmentReader l = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000\u0017á\u0013\u008aL\u0087O\u0096#\u0000\u0000\u0000\u0001\u0000\u0000\u0000d©ïõè²ØÃ\u0001\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000ª\u0001\u0000\u0000-\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000?\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:BulkOptionRequest\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u00002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\b\u0000\u0000\u0000\u0003\u0000\u0001\u0000$\u0000\u0000\u0000\u0002\u0000\u0001\u0000uuids\u0000\u0000\u0000\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0003\u0000\u0001\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
      );
      public static final SegmentReader m = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u00002<&·\u0010É\u000e\u0093#\u0000\u0000\u0000\u0001\u0000\u0000\u0000d©ïõè²ØÃ\u0001\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u009a\u0001\u0000\u0000-\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000?\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:CosmeticRequest\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u00002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\b\u0000\u0000\u0000\u0003\u0000\u0001\u0000$\u0000\u0000\u0000\u0002\u0000\u0001\u0000uuids\u0000\u0000\u0000\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0003\u0000\u0001\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
      );
      public static final SegmentReader n = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000Â[eÂ\u0096<\u0082Ê#\u0000\u0000\u0000\u0001\u0000\u0000\u0000d©ïõè²ØÃ\u0001\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000z\u0001\u0000\u0000)\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000%\u0000\u0000\u0000?\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:CosmeticSet\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u00002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\b\u0000\u0000\u0000\u0003\u0000\u0001\u0000$\u0000\u0000\u0000\u0002\u0000\u0001\u0000slugs\u0000\u0000\u0000\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0003\u0000\u0001\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
      );
      public static final SegmentReader o = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000\u000bZ\u0006÷ø\u0014\u0085Ç#\u0000\u0000\u0000\u0001\u0000\u0000\u0000d©ïõè²ØÃ\u0001\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u0082\u0001\u0000\u0000)\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000%\u0000\u0000\u0000?\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:EmoteExecute\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000*\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\b\u0000\u0000\u0000\u0003\u0000\u0001\u0000\u0014\u0000\u0000\u0000\u0002\u0000\u0001\u0000slug\u0000\u0000\u0000\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
      );
      public static final SegmentReader p = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000\u0012}²)\u000f/\u0098ª#\u0000\u0000\u0000\u0001\u0000\u0000\u0000d©ïõè²ØÃ\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000z\u0001\u0000\u0000)\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:PartyCreate\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000"
      );
      public static final SegmentReader q = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000æá±~\b\u0001=¿#\u0000\u0000\u0000\u0001\u0000\u0000\u0000d©ïõè²ØÃ\u0001\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000z\u0001\u0000\u0000)\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000%\u0000\u0000\u0000?\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:PartyInvite\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000:\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\b\u0000\u0000\u0000\u0003\u0000\u0001\u0000\u0014\u0000\u0000\u0000\u0002\u0000\u0001\u0000target\u0000\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
      );
      public static final SegmentReader r = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000F\u001dæ¬¢^é·#\u0000\u0000\u0000\u0001\u0000\u0000\u0000d©ïõè²ØÃ\u0001\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u008a\u0001\u0000\u0000-\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000?\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:PartySetOwner\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000:\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\b\u0000\u0000\u0000\u0003\u0000\u0001\u0000\u0014\u0000\u0000\u0000\u0002\u0000\u0001\u0000target\u0000\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
      );
      public static final SegmentReader s = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000y\u0001ª@9?ôÑ#\u0000\u0000\u0000\u0001\u0000\u0001\u0000d©ïõè²ØÃ\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000º\u0001\u0000\u0000-\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000w\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:PartyInviteResponse\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\b\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000B\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000$\u0000\u0000\u0000\u0003\u0000\u0001\u00000\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0001\u0000\u0000\u0000 \u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000-\u0000\u0000\u0000:\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000(\u0000\u0000\u0000\u0003\u0000\u0001\u00004\u0000\u0000\u0000\u0002\u0000\u0001\u0000partyId\u0000\b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000accept\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
      );
      public static final SegmentReader t = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000\"ò`\u007f\u0016HôÌ#\u0000\u0000\u0000\u0001\u0000\u0001\u0000d©ïõè²ØÃ\u0001\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000r\u0001\u0000\u0000)\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000%\u0000\u0000\u0000?\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:PartyLeave\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000Y\u0089\u0080\u0004\t\u00adWñ\r\u0000\u0000\u0000:\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000target\u0000\u0000"
      );
      public static final SegmentReader u = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000Y\u0089\u0080\u0004\t\u00adWñ.\u0000\u0000\u0000\u0001\u0000\u0001\u0000\"ò`\u007f\u0016HôÌ\u0001\u0000\u0007\u0000\u0001\u0000\u0002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000ª\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000%\u0000\u0000\u0000w\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:PartyLeave.target\u0000\u0000\u0000\u0000\b\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000ÿÿ\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000\u001a\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000$\u0000\u0000\u0000\u0003\u0000\u0001\u00000\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0001\u0000þÿ\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000-\u0000\u0000\u0000:\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000(\u0000\u0000\u0000\u0003\u0000\u0001\u00004\u0000\u0000\u0000\u0002\u0000\u0001\u0000me\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000target\u0000\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
      );
      public static final SegmentReader v = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000\u0099BwJçt¤\u0098#\u0000\u0000\u0000\u0001\u0000\u0001\u0000d©ïõè²ØÃ\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u008a\u0001\u0000\u0000-\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000?\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:PartySettings\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u007fÂ9i\u0000sÈ\u0097\r\u0000\u0000\u0000*\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000type\u0000\u0000\u0000\u0000"
      );
      public static final SegmentReader w = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000\u007fÂ9i\u0000sÈ\u00971\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0099BwJçt¤\u0098\u0000\u0000\u0007\u0000\u0001\u0000\u0002\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000²\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000%\u0000\u0000\u0000w\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:PartySettings.type\u0000\u0000\u0000\b\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000ÿÿ\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000Z\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000(\u0000\u0000\u0000\u0003\u0000\u0001\u00004\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0001\u0000þÿ\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00001\u0000\u0000\u0000b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00000\u0000\u0000\u0000\u0003\u0000\u0001\u0000<\u0000\u0000\u0000\u0002\u0000\u0001\u0000speechMode\u0000\u0000\u0000\u0000\u0000\u0000\u000f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0018ûÎìÖ«SÏ\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u000f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000placeholder\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
      );
      public static final SegmentReader x = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u00005jº\u0097n\u0010%ä#\u0000\u0000\u0000\u0001\u0000\u0000\u0000d©ïõè²ØÃ\u0002\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u0092\u0001\u0000\u0000-\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000w\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:P2pJoinRequest\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\b\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000:\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000$\u0000\u0000\u0000\u0003\u0000\u0001\u00000\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000-\u0000\u0000\u0000z\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000,\u0000\u0000\u0000\u0003\u0000\u0001\u00008\u0000\u0000\u0000\u0002\u0000\u0001\u0000target\u0000\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000rendezvousInfo\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u001e\u00171I#)T¶\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
      );
      public static final SegmentReader y = GeneratedClassSupport.decodeRawBytes(
         "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000]o0l9b¶î#\u0000\u0000\u0000\u0001\u0000\u0000\u0000d©ïõè²ØÃ\u0002\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u009a\u0001\u0000\u0000-\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000w\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:P2pJoinAccepted\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\b\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000:\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000$\u0000\u0000\u0000\u0003\u0000\u0001\u00000\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000-\u0000\u0000\u0000z\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000,\u0000\u0000\u0000\u0003\u0000\u0001\u00008\u0000\u0000\u0000\u0002\u0000\u0001\u0000origin\u0000\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000rendezvousInfo\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u001e\u00171I#)T¶\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
      );
   }

   public static class p {
      public static final StructSize a = new StructSize((short)1, (short)1);
      public static final hF.p.b b = new hF.p.b();
      public static final Factory<hF.p.a, hF.p.d> c = new Factory(b);

      public static final class a extends StructBuilder {
         a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            super(var1, var2, var3, var4, var5);
         }

         public final hF.p.d a() {
            return new hF.p.d(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
         }

         public final hF.p.e.a b() {
            return new hF.p.e.a(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
         }

         public final hF.p.e.a c() {
            this._setShortField(0, (short)0);
            this._clearPointerField(0);
            return new hF.p.e.a(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
         }
      }

      public static final class b extends StructFactory<hF.p.a, hF.p.d> {
         public final hF.p.d a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return new hF.p.d(var1, var2, var3, var4, var5, var6);
         }

         public final hF.p.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return new hF.p.a(var1, var2, var3, var4, var5);
         }

         public final StructSize structSize() {
            return hF.p.a;
         }

         public final hF.p.d a(hF.p.a var1) {
            return var1.a();
         }
      }

      public static class c {
         public static final StructSize a = new StructSize((short)0, (short)2);
         public static final hF.p.c.b b = new hF.p.c.b();
         public static final Factory<hF.p.c.a, hF.p.c.c> c = new Factory(b);

         public static final class a extends StructBuilder {
            a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
               super(var1, var2, var3, var4, var5);
            }

            public final hF.p.c.c a() {
               return new hF.p.c.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
            }

            public final boolean b() {
               return !this._pointerFieldIsNull(0);
            }

            public final Builder c() {
               return (Builder)this._getPointerField(DataList.factory, 0, null, 0);
            }

            public final void a(Reader var1) {
               this._setPointerField(DataList.factory, 0, var1);
            }

            public final Builder a(int var1) {
               return (Builder)this._initPointerField(DataList.factory, 0, var1);
            }

            public final boolean d() {
               return !this._pointerFieldIsNull(1);
            }

            public final Builder e() {
               return (Builder)this._getPointerField(DataList.factory, 1, null, 0);
            }

            public final void b(Reader var1) {
               this._setPointerField(DataList.factory, 1, var1);
            }

            public final Builder b(int var1) {
               return (Builder)this._initPointerField(DataList.factory, 1, var1);
            }
         }

         public static final class b extends StructFactory<hF.p.c.a, hF.p.c.c> {
            public final hF.p.c.c a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
               return new hF.p.c.c(var1, var2, var3, var4, var5, var6);
            }

            public final hF.p.c.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
               return new hF.p.c.a(var1, var2, var3, var4, var5);
            }

            public final StructSize structSize() {
               return hF.p.c.a;
            }

            public final hF.p.c.c a(hF.p.c.a var1) {
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

            public final Reader b() {
               return (Reader)this._getPointerField(DataList.factory, 0, null, 0);
            }

            public final boolean c() {
               return !this._pointerFieldIsNull(1);
            }

            public final Reader d() {
               return (Reader)this._getPointerField(DataList.factory, 1, null, 0);
            }
         }
      }

      public static final class d extends StructReader {
         d(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            super(var1, var2, var3, var4, var5, var6);
         }

         public hF.p.e.c a() {
            return new hF.p.e.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, this.nestingLimit);
         }
      }

      public static class e {
         public static final StructSize a = new StructSize((short)1, (short)1);
         public static final hF.p.e.b b = new hF.p.e.b();
         public static final Factory<hF.p.e.a, hF.p.e.c> c = new Factory(b);

         public static final class a extends StructBuilder {
            a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
               super(var1, var2, var3, var4, var5);
            }

            public hF.p.e.d a() {
               switch(this._getShortField(0)) {
                  case 0:
                     return hF.p.e.d.LIST_UPDATE;
                  case 1:
                     return hF.p.e.d.REMOVE_ALL;
                  default:
                     return hF.p.e.d._NOT_IN_SCHEMA;
               }
            }

            public final hF.p.e.c b() {
               return new hF.p.e.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
            }

            public final boolean c() {
               return this.a() == hF.p.e.d.LIST_UPDATE;
            }

            public final hF.p.c.a d() {
               assert this.a() == hF.p.e.d.LIST_UPDATE : "Must check which() before get()ing a union member.";

               return (hF.p.c.a)this._getPointerField(hF.p.c.b, 0, null, 0);
            }

            public final void a(hF.p.c.c var1) {
               this._setShortField(0, (short)hF.p.e.d.LIST_UPDATE.ordinal());
               this._setPointerField(hF.p.c.b, 0, var1);
            }

            public final hF.p.c.a e() {
               this._setShortField(0, (short)hF.p.e.d.LIST_UPDATE.ordinal());
               return (hF.p.c.a)this._initPointerField(hF.p.c.b, 0, 0);
            }

            public final boolean f() {
               return this.a() == hF.p.e.d.REMOVE_ALL;
            }

            public final Void g() {
               assert this.a() == hF.p.e.d.REMOVE_ALL : "Must check which() before get()ing a union member.";

               return Void.VOID;
            }

            public final void a(Void var1) {
               this._setShortField(0, (short)hF.p.e.d.REMOVE_ALL.ordinal());
            }
         }

         public static final class b extends StructFactory<hF.p.e.a, hF.p.e.c> {
            public final hF.p.e.c a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
               return new hF.p.e.c(var1, var2, var3, var4, var5, var6);
            }

            public final hF.p.e.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
               return new hF.p.e.a(var1, var2, var3, var4, var5);
            }

            public final StructSize structSize() {
               return hF.p.e.a;
            }

            public final hF.p.e.c a(hF.p.e.a var1) {
               return var1.b();
            }
         }

         public static final class c extends StructReader {
            c(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
               super(var1, var2, var3, var4, var5, var6);
            }

            public hF.p.e.d a() {
               switch(this._getShortField(0)) {
                  case 0:
                     return hF.p.e.d.LIST_UPDATE;
                  case 1:
                     return hF.p.e.d.REMOVE_ALL;
                  default:
                     return hF.p.e.d._NOT_IN_SCHEMA;
               }
            }

            public final boolean b() {
               return this.a() == hF.p.e.d.LIST_UPDATE;
            }

            public boolean c() {
               return !this._pointerFieldIsNull(0);
            }

            public hF.p.c.c d() {
               assert this.a() == hF.p.e.d.LIST_UPDATE : "Must check which() before get()ing a union member.";

               return (hF.p.c.c)this._getPointerField(hF.p.c.b, 0, null, 0);
            }

            public final boolean e() {
               return this.a() == hF.p.e.d.REMOVE_ALL;
            }

            public final Void f() {
               assert this.a() == hF.p.e.d.REMOVE_ALL : "Must check which() before get()ing a union member.";

               return Void.VOID;
            }
         }

         public static enum d {
            LIST_UPDATE,
            REMOVE_ALL,
            _NOT_IN_SCHEMA;
         }
      }
   }

   public static class q {
      public static final StructSize a = new StructSize((short)1, (short)1);
      public static final hF.q.b b = new hF.q.b();
      public static final Factory<hF.q.a, hF.q.d> c = new Factory(b);

      public static final class a extends StructBuilder {
         a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            super(var1, var2, var3, var4, var5);
         }

         public final hF.q.d a() {
            return new hF.q.d(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
         }

         public final hF.q.c.a b() {
            return new hF.q.c.a(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
         }

         public final hF.q.c.a c() {
            this._setShortField(0, (short)0);
            this._clearPointerField(0);
            return new hF.q.c.a(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
         }
      }

      public static final class b extends StructFactory<hF.q.a, hF.q.d> {
         public final hF.q.d a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return new hF.q.d(var1, var2, var3, var4, var5, var6);
         }

         public final hF.q.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return new hF.q.a(var1, var2, var3, var4, var5);
         }

         public final StructSize structSize() {
            return hF.q.a;
         }

         public final hF.q.d a(hF.q.a var1) {
            return var1.a();
         }
      }

      public static class c {
         public static final StructSize a = new StructSize((short)1, (short)1);
         public static final hF.q.c.b b = new hF.q.c.b();
         public static final Factory<hF.q.c.a, hF.q.c.c> c = new Factory(b);

         public static final class a extends StructBuilder {
            a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
               super(var1, var2, var3, var4, var5);
            }

            public hF.q.c.d a() {
               switch(this._getShortField(0)) {
                  case 0:
                     return hF.q.c.d.HANDSHAKE;
                  case 1:
                     return hF.q.c.d.METRICS;
                  case 2:
                     return hF.q.c.d.TRACKING_UPDATE;
                  case 3:
                     return hF.q.c.d.BULK_OPTION_REQUEST;
                  case 4:
                     return hF.q.c.d.COSMETIC_REQUEST;
                  case 5:
                     return hF.q.c.d.COSMETIC_SET;
                  case 6:
                     return hF.q.c.d.EMOTE_EXECUTE;
                  case 7:
                     return hF.q.c.d.PARTY_CREATE;
                  case 8:
                     return hF.q.c.d.PARTY_SET_OWNER;
                  case 9:
                     return hF.q.c.d.PARTY_INVITE;
                  case 10:
                     return hF.q.c.d.PARTY_INVITE_RESPONSE;
                  case 11:
                     return hF.q.c.d.PARTY_LEAVE;
                  case 12:
                     return hF.q.c.d.PARTY_SETTINGS;
                  case 13:
                     return hF.q.c.d.P2P_JOIN_REQUEST;
                  case 14:
                     return hF.q.c.d.P2P_JOIN_ACCEPTED;
                  default:
                     return hF.q.c.d._NOT_IN_SCHEMA;
               }
            }

            public final hF.q.c.c b() {
               return new hF.q.c.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
            }

            public final boolean c() {
               return this.a() == hF.q.c.d.HANDSHAKE;
            }

            public final hF.e.a d() {
               assert this.a() == hF.q.c.d.HANDSHAKE : "Must check which() before get()ing a union member.";

               return (hF.e.a)this._getPointerField(hF.e.b, 0, null, 0);
            }

            public final void a(hF.e.c var1) {
               this._setShortField(0, (short)hF.q.c.d.HANDSHAKE.ordinal());
               this._setPointerField(hF.e.b, 0, var1);
            }

            public final hF.e.a e() {
               this._setShortField(0, (short)hF.q.c.d.HANDSHAKE.ordinal());
               return (hF.e.a)this._initPointerField(hF.e.b, 0, 0);
            }

            public final boolean f() {
               return this.a() == hF.q.c.d.METRICS;
            }

            public final hF.f.a g() {
               assert this.a() == hF.q.c.d.METRICS : "Must check which() before get()ing a union member.";

               return (hF.f.a)this._getPointerField(hF.f.b, 0, null, 0);
            }

            public final void a(hF.f.c var1) {
               this._setShortField(0, (short)hF.q.c.d.METRICS.ordinal());
               this._setPointerField(hF.f.b, 0, var1);
            }

            public final hF.f.a h() {
               this._setShortField(0, (short)hF.q.c.d.METRICS.ordinal());
               return (hF.f.a)this._initPointerField(hF.f.b, 0, 0);
            }

            public final boolean i() {
               return this.a() == hF.q.c.d.TRACKING_UPDATE;
            }

            public final hF.p.a j() {
               assert this.a() == hF.q.c.d.TRACKING_UPDATE : "Must check which() before get()ing a union member.";

               return (hF.p.a)this._getPointerField(hF.p.b, 0, null, 0);
            }

            public final void a(hF.p.d var1) {
               this._setShortField(0, (short)hF.q.c.d.TRACKING_UPDATE.ordinal());
               this._setPointerField(hF.p.b, 0, var1);
            }

            public final hF.p.a k() {
               this._setShortField(0, (short)hF.q.c.d.TRACKING_UPDATE.ordinal());
               return (hF.p.a)this._initPointerField(hF.p.b, 0, 0);
            }

            public final boolean l() {
               return this.a() == hF.q.c.d.BULK_OPTION_REQUEST;
            }

            public final hF.a.a m() {
               assert this.a() == hF.q.c.d.BULK_OPTION_REQUEST : "Must check which() before get()ing a union member.";

               return (hF.a.a)this._getPointerField(hF.a.b, 0, null, 0);
            }

            public final void a(hF.a.c var1) {
               this._setShortField(0, (short)hF.q.c.d.BULK_OPTION_REQUEST.ordinal());
               this._setPointerField(hF.a.b, 0, var1);
            }

            public final hF.a.a n() {
               this._setShortField(0, (short)hF.q.c.d.BULK_OPTION_REQUEST.ordinal());
               return (hF.a.a)this._initPointerField(hF.a.b, 0, 0);
            }

            public final boolean o() {
               return this.a() == hF.q.c.d.COSMETIC_REQUEST;
            }

            public final hF.b.a p() {
               assert this.a() == hF.q.c.d.COSMETIC_REQUEST : "Must check which() before get()ing a union member.";

               return (hF.b.a)this._getPointerField(hF.b.b, 0, null, 0);
            }

            public final void a(hF.b.c var1) {
               this._setShortField(0, (short)hF.q.c.d.COSMETIC_REQUEST.ordinal());
               this._setPointerField(hF.b.b, 0, var1);
            }

            public final hF.b.a q() {
               this._setShortField(0, (short)hF.q.c.d.COSMETIC_REQUEST.ordinal());
               return (hF.b.a)this._initPointerField(hF.b.b, 0, 0);
            }

            public final boolean r() {
               return this.a() == hF.q.c.d.COSMETIC_SET;
            }

            public final hF.c.a s() {
               assert this.a() == hF.q.c.d.COSMETIC_SET : "Must check which() before get()ing a union member.";

               return (hF.c.a)this._getPointerField(hF.c.b, 0, null, 0);
            }

            public final void a(hF.c.c var1) {
               this._setShortField(0, (short)hF.q.c.d.COSMETIC_SET.ordinal());
               this._setPointerField(hF.c.b, 0, var1);
            }

            public final hF.c.a t() {
               this._setShortField(0, (short)hF.q.c.d.COSMETIC_SET.ordinal());
               return (hF.c.a)this._initPointerField(hF.c.b, 0, 0);
            }

            public final boolean u() {
               return this.a() == hF.q.c.d.EMOTE_EXECUTE;
            }

            public final hF.d.a v() {
               assert this.a() == hF.q.c.d.EMOTE_EXECUTE : "Must check which() before get()ing a union member.";

               return (hF.d.a)this._getPointerField(hF.d.b, 0, null, 0);
            }

            public final void a(hF.d.c var1) {
               this._setShortField(0, (short)hF.q.c.d.EMOTE_EXECUTE.ordinal());
               this._setPointerField(hF.d.b, 0, var1);
            }

            public final hF.d.a w() {
               this._setShortField(0, (short)hF.q.c.d.EMOTE_EXECUTE.ordinal());
               return (hF.d.a)this._initPointerField(hF.d.b, 0, 0);
            }

            public final boolean x() {
               return this.a() == hF.q.c.d.PARTY_CREATE;
            }

            public final hF.i.a y() {
               assert this.a() == hF.q.c.d.PARTY_CREATE : "Must check which() before get()ing a union member.";

               return (hF.i.a)this._getPointerField(hF.i.b, 0, null, 0);
            }

            public final void a(hF.i.c var1) {
               this._setShortField(0, (short)hF.q.c.d.PARTY_CREATE.ordinal());
               this._setPointerField(hF.i.b, 0, var1);
            }

            public final hF.i.a z() {
               this._setShortField(0, (short)hF.q.c.d.PARTY_CREATE.ordinal());
               return (hF.i.a)this._initPointerField(hF.i.b, 0, 0);
            }

            public final boolean A() {
               return this.a() == hF.q.c.d.PARTY_SET_OWNER;
            }

            public final hF.m.a B() {
               assert this.a() == hF.q.c.d.PARTY_SET_OWNER : "Must check which() before get()ing a union member.";

               return (hF.m.a)this._getPointerField(hF.m.b, 0, null, 0);
            }

            public final void a(hF.m.c var1) {
               this._setShortField(0, (short)hF.q.c.d.PARTY_SET_OWNER.ordinal());
               this._setPointerField(hF.m.b, 0, var1);
            }

            public final hF.m.a C() {
               this._setShortField(0, (short)hF.q.c.d.PARTY_SET_OWNER.ordinal());
               return (hF.m.a)this._initPointerField(hF.m.b, 0, 0);
            }

            public final boolean D() {
               return this.a() == hF.q.c.d.PARTY_INVITE;
            }

            public final hF.j.a E() {
               assert this.a() == hF.q.c.d.PARTY_INVITE : "Must check which() before get()ing a union member.";

               return (hF.j.a)this._getPointerField(hF.j.b, 0, null, 0);
            }

            public final void a(hF.j.c var1) {
               this._setShortField(0, (short)hF.q.c.d.PARTY_INVITE.ordinal());
               this._setPointerField(hF.j.b, 0, var1);
            }

            public final hF.j.a F() {
               this._setShortField(0, (short)hF.q.c.d.PARTY_INVITE.ordinal());
               return (hF.j.a)this._initPointerField(hF.j.b, 0, 0);
            }

            public final boolean G() {
               return this.a() == hF.q.c.d.PARTY_INVITE_RESPONSE;
            }

            public final hF.k.a H() {
               assert this.a() == hF.q.c.d.PARTY_INVITE_RESPONSE : "Must check which() before get()ing a union member.";

               return (hF.k.a)this._getPointerField(hF.k.b, 0, null, 0);
            }

            public final void a(hF.k.c var1) {
               this._setShortField(0, (short)hF.q.c.d.PARTY_INVITE_RESPONSE.ordinal());
               this._setPointerField(hF.k.b, 0, var1);
            }

            public final hF.k.a I() {
               this._setShortField(0, (short)hF.q.c.d.PARTY_INVITE_RESPONSE.ordinal());
               return (hF.k.a)this._initPointerField(hF.k.b, 0, 0);
            }

            public final boolean J() {
               return this.a() == hF.q.c.d.PARTY_LEAVE;
            }

            public final hF.l.a K() {
               assert this.a() == hF.q.c.d.PARTY_LEAVE : "Must check which() before get()ing a union member.";

               return (hF.l.a)this._getPointerField(hF.l.b, 0, null, 0);
            }

            public final void a(hF.l.c var1) {
               this._setShortField(0, (short)hF.q.c.d.PARTY_LEAVE.ordinal());
               this._setPointerField(hF.l.b, 0, var1);
            }

            public final hF.l.a L() {
               this._setShortField(0, (short)hF.q.c.d.PARTY_LEAVE.ordinal());
               return (hF.l.a)this._initPointerField(hF.l.b, 0, 0);
            }

            public final boolean M() {
               return this.a() == hF.q.c.d.PARTY_SETTINGS;
            }

            public final hF.n.a N() {
               assert this.a() == hF.q.c.d.PARTY_SETTINGS : "Must check which() before get()ing a union member.";

               return (hF.n.a)this._getPointerField(hF.n.b, 0, null, 0);
            }

            public final void a(hF.n.c var1) {
               this._setShortField(0, (short)hF.q.c.d.PARTY_SETTINGS.ordinal());
               this._setPointerField(hF.n.b, 0, var1);
            }

            public final hF.n.a O() {
               this._setShortField(0, (short)hF.q.c.d.PARTY_SETTINGS.ordinal());
               return (hF.n.a)this._initPointerField(hF.n.b, 0, 0);
            }

            public final boolean P() {
               return this.a() == hF.q.c.d.P2P_JOIN_REQUEST;
            }

            public final hF.h.a Q() {
               assert this.a() == hF.q.c.d.P2P_JOIN_REQUEST : "Must check which() before get()ing a union member.";

               return (hF.h.a)this._getPointerField(hF.h.b, 0, null, 0);
            }

            public final void a(hF.h.c var1) {
               this._setShortField(0, (short)hF.q.c.d.P2P_JOIN_REQUEST.ordinal());
               this._setPointerField(hF.h.b, 0, var1);
            }

            public final hF.h.a R() {
               this._setShortField(0, (short)hF.q.c.d.P2P_JOIN_REQUEST.ordinal());
               return (hF.h.a)this._initPointerField(hF.h.b, 0, 0);
            }

            public final boolean S() {
               return this.a() == hF.q.c.d.P2P_JOIN_ACCEPTED;
            }

            public final hF.g.a T() {
               assert this.a() == hF.q.c.d.P2P_JOIN_ACCEPTED : "Must check which() before get()ing a union member.";

               return (hF.g.a)this._getPointerField(hF.g.b, 0, null, 0);
            }

            public final void a(hF.g.c var1) {
               this._setShortField(0, (short)hF.q.c.d.P2P_JOIN_ACCEPTED.ordinal());
               this._setPointerField(hF.g.b, 0, var1);
            }

            public final hF.g.a U() {
               this._setShortField(0, (short)hF.q.c.d.P2P_JOIN_ACCEPTED.ordinal());
               return (hF.g.a)this._initPointerField(hF.g.b, 0, 0);
            }
         }

         public static final class b extends StructFactory<hF.q.c.a, hF.q.c.c> {
            public final hF.q.c.c a(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
               return new hF.q.c.c(var1, var2, var3, var4, var5, var6);
            }

            public final hF.q.c.a a(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
               return new hF.q.c.a(var1, var2, var3, var4, var5);
            }

            public final StructSize structSize() {
               return hF.q.c.a;
            }

            public final hF.q.c.c a(hF.q.c.a var1) {
               return var1.b();
            }
         }

         public static final class c extends StructReader {
            c(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
               super(var1, var2, var3, var4, var5, var6);
            }

            public hF.q.c.d a() {
               switch(this._getShortField(0)) {
                  case 0:
                     return hF.q.c.d.HANDSHAKE;
                  case 1:
                     return hF.q.c.d.METRICS;
                  case 2:
                     return hF.q.c.d.TRACKING_UPDATE;
                  case 3:
                     return hF.q.c.d.BULK_OPTION_REQUEST;
                  case 4:
                     return hF.q.c.d.COSMETIC_REQUEST;
                  case 5:
                     return hF.q.c.d.COSMETIC_SET;
                  case 6:
                     return hF.q.c.d.EMOTE_EXECUTE;
                  case 7:
                     return hF.q.c.d.PARTY_CREATE;
                  case 8:
                     return hF.q.c.d.PARTY_SET_OWNER;
                  case 9:
                     return hF.q.c.d.PARTY_INVITE;
                  case 10:
                     return hF.q.c.d.PARTY_INVITE_RESPONSE;
                  case 11:
                     return hF.q.c.d.PARTY_LEAVE;
                  case 12:
                     return hF.q.c.d.PARTY_SETTINGS;
                  case 13:
                     return hF.q.c.d.P2P_JOIN_REQUEST;
                  case 14:
                     return hF.q.c.d.P2P_JOIN_ACCEPTED;
                  default:
                     return hF.q.c.d._NOT_IN_SCHEMA;
               }
            }

            public final boolean b() {
               return this.a() == hF.q.c.d.HANDSHAKE;
            }

            public boolean c() {
               return !this._pointerFieldIsNull(0);
            }

            public hF.e.c d() {
               assert this.a() == hF.q.c.d.HANDSHAKE : "Must check which() before get()ing a union member.";

               return (hF.e.c)this._getPointerField(hF.e.b, 0, null, 0);
            }

            public final boolean e() {
               return this.a() == hF.q.c.d.METRICS;
            }

            public boolean f() {
               return !this._pointerFieldIsNull(0);
            }

            public hF.f.c g() {
               assert this.a() == hF.q.c.d.METRICS : "Must check which() before get()ing a union member.";

               return (hF.f.c)this._getPointerField(hF.f.b, 0, null, 0);
            }

            public final boolean h() {
               return this.a() == hF.q.c.d.TRACKING_UPDATE;
            }

            public boolean i() {
               return !this._pointerFieldIsNull(0);
            }

            public hF.p.d j() {
               assert this.a() == hF.q.c.d.TRACKING_UPDATE : "Must check which() before get()ing a union member.";

               return (hF.p.d)this._getPointerField(hF.p.b, 0, null, 0);
            }

            public final boolean k() {
               return this.a() == hF.q.c.d.BULK_OPTION_REQUEST;
            }

            public boolean l() {
               return !this._pointerFieldIsNull(0);
            }

            public hF.a.c m() {
               assert this.a() == hF.q.c.d.BULK_OPTION_REQUEST : "Must check which() before get()ing a union member.";

               return (hF.a.c)this._getPointerField(hF.a.b, 0, null, 0);
            }

            public final boolean n() {
               return this.a() == hF.q.c.d.COSMETIC_REQUEST;
            }

            public boolean o() {
               return !this._pointerFieldIsNull(0);
            }

            public hF.b.c p() {
               assert this.a() == hF.q.c.d.COSMETIC_REQUEST : "Must check which() before get()ing a union member.";

               return (hF.b.c)this._getPointerField(hF.b.b, 0, null, 0);
            }

            public final boolean q() {
               return this.a() == hF.q.c.d.COSMETIC_SET;
            }

            public boolean r() {
               return !this._pointerFieldIsNull(0);
            }

            public hF.c.c s() {
               assert this.a() == hF.q.c.d.COSMETIC_SET : "Must check which() before get()ing a union member.";

               return (hF.c.c)this._getPointerField(hF.c.b, 0, null, 0);
            }

            public final boolean t() {
               return this.a() == hF.q.c.d.EMOTE_EXECUTE;
            }

            public boolean u() {
               return !this._pointerFieldIsNull(0);
            }

            public hF.d.c v() {
               assert this.a() == hF.q.c.d.EMOTE_EXECUTE : "Must check which() before get()ing a union member.";

               return (hF.d.c)this._getPointerField(hF.d.b, 0, null, 0);
            }

            public final boolean w() {
               return this.a() == hF.q.c.d.PARTY_CREATE;
            }

            public boolean x() {
               return !this._pointerFieldIsNull(0);
            }

            public hF.i.c y() {
               assert this.a() == hF.q.c.d.PARTY_CREATE : "Must check which() before get()ing a union member.";

               return (hF.i.c)this._getPointerField(hF.i.b, 0, null, 0);
            }

            public final boolean z() {
               return this.a() == hF.q.c.d.PARTY_SET_OWNER;
            }

            public boolean A() {
               return !this._pointerFieldIsNull(0);
            }

            public hF.m.c B() {
               assert this.a() == hF.q.c.d.PARTY_SET_OWNER : "Must check which() before get()ing a union member.";

               return (hF.m.c)this._getPointerField(hF.m.b, 0, null, 0);
            }

            public final boolean C() {
               return this.a() == hF.q.c.d.PARTY_INVITE;
            }

            public boolean D() {
               return !this._pointerFieldIsNull(0);
            }

            public hF.j.c E() {
               assert this.a() == hF.q.c.d.PARTY_INVITE : "Must check which() before get()ing a union member.";

               return (hF.j.c)this._getPointerField(hF.j.b, 0, null, 0);
            }

            public final boolean F() {
               return this.a() == hF.q.c.d.PARTY_INVITE_RESPONSE;
            }

            public boolean G() {
               return !this._pointerFieldIsNull(0);
            }

            public hF.k.c H() {
               assert this.a() == hF.q.c.d.PARTY_INVITE_RESPONSE : "Must check which() before get()ing a union member.";

               return (hF.k.c)this._getPointerField(hF.k.b, 0, null, 0);
            }

            public final boolean I() {
               return this.a() == hF.q.c.d.PARTY_LEAVE;
            }

            public boolean J() {
               return !this._pointerFieldIsNull(0);
            }

            public hF.l.c K() {
               assert this.a() == hF.q.c.d.PARTY_LEAVE : "Must check which() before get()ing a union member.";

               return (hF.l.c)this._getPointerField(hF.l.b, 0, null, 0);
            }

            public final boolean L() {
               return this.a() == hF.q.c.d.PARTY_SETTINGS;
            }

            public boolean M() {
               return !this._pointerFieldIsNull(0);
            }

            public hF.n.c N() {
               assert this.a() == hF.q.c.d.PARTY_SETTINGS : "Must check which() before get()ing a union member.";

               return (hF.n.c)this._getPointerField(hF.n.b, 0, null, 0);
            }

            public final boolean O() {
               return this.a() == hF.q.c.d.P2P_JOIN_REQUEST;
            }

            public boolean P() {
               return !this._pointerFieldIsNull(0);
            }

            public hF.h.c Q() {
               assert this.a() == hF.q.c.d.P2P_JOIN_REQUEST : "Must check which() before get()ing a union member.";

               return (hF.h.c)this._getPointerField(hF.h.b, 0, null, 0);
            }

            public final boolean R() {
               return this.a() == hF.q.c.d.P2P_JOIN_ACCEPTED;
            }

            public boolean S() {
               return !this._pointerFieldIsNull(0);
            }

            public hF.g.c T() {
               assert this.a() == hF.q.c.d.P2P_JOIN_ACCEPTED : "Must check which() before get()ing a union member.";

               return (hF.g.c)this._getPointerField(hF.g.b, 0, null, 0);
            }
         }

         public static enum d {
            HANDSHAKE,
            METRICS,
            TRACKING_UPDATE,
            BULK_OPTION_REQUEST,
            COSMETIC_REQUEST,
            COSMETIC_SET,
            EMOTE_EXECUTE,
            PARTY_CREATE,
            PARTY_SET_OWNER,
            PARTY_INVITE,
            PARTY_INVITE_RESPONSE,
            PARTY_LEAVE,
            PARTY_SETTINGS,
            P2P_JOIN_REQUEST,
            P2P_JOIN_ACCEPTED,
            _NOT_IN_SCHEMA;
         }
      }

      public static final class d extends StructReader {
         d(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            super(var1, var2, var3, var4, var5, var6);
         }

         public hF.q.c.c a() {
            return new hF.q.c.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, this.nestingLimit);
         }
      }
   }
}
