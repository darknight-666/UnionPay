package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field;

import android.util.Log;

/**
 * 作者：Evergarden on 2017-11-02 10:38
 * QQ：1941042402
 */

public class File38 implements File {
    @Override
    public byte[] SendData() {
        return new byte[0];
    }


    @Override
    public byte[] analysis(int offest, byte[] data) {
        byte[] roombyte = new byte[6];
        System.arraycopy(data, offest, roombyte, 0, 6);
        String code = "";
        try {
            code = new String(roombyte, "GB2312");
        } catch (Exception e) {

        }
        Log.d("Field_38", code);

        return roombyte;
    }

    @Override
    public int getAllLen() {
        return 0;
    }
}
