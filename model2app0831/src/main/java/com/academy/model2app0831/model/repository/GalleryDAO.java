package com.academy.model2app0831.model.repository;

import org.apache.ibatis.session.SqlSession;

import com.academy.model2app0831.domain.Gallery;
import com.academy.model2app0831.mybatis.MybatisConfigManager;

public class GalleryDAO {
	MybatisConfigManager manager = MybatisConfigManager.getInstance(); // 싱글턴으로
	public int insert(Gallery gallery) {
		int result=0;
		SqlSession sqlSession= manager.getSqlSession();
		result=sqlSession.insert("Gallery.insert", gallery);
		sqlSession.commit();
		manager.closeSqlSession(sqlSession);
		return result;
	}
}
