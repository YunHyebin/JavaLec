package chap02_variable;

public class _09_booleanType {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//1. boolean타입 변수 선언 및 초기화
		boolean isOver = false;
		int moveMeter = 0;
		
		// 반복문 (무한반복문)
		while(true) {
			if (moveMeter > 100) {
				isOver = true;
			} else if (moveMeter < 30) {
				isOver = false;
			}
			if(isOver == true) {
				moveMeter -= 30;
			}else {
				moveMeter += 50;
			}
			System.out.println("현재 위치는" +moveMeter +"입니다.");
			Thread.sleep(1000);
			
		}
	}

}
