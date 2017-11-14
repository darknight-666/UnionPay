package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field;

import android.util.Log;

import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Utils.Tools;

/**
 * 作者：Evergarden on 2017-11-01 15:10
 * QQ：1941042402
 */

public class File2 implements File {

    private String hex;
    private byte[] Senddata;

    public File2(String hex){
        this.hex=hex;
    }

    @Override
    public byte[] SendData() {
        int len=hex.length();
        //int len=16;
        String len_str=len+"";
        //偶数长度补0
        if ((len&1)!=0)
        {
            hex=hex+"0";
        }
        byte[] data= Tools.hexStringToByte(hex);
        byte[] lenbyte=Tools.hexStringToByte(len_str);
        Senddata=Tools.MergeArray(lenbyte,data);
        Log.d("Field_2",Tools.byte2hex(Senddata));
        return Senddata;

    }

    //返回数据为byte[] 数组
    @Override
    public byte[] analysis(int offest,byte[] data) {

        byte[] lenbyte=new byte[1];
        Log.d("offest",offest+"");

        System.arraycopy(data,offest,lenbyte,0,1);
        int len=Integer.parseInt(Tools.byte2hex(lenbyte));
        int len_s=len;
        if ((len&1)==1){
            len++;
        }
        len/=2;

        byte[] roombyte=new byte[len];
        System.arraycopy(data,1+offest,roombyte,0,len);
        Log.d("File2",Tools.bcd2Str(roombyte));

        return roombyte;

    }

    @Override
    public int getAllLen() {
        return 0;
    }
}
