package chap06_class.car;

public class Car {
	public String company;
	public String model;
	public String color;
	public int price;
	
	public Car(String company, String model,String color, int price){
		this.company = company;
		this.model = model;
		this.color = color;
		this.price = price;
	}
	
	public void carInfo() {
		System.out.println("제조사: " + company);
		System.out.println("모델: " + model);
		System.out.println("색상: " + color);
		System.out.println("가격: " + price);
		
	}
	
	@Override
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", color=" + color + ", price=" + price + "]";
	}

	public void speedUp() {
		System.out.println("속도를 올린다.");
	}
	
	public void speedDown() {
		System.out.println("속도를 줄인다.");
	}
	
	

}
