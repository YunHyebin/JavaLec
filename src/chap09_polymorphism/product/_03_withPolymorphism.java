package chap09_polymorphism.product;

public class _03_withPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 다형성을 이용해 tv 바꾸기
		// 부모 타입의 변수 선언하고 LgTv나 samsungTv 등 만 바꾸면 됨
		Tv tv = new LgTv();
		tv.powerOn();
		tv.operate(13);
		tv.powerOff();
		
		tv = new SamsungTv();
		tv.powerOn();
		tv.operate(14);
		tv.powerOff();

	}

}
