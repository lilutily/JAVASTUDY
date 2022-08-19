package javaapp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 *  컬렉션 프레임워크 중 Map을 학습한다
 *  모여있는 데이터의 구분을 key 값으로 제어할수있으며, 특히 key값을 알면 데이터를 접근할수있다.
 *  데이터 교환에 사용되는 json도 사실 map유형이다
 * */
public class MapTest {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("a", "a2a3a4");
		map.put("b", "b2b3b4");
		map.put("c", "c1c2c3");
		map.put("d", "d5d6d7");
		
		System.out.println("총 수 : " + map.size());
		
		Set<String> set=map.keySet();
		
		Iterator<String> it=set.iterator(); // key를 늘어뜨리자
		
		while(it.hasNext()) {
			String key = it.next();
			// 얻어진 ,key를 이용하여 map안에서 꺼내자.
			System.out.println(map.get(key));
		}
	}
}
