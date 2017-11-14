//package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field;
//
//import android.util.Log;
//
//import com.szxb.cloudpaybus.comm.util.Tools;
//
///**
// * 作者：Evergarden on 2017-09-08 20:09
// * QQ：1941042402
// */
//
//public class Field_53 extends Field {
//
//
//    public Field_53(){
//
//    }
//    public Field_53(int Type){
//        super(Type);
//    }
//
//    @Override
//    public String SetRecord(int i, byte[] buffer) {
//
//        roombyte=new byte[8];
//        System.arraycopy(buffer,i,roombyte,0,8);
//        String code="";
//        try {
//            code=Tools.byte2hex(roombyte);
//        }catch (Exception e){
//
//        }
//        Log.d("Field_53", code);
//        return super.SetRecord(i,buffer);
//
//    }
//
//    @Override
//    public byte[] getData() {
//        byte[] data={0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00};
//        Senddata=data;
//        Log.d("Field_53", Tools.byte2hex(Senddata));
//        return super.getData();
//    }
//}
