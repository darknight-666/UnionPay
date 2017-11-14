//package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field;
//
//import android.util.Log;
//
//import com.szxb.cloudpaybus.comm.util.Tools;
//
///**
// * 作者：Evergarden on 2017-09-08 19:24
// * QQ：1941042402
// */
//
//public class Field_4 extends Field {
//    public Field_4(){
//
//    }
//
//    public Field_4(int Type){
//        super(Type);
//    }
//
//    @Override
//    public String SetRecord(int i, byte[] buffer) {
//        roombyte=new byte[6];
//        System.arraycopy(buffer,i,roombyte,0,6);
//        Log.d("File4", Tools.bcd2Str(roombyte));
//        return Tools.byte2hex(roombyte);
//    }
//
//    @Override
//    public byte[] getData() {
//        byte[] data={0x00,0x00,0x00,0x00,0x00,0x01};
//        Senddata=data;
//        Log.d("Field_4:",Tools.byte2hex(data));
//        return super.getData();
//    }
//}
