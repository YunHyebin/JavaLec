package chap16_collectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import chap06_class.car.Car;

public class _09_listMapEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Car> carList = new ArrayList<Car>();
		carList.add(new Car("현대", "제네시스", "흰색", 5000));
		carList.add(new Car("기아", "k7", "검은색", 4000));
		carList.add(new Car("현대", "소나타", "빨간색", 3000));
		carList.add(new Car("르노", "sm6", "파란색", 2000));
		carList.add(new Car("현대", "제네시스", "노란색", 5000));
		
		// carList를 List<Map<String, Object>>로 변환
		List<Map<String, Object>> mapList = new ArrayList<Map<String, Object>>();
		
		for (Car c : carList) {
			Map<String, Object> map = new HashMap<>();
			map.put("제조사", c.company);
			map.put("모델명", c.model);
			map.put("색상", c.color);
			map.put("가격", c.price);
			mapList.add(map);
			
		}
		System.out.println(mapList);
		//[{제조사=현대, 색상=흰색, 모델명=제네시스, 가격=5000}, 
		
		for(int i=0; i<mapList.size(); i++) {
			System.out.println(mapList.get(i));
		}
		
//		// Map.Entry를 사용하여 모든 키-값 쌍 출력
//		for (Map.Entry<String, Object> entry : map.entrySet()) {
//			
//		}
		
		
		
		

	}

}
