package chap09_polymorphism.product;

public class _01_methodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 다형성의 구현
		//부모형태의 변수에 자식 인스턴스(객체)를 담아 
		// 다양한 형태로 사용한다.
		ElectronicDevice ed = new Tv();
		ed.powerOn();
		ed.operate(11);
		ed.powerOff();
		
		ed = new Aircon();
		ed.powerOn();
		ed.operate(18);
		ed.powerOff();
		
		

	}

}
