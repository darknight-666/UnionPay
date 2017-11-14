//package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field;
//
//import android.util.Log;
//
//import com.szxb.buspay.db.dao.AIDDao;
//import com.szxb.buspay.db.dao.AIDIndexDao;
//import com.szxb.buspay.db.dao.PublicKeyDao;
//import com.szxb.buspay.db.dao.PublicKeyIndexDao;
//import com.szxb.cloudpaybus.UnionBus;
//import com.szxb.cloudpaybus.comm.CommonSharedPreferences;
//import com.szxb.cloudpaybus.comm.FetchAppConfig;
//import com.szxb.cloudpaybus.comm.entity.AID;
//import com.szxb.cloudpaybus.comm.entity.AIDIndex;
//import com.szxb.cloudpaybus.comm.entity.PublicKey;
//import com.szxb.cloudpaybus.comm.entity.PublicKeyIndex;
//import com.szxb.cloudpaybus.comm.util.Config;
//import com.szxb.cloudpaybus.comm.util.ThreeDes;
//import com.szxb.cloudpaybus.comm.util.Tools;
//
///**
// * 作者：Evergarden on 2017-09-04 10:39
// * QQ：1941042402
// */
//
////pin秘钥3des mac秘钥des加
////
////
////
//// 密
//public class Field_62 extends Field{
//
//
//    private String index;
//    public Field_62(){
//
//    }
//    public Field_62(int Type){
//        super(Type);
//    }
//
//    public Field_62(int Type,String list){
//        super(Type);
//        this.index=list;
//    }
//
//    @Override
//    public byte[] getData() {
//        switch (Type){
//            case Config.AIDQureyMessage:
//
//                byte[] data="100".getBytes();
//                byte[] len=Tools.int2Bytes(3,2);
//                Senddata=Tools.MergeArray(len,data);
//                break;
//
//            case Config.PublicQureykeyMessage:
//                byte[] data1="100".getBytes();
//                byte[] len1=Tools.int2Bytes(3,2);
//                Senddata=Tools.MergeArray(len1,data1);
//                break;
//            case Config.DwonAIDMessage:
//                byte[] data2=Tools.hexStringToByte(index);
//                byte[] len2={0x00,0x11};
//                Senddata=Tools.MergeArray(len2,data2);
//
//                break;
//
//            case Config.PublicKeyIndex:
//                byte[] len3={0x00,0x03};
//                byte[] data3="100".getBytes();
//                Senddata=Tools.MergeArray(len3,data3);
//                break;
//
//            case Config.PublicIndexEnd:
//                byte[] len4={0x00,0x03};
//                byte[] data4="108".getBytes();
//                Senddata=Tools.MergeArray(len4,data4);
//                break;
//
//            case Config.DownPublicKey:
//                byte[] len5={0x00,0x12};
//                byte[] data5=Tools.hexStringToByte(index);
//                Senddata=Tools.MergeArray(len5,data5);
//                break;
//
//        }
//        Log.d("Field_62",Tools.byte2hex(Senddata));
//        return super.getData();
//    }
//
//    public String SetRecord(int i, byte[] buffer){
//        switch (Type){
//            case Config.SginMessage:
//                lenbyte=new byte[2];
//                roombyte=new byte[40];
//                System.arraycopy(buffer,i,lenbyte,0,2);
//                String len_str=Tools.bcd2Str(lenbyte);
//                Log.d("len", Tools.bcd2Str(lenbyte));
//                int len_int=Integer.parseInt(len_str);
//                Log.d("len", len_int+"");
//                if (len_int==40) {
//                    byte[] pinKey = new byte[16];
//                    byte[] pinKeycrc=new byte[4];
//                    byte[] macKey=new byte[16];
//                    byte[] macKeycrc=new byte[4];
//
//                    System.arraycopy(buffer, i + 2, pinKey, 0, 16);
//                    Log.d("Field 62 pinKey:", Tools.byte2hex(pinKey));
//                    System.arraycopy(buffer, i + 2 + 16, pinKeycrc, 0, 4);
//                    Log.d("Field 62 pinKeycrc:", Tools.byte2hex(pinKeycrc));
//                    System.arraycopy(buffer, i + 2 + 16 + 4, macKey, 0, 16);
//                    Log.d("Field 62 macKey:", Tools.byte2hex(macKey));
//                    System.arraycopy(buffer, i + 2 + 16 + 4 + 16, macKeycrc, 0, 4);
//                    Log.d("Field 62 macKeycrc:", Tools.byte2hex(macKeycrc));
//                    String key=FetchAppConfig.MainKey();
//                  //  String key="258FB0AB70D025CDB99DF2C4D302D646";
//                    String MacKey=Tools.byte2hex(ThreeDes.Union3DesDecrypt(Tools.hexStringToByte(key),macKey));
//                    String Mac=MacKey.substring(0,16);
//                    byte[] crc={0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00};
//                    byte[] crcdata= ThreeDes.encrypt(crc,Mac);
//                    Log.d("MAC",Mac);
//                    Log.d("datacrc",Tools.byte2hex(crcdata));
//                    Log.d("Field 62 MacKey:", MacKey);
//                    if (Tools.byte2hex(crcdata).contains(Tools.byte2hex(macKeycrc))){
//                        Log.d("MAC Result:","Success");
//                        CommonSharedPreferences.put("MacKey",MacKey);
//                    }
//                }else
//                    Log.d("Field 62 MacKey:","下载失败");
//                break;
//            case Config.AIDQureyMessage:
//                lenbyte=new byte[2];
//                roombyte=new byte[45];
//                System.arraycopy(buffer,i,lenbyte,0,2);
//                Log.d("len",Tools.byte2hex(lenbyte));
//                System.arraycopy(buffer,i+2,roombyte,0,45);
//                Log.d("9f06",Tools.byte2hex(roombyte));
//                getAIDIndex(Tools.byte2hex(roombyte));
//
//
//                break;
//
//            case Config.DwonAIDMessage:
//                lenbyte=new byte[2];
//                roombyte=new byte[113];
//                System.arraycopy(buffer,i,lenbyte,0,2);
//                Log.d("len",Tools.byte2hex(lenbyte));
//                System.arraycopy(buffer,i+2,roombyte,0,113);
//                Log.d("AID",Tools.byte2hex(roombyte));
//                AIDDao aidDao= UnionBus.getInstance().getDaoSession().getAIDDao();
//                AID aid=new AID();
//                aid.setAID(Tools.byte2hex(roombyte));
//                aidDao.insert(aid);
//
//                Log.d("AID :",aidDao.loadAll().toString());
//                break;
//
//            case Config.PublicKeyIndex:
//                lenbyte=new byte[2];
//                roombyte=new byte[185];
//                System.arraycopy(buffer,i,lenbyte,0,2);
//                Log.d("len",Tools.byte2hex(lenbyte));
//                System.arraycopy(buffer,i+2,roombyte,0,185);
//                Log.d("PublicKeyIndex",Tools.byte2hex(roombyte));
//
//                getPublicIndex(Tools.byte2hex(roombyte));
//                break;
//
//            case Config.PublicIndexEnd:
//                lenbyte=new byte[2];
//                roombyte=new byte[185];
//                System.arraycopy(buffer,i,lenbyte,0,2);
//                Log.d("len",Tools.byte2hex(lenbyte));
//                System.arraycopy(buffer,i+2,roombyte,0,185);
//                Log.d("PublicIndexEnd",Tools.byte2hex(roombyte));
//                getPublicIndex(Tools.byte2hex(roombyte));
//
//                break;
//
//            case Config.DownPublicKey:
//                lenbyte=new byte[2];
//
//
//                System.arraycopy(buffer,i,lenbyte,0,2);
//                String lenstr= Tools.byte2hex(lenbyte);
//                int len=Integer.parseInt(lenstr);
//                Log.d("62 len:",len+"");
//
//                roombyte=new byte[len];
//                System.arraycopy(buffer,i+2,roombyte,0,len);
//                Log.d("Publickey",Tools.byte2hex(roombyte));
//                PublicKeyDao dao=UnionBus.getInstance().getDaoSession().getPublicKeyDao();
//                PublicKey publicKey=new PublicKey();
//                publicKey.setPublicKey(Tools.byte2hex(roombyte));
//                dao.insert(publicKey);
//                CommonSharedPreferences.put("Public",FetchAppConfig.PublicIndex()+Tools.byte2hex(roombyte));
//                Log.d("Public:",Tools.byte2hex(roombyte));
//
//                break;
//
//
//
//
//        }
//
//        return super.SetRecord(i,buffer);
//    }
//
//
//    public void getAIDIndex(String code) {
//
//
//        for (int i = 2; i < code.length(); ) {
//            int a = code.indexOf("9F06", i);
//            Log.d("9f06", code.substring(a + 6, a + 22));
//            i = i + 22;
//            if (a > 0) {
//                String TAG = "9F06";
//                String Len = "08";
//                String Value = code.substring(a + 6, a + 22);
//                AIDIndexDao dao=UnionBus.getInstance().getDaoSession().getAIDIndexDao();
//                AIDIndex aidIndex=new AIDIndex();
//                aidIndex.setAIDIndex(TAG + Len + Value);
//                dao.insert(aidIndex);
//                Log.d("------AID INDEX-------:",aidIndex.getAIDIndex()+dao.loadAll().size());
//
//            }
//        }
//    }
//
//
//    public void getPublicIndex(String code) {
//
//
//        for (int i = 2; i < code.length(); ) {
//            int a = code.indexOf("9F06", i);
//            Log.d("9f06", code.substring(a + 6, a + 24));
//            i = i + 24+22;
//            if (a > 0) {
//                String TAG = "9F06";
//                String Len = "05";
//                String Value = code.substring(a + 6, a + 24);
//                PublicKeyIndexDao dao=UnionBus.getInstance().getDaoSession().getPublicKeyIndexDao();
//                PublicKeyIndex publicKeyIndex=new PublicKeyIndex();
//                publicKeyIndex.setPublicKeyIndex(TAG + Len + Value);
//
//                dao.insert(publicKeyIndex);
//
//                Log.d("----publicKeyIndex-----",publicKeyIndex.getPublicKeyIndex());
//
//            }
//        }
//    }
//
//
//
//}
