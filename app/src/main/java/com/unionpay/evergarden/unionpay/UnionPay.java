package com.unionpay.evergarden.unionpay;

import android.app.Application;

/**
 * 作者：Evergarden on 2017-10-30 15:28
 * QQ：1941042402
 */

public class UnionPay extends Application {

    private volatile static UnionPay unionpay = null;

    public static UnionPay getInstance() {
        if (unionpay==null){
            synchronized (UnionPay.class){
                if (unionpay==null){
                    unionpay=new UnionPay();
                }
            }
        }

        return unionpay;
    }
    
    @Override
    public void onCreate() {
        super.onCreate();
    }
}
