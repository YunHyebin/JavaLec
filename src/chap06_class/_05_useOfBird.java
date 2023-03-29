package chap06_class;

import chap06_class.animal.Bird;

public class _05_useOfBird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bird bird = new Bird();
		bird.name = "참새";
		bird.food = "모이";
		bird.fly();
		bird.cry();
		bird.eat();
		
		Bird eagle = new Bird("독수리", "고기");
		Bird chicken = new Bird("닭", "모이");
		
	}

}
