package Convenience_Store;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

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
	Product p1= (Product) objectInputStream.readObject();
	// p1.putProductInfo();
	Product p2= (Product) objectInputStream.readObject();
	// p2.putProductInfo();
	// 저장했던 자료구조의 형태정보를 읽어온다.
	ArrayList list =(ArrayList) objectInputStream.readObject();
	// 객체의 개수가 맞는지 확인
	System.out.println(list.size());
	Product p =(Product)list.get(0);p.PrintAll();
	p =(Product)list.get(1); p.PrintAll();
	
		/*objectOutputStream.readObject(p1);
		objectOutputStream.readObject(userNames);
		objectOutputStream.close(); */
	}

}

