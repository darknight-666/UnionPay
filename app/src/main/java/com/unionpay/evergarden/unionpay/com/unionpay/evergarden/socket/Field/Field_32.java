//package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field;
//
//import android.util.Log;
//
//import com.szxb.cloudpaybus.comm.util.Tools;
//
///**
// * 作者：Evergarden on 2017-09-04 10:21
// * QQ：1941042402
// */
//
////检索参考号
//public class Field_32 extends Field {
//
//
//
//    public Field_32(){
//
//    }
//
//    public Field_32(int Type){
//        super(Type);
//    }
//
//
//    @Override
//    public String SetRecord(int i,byte[] buffer){
//        lenbyte=new byte[1];
//        roombyte=new byte[4];
//        System.arraycopy(buffer,i,lenbyte,0,1);
//        System.arraycopy(buffer,i+1,roombyte,0,4);
//        String code="";
//        code=Tools.bcd2Str(roombyte);
//        Log.d("len",Tools.byte2hex(lenbyte));
//        Log.d("Field_32", code);
//        return super.SetRecord(i,buffer);
//
//    }
//
//    @Override
//    public byte[] getData() {
//        return super.getData();
//    }
//}
