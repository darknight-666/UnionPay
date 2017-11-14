//package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field;
//
//import android.util.Log;
//
//import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Utils.Tools;
//
//
///**
// * 作者：Evergarden on 2017-09-11 16:45
// * QQ：1941042402
// */
//
//public class Field_15 extends Field{
//
//
//    public Field_15(){
//
//    }
//
//    public Field_15(int Type){
//        super(Type);
//    }
//
//
//    public String SetRecord(int i,byte[] buffer){
//        roombyte=new byte[2];
//
//        System.arraycopy(buffer,i,roombyte,0,2);
//        Log.d("Field_15", Tools.bcd2Str(roombyte));
//        return Tools.bcd2Str(roombyte);
//    }
//
//}
