package chap09_polymorphism.product;

public class _02_withoutPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//l 다형성을 이용하지 않고 tv 바꾸기
		LgTv lgtv = new LgTv();
		lgtv.powerOn();
		lgtv.operate(13);
		lgtv.powerOff();
		
		SamsungTv stv = new SamsungTv();
		stv.powerOn();
		stv.operate(13);
		stv.powerOff();
		
		

	}

}
