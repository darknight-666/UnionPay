//package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field;
//
//import android.util.Log;
//
//import com.szxb.cloudpaybus.comm.util.Tools;
//
///**
// * 作者：Evergarden on 2017-09-02 17:48
// * QQ：1941042402
// */
//
////BCD
//public class Field_12 extends Field{
//
//
//
//    public Field_12(){
//
//    }
//
//    public Field_12(int Type){
//        super(Type);
//    }
//
//
//    public String SetRecord(int i,byte[] buffer){
//        Log.d("offest",i+"");
//        roombyte=new byte[3];
//        System.arraycopy(buffer,i,roombyte,0,3);
//        Log.d("Date", Tools.bcd2Str(roombyte));
//
//        return super.SetRecord(i,buffer);
//    }
//
//
//}
