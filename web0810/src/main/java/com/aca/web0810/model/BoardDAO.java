package com.aca.web0810.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.aca.web0810.domain.Board;

/* 이클래스는 웹 기반 뿐만 아니라 스탠다드 기반에서도 공용으로 쓸 수 있는 수준으로 정의해 놓자
 *  재사용을 위해...
 *  
 *  아래의 클래스는 오직 CRUD만을 처리하기 위한 객체이므로
 *  객체지향의 설계분야에서 이러한 역할을 수행하는 객체를 가리켜 DAO(Data Access Object)
 * */
public class BoardDAO {
	String url="jdbc:oracle:thin:@localhost:1521:XE";
	String user="java";
	String password="1234";

	// 레코드 넣기
	public int insert(Board board) {
		
		Connection con =null;
		PreparedStatement pstmt = null;
		int result =0; // 멤버변수가 아닌 지역변수는 컴파일러가 초기화해주지 않음 따라서 반드시 초기화하자
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 드라이버 로드
			con=DriverManager.getConnection(url, user, password); // 접속
			String sql="insert into board(board_id, title, writer, content) values(board_seq.nextval, ?, ?, ?)";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getWriter());
			pstmt.setString(3, board.getContent());
			result = pstmt.executeUpdate();
			if(result==0) {
				
			} else {
				// 
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		 return result;
	} // insert method close
	
	// 게시물 목록가져오기
	public List selectAll() {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs= null;
		List list = new ArrayList();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url, user, password); // 접속
			
			
			String sql="select * from board order by board_id desc";
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery(); // 쿼리 수행 및 레코드 반환
			// rs는 finally 문에서 con, pstmt와 함께 닫히게 되므로 반환할 수 없다
			// 해결책 : rs를 대신할 객체를 이용
			// 테이블의 레코드 1건 -- DTO의 인스턴스 한개로 대체
			// 테이블의 레코드의 순서는 -- java.util의 List로 대체
			
			while(rs.next()) {
				Board board= new Board(); //empty
				
				board.setBoard_id(rs.getInt("board_id")); // pk
				board.setTitle(rs.getString("title")); // 제목
				board.setWriter(rs.getString("writer")); // 작성자
				board.setContent(rs.getString("content")); // 내용
				board.setRegdate(rs.getString("regdate")); // 작성일
				board.setHit(rs.getInt("hit")); // 조회수
				
				list.add(board); // 리스트에 추가
			}	
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} // 드라이버 로드
		catch (SQLException e) {
			e.printStackTrace();
		}  finally {
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return list;
	}
	// 레코드 한 건 가져오기
	public Board select(int board_id) {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		Board board = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url,user,password);
			String sql="select * from board where board_id=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, board_id);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				board= new Board(); //empty
				
				board.setBoard_id(rs.getInt("board_id")); // pk
				board.setTitle(rs.getString("title")); // 제목
				board.setWriter(rs.getString("writer")); // 작성자
				board.setContent(rs.getString("content")); // 내용
				board.setRegdate(rs.getString("regdate")); // 작성일
				board.setHit(rs.getInt("hit")); // 조회수
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return board;
	}
	// 한건 삭제
	public int delete(int board_id) {
		Connection con=null;
		PreparedStatement pstmt=null;
		int result=0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url,user,password);
			String sql="delete board where board_id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, board_id);
			
			result=pstmt.executeUpdate(); // 쿼리 실행 후 , 이 쿼리문에 의해 반영된 레코드 수\
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}
	// 한건수정
	public int update(Board board) {
		Connection con =null;
		PreparedStatement pstmt=null;
		int result =0; // 성공 여부를 판단할 수 있게 해주는 변수
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url,user,password);
			String sql="update board set title=?, writer=?, content=? where board_id=?";
			pstmt=con.prepareStatement(sql);
			
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getWriter());
			pstmt.setString(3, board.getContent());
			pstmt.setInt(4, board.getBoard_id());
			
			result = pstmt.executeUpdate(); // 쿼리 실행 후 이 업데이트 문에 의해 반영된 레코드 수 반환
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}
	
} // class  close
