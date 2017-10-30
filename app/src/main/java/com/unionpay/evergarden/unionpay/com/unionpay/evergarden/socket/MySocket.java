package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket;



import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Utils.Tools;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;


/**
 * 作者：Evergarden on 2017-10-30 15:23
 * QQ：1941042402
 */

public class MySocket {


    final MySocket mySocket=this;

    private SocketStatus socketStatus;
    private SocketAddress socketAddress;
    private Socket socket;

    private DataInputStream dis;
    private DataOutputStream dos;


    //建立连接
    public MySocket Init(String host,int port){
        socket=new Socket();
        socketAddress = new InetSocketAddress(host,port);
        return this;

    }

    //设置超时 时间毫秒
    public void SetTimeOut(int time,SocketStatus socketStatus){
        try {
            socket.setSoTimeout(time);
        }catch (Exception e){
            socketStatus.Timeout();
        }

    }


    //发送数据
    private void SendByte(byte[] data){
        try {
            dos.write(data);
            dos.flush();
        }catch (Exception e){
            socketStatus.Timeout();
        }



    }


    //接收数据
    private void ReceiveByte(SocketStatus socketStatus){
        try {
            byte[] len=new byte[2];
            dis.read(len);
            int length=Integer.parseInt(Tools.byte2hex(len),16);
            byte[] room=new byte[length];
            dis.read(room);
            socketStatus.Analysis(length,room);
            socket.close();
            dis.close();
            dos.close();
        }catch (Exception e){
            socketStatus.Timeout();
        }


    }

}
