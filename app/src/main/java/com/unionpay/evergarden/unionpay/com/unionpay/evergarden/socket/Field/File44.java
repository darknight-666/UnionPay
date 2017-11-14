package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field;

import android.util.Log;

import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Utils.Tools;

/**
 * 作者：Evergarden on 2017-11-02 10:38
 * QQ：1941042402
 */

public class File44 implements File {
    @Override
    public byte[] SendData() {
        return new byte[0];
    }

    @Override
    public byte[] analysis(int offest, byte[] data) {
        byte[] lenbyte = new byte[1];
        Log.d("offest", offest + "");
        System.arraycopy(data, offest, lenbyte, 0, 1);
        Log.d("2", "1");
        int len = Integer.parseInt(Tools.byte2hex(lenbyte));
        Log.d("Field", len + "");

        //        if ((len&1)==1){
        //            len++;
        //        }
        //        len/=2;
        byte[] roombyte = new byte[len];

        System.arraycopy(data, offest + 1, roombyte, 0, len);

        Log.d("Field44:", Tools.byte2hex(roombyte));
        return roombyte;
    }


/*    @Override
    public void analysis(byte[] data) {

    }*/


    @Override
    public int getAllLen() {
        return 0;
    }
}
