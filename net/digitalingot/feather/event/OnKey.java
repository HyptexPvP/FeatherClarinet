package net.digitalingot.feather.event;

import java.lang.reflect.Method;

final class OnKey {
   private static final OnKey.a a;

   static void a(java.awt.event.KeyEvent var0, int var1) {
      a.a(var0, var1);
   }

   static {
      if (System.getProperty("os.name").startsWith("Windows")) {
         a = new OnKey.c();
      } else {
         a = new OnKey.b();
      }

   }

   interface a {
      void a(java.awt.event.KeyEvent var1, int var2);
   }

   static class b implements OnKey.a {
      private b() {
      }

      @Override
      public void a(java.awt.event.KeyEvent var1, int var2) {
      }
   }

   static class c extends OnKey.b {
      private static final int a = 0;
      private static final int b = 0;
      private static final Method c;

      private c() {
      }

      @Override
      public void a(java.awt.event.KeyEvent var1, int var2) {
         int var3 = b(var2);
         if (var3 != 0) {
            int var4 = a(var3);
            if (var4 != 0) {
               KeyEvent.a(var1, var4);
            }
         }

      }

      private static int a(int var0) {
         try {
            return c.invoke(null, var0, 0);
         } catch (Throwable var2) {
            return 0;
         }
      }

      private static int b(int var0) {
         switch(var0) {
            case 1:
               return 27;
            case 2:
               return 49;
            case 3:
               return 50;
            case 4:
               return 51;
            case 5:
               return 52;
            case 6:
               return 53;
            case 7:
               return 54;
            case 8:
               return 55;
            case 9:
               return 56;
            case 10:
               return 57;
            case 11:
               return 48;
            case 12:
               return 189;
            case 13:
               return 187;
            case 14:
               return 8;
            case 15:
               return 9;
            case 16:
               return 81;
            case 17:
               return 87;
            case 18:
               return 69;
            case 19:
               return 82;
            case 20:
               return 84;
            case 21:
               return 89;
            case 22:
               return 85;
            case 23:
               return 73;
            case 24:
               return 79;
            case 25:
               return 80;
            case 26:
               return 219;
            case 27:
               return 221;
            case 28:
               return 13;
            case 29:
               return 162;
            case 30:
               return 65;
            case 31:
               return 83;
            case 32:
               return 68;
            case 33:
               return 70;
            case 34:
               return 71;
            case 35:
               return 72;
            case 36:
               return 74;
            case 37:
               return 75;
            case 38:
               return 76;
            case 39:
               return 186;
            case 40:
               return 222;
            case 41:
               return 192;
            case 42:
               return 160;
            case 43:
               return 220;
            case 44:
               return 90;
            case 45:
               return 88;
            case 46:
               return 67;
            case 47:
               return 86;
            case 48:
               return 66;
            case 49:
               return 78;
            case 50:
               return 77;
            case 51:
               return 188;
            case 52:
               return 190;
            case 53:
               return 191;
            case 54:
               return 161;
            case 55:
               return 106;
            case 56:
               return 164;
            case 57:
               return 32;
            case 58:
               return 20;
            case 59:
               return 112;
            case 60:
               return 113;
            case 61:
               return 114;
            case 62:
               return 115;
            case 63:
               return 116;
            case 64:
               return 117;
            case 65:
               return 118;
            case 66:
               return 119;
            case 67:
               return 120;
            case 68:
               return 121;
            case 69:
               return 144;
            case 70:
               return 145;
            case 71:
               return 103;
            case 72:
               return 104;
            case 73:
               return 105;
            case 74:
               return 109;
            case 75:
               return 100;
            case 76:
               return 101;
            case 77:
               return 102;
            case 78:
               return 107;
            case 79:
               return 97;
            case 80:
               return 98;
            case 81:
               return 99;
            case 82:
               return 96;
            case 83:
               return 110;
            case 84:
            case 85:
            case 86:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 122:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
            case 145:
            case 146:
            case 147:
            case 149:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 158:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 167:
            case 168:
            case 169:
            case 170:
            case 171:
            case 172:
            case 173:
            case 174:
            case 175:
            case 176:
            case 177:
            case 178:
            case 180:
            case 182:
            case 185:
            case 186:
            case 187:
            case 188:
            case 189:
            case 190:
            case 191:
            case 192:
            case 193:
            case 194:
            case 195:
            case 196:
            case 198:
            case 202:
            case 204:
            case 206:
            case 212:
            case 213:
            case 214:
            case 215:
            case 216:
            case 217:
            case 218:
            case 222:
            default:
               return 0;
            case 87:
               return 122;
            case 88:
               return 123;
            case 100:
               return 124;
            case 101:
               return 125;
            case 102:
               return 126;
            case 112:
               return 21;
            case 121:
               return 28;
            case 123:
               return 29;
            case 148:
               return 25;
            case 157:
               return 163;
            case 179:
               return 108;
            case 181:
               return 111;
            case 183:
               return 44;
            case 184:
               return 165;
            case 197:
               return 19;
            case 199:
               return 36;
            case 200:
               return 38;
            case 201:
               return 33;
            case 203:
               return 37;
            case 205:
               return 39;
            case 207:
               return 35;
            case 208:
               return 40;
            case 209:
               return 34;
            case 210:
               return 45;
            case 211:
               return 46;
            case 219:
               return 91;
            case 220:
               return 92;
            case 221:
               return 93;
            case 223:
               return 95;
         }
      }

      static {
         Class var0;
         try {
            var0 = Class.forName("org.lwjgl.opengl.WindowsKeyboard");
         } catch (Throwable var3) {
            throw new IllegalStateException();
         }

         try {
            c = var0.getDeclaredMethod("MapVirtualKey", Integer.TYPE, Integer.TYPE);
            c.setAccessible(true);
         } catch (Throwable var2) {
            throw new IllegalStateException();
         }
      }
   }
}
