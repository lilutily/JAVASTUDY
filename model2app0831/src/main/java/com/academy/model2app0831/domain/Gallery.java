package com.academy.model2app0831.domain;

import lombok.Data;

@Data
public class Gallery {
	private int gallery_id;
	private String title;
	private String writer;
	private String content;
	private String regdate;
	private int hit;
	private String filename;
}
