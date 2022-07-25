package FileReadWrite;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

@SuppressWarnings({ "rawtypes", "unchecked", "nls" })
public class FileWrite {
	public static void main(String[] args) throws IOException{

		  //파일스트림(객체를 저장할곳은 이곳이다)
		  //객체담당클래스 <========> 파일담당클래스 <=========> 하드웨어(하드디스크/usb드라이브/네트워크)
		  
		  //파일스트림(객체를 저장할곳은 이곳이다) 
		  FileOutputStream fileStream = new FileOutputStream("C:\\Users\\에스엘아카데미\\eclipse-workspace\\read\\test.txt");

		  //객체저장스트림(객체를 파일스트림과 연결한다.)-파이프연결

		  ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileStream);

		  //저장할객체들의 내용과 그것들을 컨테이너에 저장해둠  

		  ArrayList<String> userNames = new ArrayList<String>();
		  userNames.add("asd");
		  userNames.add("fsa");
		  objectOutputStream.writeObject(userNames); //mvt? mvc?
		  objectOutputStream.close();//스트림들을 닫는다.  
		  
		 /* HashMap<Integer,String> map = new HashMap<Integer,String>(){{//초기값 지정
			    put(1,"사과");
			    put(2,"바나나");
			    put(3,"포도");
			}};
					
			objectOutputStream.writeObject(map);

			  objectOutputStream.close();//스트림들을 닫는다. */


		  
		 /* HashMap userInfoMap = new HashMap();userInfoMap.put("TEL", "02-324-2424"); 

		  userInfoMap.put("phone", "010-9999-9999");

		  userInfoMap.put("address", "서울서 서추구 방배동 34244");

		  userInfoMap.put("age", "43");

		  userInfoMap.put("bitrhday", "19330101");

		  //HashMap이라는곳에 저장된것들을 통째로 파일에 저장한다.(객체스트림-->파일스트림-->실제파일에 저장)

		  objectOutputStream.writeObject(userInfoMap);

		  objectOutputStream.close();//스트림들을 닫는다.

		}
		*/
			
		}

		}