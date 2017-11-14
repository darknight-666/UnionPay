//package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field;
//
//import android.util.Log;
//
//import com.szxb.cloudpaybus.comm.util.Config;
//import com.szxb.cloudpaybus.comm.util.Tools;
//
//import java.lang.reflect.Field;
//
///**
// * 作者：Evergarden on 2017-09-08 19:36
// * QQ：1941042402
// */
//
//public class Field_22 extends Field {
//
//    public Field_22(){
//
//    }
//
//    public Field_22(int Type){
//        super(Type);
//    }
//
//    @Override
//    public String SetRecord(int i, byte[] buffer) {
//        roombyte=new byte[2];
//        System.arraycopy(buffer,i,roombyte,0,2);
//        String code="";
//        try {
//            code= Tools.bcd2Str(roombyte);
//        }catch (Exception e){
//
//        }
//        Log.d("Field_22", code);
//        return super.SetRecord(i,buffer);
//    }
//
////    @Override
//    public byte[] getData() {
//
//
//        switch (Type){
//            case Config.CardPay:
//                byte[] data={0x07,0x20};
//                Senddata=data;
//
//                break;
//            case Config.qxcord:
//                byte[] data1={0x03,0x20};
//                Senddata=data1;
//                break;
//        }
//
//        return super.getData();
//    }
//
//
//
//}
