package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket;


/**
 * 作者: Tangren on 2017/7/12
 * 包名：com.szxb.onlinbus.util
 * 邮箱：996489865@qq.com
 * TODO:获取全局的SP数据
 */

public class FetchAppConfig {



    //Ip地址
    public static String Host(){

        return (String)CommonSharedPreferences.get("Host","183.237.71.61");

    }

    //"183.237.71.61", 22102
    //"222.240.176.210" 29003
    //端口号
    public static int Port(){

        return (Integer)CommonSharedPreferences.get("Port",22102);
    }


    //主密钥
    //"9D0BDA257668DF8ADC4C5B856EA26298"
    //"258FB0AB70D025CDB99DF2C4D302D646"
    public static String MainKey(){
        return (String) CommonSharedPreferences.get("MainKey","9D0BDA257668DF8ADC4C5B856EA26298");
    }

//Audit Number


    public static int Init(){
        return (Integer) CommonSharedPreferences.get("Init", 0);
    }

    //11域 交易流水
    public static String Audit_Number() {
        return (String) CommonSharedPreferences.get("Audit_Number", "000109");
    }

    //批次号
    public static String Order_Number() {
        return (String) CommonSharedPreferences.get("Order_Number", "005001");
    }

    //41域 终端号
    //60941241 99999906
    public static String SN() {
        return (String) CommonSharedPreferences.get("SN", "60941241");
    }


    //42域 商户号
    //940411289996920  001430170119999
    public static String Merchant_Number() {
        return (String) CommonSharedPreferences.get("Merchant_Number", "940411289996920");
    }

    //mac秘钥
    public static String MacKey() {
        return (String) CommonSharedPreferences.get("MacKey", "");

    }

    //AIDlist索引
    public static String AIDlistIndex() {
        return (String) CommonSharedPreferences.get("AIDLISTIndex", "");
    }


    //AID
    public static String AID() {
        return (String) CommonSharedPreferences.get("AID", "");
    }

    public static String PublicIndex() {
        return (String) CommonSharedPreferences.get("PublicIndex", "");
    }


    public static String DownLoad() {
        return (String) CommonSharedPreferences.get("DownLoad", "0");
    }


    public static int getTimeOut() {
        return (Integer) CommonSharedPreferences.get("time_out", 3000);
    }
}