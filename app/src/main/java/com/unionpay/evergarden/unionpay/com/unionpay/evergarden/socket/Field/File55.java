package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field;

import android.util.Log;

import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Utils.Tools;

/**
 * 作者：Evergarden on 2017-11-02 10:38
 * QQ：1941042402
 */

public class File55 implements File {


    private String passCode;

    public File55() {

    }


    @Override
    public byte[] SendData() {
        Log.d("Field_55", passCode);
        int len = passCode.length() / 2;
        String len_str = len + "";
        if ((len_str.length() & 1) != 0) {
            if (len_str.length() < 4) {
                for (int i = len_str.length(); i < 4; i++) {
                    len_str = "0" + len_str;
                }
            }
        }
        Log.d("Field_55 len", len_str);

        byte[] Senddata = Tools.MergeArray(Tools.hexStringToByte(len_str), Tools.hexStringToByte(passCode));
        Log.d("Field_55", Tools.byte2hex(Senddata));
        return Senddata;
    }

    @Override
    public byte[] analysis(int offest, byte[] data) {
        byte[] lenbyte = new byte[2];
        Log.d("offest", offest + "");
        System.arraycopy(data, offest, lenbyte, 0, 2);
        Log.d("2", "1");
        int len = Integer.parseInt(Tools.byte2hex(lenbyte));
        Log.d("Field", len + "");

        byte[] roombyte = new byte[len];

        System.arraycopy(data, offest + 2, roombyte, 0, len);

        Log.d("Field55:", Tools.bcd2Str(roombyte));

        return roombyte;
    }


 /*   @Override
    public void analysis(byte[] data) {

    }*/


    @Override
    public int getAllLen() {
        return 0;
    }
}
