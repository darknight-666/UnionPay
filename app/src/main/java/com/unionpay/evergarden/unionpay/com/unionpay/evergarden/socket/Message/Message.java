package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Message;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

/**
 * 作者：Evergarden on 2017-09-07 17:16
 * QQ：1941042402
 */

public class Message {
    public byte[] TPDU = {0x60, 0x01, 0x51, 0x00, 0x00};
   // public byte[] TPDU = {0x60, 0x03, 0x03, 0x00, 0x00};
    public byte[] APDU = {0x61, 0x31, 0x00, 0x31, 0x30, 0x31};

    byte[] data = new byte[4];


    public DataOutputStream dos;
    public DataInputStream dis;
    public Socket socket;

//    public void Httprequest(Map<String, Object> map) {
//        JsonRequest request = new JsonRequest(Config.URL, RequestMethod.POST);
//        Log.d("Field: NetWork ", "net start");
//        request.add(map);
//        Log.d("Field: NetWork ", "参数添加");
//        CallServer.getHttpclient().add(Config.qxcord, request, new HttpListener<JSONObject>() {
//            @Override
//            public void success(int what, Response<JSONObject> response) {
//                Log.d("Field: NetWork ", response.toString());
//
//            }
//
//            @Override
//            public void fail(int what, String e) {
//                Log.d("Field: NetWork ", e);
//
//            }
//        });
//
//    }



    public byte[] SendData() {

        return data;
    }


    public void Reord() {


    }

}
