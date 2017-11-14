package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field;

/**
 * 作者：Evergarden on 2017-11-01 14:50
 * QQ：1941042402
 */

//数据域
public interface File {

    //发送数据包
    byte[] SendData();

    //解析数据
    byte[] analysis(int offest,byte[] data);

    //获取总长度
    int getAllLen();

}
