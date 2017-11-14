//package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field;
//
//import android.util.Log;
//
//import com.szxb.cloudpaybus.comm.util.Config;
//import com.szxb.cloudpaybus.comm.util.Tools;
//
///**
// * 作者：Evergarden on 2017-09-02 16:50
// * QQ：1941042402
// */
//
//public class Field_63 extends Field{
//
//
//    public Field_63(int Type){
//        super(Type);
//    }
//
//
//    public Field_63(){
//
//    }
//
//
//
//    @Override
//    public String SetRecord(int i, byte[] buffer) {
//        lenbyte=new byte[2];
//        Log.d("offest",i+"");
//        System.arraycopy(buffer,i,lenbyte,0,2);
//        Log.d("2","1");
//        int len=Integer.parseInt(Tools.byte2hex(lenbyte));
//        Log.d("offest",i+"");
//
//        roombyte=new byte[len];
//
//        System.arraycopy(buffer,i,roombyte,0,len);
//
//        Log.d("File55",Tools.bcd2Str(roombyte));
//        return super.SetRecord(i, buffer);
//    }
//
//   //签到 操作员号
//     public byte[] Field_63_1(){
//
//       switch (Type){
//           case Config.SginMessage:
//               byte[] bytes="099".getBytes();
//                return bytes;
//
//       }
//        return null;
//
//   }
//
//
//
//
//    public byte[] getData() {
//
//        switch (Type){
//            case Config.SginMessage:
//                byte[] len={0x00,0x03};
//                Senddata=Tools.MergeArray(len,Field_63_1());
//                break;
//        }
//        Log.d("Field_63", Tools.byte2hex(Senddata));
//        return Senddata;
//    }
//}
