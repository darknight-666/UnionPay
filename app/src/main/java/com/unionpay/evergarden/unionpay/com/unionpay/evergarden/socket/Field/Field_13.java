//package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field;
//
//import android.util.Log;
//
//import com.szxb.cloudpaybus.comm.util.Tools;
//
///**
// * 作者：Evergarden on 2017-09-04 10:18
// * QQ：1941042402
// */
//
//public class Field_13 extends Field{
//
//
//
//    public Field_13(){
//
//    }
//
//    public Field_13(int Type){
//        super(Type);
//    }
//
//
//    public String SetRecord(int i,byte[] buffer){
//        roombyte=new byte[2];
//        Log.d("offest",i+"");
//        System.arraycopy(buffer,i,roombyte,0,2);
//        Log.d("Time", Tools.bcd2Str(roombyte));
//        return super.SetRecord(i,buffer);
//    }
//
//}
