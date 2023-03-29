package chap06_class;

import chap06_class.car.Car;

public class _06_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();		// 기본생성자 (멤버변수 초기화되지 않은 상태
		Car car2 = new Car("현대", "아반떼", "검정", 1000);	// 생성과 됭시에 모든 멤버변수 초기화
		Car car3 = new Car("현대", "제네시스");	// 제조사와 이름만 초기화
		
		
		//System.out.println(car1.carInfo);		//car.carInfo는 return값이 없어서 출력도 안되고 메소드 안에서 출력하는 메소드라 에러남
		System.out.println("----------------------------");
		car1.carInfo();
		System.out.println("----------------------------");
		car2.carInfo();
		System.out.println("----------------------------");
		car3.carInfo();
		

	}

}
