//package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field;
//
//import android.util.Log;
//
//import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Utils.Tools;
//
//
///**
// * 作者：Evergarden on 2017-09-08 20:06
// * QQ：1941042402
// */
//
//public class Field_49 extends Field {
//
//
//    public Field_49(){}
//
//
//    public Field_49(int Type){
//        super(Type);
//    }
//
//    @Override
//    public String SetRecord(int i, byte[] buffer) {
//        roombyte=new byte[3];
//        System.arraycopy(buffer,i,roombyte,0,3);
//        Log.d("Field49", Tools.byte2hex(roombyte));
//        return super.SetRecord(i, buffer);
//    }
//
//    @Override
//    public byte[] getData() {
//        Senddata="156".getBytes();
//        Log.d("Field_49", Tools.byte2hex(Senddata));
//        return super.getData();
//    }
//}
