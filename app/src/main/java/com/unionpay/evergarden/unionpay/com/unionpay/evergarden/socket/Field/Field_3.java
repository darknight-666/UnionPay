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
////交易处理码
//public class Field_3 extends Field{
//
//    public Field_3(){
//
//    }
//    public Field_3(int Type){
//        super(Type);
//    }
//
//    @Override
//    public byte[] getData() {
//        byte[] data= {0x00,0x00,0x00};
//        Senddata=data;
//        Log.d("Field_3:",Tools.byte2hex(data));
//        return super.getData();
//    }
//
//    @Override
//    public String SetRecord(int i, byte[] buffer) {
//
//        roombyte=new byte[3];
//        System.arraycopy(buffer,i,roombyte,0,3);
//        Log.d("File3",Tools.bcd2Str(roombyte));
//        return super.SetRecord(i, buffer);
//    }
//}
