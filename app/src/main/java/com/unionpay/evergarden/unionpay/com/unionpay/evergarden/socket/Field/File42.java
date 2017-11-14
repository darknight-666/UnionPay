package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field;

import android.util.Log;

import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.FetchAppConfig;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Utils.Tools;

/**
 * 作者：Evergarden on 2017-11-02 10:38
 * QQ：1941042402
 */

public class File42 implements File {
    @Override
    public byte[] SendData() {
        byte[] data = new byte[0];
        if (FetchAppConfig.Merchant_Number().length() == 15) {
            data = FetchAppConfig.Merchant_Number().getBytes();
            Log.d("Field_42", Tools.byte2hex(data));

        }


        Log.d("Field_42", Tools.byte2hex(data));
        return data;
    }

    @Override
    public byte[] analysis(int offest, byte[] data) {
        byte[] roombyte = new byte[15];
        System.arraycopy(data, offest, roombyte, 0, 15);
        String code = "";
        try {
            code = new String(roombyte, "GB2312");
        } catch (Exception e) {

        }
        Log.d("Field_42", code);
        return roombyte;
    }


   /* @Override
    public void analysis(byte[] data) {

    }*/


    @Override
    public int getAllLen() {
        return 0;
    }
}
