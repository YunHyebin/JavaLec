package chap06_class.car;

public class HyundaiCarInherit extends Car {

	
	// Car 상위 클래스에 speedUp, speedDown 메소드가 있음
	// HyundaiCarInherit 클래스에서 상위클래스에서 상속받음 메소드의 반환값을 재정의함 = 메소드 오버라이딩
	// 상속받음 메소드를 재정의할 때 메소드 이름, 메소드 매개변수 갯수, 매개변수 타입은 무조건 같아야함.
	public void speedUp() {
		System.out.println("스피드 업");
	}
	
	public void speedDown() {
		System.out.println("스피드 다운");
	}
	
	

}
