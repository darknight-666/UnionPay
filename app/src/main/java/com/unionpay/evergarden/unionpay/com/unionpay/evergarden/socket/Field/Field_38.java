//package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field;
//
//import android.util.Log;
//
///**
// * 作者：Evergarden on 2017-09-04 10:25
// * QQ：1941042402
// */
//
//public class Field_38 extends Field{
//
//
//
//    public Field_38(){
//
//    }
//
//    public Field_38(int Type){
//        super(Type);
//    }
//
//
//    public String SetRecord(int i,byte[] buffer){
//        roombyte=new byte[6];
//        System.arraycopy(buffer,i,roombyte,0,6);
//        String code="";
//        try {
//            code=new String(roombyte,"GB2312");
//        }catch (Exception e){
//
//        }
//        Log.d("Field_38", code);
//        return super.SetRecord(i,buffer);
//    }
//
//}
