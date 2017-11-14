package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field;

import android.util.Log;

import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Utils.Tools;

/**
 * 作者：Evergarden on 2017-11-02 10:38
 * QQ：1941042402
 */

public class File53 implements File {
    @Override
    public byte[] SendData() {
        byte[] data={0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00};
        Log.d("Field_53", Tools.byte2hex(data));
        return data;
    }


    @Override
    public void analysis(byte[] data) {

    }


    @Override
    public int getAllLen() {
        return 0;
    }
}
