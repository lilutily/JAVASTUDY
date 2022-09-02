package com.academy.model2app0902.gallery.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.academy.model2app0831.controller.Controller;
import com.academy.model2app0831.domain.Gallery;
import com.academy.model2app0831.model.repository.GalleryDAO;
import com.academy.model2app0831.util.FileManager;

/* 텍스트 파라미터 뿐만 아니라 바이너리 파일이 포함된 업로드 요청을 처리해본다
 * 지난 시간에 이용한 컴포넌트 cos.jar(ORelly사 제공)
 * 이번 시간은 apache.org에서 제작한 apache.commons 프로젝트 하위 컴포넌트 fileupload 컴포넌트 
 * */
public class RegistController implements Controller{
	FileManager fileManager=new FileManager();
	GalleryDAO galleryDAO = new GalleryDAO();
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		Gallery gallery=fileManager.getParam(request); // title , writer , content만 채워져있음
		
		galleryDAO.insert(gallery); // db레코드에 들어감 select gallery_seq.currval from dual 22라인을 지나는 순간 primary key가 채워짐
		
		// mybatis에 의해 기존의 Gallery DTO의 pk값이 채워지게 된다..
		int gallery_id=gallery.getGallery_id();

		// 파일 업로드
		fileManager.saveAS(fileManager.getDest()+"/"+gallery_id+"."+fileManager.getExtension());
		
	}

	@Override
	public String getViewName() {
		// TODO Auto-generated method stub
		return "/gallery/result/write";
	}

	@Override
	public boolean isfForward() {
		return false;
	}

}
