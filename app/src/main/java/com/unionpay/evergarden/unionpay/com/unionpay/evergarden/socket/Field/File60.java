package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field;

import android.util.Log;

import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.FetchAppConfig;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Utils.Config;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Utils.Tools;

/**
 * 作者：Evergarden on 2017-11-02 10:38
 * QQ：1941042402
 */

public class File60 implements File {


    private int Type;


    public File60(int Type){
        this.Type=Type;
    }

    @Override
    public byte[] SendData() {

        byte[] Senddata=new byte[0];
        switch (Type){
            case Config.CardPay:
                byte[] len={0x00,0x13};
                Senddata= Tools.MergeArray(len,Field_60_1(),Field_60_2(),Field_60_3());
                Log.d("Field_60", Tools.byte2hex(Senddata));
                return Senddata;

            case Config.qxcord:
                byte[] len1={0x00,0x08};

                Senddata= Tools.MergeArray(len1,Field_60_1(),Field_60_2());
                Log.d("Field_60", Tools.byte2hex(Senddata));
                return Senddata;

            default:
                byte[] len2={0x00,0x11};
                Senddata= Tools.MergeArray(len2,Field_60_1(),Field_60_2(),Field_60_3());
                Log.d("Field_60", Tools.byte2hex(Senddata));
                return Senddata;

        }
    }


    @Override
    public void analysis(byte[] data) {

    }


    @Override
    public int getAllLen() {
        return 0;
    }



    //签到 交易类型码
    public byte[] Field_60_1(){
        switch (Type){
            case Config.SginMessage:
                byte[] bytes={0x00};
                return bytes;

            case Config.AIDQureyMessage:
                byte[] bytes1={0x00};
                return bytes1;

            case Config.PublicQureykeyMessage:
                byte[] bytes2={0x00};
                return bytes2;

            case Config.DwonAIDMessage:
                byte[] bytes3={0x00};
                return bytes3;

            case Config.AIDEnd:
                byte[] bytes4={0x00};
                return bytes4;

            case Config.PublicKeyIndex:
                byte[] bytes5={0x00};
                return bytes5;
            case Config.DownPublicKey:
                byte[] bytes6={0x00};
                return bytes6;

            case Config.PublicIndexEnd:
                byte[] bytes7={0x00};
                return bytes7;

            case Config.DownPublicKeyEnd:
                byte[] bytes8={0x00};
                return bytes8;
            case Config.CardPay:
                byte[] bytes9={0x22};
                return bytes9;
            case Config.qxcord:
                byte[] bytes10={0x22};
                return bytes10;
        }
        return null;

    }

    //批次号
    public byte[] Field_60_2(){
        byte[] bytes= Tools.str2Bcd(FetchAppConfig.Order_Number());
        return bytes;


    }

    //网络管理信息码
    public byte[] Field_60_3(){
        switch (Type){
            case Config.SginMessage:
                byte[] bytes={0x00,0x30};
                return bytes;

            case Config.AIDQureyMessage:
                byte[] bytes1={0x38,(byte) 0x20};
                return bytes1;

            case Config.PublicQureykeyMessage:
                byte[] bytes2={0x37,0x20};
                return bytes2;

            case Config.DwonAIDMessage:
                byte[] bytes3={0x38,0x00};
                return bytes3;

            case Config.AIDEnd:
                byte[] bytes4={0x38,0x10};
                return bytes4;

            case Config.PublicKeyIndex:
                byte[] bytes5={0x37,0x20};
                return bytes5;

            case Config.DownPublicKey:
                byte[] bytes6={0x37,0x00};
                return bytes6;
            case Config.PublicIndexEnd:
                byte[] bytes7={0x37,0x20};
                return bytes7;
            case Config.DownPublicKeyEnd:
                byte[] bytes8={0x37,0x10};
                return bytes8;

            case Config.CardPay:
                byte[] bytes9={0x00,0x06,0x00};
                return bytes9;

            case Config.qxcord:

                break;

        }
        return null;

    }

}
