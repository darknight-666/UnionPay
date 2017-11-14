package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Utils;

/**
 * 作者：Evergarden on 2017-09-02 11:12
 * QQ：1941042402
 */

public class Config {

    //报文消息类型
    public static final int SginMessage=0x01;
    public static final int AIDQureyMessage=0x02;
    public static final int DwonAIDMessage=0x03;
    public static final int PublicQureykeyMessage=0x04;
    public static final int AIDEnd=0x05;
    public static final int PublicKeyIndex=0x06;
    public static final int PublicIndexEnd=0x07;
    public static final int DownPublicKey=0x08;

    public static final int CardPay=0x09;
    public static final int qxcord=0x10;
    public static final int DownPublicKeyEnd=0x11;
    public static final int keyEvent=0x12;
    public static final String URL="http://139.199.158.253/bipbus/interaction/bankjour";

    //寻卡 二维码消息类型
    public static final int Barcode=0x99;
    public static final int UnionCard=0x98;


}
