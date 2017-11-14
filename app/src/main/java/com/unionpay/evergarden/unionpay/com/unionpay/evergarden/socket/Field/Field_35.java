//package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field;
//
//import android.util.Log;
//
//import com.szxb.cloudpaybus.comm.util.Tools;
//
///**
// * 作者：Evergarden on 2017-09-08 20:03
// * QQ：1941042402
// */
//
////二磁道数据
//public class Field_35 extends Field {
//    private String hex;
//
//
//
//    public Field_35(){
//
//    }
//    public Field_35(int Type){
//        super(Type);
//    }
//    public Field_35(int Type,String hex){
//        super(Type);
//        this.hex=hex;
//    }
//
//    @Override
//    public String SetRecord(int i, byte[] buffer) {
//        lenbyte=new byte[1];
//        Log.d("offest",i+"");
//        System.arraycopy(buffer,i,lenbyte,0,1);
//        Log.d("2","1");
//        int len=Integer.parseInt(Tools.byte2hex(lenbyte))/2;
//        Log.d("offest",i+"");
//
//        roombyte=new byte[len];
//
//        System.arraycopy(buffer,i,roombyte,0,len);
//
//        Log.d("File35",Tools.bcd2Str(roombyte));
//
//        return super.SetRecord(i, buffer);
//    }
//
//
//    @Override
//    public byte[] getData() {
//
//        if (hex.contains("f")){
//            hex=hex.substring(0, hex.indexOf("f"));
//        }
//
//
//        Log.d("Field35",hex);
//        int len=hex.length();
//        String len_str=len+"";
//        byte[] lenbyte=Tools.hexStringToByte(len_str);
//        if ((len&1)!=0)
//        {
//            hex=hex+"0";
//        }
//
//
//        byte[] data= Tools.hexStringToByte(hex);
//        Senddata=Tools.MergeArray(lenbyte,data);
//        return super.getData();
//    }
//}
