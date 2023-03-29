package chap06_class;

import chap06_class.car.Car;

public class _04_useOfCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		
		car.company = "현대";
		car.model = "제네시스";
		car.color = "검정";
		car.price = 5000;
		
		car.carInfo();
		
		Car car2 = new Car("기아", "k9", "하양", 10000);
		
	}

}
