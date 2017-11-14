//package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field;
//
//import android.util.Log;
//
//import com.szxb.cloudpaybus.comm.FetchAppConfig;
//import com.szxb.cloudpaybus.comm.util.Tools;
//
///**
// * 作者：Evergarden on 2017-09-02 12:04
// * QQ：1941042402
// */
//
//public class Field_41 extends Field {
//
//
//
//    public Field_41(){
//
//    }
//
//    public Field_41(int Type){
//
//        super(Type);
//    }
//
//
//    public byte[] getData() {
//
//                if (FetchAppConfig.SN().length()==8) {
//                    byte[] data = FetchAppConfig.SN().getBytes();
//                    Senddata=data;
//                }
//
//
//
//        Log.d("Field_41", Tools.byte2hex(Senddata));
//        return Senddata;
//    }
//
//
//    public String SetRecord(int i,byte[] buffer){
//        roombyte=new byte[8];
//        System.arraycopy(buffer,i,roombyte,0,8);
//        String code="";
//        try {
//            code=new String(roombyte,"GB2312");
//        }catch (Exception e){
//
//        }
//        Log.d("Field_41", code);
//        return super.SetRecord(i,buffer);
//    }
//
//
//
//}
