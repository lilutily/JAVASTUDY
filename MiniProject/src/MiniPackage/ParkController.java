package MiniPackage;

import java.util.ArrayList;

public class ParkController {
	private ArrayList<Park> list;

	public ParkController() {
		list = new ArrayList<>(5);
	}

	// 파라미터로 넘어온 ParkVO 객체를 list에 추가하는 add 메소드
	public void add(Park p) {
		list.add(p);
	}

	// 파라미터로 넘어온 ParkVO 객체가 list에 존재하는지 확인하는 contains 메소드
	public boolean contains(Park p) {
		return list.contains(p);
	}

	// 현재 list의 크기를 return하는 size() 메소드
	public int size() {
		return list.size();
	}

	// 파라미터로 넘어온 int 값을 시간 형식에 맞는지 체크하는 validateTime() 메소드
	public boolean validateTime(int time) {
		int hour = time / 100; // 시간
		int minute = time % 100; // 분

		return hour >= 0 && hour < 24 && minute >= 0 && minute < 60;

	}

	// 파라미터로 넘어온 ParkVO 객체와 일치하는 객체를 list에서 찾아서
	// 리턴하는 get() 메소드
	public Park get(Park p) {
		// 먼저 p와 일치하는 객체의 index를 찾고
		// 해당 인덱스를 list.get()의 파라미터로 넘겨서
		// 리턴하자.
		int index = list.indexOf(p);
		return list.get(index);

	}
	// 파라미터로 넘어온 ParkVO 객체를
	// list에서 제거하는 remove() 메소드
	public void remove(Park p) {
		list.remove(p);
	}
}
