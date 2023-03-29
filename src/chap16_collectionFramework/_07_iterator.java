package chap16_collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import chap06_class.car.Car;

public class _07_iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Map은 컬렉션을 상속받지 않았음. 하지만 set으로 변환시키는 메소드를 이용하여 iterator를 사용할 수 있게 함.
//		Map<String, String> map;

		// 이 안에 들어가는 요소의 형이 Car 클래스 형이면 됨.
		List<Car> cList = new ArrayList<Car>();

		Car car1 = new Car("현대", "제네시스", "검정", 4400);
		cList.add(car1);

		Car car2 = new Car("현대", "아반떼", "흰색", 5400);
		cList.add(car2);

		Car car3 = new Car("현대", "소나타", "흰색", 5000);
		cList.add(car3);

		Car car4 = new Car("기아", "ev6", "흰색", 4000);
		cList.add(car4);

		Car car5 = new Car("기아", "모하비", "빨간색", 6000);
		cList.add(car5);

		System.out.println("삭제되기 전 cList의 크기" + cList.size());

		// Iterator로 요소 받아오기
		Iterator it = cList.iterator();
		//Iterator<Car> it = cList.iterator();
		// it는 5개의 요소를 가지고 있게됨

		while (it.hasNext()) {
			Car c = (Car) it.next();
//			Iterator<Car> 로 타입 지정 시 밑에처럼 (Car)로 형변환 안해도 됨
//			Car c = it.next();
			c.carInfo();
			System.out.println("--------");
			if (c.company.equals("현대")) {
				it.remove();
			}
		}
		System.out.println("삭제된 후 cList의 크기" + cList.size());

		ListIterator<Car> lit = cList.listIterator();
		lit.next();
		
		while (lit.hasPrevious()) {
			lit.previous();
			Car c = new Car("쉐보레", "카마로", "노란색", 4000);
			lit.set(c);
		}

		for (Car c : cList) {
			c.carInfo();
		}

	}

}
