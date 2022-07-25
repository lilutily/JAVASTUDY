package Member;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
@SuppressWarnings({ "rawtypes", "unchecked", "nls" })
public class Play implements Serializable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		// 파일과 연결시키는 부분 (파일 스트림)
		FileInputStream fileStream = new FileInputStream("C:\\Users\\에스엘아카데미\\eclipse-workspace\\read\\test.txt");
		// 커스텀클래스(직접제작한 특수한 클래스) 를 연결 시키는 부분
		BufferedInputStream bufferedStream = new BufferedInputStream(fileStream);
		// 최종적으로 객체의 읽기(read)를 위한 부분
		ObjectInputStream objectInputStream = new ObjectInputStream(bufferedStream);

		// 한개를 읽어와서 p1에 연결
	MemberInfo p1= (MemberInfo) objectInputStream.readObject();
	MemberInfo p2= (MemberInfo) objectInputStream.readObject();
	// 저장했던 자료구조의 형태정보를 읽어온다.
	ArrayList list =(ArrayList) objectInputStream.readObject();
	// 객체의 개수가 맞는지 확인
	System.out.println(list.size());
	MemberInfo p =(MemberInfo)list.get(0);p.putMember();
	p =(MemberInfo)list.get(1); p.putMember();
	objectInputStream.close();
	
	/*
	MemberInfo md = new MemberInfo();
	boolean isExit = false;
	
	do {
	Scanner input = new Scanner(System.in);
	System.out.print("회원정보등록"); 
	String setMember=input.nextLine();
	System.out.print("회원정보 불러오기"); 
	String ProductA=input.nextLine();
	System.out.print("회원정보 출력하기"); 
	String putMember=input.nextLine();  int menu = Integer.parseInt(input.nextLine());
	
	switch(menu) {
	case 1: // //회원정보등록
	{
		md.createMember();
		
	}				
	break;
	case 2: // 회원정보 불러오기
	{
		md.putMember();
			
	}		
		break;
	case 3: // 회원정보 출력하기
	{
		md.infoMember();
		}
	case 4: // 종료
		isExit =true;
		break;
	}
} 
while(!isExit); */	
	}

	
	}
