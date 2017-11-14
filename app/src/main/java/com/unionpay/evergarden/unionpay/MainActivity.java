package com.unionpay.evergarden.unionpay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Message.AIDIndexSock;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Message.SginSock;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Utils.Config;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.entity.UnionCard;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



//                AIDIndexSock aidIndexSock=new AIDIndexSock();
//                UnionPay.getUnionCard().setType(Config.AIDQureyMessage);
//                aidIndexSock.Sock();

        new Thread(new Runnable() {
            @Override
            public void run() {
                SginSock sginSock=new SginSock();
                UnionPay.getUnionCard().setType(Config.SginMessage);
                sginSock.Sock();
            }
        }).start();


    }
}
