package chap11_interface;

import chap11_interface.Device.ElectronicDevice;
import chap11_interface.Device.LgTv;
import chap11_interface.Device.Tv;

public class _03_multiInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tv tv = new LgTv();
		
		tv.powerOn();
		tv.powerOff();
		tv.changeChannel(3);
		tv.reset();
		
		ElectronicDevice.warn();
		// static은 다른 클래스에 상속바당서 쓸 수 없다.
		// 인터페이스 안에서 static으로 선언된 메소드를 사용하려면 선언된 클래스를 사용해서 호출한다,
		// static 메소드는 상속받은 자식 클래스에서 호출은 불가능하다.
//		tv.warn();
//		Display.wanr();
		

	}

}
