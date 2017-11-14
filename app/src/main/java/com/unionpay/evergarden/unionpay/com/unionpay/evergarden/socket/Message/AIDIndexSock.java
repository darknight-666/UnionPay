package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Message;


import android.content.IntentSender;

import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.FetchAppConfig;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.MySocket;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.SocketStatus;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Utils.Util;

import java.util.Set;

/**
 * 作者：Evergarden on 2017-09-05 19:38
 * QQ：1941042402
 * TODO:刷卡需要的aid
 */

//41 42 60 62
public class AIDIndexSock implements SocketStatus{

    MySocket mySocket=new MySocket();

    private byte[] MessageType = {(byte) 0x08, 0x20};
    private byte[]bitmap={0x00,0x00, 0x00, 0x00, 0x00, (byte)0xC0, 0x00, 0x14};
    public void Sock(){
        mySocket.Init(this)
                .SetTimeOut(5000)
                .SendByte(MessageType,bitmap)
                .ReceiveByte();


    }

    @Override
    public void Timeout() {

    }

    @Override
    public void Analysis(int len, byte[] data) {

    }

    //
//    public AIDIndexSock(SocketCall socketCall) {
//        super(socketCall);
//
//    }
//    private byte[] MessageType = {(byte) 0x08, 0x20};
//    private byte[]bitmap={0x00,0x00, 0x00, 0x00, 0x00, (byte)0xC0, 0x00, 0x14};
//    Field_41 field_41;
//    Field_42 field_42;
//    Field_60 field_60;
//    Field_62 field_62;
//
//
//    @Override
//    public byte[] SendData(){
//        field_41=new Field_41(Config.AIDQureyMessage);
//        field_42=new Field_42(Config.AIDQureyMessage);
//        field_60=new Field_60(Config.AIDQureyMessage);
//        field_62=new Field_62(Config.AIDQureyMessage);
//        byte[] Data= Tools.MergeArray(TPDU,APDU,MessageType,bitmap,
//                field_41.getData(),field_42.getData()
//                ,field_60.getData(),field_62.getData());
//        byte[] len=Tools.int2Bytes(Data.length,2);
//        byte[] SendData=Tools.MergeArray(len,Data);
//
//        Log.d("Field：",Tools.byte2hex(SendData));
//        return SendData;
//    }
//
//
//    //解包
//    @Override
//    public void Reord(){
//        String code="";
//        byte[] len=new byte[2];
//        try {
//            dis.read(len);
//            Log.d("record len",Tools.byte2hex(len)+"----");
//            int length=Integer.parseInt(Tools.byte2hex(len),16);
//            Log.d("record len",length+"----");
//            byte[] room=new byte[length];
//            dis.read(room);
//            Log.d("Field room",Tools.byte2hex(room)+"----");
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
//                        Field_12 field_12=new Field_12(Config.AIDQureyMessage);
//                        field_12.SetRecord(offest,room);
//                        offest=offest+field_12.getLengt();
//                        break;
//                    case 13:
//                        Field_13 field_13=new Field_13(Config.AIDQureyMessage);
//                        field_13.SetRecord(offest,room);
//                        offest+=field_13.getLengt();
//                        break;
//                    case 39:
//                        Field_39 field_39=new Field_39(Config.AIDQureyMessage);
//                        code=field_39.SetRecord(offest,room);
//
//                        offest+=field_39.getLengt();
//                        break;
//                    case 41:
//                        Field_41 field_41=new Field_41(Config.AIDQureyMessage);
//                        field_41.SetRecord(offest,room);
//                        offest+=field_41.getLengt();
//                        break;
//                    case 42:
//                        Field_42 field_42=new Field_42(Config.AIDQureyMessage);
//                        field_42.SetRecord(offest,room);
//                        offest+=field_42.getLengt();
//                        break;
//                    case 60:
//                        field_60.SetRecord(offest,room);
//                        offest+=field_60.getLengt();
//                        break;
//                    case 62:
//                        Field_62 field_62=new Field_62(Config.AIDQureyMessage);
//                        field_62.SetRecord(offest,room);
//                        offest+=field_62.getLengt();
//                        break;
//                }
//                Log.d("----","Field"+i);
//            }
//            socket.close();
//            dis.close();
//            dos.close();
//            socketCall.Listener(Config.AIDQureyMessage,code);
//            Log.d("record len",Tools.byte2hex(room)+"----");
//        }catch (Exception e){
//            Log.d("REcord Exception",e.getMessage());
//        }
//
//    }

}
