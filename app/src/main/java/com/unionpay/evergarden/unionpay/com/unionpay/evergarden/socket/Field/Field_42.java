//package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field;
//
//import android.util.Log;
//
//import com.szxb.cloudpaybus.comm.FetchAppConfig;
//import com.szxb.cloudpaybus.comm.util.Tools;
//
///**
// * 作者：Evergarden on 2017-09-02 14:15
// * QQ：1941042402
// */
//
//public class Field_42 extends Field{
//
//
//    public Field_42(){
//
//    }
//
//    public Field_42(int Type){
//       super(Type);
//    }
//
//
//    public byte[] getData() {
//
//
//                if (FetchAppConfig.Merchant_Number().length()==15) {
//                    byte[] data = FetchAppConfig.Merchant_Number().getBytes();
//                    Log.d("Field_42", Tools.byte2hex(data));
//                    Senddata=data;
//                }
//
//
//
//
//        Log.d("Field_42", Tools.byte2hex(Senddata));
//        return Senddata;
//    }
//
//
//
//    public String SetRecord(int i,byte[] buffer){
//        roombyte=new byte[15];
//        System.arraycopy(buffer,i,roombyte,0,15);
//        String code="";
//        try {
//            code=new String(roombyte,"GB2312");
//        }catch (Exception e){
//
//        }
//        Log.d("Field_42", code);
//        return super.SetRecord(i,buffer);
//    }
//}
