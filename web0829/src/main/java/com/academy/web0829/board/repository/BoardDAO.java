package com.academy.web0829.board.repository;


import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.academy.web0829.domain.Board;
import com.academy.web0829.mybatis.ConfigManager;

public class BoardDAO {
	ConfigManager configManager =  ConfigManager.getInstance();
	
	// 한건 넣기
	public int insert(Board board) {
		SqlSession sqlSession=configManager.getSqlSession(); // mybatis 쿼리수행 객체
		int result=0;
		// 여기서 SQL문 작성하지 말고 , XML에 작성된 쿼리문을 호출
//		sqlSession.insert("쿼리문을 넣어놓은 xml", sqlSession);
		result=sqlSession.insert("Board.insert", board); // 여기서 SQL문 작성하지 말고 XML에 작성환 쿼리문 호출
		sqlSession.commit();
		configManager.closeSqlSession(sqlSession);
		return result;
	}
	public List selectAll() {
		SqlSession sqlSession=configManager.getSqlSession();
		List list=null;
		list=sqlSession.selectList("Board.selectAll");
		configManager.closeSqlSession(sqlSession);
		return list;
	}
	
	// 한건가져오기
	public Board select(int board_id) {
		SqlSession sqlSession =configManager.getSqlSession();
		Board board=null;
		board=sqlSession.selectOne("Board.select", board_id);
		configManager.closeSqlSession(sqlSession);
		return board;
	}
	// 한건 업데이트
	public int update(Board board) {
		int result=0;
		SqlSession sqlSession=configManager.getSqlSession();
		result=sqlSession.update("Board.update", board);
		sqlSession.commit(); // DML이니까
		configManager.closeSqlSession(sqlSession);
		return result;
	}
	
	// 한건 삭제하기
	public int delete(int board_id) {
		SqlSession sqlSession=configManager.getSqlSession();
		int result=0;
		result=sqlSession.delete("Board.delete", board_id);
		sqlSession.commit();
		configManager.closeSqlSession(sqlSession);
		return result;
	}
}
