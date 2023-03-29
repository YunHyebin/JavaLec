package chap99_etc;

public class _03_mathRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 난수 발생 첫번째 방식
		// Math.random() 사용
		
		//0 <= Math.random() < 1 사이의 난수
		System.out.println(Math.random()); // 0.35579701370452277
		
		//2. 1<= Math.random() <= 11
		// 0 <= Math.random() * 10 < 10
		// 1 <= (int)(Math.random() * 10) + 1 < 11
		int rand = (int)(Math.random() * 10) + 1;
		System.out.println(rand); // 9
		
		//3. 1~45까지의 난수
		// 1 <= Math.random() * 10 < 45
		int rand45 = (int)(Math.random() * 45) + 1;
		System.out.println(rand45);
		
		//강사님 방법
		int rand2 = (int)(Math.random() * 45) + 1;
		
		//4. 200~299
		int rand299 = (int)(Math.random() * 100) + 200;
		System.out.println(rand299);
		
		// 강사님 방법
		int rand3 = (int)(Math.random() * 100) + 200;
		
		//a~b까지 랜덤
		//(int)(Math.random() * (b-a+1)) + a
	}

}
