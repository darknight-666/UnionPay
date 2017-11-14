//package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Message;
//
//import android.util.Log;
//
//
//import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field.Field_41;
//import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field.Field_42;
//import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field.Field_60;
//import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field.Field_62;
//import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Utils.Tools;
//
//import java.util.Set;
//
///**
// * 作者：Evergarden on 2017-09-07 18:15
// * QQ：1941042402
// */
//
//public class DownAIDMessage extends  Message {
//
//    Field_41 field_41;
//    Field_42 field_42;
//    Field_60 field_60;
//    Field_62 field_62;
//
//    String list;
//    byte[] bitmap={0x00, 0x00, 0x00, 0x00, 0x00, (byte) 0xC0, 0x00, 0x14,};
//
//    byte[] messageType={0x08,0x00};
//
//    public DownAIDMessage(SocketCall socketCall){
//        super(socketCall);
//    }
//
//
//    public DownAIDMessage(SocketCall socketCall, String list){
//        super(socketCall);
//        this.list=list;
//    }
//
//
//    @Override
//    public byte[] SendData() {
//        field_41=new Field_41(Config.DwonAIDMessage);
//        field_42=new Field_42(Config.DwonAIDMessage);
//        field_60=new Field_60(Config.DwonAIDMessage);
//        field_62=new Field_62(Config.DwonAIDMessage,list);
//        byte[] Data= Tools.MergeArray(TPDU,APDU,messageType,bitmap,field_41.getData(),field_42.getData(),field_60.getData(),field_62.getData());
//        byte[] len=Tools.int2Bytes(Data.length,2);
//        byte[] SendData=Tools.MergeArray(len,Data);
//        Log.d("AID 下载：", Tools.byte2hex(SendData));
//        return SendData;
//    }
//
//    @Override
//    public void Reord() {
//        byte[] len=new byte[2];
//        String code="";
//        try {
//            dis.read(len);
//            Log.d("record len",Tools.byte2hex(len)+"----");
//            int length=Integer.parseInt(Tools.byte2hex(len),16);
//            Log.d("record len",length+"----");
//            byte[] room=new byte[length];
//            dis.read(room);
//            Log.d("record room",Tools.byte2hex(room)+"----");
//            //位图
//            byte[] bitmap = new byte[8];
//            System.arraycopy(room, 13, bitmap, 0, 8);
//
//            int offest=21;
//            Set<Integer> bitmap_set = Util.bitMap2Set(bitmap);
//            for (Integer i:bitmap_set){
//                switch (i){
//
//                    case 12:
//                        Field_12 field_12=new Field_12(Config.DwonAIDMessage);
//                        field_12.SetRecord(offest,room);
//                        offest=offest+field_12.getLengt();
//                        break;
//                    case 13:
//                        Field_13 field_13=new Field_13(Config.DwonAIDMessage);
//                        field_13.SetRecord(offest,room);
//                        offest+=field_13.getLengt();
//                        break;
//
//                    case 37:
//                        Field_37 field_37=new Field_37(Config.DwonAIDMessage);
//                        field_37.SetRecord(offest,room);
//                        offest+=field_37.getLengt();
//                        break;
//
//                    case 39:
//                        Field_39 field_39=new Field_39(Config.DwonAIDMessage);
//                        code= field_39.SetRecord(offest,room);
//                        offest+=field_39.getLengt();
//                        break;
//                    case 41:
//                        Field_41 field_41=new Field_41(Config.DwonAIDMessage);
//                        field_41.SetRecord(offest,room);
//                        offest+=field_41.getLengt();
//                        break;
//                    case 42:
//                        Field_42 field_42=new Field_42(Config.DwonAIDMessage);
//                        field_42.SetRecord(offest,room);
//                        offest+=field_42.getLengt();
//                        break;
//                    case 60:
//                        field_60.SetRecord(offest,room);
//                        offest+=field_60.getLengt();
//                        break;
//                    case 62:
//                        Field_62 field_62=new Field_62(Config.DwonAIDMessage);
//                        field_62.SetRecord(offest,room);
//                        offest+=field_62.getLengt();
//                        break;
//                }
//
//            }
//            socket.close();
//            dis.close();
//            dos.close();
//            socketCall.Listener(Config.DwonAIDMessage,code);
//            Log.d("record len",Tools.byte2hex(room)+"----");
//        }catch (Exception e){
//            Log.d("REcord Exception",e.getMessage());
//        }
//
//    }
//}
