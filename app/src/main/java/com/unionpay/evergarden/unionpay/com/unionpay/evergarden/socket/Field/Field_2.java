//package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field;
//
//import android.util.Log;
//
//import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Utils.Tools;
//
//
///**
// * 作者：Evergarden on 2017-09-08 19:23
// * QQ：1941042402
// */
//
////主账号
//public class Field_2 extends Field {
//
//
//
//    public Field_2(){
//        super();
//    }
//
//    public Field_2(int type){
//        super(type);
//    }
//    private String hex;
//
//    public Field_2(int type,String hex){
//        super(type);
//        this.hex=hex;
//    }
//    @Override
//    public String SetRecord(int i, byte[] buffer) {
//       /* lenbyte=new byte[1];
//        Log.d("offest",i+"");
//        System.arraycopy(buffer,i,lenbyte,0,1);
//        Log.d("2","1");
//        int len=Integer.parseInt(Tools.byte2hex(lenbyte));
//        if ((len&1)==1){
//            len++;
//        }
//        len/=2;
//        Log.d("offest",i+"");
//
//        roombyte=new byte[len];
//
//        System.arraycopy(buffer,i,roombyte,0,len);
//
//        Log.d("File2",Tools.bcd2Str(roombyte));
//
//        return Tools.bcd2Str(roombyte);*/
//        lenbyte=new byte[1];
//        Log.d("offest",i+"");
//        System.arraycopy(buffer,i,lenbyte,0,1);
//        Log.d("2","1");
//        int len=Integer.parseInt(Tools.byte2hex(lenbyte));
//        int len_s=len;
//        if ((len&1)==1){
//            len++;
//        }
//
//        len/=2;
//        Log.d("offest",i+"");
//        roombyte=new byte[len];
//        System.arraycopy(buffer,i+1,roombyte,0,len);
//        Log.d("File2",Tools.bcd2Str(roombyte));
//        return Tools.bcd2Str(roombyte).substring(0,len_s);
//
//
//    }
//
//    @Override
//    public byte[] getData() {
//
//        int len=hex.length();
//        //int len=16;
//        String len_str=len+"";
//        //偶数长度补0
//        if ((len&1)!=0)
//        {
//            hex=hex+"0";
//        }
//        byte[] data= Tools.hexStringToByte(hex);
//        byte[] lenbyte=Tools.hexStringToByte(len_str);
//        Senddata=Tools.MergeArray(lenbyte,data);
//        Log.d("Field_2",Tools.byte2hex(Senddata));
//        return super.getData();
//    }
//}
