//package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field;
//
//import android.util.Log;
//
//import com.szxb.cloudpaybus.comm.util.Tools;
//
///**
// * 作者：Evergarden on 2017-09-12 20:19
// * QQ：1941042402
// */
//
//public class Field_44 extends Field {
//
//
//
//    @Override
//    public String SetRecord(int i, byte[] buffer) {
//        lenbyte=new byte[1];
//        Log.d("offest",i+"");
//        System.arraycopy(buffer,i,lenbyte,0,1);
//        Log.d("2","1");
//        int len=Integer.parseInt(Tools.byte2hex(lenbyte));
//        Log.d("Field",len+"");
//
////        if ((len&1)==1){
////            len++;
////        }
////        len/=2;
//        roombyte=new byte[len];
//
//        System.arraycopy(buffer,i+1,roombyte,0,len);
//
//        Log.d("Field44:",Tools.byte2hex(roombyte));
//
//        return super.SetRecord(i, buffer);
//    }
//}
