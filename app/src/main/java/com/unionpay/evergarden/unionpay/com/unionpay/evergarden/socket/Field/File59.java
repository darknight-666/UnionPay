package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field;

import android.util.Log;

import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Utils.Tools;

/**
 * 作者：Evergarden on 2017-11-02 10:38
 * QQ：1941042402
 */

public class File59 implements File {

    private String value;

    public File59(String value) {
        this.value = value;
    }

    @Override
    public byte[] SendData() {
        byte[] Value = value.getBytes();
        int roomlen = Value.length;
        String roomlen_str = roomlen + "";
        if (roomlen_str.length() < 3) {
            for (int i = 0; i < 3 - roomlen_str.length() + 1; i++) {
                roomlen_str = "0" + roomlen_str;
            }
            Log.d("Code", roomlen_str);
        }
        byte[] L = roomlen_str.getBytes();
        byte[] TAG = "A3".getBytes();
        byte[] data = Tools.MergeArray(TAG, L, Value);
        int len = data.length;
        String len_str = len + "";
        Log.d("len", len_str);


        if (len_str.length() < 4) {
            for (int i = 0; i < 4 - len_str.length() + 1; i++) {
                len_str = "0" + len_str;
            }
            Log.d("len", len_str);
        }
        byte[] lenbyte = Tools.hexStringToByte(len_str);
        byte[] Senddata = Tools.MergeArray(lenbyte, data);
        Log.d("Field_59", Tools.byte2hex(Senddata));
        return Senddata;
    }

    @Override
    public byte[] analysis(int offest, byte[] data) {
        byte[] lenbyte = new byte[2];
        System.arraycopy(data, offest, lenbyte, 0, 2);
        return lenbyte;
    }


 /*   @Override
    public void analysis(byte[] data) {

    }*/


    @Override
    public int getAllLen() {
        return 0;
    }
}
