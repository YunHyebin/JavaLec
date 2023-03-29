package chap06_class.animal;

public class Bird {
	// 날개(int), 색깔, 새이름, 크기, 식습관
	// 날다, 운다, 걷는다, 먹이를 먹는다
	int wing;
	String color;
	public String name;
	public int size;
	public String food;
	
	public void fly() {
		System.out.println(name + "는 날개를 이용하여 하늘을 납니다");
	}
	
	public void cry() {
		System.out.println(name + "는 나무에 앉아 웁니다");
	}
	
	public void walk() {
		System.out.println(name + "는 땅을 걷는다");
	}
	
	public void eat() {
		System.out.println(name +"는 " + food + "를 먹는다");
	}
	// 기본생성자
	public Bird() {
		System.out.println("기본 생성자 호출");
	}
	
	// 매개변수가 있는 생성자 -> 생성과 동시에 직접적으로 멤버변수 초기화
	public Bird(int wing, String name, int size, String food) {
		this.wing = wing;
		this.name = name;
		this.size = size;
		this.food = food;
	}
	
	public Bird(String inputName, String inputFood) {
		this.name = inputName;
		this.food = inputFood;
	}

}
