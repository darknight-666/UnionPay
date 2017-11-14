package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field.Factory;

import com.unionpay.evergarden.unionpay.UnionPay;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field.File;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field.File25;
import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Field.File60;


/**
 * 作者：Evergarden on 2017-11-01 15:18
 * QQ：1941042402
 */

public class File60Factory implements FileFactory {

    @Override
    public File getFile() {
        return new File60(UnionPay.getUnionCard().getType());
    }
}
