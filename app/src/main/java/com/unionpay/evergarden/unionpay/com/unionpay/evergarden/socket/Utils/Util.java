package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Utils;

import android.content.Context;
import android.util.Log;


import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

/**
 * 作者: Tangren on 2017/8/19
 * 包名：szxb.com.socket.utils
 * 邮箱：996489865@qq.com
 * TODO:一句话描述
 */

public class Util {


    public static String getNowDate() {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String dateString = formatter.format(currentTime);

        return dateString;
    }


    private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", new Locale("zh", "CN"));

    //得到当前日期：yyyy-MM-dd HH:mm:ss
    public static String getCurrentDate() {
        return format.format(new Date());
    }

    //获取bitmap所存在的域
    public static int[] bitmapFiled(String bitmapString) {
        int[] resultInt = null;
        for (int i = 0; i < bitmapString.length(); i++) {
            int a = bitmapString.indexOf("1", i);
            if (a < 0) break;
            resultInt[i] = a + 1;
            System.out.println(a + 1);
            i = a;
        }
        return resultInt;
    }

    //将字节数组转换成二进制字符串
    private static String binary(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(byteToBit(b));
        }
        return sb.toString();
    }

    private static String byteToBit(byte b) {
        return "" + (byte) ((b >> 7) & 0x1) + (byte) ((b >> 6) & 0x1)
                + (byte) ((b >> 5) & 0x1) + (byte) ((b >> 4) & 0x1)
                + (byte) ((b >> 3) & 0x1) + (byte) ((b >> 2) & 0x1)
                + (byte) ((b >> 1) & 0x1) + (byte) ((b >> 0) & 0x1);
    }


    public static Set<Integer> bitMap2Set(byte[] bitmap) {
        Set<Integer> sets = new TreeSet<Integer>();
        StringBuilder string_bitmap = new StringBuilder();
        for (byte b : bitmap) {
            //logger.debug(String.format("%1$08d",Integer.parseInt(Integer.toBinaryString(b&0xFF))));
            string_bitmap.append(String.format("%1$08d", Integer.parseInt(Integer.toBinaryString(b & 0xFF))));
        }
        //logger.debug("string_bitmap={}",string_bitmap);
        Log.d("Util",
                "bitMap2Set(Util.java:57)string_bitmap=" + string_bitmap);
        for (int i = 1; i < string_bitmap.toString().toCharArray().length; i++) {
            if (string_bitmap.toString().toCharArray()[i] == '1') {
                sets.add(i + 1);
            }
        }
        return sets;
    }


    public static String getAssetsData(Context context, String path) {
        String result = "";
        try {
            InputStream mAssets = context.getAssets().open(path);
            int lenght = mAssets.available();
            byte[] buffer = new byte[lenght];
            mAssets.read(buffer);
            mAssets.close();
            result = new String(buffer);
            return result;
        } catch (IOException e) {
            e.printStackTrace();
            Log.e("fuck", e.getMessage());
            return result;
        }
    }


//    public static boolean isBlackListName(String cardNo) {
//        BalckListEntityDao dao = UnionBus.getInstance().getDaoSession().getBalckListEntityDao();
//        BalckListEntity unique = dao.queryBuilder().where(BalckListEntityDao.Properties.Cardno.eq(cardNo)).unique();
//        if (unique != null)
//            return true;
//        return false;
//    }
}
