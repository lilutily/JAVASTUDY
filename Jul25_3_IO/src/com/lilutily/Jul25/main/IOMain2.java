package com.lilutily.Jul25.main;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class IOMain2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름/나이/직업 : ");
		String msg =scan.next();
		// 폴더는 못만들어줌
		// 드라이브도 못만들어줌
		// 폴더의 사용권한이 없으면 에러가 남
		
		try {
//			OutputStreamWriter 을 개조함 , 파일에 쓰기 편하게
//			FileWriter fw = new FileWriter("C:\\javatest\\test2.txt"); // \\ 안해주고 /하나 해줘도 처리는 됨 다만 리눅스에 맞춰서 \\함
			FileOutputStream fos = new FileOutputStream("C:\\javatest\\Jul28.txt", true); // 더 낮은 단계로 입력
			// 인코딩 방식 지정
			OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8"); 
			BufferedWriter bw =new BufferedWriter(osw);
//			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(msg+"\r\n");
			bw.close(); // 한번 닫으면 절대 다시 못열어용~
//			bw.flush(); // 닫지 않아도 데이터가 전송됨
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scan.close();
	}
}
