package Member;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class Product {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		
		
		FileOutputStream fileStream = new FileOutputStream("C:\\Users\\에스엘아카데미\\eclipse-workspace\\read\\test.txt");

		BufferedOutputStream bufferedStream = new BufferedOutputStream(fileStream);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedStream);

		ArrayList<MemberInfo> userNames = new ArrayList<MemberInfo>();
		Product p1=new Product();
		Product p2=new Product();
		Product b1=new Product();  
		Product b2=new Product();
		p1.ProductA("이름1" , "아이디1" , "패스워드1" ,"010-xxxx-xxxx"); // ,false, "xx시 xx구", 23
		p2.ProductA("이름2" , "아이디2" , "패스워드2" ,"010-xxxx-xxxx"); // ,true, "xx시 xx구", 28
		userNames.add(p1);
		userNames.add(p2);;
		System.out.println("저장되었습니다");
		
		objectOutputStream.writeObject(p1);
		objectOutputStream.writeObject(p2);
		objectOutputStream.writeObject(userNames);
		objectOutputStream.close();//스트림들을 닫는다.
		
	}  

}
