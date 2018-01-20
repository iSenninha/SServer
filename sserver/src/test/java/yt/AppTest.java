package yt;

import java.io.File;
import java.io.FileInputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.LoggerFactory;

import cn.senninha.sserver.logger.LoggerSystem;

public class AppTest {

	public static void main(String[] args) {
//		LoggerSystem.NET.getLogger().error("日志测试");
//		LoggerSystem.CHECKOUT.getLogger().error("结算");
//		LoggerFactory.getLogger("async").info("senninha");
//		Long l = decToBCD("1234567");
//		System.out.println(Long.toHexString(l));
		testMyBatis();
	}

	public static long decToBCD(String str) {
		long tem = Long.valueOf(str);
		if (tem < 10) {
			return tem;
		}

		long result = 0;
		long leave = (tem % 10);
		tem = tem / 10;

		int i = 0;

		while (tem > 0) {
			result = result | ((leave << (i * 4)));
			leave = tem % 10;
			tem = tem / 10;
			i++;
		}
		result = result | ((leave << (i * 4)));
		return result;
	}

	public static void testMyBatis() {
		try {
			System.out.println(AppTest.class.getResource("/"));
			FileInputStream in = new FileInputStream(new File("resources/dbConfig.xml"));
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
			SqlSession session = sessionFactory.openSession();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
