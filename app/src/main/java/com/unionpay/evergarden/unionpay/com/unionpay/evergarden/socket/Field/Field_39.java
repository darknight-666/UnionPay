//package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field;
//
//import android.util.Log;
//
//import com.szxb.cloudpaybus.comm.util.Tools;
//
///**
// * 作者：Evergarden on 2017-09-04 10:45
// * QQ：1941042402
// */
//
//public class Field_39 extends Field {
//
//
//    public Field_39(){
//
//    }
//
//    public Field_39(int Type){
//        super(Type);
//    }
//
//
//    public String SetRecord(int i,byte[] buffer){
//        roombyte=new byte[2];
//        System.arraycopy(buffer,i,roombyte,0,2);
//        Log.d("Field_39", Tools.byte2hex(roombyte));
//        return Tools.byte2hex(roombyte);
//    }
//}
