package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field;


import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Utils.Tools;

/**
 * 作者：Evergarden on 2017-09-05 15:29
 * QQ：1941042402
 */

public class Field {

    public int len;//内容长度
    public int Type;//使用类型
    public byte[] Senddata;//发送数据
    public int Var;//不定长长度字节长度
    public int Lengt;//实际总长度（包含长度域）
    public byte[] lenbyte;//长度数据
    public byte[] roombyte;//具体数据

    public Field(){}

    public Field(int type){
        this.Type=type;
    }

    public String SetRecord(int i,byte[] buffer) {


        return Tools.byte2hex(roombyte);
    }

    public byte[] getData() {


        return Senddata;
    }


    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public int getType() {
        return Type;
    }

    public void setType(int type) {
        Type = type;
    }

    public byte[] getSenddata() {
        return Senddata;
    }

    public void setSenddata(byte[] senddata) {
        Senddata = senddata;
    }



    public int getVar() {
        return Var;
    }

    public void setVar(int var) {
        Var = var;
    }

    public int getLengt() {
        int length;
        if (lenbyte==null){
           length=roombyte.length;
        }else {
           length=lenbyte.length+roombyte.length;
        }
        return length;
    }

    public void setLengt(int lengt) {
        Lengt = lengt;
    }
}
