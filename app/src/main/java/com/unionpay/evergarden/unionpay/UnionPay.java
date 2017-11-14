package com.unionpay.evergarden.unionpay;

import android.app.Application;

import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.CommonSharedPreferences;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.entity.UnionCard;

/**
 * 作者：Evergarden on 2017-10-30 15:28
 * QQ：1941042402
 */

public class UnionPay extends Application {

    private volatile static UnionPay unionpay = null;

    private static UnionCard unionCard;
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


    public static UnionCard getUnionCard(){
        if (unionCard==null){
             unionCard=new UnionCard();
             unionCard.loadingdata();
        }

        return unionCard;
    }
    
    @Override
    public void onCreate() {
        super.onCreate();
        unionpay=this;
    }
}
