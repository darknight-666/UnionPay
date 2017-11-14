package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field;

import android.util.Log;

import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Utils.Tools;

/**
 * 作者：Evergarden on 2017-11-02 10:38
 * QQ：1941042402
 */

public class File35 implements File {

    private String hex;

    public File35(String hex){
        this.hex=hex;

    }

    @Override
    public byte[] SendData() {
        if (hex.contains("f")){
            hex=hex.substring(0, hex.indexOf("f"));
        }
        Log.d("Field35",hex);
        int len=hex.length();
        String len_str=len+"";
        byte[] lenbyte=Tools.hexStringToByte(len_str);
        if ((len&1)!=0)
        {
            hex=hex+"0";
        }
        byte[] data= Tools.hexStringToByte(hex);
        byte[] Senddata=Tools.MergeArray(lenbyte,data);
        return Senddata;

    }


    @Override
    public byte[] analysis(int offest, byte[] data) {
        byte[] lenbyte=new byte[1];
        Log.d("offest",offest+"");
        System.arraycopy(data,offest,lenbyte,0,1);
        Log.d("2","1");
        int len=Integer.parseInt(Tools.byte2hex(lenbyte))/2;
        Log.d("offest",offest+"");

        byte[] roombyte=new byte[len];

        System.arraycopy(data,offest,roombyte,0,len);

        Log.d("File35",Tools.bcd2Str(roombyte));

        return roombyte;
    }

    @Override
    public int getAllLen() {
        return 0;
    }
}
