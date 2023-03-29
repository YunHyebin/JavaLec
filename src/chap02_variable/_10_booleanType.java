package chap02_variable;

public class _10_booleanType {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		//1. int 타입 변수 선언 및 초기화
		int num1 = 10;
		int num2 = 15;
		
		//2. boolean타입 변수 선언 및 연산을 통한 초기화
		// 삼항연산자 조건 ? 결과1 : 결과2;
		// 조건 true -> 결과 1 / false -> 결과2
		boolean result1 = num1 % 2 == 0 ? true : false;
		boolean result2 = num2 % 2 == 0 ? true : false;
		
		System.out.println(result1);
		System.out.println(result2);
		
		
		String id = "bitNaver5";
		boolean idValidation = false;
		if (id.length() >= 5 && id.length() < 2) {
			idValidation = true;
		}
		if(idValidation) { //idValdation == true
			System.out.println("사용할 수 있는 아이디입니다.");
		}
		else { //!idValidation
			System.out.println("아이디는 5자 이상이여야 합니다.");
		}
		
		
		//DB커넥션 풀의 최대 DB 연결 개수 = 20개 로 지정함
		final int MAX_CONNECTION = 20;
		final int MAX_VALUE;
		//상수는 선언만 하고 나중에 값을 저장(초기화)해도 된다.
		
		MAX_VALUE = 10;
		//한번 지정된 상수의 값은 변경할 수 없다.
		
		int userCnt = 0;
		while(true) {
			userCnt++;
			System.out.println("현재 사용자 수: " + userCnt);
			if(userCnt > MAX_CONNECTION) {
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("DB 연결이 모두 사용중입니다.");
		
		

	}

}
