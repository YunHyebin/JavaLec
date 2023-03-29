package chap12_nestedClass.clazz;

public class Car {
	public void main() {
		public void speedUp() {
			class Engine{
				int fuelAmount;
				
				// 생성자
				public Engine(int fuelAmount) {
					this.fuelAmount = fuelAmount;
				}
				
				public void useFuelAmount() {
					this.fuelAmount -= 10;
				}
			}
			
			Engine eg = new Engine(100);
			eg.useFuelAmount();
			System.out.println("연료가 " + eg.fuelAmount + "% 남았습니다.");
			
		}
		
	}

}
