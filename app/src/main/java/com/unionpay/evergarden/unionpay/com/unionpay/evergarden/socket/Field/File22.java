package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field;

import android.util.Log;

import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Utils.Config;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Utils.Tools;

/**
 * 作者：Evergarden on 2017-11-02 10:38
 * QQ：1941042402
 */

public class File22 implements File {

    private int Type;

    public File22(int Type){

        this.Type=Type;
    }

    @Override
    public byte[] SendData() {
        byte[] Senddata=null;
        switch (Type){
            case Config.CardPay:
                byte[] data={0x07,0x20};
                Senddata=data;

                break;
            case Config.qxcord:
                byte[] data1={0x03,0x20};
                Senddata=data1;
                break;
        }

        return Senddata;
    }

    @Override
    public byte[] analysis(int offest, byte[] data) {
        byte[] roombyte=new byte[2];
        System.arraycopy(data,offest,roombyte,0,2);
        String code="";
        try {
            code= Tools.bcd2Str(roombyte);
             }catch (Exception e){
        }
          Log.d("Field_22", code);
          return roombyte;
    }

    @Override
    public int getAllLen() {
        return 0;
    }
}
