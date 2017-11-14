package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field;

import android.util.Log;

import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Utils.Tools;

/**
 * 作者：Evergarden on 2017-11-02 10:38
 * QQ：1941042402
 */

public class File39 implements File {
    @Override
    public byte[] SendData() {
        return new byte[0];
    }

    @Override
    public byte[] analysis(int offest, byte[] data) {
        byte[] roombyte = new byte[2];
        System.arraycopy(data, offest, roombyte, 0, 2);
        Log.d("Field_39", Tools.byte2hex(roombyte));
        return  roombyte;
    }


    /*@Override
    public void analysis(byte[] data) {

    }*/


    @Override
    public int getAllLen() {
        return 0;
    }
}
