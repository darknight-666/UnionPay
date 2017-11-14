package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field;

import android.util.Log;

import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Utils.Tools;

/**
 * 作者：Evergarden on 2017-11-02 10:38
 * QQ：1941042402
 */

public class File25 implements File {
    @Override
    public byte[] SendData() {
        byte[] data={0x00};
        return data;
    }

    @Override
    public byte[] analysis(int offest, byte[] data) {
        byte[] roombyte=new byte[1];
       System.arraycopy(roombyte,offest,roombyte,0,1);
       Log.d("Field_25", Tools.bcd2Str(roombyte));
       return roombyte;
    }

    @Override
    public int getAllLen() {
        return 0;
    }
}
