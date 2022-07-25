package FileReadWrite;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

@SuppressWarnings({ "rawtypes", "unchecked", "nls" })

public class FileRead {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		// 하드디스크의 특정파일과 fileStream 패러펀스를 연결한다
		// 그러면 , 이제부터 fileStream이라는 것이 파일을 담당한다(이것으로 접한할수있다는 뜻)
		FileInputStream fileStream = new FileInputStream("C:\\Users\\에스엘아카데미\\eclipse-workspace\\read\\test.txt");
		// 프로그래머가 객체작업을 하려면 ObjectInputStream을 사용해야한다
		// 그래서 ObjectInputStream과 fileStream을 연결해줘야된다
		// 그러면 결론적으로 *객체작업담당 <-----> *파일작업담당 으로 연결된다
		ObjectInputStream objectInputStream = new ObjectInputStream(fileStream);
		// 연결은 다 되었지만, 데이터를 파일에서 읽어와서 메모리에 저장해준다음이 문제이다.
		// 읽어온 객체가 어떤타입인지 모르기 때문에 반드시 타입캐스팅(그게 원래 어떤 객체였는지)을 해줘야함
		// 우리는 사람이름(String 타입)을 저장했었기 때문에 그것으로 타입캐스팅 해줘야한다.	
		Object object = objectInputStream.readObject();
		
		// 원래 저장할때 컨테이너타입이 ArrayList였다. 그러므로 일단 그 타입으로 캐스팅해야한다.
		// 그 다음 , 그 안에 들어있는 각각의 객체가 String타입이였다.
		// 각각의 String 타입 객체를 뽑아서 화면에 출력해야한다.
		// 데이터파싱(Parsing)
		ArrayList<String> userNames = (ArrayList<String>) object;
		System.out.println(userNames.size());
		System.out.println(userNames.get(0)); // 첫번째 고객의 이름
		System.out.println(userNames.get(1)); // 두번째 고객의 이름
		objectInputStream.close();
	}

}
