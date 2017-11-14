package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Message;

import android.util.Log;

import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.MySocket;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.SocketStatus;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Utils.Tools;

/**
 * 作者：Evergarden on 2017-11-13 14:06
 * QQ：1941042402
 */

public class SginSock implements SocketStatus {


    MySocket mySocket=new MySocket();

    private byte[] MessageType = {(byte) 0x08, 0x00};
    //00 20 00 00 00 C0 00 12
    private byte[]bitmap={0x00,0x20, 0x00, 0x00, 0x00, (byte)0xC0, 0x00, 0x12};

    public void Sock(){
        mySocket.Init(this)
                .SetTimeOut(5000)
                .SendByte(MessageType,bitmap)
                .ReceiveByte();


    }



    @Override
    public void Timeout() {

    }

    @Override
    public void Analysis(int len, byte[] data) {

        Log.d(this.getClass().getName(),len+ Tools.byte2hex(data));
    }


}
