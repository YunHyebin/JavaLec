package chap07_inherit.car;

import chap06_class.car.Car;
import chap06_class.car.HyundaiCar;
import chap06_class.car.KiaCar;

public class _01_withoutInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 객체 생성
		Car car = new Car();
		KiaCar kCar = new KiaCar();
		HyundaiCar hCar = new HyundaiCar();
		
		car.company = "GM";
		kCar.company = "Kia";
		hCar.company = "Hyundai";

	}

}
