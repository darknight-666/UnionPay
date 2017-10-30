package com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Utils;

import android.util.Log;

import java.nio.ByteBuffer;
import java.util.Arrays;


/**
 * @author Administrator
 * 工具类，用于各种BCD码、ASCII码、二进制码的转换
 */
public abstract class Tools {
	
	 public static byte[] shortToByteArray(short s) {
		  byte[] shortBuf = new byte[2];
		  for(int i=0;i<2;i++) {
		     int offset = (shortBuf.length - 1 -i)*8;
		     shortBuf[i] = (byte)((s>>>offset)&0xff);
		  }
		  return shortBuf;
	 }

	/**
	 * 合并byte数组
	 */
	public static byte[] unitByteArray(byte[] byte1, byte[] byte2) {

			byte[] unitByte = new byte[byte1.length + byte2.length];
			System.arraycopy(byte1, 0, unitByte, 0, byte1.length);
			System.arraycopy(byte2, 0, unitByte, byte1.length, byte2.length);
			return unitByte;

	}

	public static byte[] MergeArray(byte[] byte1,byte[]... bytes){
		byte[] Merage=byte1;
		Log.d("Merage",byte2hex(byte1));
		for (int i=0;i<bytes.length;i++) {
			Log.d("Merage",byte2hex(bytes[i]));
			byte[] newInt = unitByteArray(Merage,bytes[i]);
			Merage= newInt;

		}

//		byte[] Merage=null;
//		for (int k = 0; k < list.size(); k++) {
//			byte[] Item = (byte[])  list.get(k);
//			byte[] newInt = unitByteArray(Merage,Item);
//			Merage= newInt;
//		}

		return Merage;

	}

	//求长度用的 int转byte[]
	public static byte[] int2Bytes(int value, int len) {
		byte[] b = new byte[len];
		for (int i = 0; i < len; i++) {
			b[len - i - 1] = (byte) ((value >> 8 * i) & 0xff);
		}
		return b;
	}

	//高位在前 低位在后
	public static int bytesToInt2(byte[] src, int offset) {
		int value;
		value = (int) ( ((src[offset] & 0xFF)<<24)
				|((src[offset+1] & 0xFF)<<16)
				|((src[offset+2] & 0xFF)<<8)
				|(src[offset+3] & 0xFF));
		return value;
	}

	//ByteToHexString
	public static String byte2hex(byte[] b) {
		
		if(b==null) return null;
		String hs = "";
		String stmp = "";
		for (int n = 0; n < b.length; n++) {
			stmp = (Integer.toHexString(b[n] & 0XFF));
			if (stmp.length() == 1)
				hs = hs + "0" + stmp;
			else
				hs = hs + stmp;
		}
		return hs.toUpperCase();
	}
	public static String byte2hex(byte[] b,int off,int len) {
		
		byte[] data=Arrays.copyOfRange(b, off, off+len);
		
		return byte2hex(data);
	}



	public static String DecimaltoBcd(String str){
		String b_num="";
		for (int i = 0; i < str.length(); i++) {

			String b = Integer.toBinaryString(Integer.parseInt(str.valueOf(str.charAt(i))));

			int b_len=4-b.length();

			for(int j=0;j<b_len;j++){
				b="0"+b;
			}
			b_num+=b;
		}

		return b_num;
	}


	public static String HextoBcd(String hex){

		int decimal = Integer.parseInt(hex,16);

		String bcd = DecimaltoBcd(String.valueOf(decimal));

		return bcd;
	}

	//HexStringToByte
	public static byte[] hexStringToByte(String hex) {
		hex=hex.toUpperCase();
		int len = (hex.length() / 2);
		byte[] result = new byte[len];
		char[] achar = hex.toCharArray();
		for (int i = 0; i < len; i++) {
			int pos = i * 2;
			result[i] = (byte) (toByte(achar[pos]) << 4 | toByte(achar[pos + 1]));
		}
		return result;
	}
	
	private static byte toByte(char c) {
		byte b = (byte) "0123456789ABCDEF".indexOf(c);
		return b;
	}
		
	private static byte abcd_to_asc(byte abyte)
	{
		if (abyte <= 9)
			abyte = (byte) (abyte + '0');
		else
			abyte = (byte) (abyte + 'A' - 10);
		return (abyte);
	}

	public static int BCD2INT(byte []bcd_buf,int len){
		try{
			return Integer.parseInt(new String(BCD2ASCII(bcd_buf,len),"US-ASCII"));
		}catch(Exception ex){
			throw new RuntimeException(ex);
		}
		
	}
	
	public static byte[] BCD2ASCII(byte [] bcd_buf,int len)
	{
		int i,n;
		n=len;
		ByteBuffer asc_buf=ByteBuffer.allocate(n);
		byte tmp;
		for (i = 0; i < n/2; i++) {
			tmp = (byte) ((bcd_buf[i] & 0xf0) >> 4);
			tmp = abcd_to_asc(tmp);
			asc_buf.put(tmp);
			tmp = (byte) (bcd_buf[i] & 0x0f);
			tmp = abcd_to_asc(tmp);
			asc_buf.put(tmp);
		}
		if (n % 2!=0) {
			tmp = (byte) ((bcd_buf[i] & 0xf0) >> 4);
			tmp = abcd_to_asc(tmp);
			asc_buf.put(tmp);
		}
		asc_buf.flip();
	    byte[] res=null;
    	res=new byte[asc_buf.remaining()];
    	asc_buf.get(res, 0, res.length);
    	return res;
	}

	private static byte aasc_to_bcd(byte asc)
	{
		byte bcd;

		if ((asc >= '0') && (asc <= '9'))
			bcd = (byte) (asc - '0');
		else if ((asc >= 'A') && (asc <= 'F'))
			bcd = (byte) (asc - 'A' + 10);
		else if ((asc >= 'a') && (asc <= 'f'))
			bcd = (byte) (asc - 'a' + 10);
		else if ((asc > 0x39) && (asc <= 0x3f))
			bcd = (byte) (asc - '0');
		else {
			/*		printf( "\f[Warning] : Bad HEX digid" );
					bcd = 0;
			*/ 		
			bcd = 0x0f;
		}
		return bcd;
	}
	//ASCII2BCD	
	public static byte[] ASCII2BCD(byte[] asc_buf)
	{
		int j=0;
		int n=asc_buf.length;
		byte []bcd_buf=new byte[(n+1)/2];
		for (int i = 0; i < (n+1)/2; i++) {
			bcd_buf[i] = aasc_to_bcd(asc_buf[j++]);
			bcd_buf[i] = (byte) (((j >= n) ? 0x00 : aasc_to_bcd(asc_buf[j++]))+ (bcd_buf[i] << 4));
		}
		return bcd_buf;
	}
	public static byte[] ASCII2BCD(byte[] asc_buf,int off,int len)
	{
		byte[] data=Arrays.copyOfRange(asc_buf, off, off+len);
		
		return ASCII2BCD(data);
	}


	/** *//**
	 * @函数功能: BCD码转为10进制串(阿拉伯数据)
	 * @输入参数: BCD码
	 * @输出结果: 10进制串
	 */
	public static String bcd2Str(byte[] bytes){
		StringBuffer temp=new StringBuffer(bytes.length*2);

		for(int i=0;i<bytes.length;i++){
			temp.append((byte)((bytes[i]& 0xf0)>>>4));
			temp.append((byte)(bytes[i]& 0x0f));
		}
		return temp.toString().substring(0,1).equalsIgnoreCase("0")?temp.toString().substring(1):temp.toString();
	}

	/**
	 * @函数功能: 10进制串转为BCD码
	 * @输入参数: 10进制串
	 * @输出结果: BCD码
	 */
	public static byte[] str2Bcd(String asc) {
		int len = asc.length();
		int mod = len % 2;

		if (mod != 0) {
			asc = "0" + asc;
			len = asc.length();
		}

		byte abt[] = new byte[len];
		if (len >= 2) {
			len = len / 2;
		}

		byte bbt[] = new byte[len];
		abt = asc.getBytes();
		int j, k;

		for (int p = 0; p < asc.length()/2; p++) {
			if ( (abt[2 * p] >= '0') && (abt[2 * p] <= '9')) {
				j = abt[2 * p] - '0';
			} else if ( (abt[2 * p] >= 'a') && (abt[2 * p] <= 'z')) {
				j = abt[2 * p] - 'a' + 0x0a;
			} else {
				j = abt[2 * p] - 'A' + 0x0a;
			}

			if ( (abt[2 * p + 1] >= '0') && (abt[2 * p + 1] <= '9')) {
				k = abt[2 * p + 1] - '0';
			} else if ( (abt[2 * p + 1] >= 'a') && (abt[2 * p + 1] <= 'z')) {
				k = abt[2 * p + 1] - 'a' + 0x0a;
			}else {
				k = abt[2 * p + 1] - 'A' + 0x0a;
			}

			int a = (j << 4) + k;
			byte b = (byte) a;
			bbt[p] = b;
		}
		return bbt;
	}

}
