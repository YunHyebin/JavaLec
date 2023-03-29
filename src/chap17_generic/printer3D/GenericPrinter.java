package chap17_generic.printer3D;

public class GenericPrinter<T extends Material> {
	//<T>로 선언한 제네릭 클래스, type의 약자, 자료형 매개변수
	// extends 예약어로 Material을 상속받은 임의클래스 T만 매개변수로 받을 수 있음.
	private T material;
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	// 자료형 매개변수 T를 리턴타입으로 사용한 제네릭 메소드
	public T getmaterial() {
		return material;
	}
	
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
	}
	
	

}
