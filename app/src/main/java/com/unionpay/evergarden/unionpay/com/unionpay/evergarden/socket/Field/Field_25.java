//package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field;
//
//import android.util.Log;
//
//import com.szxb.cloudpaybus.comm.util.Tools;
//
///**
// * 作者：Evergarden on 2017-09-08 20:01
// * QQ：1941042402
// */
//
//public class Field_25 extends Field {
//
//    public Field_25(){
//
//    }
//
//    public Field_25(int Type){
//        super(Type);
//    }
//
//    @Override
//    public void setSenddata(byte[] senddata) {
//
//
//        super.setSenddata(senddata);
//    }
//
//
//    @Override
//    public String SetRecord(int i, byte[] buffer) {
//        roombyte=new byte[1];
//
//        System.arraycopy(buffer,i,roombyte,0,1);
//        Log.d("Field_25", Tools.bcd2Str(roombyte));
//        return super.SetRecord(i,buffer);
//
//    }
//
//    @Override
//    public byte[] getData() {
//        byte[] data={0x00};
//        Senddata=data;
//        return super.getData();
//    }
//}
