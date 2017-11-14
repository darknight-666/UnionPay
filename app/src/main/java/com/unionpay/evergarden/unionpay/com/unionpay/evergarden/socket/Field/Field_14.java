//package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field;
//
//import android.util.Log;
//
//import com.szxb.cloudpaybus.comm.util.Tools;
//
///**
// * 作者：Evergarden on 2017-09-11 16:45
// * QQ：1941042402
// */
//
//public class Field_14 extends Field{
//
//
//
//    public Field_14(){
//        super();
//    }
//
//    public Field_14(int Type){
//        super(Type);
//    }
//
//
//    public String SetRecord(int i,byte[] buffer){
//        roombyte=new byte[2];
//
//        System.arraycopy(buffer,i,roombyte,0,2);
//        Log.d("Field_14", Tools.bcd2Str(roombyte));
//        return super.SetRecord(i,buffer);
//    }
//
//}
