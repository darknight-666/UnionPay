package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field;

import android.util.Log;

import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Utils.Config;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Utils.Tools;

/**
 * 作者：Evergarden on 2017-11-02 10:38
 * QQ：1941042402
 */

public class File62 implements File {

    private int Type;
    private String list;
    public File62(int Type,String list){
        this.Type = Type;
        this.list=list;

    }
    @Override
    public byte[] SendData() {

        byte[] Senddata=new byte[0];
        switch (Type){
            case Config.AIDQureyMessage:

                byte[] data="100".getBytes();
                byte[] len= Tools.int2Bytes(3,2);
                Senddata=Tools.MergeArray(len,data);
                break;

            case Config.PublicQureykeyMessage:
                byte[] data1="100".getBytes();
                byte[] len1=Tools.int2Bytes(3,2);
                Senddata=Tools.MergeArray(len1,data1);
                break;
            case Config.DwonAIDMessage:
                byte[] data2=Tools.hexStringToByte(list);
                byte[] len2={0x00,0x11};
                Senddata=Tools.MergeArray(len2,data2);

                break;

            case Config.PublicKeyIndex:
                byte[] len3={0x00,0x03};
                byte[] data3="100".getBytes();
                Senddata=Tools.MergeArray(len3,data3);
                break;

            case Config.PublicIndexEnd:
                byte[] len4={0x00,0x03};
                byte[] data4="108".getBytes();
                Senddata=Tools.MergeArray(len4,data4);
                break;

            case Config.DownPublicKey:
                byte[] len5={0x00,0x12};
                byte[] data5=Tools.hexStringToByte(list);
                Senddata=Tools.MergeArray(len5,data5);
                break;

        }
        Log.d("Field_62",Tools.byte2hex(Senddata));
        return Senddata;
    }


    @Override
    public void analysis(byte[] data) {

    }


    @Override
    public int getAllLen() {
        return 0;
    }
}
