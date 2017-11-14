//package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field;
//
//import android.util.Log;
//
//import com.szxb.cloudpaybus.comm.util.Tools;
//
///**
// * 作者：Evergarden on 2017-09-04 10:25
// * QQ：1941042402
// */
//
//public class Field_37 extends Field{
//
//
//    public Field_37(){
//
//    }
//
//    public Field_37(int Type){
//        super(Type);
//    }
//
//
//    public String SetRecord(int i,byte[] buffer){
//        roombyte=new byte[12];
//        System.arraycopy(buffer,i,roombyte,0,12);
//        String code="";
//        try {
//            code=Tools.bcd2Str(roombyte);
//        }catch (Exception e){
//        }
//        Log.d("Field_37", code);
//        return code;
//    }
//
//}
