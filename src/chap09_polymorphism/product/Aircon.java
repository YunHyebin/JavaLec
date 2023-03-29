package chap09_polymorphism.product;

public class Aircon extends ElectronicDevice {
	public int lastTemperature;
	
	public void powerOn() {
		System.out.println("에이컨 전원을 켭니다. 설정된 온도는 " + lastTemperature);
	}
	public void powerOff() {
		System.out.println("에어컨 전원을 끕니다. 마지막으로 설정된 온도는 : lastTemperature");
	}
	
	public void channerTemperate(int temperature){
		lastTemperature = temperature;
		System.out.println("온도를" + temperature + "로 설정합니다.");
	}
	public void operate(int temperature){
		channerTemperate(temperature);
	}
	
	
	
}
