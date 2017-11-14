//package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field;
//
//import android.util.Log;
//
//import com.szxb.cloudpaybus.comm.util.Tools;
//
///**
// * 作者：Evergarden on 2017-09-08 20:13
// * QQ：1941042402
// */
//
//public class Field_55 extends Field {
//
//
//    String  passCode;
//
//
//    public Field_55(){
//
//    }
//    public Field_55(int Type){
//            super(Type);
//    }
//    public Field_55(int Type, String passCode){
//        super(Type);
//        this.passCode=passCode;
//    }
//
//    @Override
//    public String SetRecord(int i, byte[] buffer) {
//        lenbyte=new byte[2];
//        Log.d("offest",i+"");
//        System.arraycopy(buffer,i,lenbyte,0,2);
//        Log.d("2","1");
//        int len=Integer.parseInt(Tools.byte2hex(lenbyte));
//        Log.d("Field",len+"");
//
//        roombyte=new byte[len];
//
//        System.arraycopy(buffer,i+2,roombyte,0,len);
//
//        Log.d("Field55:",Tools.bcd2Str(roombyte));
//        return super.SetRecord(i, buffer);
//    }
//
//    @Override
//    public byte[] getData() {
////        String code ="01249F 36 02 01 88 95 05 00 00 00 00 00 9F 1E 08 30 30 30 30 30 30 30 30 9F 10 13 07 0D 01 03 A0 10 00 01 0A 01 00 00 00 00 00 E9 A6 E9 53 9F 26 08 07 BA 73 0E 3B C0 55 F2 9F 27 01 80 9F 37 04 42 6C 36 4C 9A 03 16 10 26 9C 01 00 9F 02 06 00 00 00 00 00 01 5F 2A 02 01 56 82 02 7C 00 9F 1A 02 01 56 9F 03 06 00 00 00 00 00 00 9F 33 03 E0 E1 C8 9F 35 01 22 9F 41 04 00 00 00 08";
////        String codes="0124 9F36 02017A 95050000000000 9F1E083030303030303030 9F101307010103A02000010A010000000000CFD0DCD6 9F2608636447A5CEE5D273 9F270180  9F3704991B789D 9A03161026 9C0100 9F0206000000000001 5F2A020156 82027C00 9F1A020156 9F0306000000000000 9F3303E0E1C8 9F350122 9F410400000009  0013 22000120000600 ";
////        String re=code.replace(" ","");
////        String res=codes.replace(" ","");
//        //String crc="0124 9F36 0202DF 95050000000000 9F1E083030303030303030 9F101307010103900000010A0100000095478D8CB565 9F2608832F8FDF05EBAED0 9F270180  9F37044168DB96 9A03170911 9C0100 9F0206000000000001 5F2A02015682027C00 9F1A0201569F0306000000000000 9F3303E0E1C8 9F350122 9F410400000011";
//       // String res=crc.replace(" ","");
//        Log.d("Field_55", passCode);
//        int len=passCode.length()/2;
//        String len_str=len+"";
//        if ((len_str.length()&1)!=0 ){
//            if (len_str.length()<4){
//                for (int i=len_str.length();i<4;i++) {
//                    len_str = "0" + len_str;
//                }
//            }
//
//        }
//        Log.d("Field_55 len",len_str);
//
//        Senddata=Tools.MergeArray(Tools.hexStringToByte(len_str),Tools.hexStringToByte(passCode));
//        Log.d("Field_55", Tools.byte2hex(Senddata));
//        return super.getData();
//
//    }
//}
