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
}
