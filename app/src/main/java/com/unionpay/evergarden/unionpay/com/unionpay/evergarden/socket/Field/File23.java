package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field;

import android.util.Log;

import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Utils.Tools;

/**
 * 作者：Evergarden on 2017-11-02 10:38
 * QQ：1941042402
 */

public class File23 implements File {
    private String Order;

    public File23(String Order){
        this.Order=Order;
    }

    @Override
    public byte[] SendData() {
        int len=Order.length();
        for (int i=0;i<4-len;i++) {
            Order = "0" + Order;
        }
        byte[] data= Tools.hexStringToByte(Order);
        Log.d("Field_23", Tools.byte2hex(data));
        return data;
    }


    @Override
    public byte[] analysis(int offest, byte[] data) {
        byte[] roombyte=new byte[2];
        System.arraycopy(data,offest,roombyte,0,2);
        Log.d("Field_23", Tools.bcd2Str(roombyte));
        return roombyte;
    }

    @Override
    public int getAllLen() {
        return 0;
    }
}
