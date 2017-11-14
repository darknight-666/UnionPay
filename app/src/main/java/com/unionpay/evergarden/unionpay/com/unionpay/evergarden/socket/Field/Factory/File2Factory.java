package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field.Factory;

import com.unionpay.evergarden.unionpay.UnionPay;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field.File;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field.File2;


/**
 * 作者：Evergarden on 2017-11-01 15:18
 * QQ：1941042402
 */

public class File2Factory implements FileFactory {

    @Override
    public File getFile() {
        return new File2(UnionPay.getUnionCard().getPrimary());
    }

 }
