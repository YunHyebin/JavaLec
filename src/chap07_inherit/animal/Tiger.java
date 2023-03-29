package chap07_inherit.animal;

public class Tiger extends Animal {
	public String meat;
	public boolean isSwimming;
	public boolean hasPattern;
	public String color;
	
	public Tiger() {}
	
	public Tiger(String meat, boolean isSwimming, boolean hasPattern, 
			String color, int age, int size, int legCnt, boolean hasWing) {
		// 부모클래스에 생성자가 있다면
		// 위의 방식보다는 부모클래스의 생성자를 호출하는 게 편하다.
		// 부모 클래스를 자식클래스에서 사용하는 방법 : super 키워드
		//super 자체는 부모클래스를 의미함.
		//부모 클래스의 생성자는 super(); 호출
		// super 생성자 가지고 오는 것은 무조건 자식 클래스 생성자 안에서만 호출 가능하다.
		super(age, size, legCnt, hasWing);
		//super.age
		this.meat = meat;
		this.isSwimming = isSwimming;
		this.hasPattern = hasPattern;
		this.color = color;
//		
		// 부모 생성자 super 를 호출하기 전엔 이런 식으로 다 일일히 써야함.
//		// 부모의 속성 초기화
//		this.age=age;
//		this.size = size;
//		this.legCnt = legCnt;
//		this.hasWing = hasWing;		
	}
	

	public void eat() {
		System.out.println(meat + "를 먹는다.");
	}

	public void swim() {
		if (isSwimming == true) {
			System.out.println("현재 수영 중");
		} else {
			System.out.println("현재 사냥 중");
		}
	}
	
	public void printPattern() {
		if(hasPattern == true) {
			System.out.println("무늬가 있습니다.");
		} else {
			System.out.println("무늬가 없습니다.");
		}
	}
	
	public void hunt() {
		System.out.println("사냥을 한다.");
	}
	
	public void grooming() {
		System.out.println("그루밍한다.");
	}
}