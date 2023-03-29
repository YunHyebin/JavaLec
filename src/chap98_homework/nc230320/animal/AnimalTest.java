package chap98_homework.nc230320.animal;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----------포유류-----------");
		Mammalia mam = new Mammalia(1, 1, 4, false);
		mam.giveBirth();
		
		System.out.println("----------고양이과-----------");
		Feline fe = new Feline(2, 3, 4, true, true);
		fe.giveBirth();
		fe.isGrooming();
		
		System.out.println("----------호랑이-----------");
		Tiger ti = new Tiger(1, 1, 4, false, true, true);
		ti.giveBirth();
		ti.isClimbing();
		ti.isGrooming();
		
		System.out.println("----------사자-----------");
		Lion li = new Lion(1, 4, 4, false, true, true);
		li.giveBirth();
		li.isGrooming();
		li.aroundInGroup();
		
		li.age = 5;
		System.out.println(li.age);
		
		

	}

}
