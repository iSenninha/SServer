package yt;

import org.slf4j.LoggerFactory;

import cn.senninha.sserver.logger.LoggerSystem;

public class AppTest {

	public static void main(String[] args) {
		LoggerSystem.NET.getLogger().error("日志测试");
		LoggerSystem.CHECKOUT.getLogger().error("结算");
		LoggerFactory.getLogger("async").info("senninha");
	}

}
