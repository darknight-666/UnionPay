package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field;

import android.util.Log;

import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.CommonSharedPreferences;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.FetchAppConfig;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Utils.Tools;

/**
 * 作者：Evergarden on 2017-11-02 10:38
 * QQ：1941042402
 */

public class File11 implements File {

    @Override
    public byte[] SendData() {

        byte[] data = Tools.str2Bcd(FetchAppConfig.Audit_Number());

        int Code= Integer.parseInt(FetchAppConfig.Audit_Number());
        if (Code==999999)
            CommonSharedPreferences.put("Audit_Number","000001");
        else
            Code++;
        String batch=Code+"";
        int len=batch.length();
        if (len<6)
            for (int i=0;i<6-len;i++)
                batch="0"+batch;
        CommonSharedPreferences.put("Audit_Number",batch);


        Log.d("Field_11", Tools.byte2hex(data));
        return data;
    }


    @Override
    public byte[] analysis(int offest, byte[] data) {

        byte[] roombyte=new byte[3];
        System.arraycopy(roombyte,offest,roombyte,0,3);
        Log.d("Field_11:set",Tools.bcd2Str(roombyte));

        return roombyte;
    }

    @Override
    public int getAllLen() {
        return 0;
    }
}
