package chap17_generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class _03_limitedGeneric {
	public static void main(String[] args) {

		// sumList 메소드 사용 예시
		List<Long> lList = new ArrayList<Long>();
		for (int i = 0; i < 10; i++) {
			lList.add((long) 5 * i);
		}
		System.out.println(_03_limitedGeneric.<Long>sumList(lList));
		ArrayList<Long> result1 = new ArrayList<Long>();

		// max메소드 사용 예시
		List<Number> numList = new ArrayList<Number>();
		for (int i = 0; i < 10; i++) {
			numList.add((Integer) 5 * i);
		}
		System.out.println(_03_limitedGeneric.<Double>max(numList));

		// maxKey 메소드 사용 예시
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < 10; i++) {
			map.put(String.valueOf(i), Integer.valueOf((int) Math.random() * 10) + 1);
			System.out.println(map.get(String.valueOf(i)));
		}
		System.out.println(_03_limitedGeneric.maxKey(map));
	}

	public static <T extends Number> double sumList(List<T> tList) {
		double sum = 0.0;
		for (T t : tList) {
			sum += t.doubleValue();
		}
		return sum;
	}// sumList 메소드 종료

	// Integer type에게 상속해준 부모클래스들 타입으로 지정
	// 와일드카드는 리턴 타입으로서 지정은 불가능하다. 매개변수로만 지정 가능
	public static int max(List<? super Integer> list) {
		int max = (int) list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if ((int) list.get(i) > max) {
				max = (int) list.get(i);
			}
		}
		return max;
	}

	// 와일드카드가 아니고선 무조건 메소드 명 앞에 타입을 지정해야 함.
	public static <K, V extends Number> int sumMapValue(Map<K, V> map) {
		int sum = 0;

		for (V v : map.values()) {
			sum += (int) v;
		}
		return sum;
	}

	// Map의 value의 max값 찾고 해당 key값을 리턴하는 메소드

	public static <K, V extends Number> K maxKey(Map<K, V> map) {
		K maxKey = null;
		V maxVal = null;

		int index = 0; // Set<Entry<K, V>>가 entrySet을 가져올 때의 결과
		for (Entry<K, V> ent : map.entrySet()) {
			if (index == 0) {
				maxKey = ent.getKey();
				maxVal = ent.getValue();
			} else {
				if (ent.getValue().doubleValue() > maxVal.doubleValue()) {
					maxKey = ent.getKey();
					maxVal = ent.getValue();
				}
			}
			index++;
		}
		return maxKey;
	}

	// 매개변수 타입은 List임 즉, 메소드 오버로딩 불가능
	public int add(List<?> intList) {
		return 1;
	}

	
//	public <T> T getT(List<? extends T>) {
//	}

}
