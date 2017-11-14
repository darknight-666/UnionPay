//package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field;
//
//import android.util.Log;
//
//import com.szxb.cloudpaybus.comm.CommonSharedPreferences;
//import com.szxb.cloudpaybus.comm.FetchAppConfig;
//import com.szxb.cloudpaybus.comm.util.Tools;
//
///**
// * 作者：Evergarden on 2017-09-02 11:11
// * QQ：1941042402
// */
//
//public class Field_11 extends Field{
//
//
//
//    public Field_11(){
//        super();
//    }
//
//     public Field_11(int type){
//
//         super(type);
//     }
//
//
//
//    @Override
//    public String SetRecord(int i,byte[] buffer){
//        Log.d("offest",i+"");
//        roombyte=new byte[3];
//        System.arraycopy(buffer,i,roombyte,0,3);
//        Log.d("Field_11:set",Tools.bcd2Str(roombyte));
//        // CommonSharedPreferences.put("Audit_Number",Tools.bcd2Str(roombyte));
//
//
//        return super.SetRecord(i,buffer);
//    }
//
//
//    @Override
//    public byte[] getData() {
//                Senddata=new byte[3];
//                 byte[] data = Tools.str2Bcd(FetchAppConfig.Audit_Number());
//                Senddata=data;
//                int Code= Integer.parseInt(FetchAppConfig.Audit_Number());
//                if (Code==999999)
//                    CommonSharedPreferences.put("Audit_Number","000001");
//                else
//                    Code++;
//                String batch=Code+"";
//                int len=batch.length();
//                if (len<6)
//                    for (int i=0;i<6-len;i++)
//                        batch="0"+batch;
//                CommonSharedPreferences.put("Audit_Number",batch);
//
//
//                if (FetchAppConfig.Audit_Number().length()==6) {
//
//
//                }
//
//
//
//
//        Log.d("Field_11", Tools.byte2hex(Senddata));
//        return Senddata;
//    }
//}
