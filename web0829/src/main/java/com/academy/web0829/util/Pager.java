package com.academy.web0829.util;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import lombok.Data;
@Data
public class Pager {
	
	private int totalRecord; // 총레코드 수
	private int pageSize=10; // 페이지당 보여질 레코드 수
	private int totalPage;
	private int blockSize=10;; // 블럭당 보여질 페이지
	private int currentPage=1; // 게시판 처음들어오면 보게될 페이지
	private int firstPage; // 블럭당 시작 페이지
	private int lastPage; // 블럭당 마지막페이지
	private int curPos; // 페이지당 시작 index
	private int num; // 페이지당 게시물 시작 번호
	
	// 공식을 대입하기 위한 메서드
	public void init(List list, HttpServletRequest request) {
		totalRecord=list.size();
		totalPage=(int)Math.ceil((float)totalRecord/pageSize);
		if(request.getParameter("currentPage")!=null) {
			currentPage=Integer.parseInt(request.getParameter("currnetPage"));
		}
		firstPage=currentPage-(currentPage-1)%blockSize;
		lastPage=firstPage+(blockSize-1);
		curPos=(currentPage-1)*pageSize;
		num=totalRecord-curPos;
	}
}
