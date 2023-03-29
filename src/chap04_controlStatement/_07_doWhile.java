package chap04_controlStatement;

public class _07_doWhile {

	public static void main(String[] args) {
		do {
			System.out.println("무조건 1회 실행");
		} while (1 < 0); // while문에서 조건문이 false로 나와 dowhile 반복문 종료

		
		// do{} 블록의 소스코드는 무조건 1회 실행된다.
		// 조건식이 true이면 다시 반복 실행
		int i = 1;
		do {
			System.out.println(i++);
		} while (i <= 20);
		
		
		i = 1;
		do {
			if(i % 3==0) {
				System.out.println(i);
			}
		} while(++i <= 20);
		
		
	}
}
