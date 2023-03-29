package chap16_collectionFramework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class _08_myMapEntry {

	public static void main(String[] args) {
		// HashMap 객체 생성하고 타입 지정되지 않은 map 변수에 저장
		HashMap mapEx = new HashMap();
		// HashMap 객체 생성하고 타입 지정된 map 변수에 저장
		HashMap <String, Integer> map = new HashMap<>();
		
		// map에 key와 value 저장
		map.put("김밥", 2500);
		map.put("라면", 3000);
		map.put("떡볶이", 4000);
		map.put("아메리카노", 5000);
		
		System.out.println(map);
		//{김밥=2500, 아메리카노=5000, 라면=3000, 떡볶이=4000}
		
		//map에 저장되어있는 모든 key와 value를 iterator로 하나씩 가져와
		//set형으로 변환해서 set변수에 저장
		Set set = map.entrySet();
		//{김밥=2500, 아메리카노=5000, 라면=3000, 떡볶이=4000}
		
		//set에 저장되어있는 위의 값을 하나씩 가져와서 it에 저장
		Iterator it = set.iterator();
		
		// it에 다음 요소가 있을 때까지 반복
		while (it.hasNext()) {
			// it의 다음 요소를 map.entry로 변환하여 변수e에 저장
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("메뉴: " + e.getKey()
			+ ", 가격: " + e.getValue());
		}
		
		set = map.keySet();
		//map에 있는 key를 하나의 set으로 가져와 set변수에 저장
		System.out.println("메뉴판 " + set);
		//메뉴판 [김밥, 아메리카노, 라면, 떡볶이]
		
		// 컬렉션 형의 values 변수에 map의 모든 밸류들을 저장
		Collection values = map.values();
		
		it = values.iterator();
		
		int total = 0;
		
		while(it.hasNext()) {
			// 하나씩 가져온 value가 it에 저장되고
			// 다음 요소가 있으면 Integer 형변환 하여 변수 i에 저장
			Integer i = (Integer)it.next();
			// total 변수에 i를 int형으로 변환하여 더하고 저장
			total += i.intValue();
		}
		
		System.out.println(total);	//14500
		
		
		
		
		
		

	}

}
