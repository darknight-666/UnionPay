package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.entity;

/**
 * 作者：Evergarden on 2017-11-02 10:24
 * QQ：1941042402
 */

public class UnionCard
{
    //主账号
    private String primary;


    //22 60,62,63
    private int Type;

    //23
    private String Order;

    //35
    private String hex;

    //59
    private String value;

    //62
    private String list;


    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getOrder() {
        return Order;
    }

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }

    public void setOrder(String order) {
        Order = order;
    }

    public int getType() {
        return Type;
    }

    public void setType(int type) {
        Type = type;
    }

    public String getPrimary() {
        return primary;
    }

    public void setPrimary(String primary) {
        this.primary = primary;
    }



    public void loadingdata(){

    }
}
