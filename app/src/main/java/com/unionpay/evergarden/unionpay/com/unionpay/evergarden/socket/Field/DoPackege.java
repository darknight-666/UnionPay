package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field;

import android.util.Log;

import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field.Factory.File11Factory;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field.Factory.File12Factory;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field.Factory.File13Factory;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field.Factory.File14Factory;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field.Factory.File15Factory;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field.Factory.File22Factory;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field.Factory.File23Factory;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field.Factory.File25Factory;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field.Factory.File2Factory;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field.Factory.File32Factory;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field.Factory.File35Factory;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field.Factory.File37Factory;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field.Factory.File38Factory;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field.Factory.File39Factory;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field.Factory.File3Factory;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field.Factory.File41Factory;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field.Factory.File42Factory;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field.Factory.File44Factory;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field.Factory.File49Factory;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field.Factory.File4Factory;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field.Factory.File53Factory;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field.Factory.File55Factory;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field.Factory.File59Factory;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field.Factory.File60Factory;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field.Factory.File62Factory;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field.Factory.File63Factory;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field.Factory.FileFactory;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Utils.Tools;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 作者：Evergarden on 2017-11-01 15:38
 * QQ：1941042402
 */

public class DoPackege  {
    Map<Integer,FileFactory> map;
    public void init(){
        map=new HashMap<>();
        map.put(2,new File2Factory());
        map.put(3,new File3Factory());
        map.put(4,new File4Factory());
        map.put(11,new File11Factory());
        map.put(12,new File12Factory());
        map.put(13,new File13Factory());
        map.put(14,new File14Factory());
        map.put(15,new File15Factory());
        map.put(22,new File22Factory());
        map.put(23,new File23Factory());
        map.put(25,new File25Factory());
        map.put(32,new File32Factory());
        map.put(35,new File35Factory());
        map.put(37,new File37Factory());
        map.put(38,new File38Factory());
        map.put(39,new File39Factory());
        map.put(41,new File41Factory());
        map.put(42,new File42Factory());
        map.put(44,new File44Factory());
        map.put(49,new File49Factory());
        map.put(53,new File53Factory());
        map.put(55,new File55Factory());
        map.put(59,new File59Factory());
        map.put(60,new File60Factory());
        map.put(62,new File62Factory());
        map.put(63,new File63Factory());

    }


    public byte[] TPDU = {0x60, 0x03, 0x03, 0x00, 0x00};
    public byte[] APDU = {0x61, 0x31, 0x00, 0x31, 0x30, 0x31};
    public byte[] Message=new byte[0];

    public byte[] bitMap=new byte[0];

    public void AddHead(byte[] MSG,byte[] bitmap){

            Message=MSG;
            bitMap=bitmap;
    }

    public byte[] GetALLData(Set<Integer> integerSet){
        byte[] ALLData=Tools.MergeArray(TPDU,APDU,Message,bitMap);
        System.out.println(integerSet);

        for (int i:integerSet){
            ALLData=Tools.unitByteArray(ALLData,map.get(i).getFile().SendData());
            System.out.println(integerSet);
        }
        byte[] len=Tools.int2Bytes(ALLData.length,2);
        ALLData=Tools.MergeArray(len,ALLData);
        return ALLData;

    }





}
