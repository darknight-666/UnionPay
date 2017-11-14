package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field;

import android.util.Log;

import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.FetchAppConfig;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Utils.Tools;

/**
 * 作者：Evergarden on 2017-11-02 10:38
 * QQ：1941042402
 */

public class File41 implements File {
    @Override
    public byte[] SendData() {
        byte[] data = new byte[0];
        String code = FetchAppConfig.SN();
        if (FetchAppConfig.SN().length() == 8) {
            data = FetchAppConfig.SN().getBytes();

        }
        Log.d("Field_41", Tools.byte2hex(data));
        return data;
    }

    @Override
    public byte[] analysis(int offest, byte[] data) {
        byte[] roombyte = new byte[8];
        System.arraycopy(data, offest, roombyte, 0, 8);
        String code = "";
        try {
            code = new String(roombyte, "GB2312");
        } catch (Exception e) {

        }
        Log.d("Field_41", code);

        return roombyte;
    }


  /*  @Override
    public void analysis(byte[] data) {

    }*/


    @Override
    public int getAllLen() {
        return 0;
    }
}
