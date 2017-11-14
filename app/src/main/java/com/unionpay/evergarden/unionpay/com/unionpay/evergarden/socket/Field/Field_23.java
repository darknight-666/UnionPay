//package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field;
//
//import android.util.Log;
//
//import com.szxb.cloudpaybus.comm.util.Tools;
//
///**
// * 作者：Evergarden on 2017-09-08 19:58
// * QQ：1941042402
// */
//
//public class Field_23 extends Field {
//
//    public Field_23(){
//        super();
//    }
//    private String Xulie;
//
//    public  Field_23(int Type){
//        super(Type);
//    }
//
//    public  Field_23(int Type,String Xulie){
//        this.Xulie=Xulie;
//
//    }
//    @Override
//    public String SetRecord(int i, byte[] buffer) {
//        roombyte=new byte[2];
//        System.arraycopy(buffer,i,roombyte,0,2);
//        Log.d("Field_23", Tools.bcd2Str(roombyte));
//        return super.SetRecord(i, buffer);
//    }
//
//    @Override
//    public byte[] getData() {
//        int len=Xulie.length();
//        for (int i=0;i<4-len;i++) {
//            Xulie = "0" + Xulie;
//        }
//
//        byte[] data=Tools.hexStringToByte(Xulie);
//        // byte[] data={0x00,0x00};
//        Log.d("Field_23", Tools.byte2hex(data));
//        Senddata=data;
//        return super.getData();
//    }
//}
