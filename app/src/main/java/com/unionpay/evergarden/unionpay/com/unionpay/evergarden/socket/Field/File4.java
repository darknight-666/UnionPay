package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field;

import android.util.Log;

import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Utils.Tools;

/**
 * 作者：Evergarden on 2017-11-01 15:32
 * QQ：1941042402
 */

public class File4 implements File {

    @Override
    public byte[] analysis(int offest, byte[] data) {
        byte[] roombyte=new byte[6];
        System.arraycopy(data,offest,roombyte,0,6);
        Log.d("File4", Tools.bcd2Str(roombyte));
        return roombyte;
    }

    @Override
    public int getAllLen() {
        return 0;
    }

    @Override
    public byte[] SendData() {
        byte[] data={0x00,0x00,0x00,0x00,0x00,0x01};

        Log.d("Field_4:", Tools.byte2hex(data));
        return data;
    }
}
