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
        String code=FetchAppConfig.SN();
        if (FetchAppConfig.SN().length()==8) {
            data = FetchAppConfig.SN().getBytes();

        }
        Log.d("Field_41", Tools.byte2hex(data));
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
