package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field;

import android.util.Log;

import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Utils.Tools;

/**
 * 作者：Evergarden on 2017-11-02 10:38
 * QQ：1941042402
 */

public class File49 implements File {
    @Override
    public byte[] SendData() {
        byte[] Senddata = "156".getBytes();
        Log.d("Field_49", Tools.byte2hex(Senddata));
        return Senddata;
    }

    @Override
    public byte[] analysis(int offest, byte[] data) {
        byte[] roombyte = new byte[3];
        System.arraycopy(data, offest, roombyte, 0, 3);
        Log.d("Field49", Tools.byte2hex(roombyte));
        return roombyte;
    }


/*    @Override
    public void analysis(byte[] data) {

    }*/


    @Override
    public int getAllLen() {
        return 0;
    }
}
