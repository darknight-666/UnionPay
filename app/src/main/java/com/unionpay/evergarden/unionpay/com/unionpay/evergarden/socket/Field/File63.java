package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field;

import android.util.Log;

import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Utils.Config;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Utils.Tools;

/**
 * 作者：Evergarden on 2017-11-02 10:38
 * QQ：1941042402
 */

public class File63 implements File {
    private int Type;

    public File63(int Type){
            this.Type=Type;
    }

    @Override
    public byte[] SendData() {
        byte[] Senddata=new byte[0];
        switch (Type){
            case Config.SginMessage:
                byte[] len={0x00,0x03};
                 Senddata= Tools.MergeArray(len,Field_63_1());
                break;
        }
        Log.d("Field_63", Tools.byte2hex(Senddata));
        return Senddata;
    }

    //签到 操作员号
    public byte[] Field_63_1(){

        switch (Type){
            case Config.SginMessage:
                byte[] bytes="099".getBytes();
                return bytes;

        }
        return null;

    }




    @Override
    public void analysis(byte[] data) {

    }


    @Override
    public int getAllLen() {
        return 0;
    }
}
