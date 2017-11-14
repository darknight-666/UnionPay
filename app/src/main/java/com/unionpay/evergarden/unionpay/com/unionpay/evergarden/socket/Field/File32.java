package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field;

import android.util.Log;

import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Utils.Tools;

/**
 * 作者：Evergarden on 2017-11-02 10:38
 * QQ：1941042402
 */

public class File32 implements File {
    @Override
    public byte[] SendData() {
        return new byte[0];
    }


    @Override
    public byte[] analysis(int offest, byte[] data) {
        byte[] lenbyte=new byte[1];
        byte[] roombyte=new byte[4];
        System.arraycopy(lenbyte,offest,lenbyte,0,1);
        System.arraycopy(data,offest+1,roombyte,0,4);
        String code="";
        code=Tools.bcd2Str(roombyte);
        Log.d("len", Tools.byte2hex(lenbyte));
        Log.d("Field_32", code);
        return roombyte;
    }




    @Override
    public int getAllLen() {
        return 0;
    }
}
