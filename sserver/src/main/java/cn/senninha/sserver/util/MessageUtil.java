package cn.senninha.sserver.util;

import java.nio.ByteBuffer;

/**
 * 
 * @author senninha on 2018年1月11日
 *
 */
public class MessageUtil {
	/**
	 * 校验和
	 * @param buffer
	 * @param start 开始下标(包含)
	 * @param end 结束下标(不包含)
	 * @return
	 */
	public static byte checkSum(ByteBuffer buffer, int start, int end) {
		int checkSum = 0;
		for(int i = start ; i < end - start ; i++) {
//			checkSum = ((0xff & buffer.get(i))) + checkSum;
			checkSum = buffer.get(i) + checkSum;
		}
		return (byte) (checkSum & 0xff);
	}
	
	/**
	 * ascii转为string
	 * @param b 多少个字节都兼容吧orz
	 * @return
	 */
	public static String byte32ChangeToString(byte[] b){
		StringBuilder sb = new StringBuilder(32);
		for(int i = 0 ; i < b.length ; i++){
			sb.append((char) b[i]);
		}
		return sb.toString();
	}
	
	/**
	 * string转为byte[]
	 * @param s
	 * @return
	 */
	public static byte[] stringToByteArray(String s){
		byte[] b = new byte[s.length()];
		for(int i = 0 ; i < s.length() ; i++){
			b[i] = (byte) s.charAt(i);
		}
		return b;
	}
	
	public static void main(String[] args){
		String s = "ABC";
		byte[] b = stringToByteArray(s);
		System.out.println(byte32ChangeToString(b));
	}
}
