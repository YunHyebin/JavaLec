package chap07_inherit.car;

import chap06_class.car.Car;
import chap06_class.car.HyundaiCar;
import chap06_class.car.HyundaiCarInherit;
import chap06_class.car.KiaCar;
import chap06_class.car.KiaCarInherit;

public class _02_withInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 객체 생성
		Car car = new Car();
		KiaCar kCar = new KiaCar();
		HyundaiCar hCar = new HyundaiCar();
		
		car.company = "GM";
		kCar.company = "Kia";
		hCar.company = "Hyundai";
		
		
		// 다형성의 기초
		// 같은 모양의 객체로 전혀 다른 결과값을 발현하는 성질
		
		
		//부모클래스 객체에 자식클래스를 넣응ㄹ 수 있따
		// 자식클래스는 부모의 형태도 가지고 있기 때문에
		// 부모클래스로 만들어진 변수에 대입 가능하다
		Car car1 = new KiaCarInherit();
		car1.speedUp();
		car1.speedDown();
		car1.company = "Kia"; //부모에 있는 메소드 사용 가능함. 
//		car1.opendoor();
		// 변수가 부모의 형태이기 때문에 자식의 기능은 가지고 있지 않다.
		
		Car car2 = new HyundaiCarInherit();
		car2.speedUp();
		car2.speedDown();
		car2.company = "Hyundai";

	}

}
