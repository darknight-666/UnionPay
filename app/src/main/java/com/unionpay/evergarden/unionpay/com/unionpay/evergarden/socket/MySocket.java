package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket;



import android.util.Log;

import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field.DoPackege;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Utils.Tools;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Utils.Util;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Set;


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

    private byte[] MessageType = new byte[0];
    private byte[] bitmap = new byte[0];


    //建立连接
    public MySocket Init(SocketStatus socketStatus){
        this.socketStatus=socketStatus;
        System.out.println("111111111111+");
        String host=FetchAppConfig.Host();
        System.out.println(host);
        int port=FetchAppConfig.Port();
        System.out.println(port);

        try {
            socket=new Socket(host,port);
        } catch (IOException e) {
            e.printStackTrace();
            socketStatus.Timeout();
            Log.d("Connect","!"+e.getMessage());
        }

        return this;

    }


    public MySocket addMsg(byte[] Msg,byte[] bitmap){
        MessageType=Msg;
        this.bitmap=bitmap;
        return this;

    }

    //设置超时 时间毫秒
    public MySocket SetTimeOut(int time){

        try {

            socket.setSoTimeout(time);
        }catch (Exception e){
            socketStatus.Timeout();
            Log.d("Connect","!"+e.getMessage());
        }
        return this;
    }


    //发送数据
    public MySocket SendByte(byte[] MSG,byte[] bitmap){


        DoPackege doPackege=new DoPackege();
        doPackege.init();
        doPackege.AddHead(MSG, bitmap);
        Set<Integer> bitmap_set = Util.bitMap2Set(bitmap);
        System.out.println(Tools.byte2hex(doPackege.GetALLData(bitmap_set)));

        try {
            if (socket.isConnected()){
                Log.d("Send","connect");
                dos=new DataOutputStream(socket.getOutputStream());
            }


            dos.write(doPackege.GetALLData(bitmap_set));
            dos.flush();
        }catch (Exception e){
            Log.d("Send","!"+e.getMessage());
            socketStatus.Timeout();
        }



        return this;

    }


    //接收数据
    public MySocket ReceiveByte(){
        Log.d(this.getClass().getName(),"!");
        try {
            Log.d("receive","connect");
            dis=new DataInputStream(socket.getInputStream());
            byte[] len=new byte[2];
            dis.read(len);
            int length=Integer.parseInt(Tools.byte2hex(len),16);
            Log.d(this.getClass().getName(),"!"+length);
            byte[] room=new byte[length];
            dis.read(room);
            Log.d(this.getClass().getName(),"!");
            System.out.println(length+"---"+Tools.byte2hex(room));
            socketStatus.Analysis(length,room);
            socket.close();
            dis.close();
            dos.close();
        }catch (Exception e){
            Log.d(this.getClass().getName(),"!"+e.getMessage());
            socketStatus.Timeout();
        }

        return this;


    }

}
