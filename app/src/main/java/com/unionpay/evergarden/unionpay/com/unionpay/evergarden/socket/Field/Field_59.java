//package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field;
//
//import android.util.Log;
//
//import com.szxb.cloudpaybus.comm.util.Tools;
//
///**
// * 作者：Evergarden on 2017-09-02 17:48
// * QQ：1941042402
// */
//
////BCD
//public class Field_59 extends Field{
//
//
//
//    public Field_59(){
//
//    }
//    private String value;
//    public Field_59(int Type,String value){
//        super(Type);
//        this.value=value;
//    }
//
//
//    public String SetRecord(int i,byte[] buffer){
//
//        lenbyte=new byte[2];
//        System.arraycopy(buffer,i,lenbyte,0,2);
//
//
//        return super.SetRecord(i,buffer);
//    }
//
//
//    @Override
//    public byte[] getData() {
//        byte[] Value=value.getBytes();
//        int roomlen=Value.length;
//        String roomlen_str=roomlen+"";
//        if (roomlen_str.length()<3){
//            for (int i=0;i<3-roomlen_str.length()+1;i++){
//                roomlen_str="0"+roomlen_str;
//            }
//            Log.d("Code",roomlen_str);
//        }
//        byte[] L=roomlen_str.getBytes();
//        byte[] TAG="A3".getBytes();
//        byte[] data=Tools.MergeArray(TAG,L,Value);
//        int len=data.length;
//        String len_str=len+"";
//        Log.d("len",len_str);
//
//
//
//
//        if (len_str.length()<4){
//            for (int i=0;i<4-len_str.length()+1;i++){
//                len_str="0"+len_str;
//            }
//            Log.d("len",len_str);
//        }
//        lenbyte=Tools.hexStringToByte(len_str);
//        Senddata=Tools.MergeArray(lenbyte,data);
//        Log.d("Field_59", Tools.byte2hex(Senddata));
//        return super.getData();
//    }
//}
