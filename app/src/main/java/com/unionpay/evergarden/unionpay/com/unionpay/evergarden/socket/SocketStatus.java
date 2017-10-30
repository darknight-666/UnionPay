package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket;

/**
 * 作者：Evergarden on 2017-10-30 17:12
 * QQ：1941042402
 */

public interface SocketStatus {

    //Socket超时
    void Timeout();

    //数据接收 len长度 data数据内容
    void Analysis(int len,byte[] data);
}
