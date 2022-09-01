package com.academy.web0829.mybatis;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/*
 *  mybatis의 설정 정보는 요청이 있을때마다 xml을 읽어들일 필요없고
 *  프로그램이 가동되면 한번만 불러와 사용하는 좋을거 같다.
 * */
public class ConfigManager {
	private static ConfigManager instance;
	SqlSessionFactory sqlSessionFactory;
	private ConfigManager() {
		
		try {
			String resource = "com/academy/web0829/mybatis/config.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			// mybatis를 이용하면, 기존에 jdbc에서 sql문 수행시 사용했던 PreparedStatement를 사용하는게 아니라
			// 대신 SqlSession이라는 객체를 이용 아래의 SqlSession는 SqlSession 을 관리 및 반환해주는 객체
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// SqlSessionFactory로 부터 SqlSession을 얻어갈수있도록 메서드를 정의
	public SqlSession getSqlSession() {
		return sqlSessionFactory.openSession();
	}
	// 닫기
	public static void closeSqlSession(SqlSession sqlSession) {
		sqlSession.close();
	}
	public static ConfigManager getInstance() {
		if(instance== null) {
			instance= new ConfigManager();
		}
		return instance;
	}
}
