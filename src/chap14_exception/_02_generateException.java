package chap14_exception;

public class _02_generateException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[3];
		int index = 0;
		
		try {
//			ArrayIndexOutOfBoundsException aie 
//			= new ArrayIndexOutOfBoundsException("인덱스가 초과됐습니다.");
//			throw aie;
			
			
//			ArrayIndexOutOfBoundsException는 이미 만들어진 클래스로, 매개변수에 숫자를 넣는것과 숫자를 넣지않을 때의 출력이 다름
			
			//1. NullPointer Exception
			NullPointerException ne = new NullPointerException("null입니다.");
			throw ne
			//2. ArithmeticException
			ArithmeticException ae = new ArithmeticException("수학적 오류입니다.");
			throw ae
			
		}catch(NullPointerException ne) {
			System.out.println(ne.getMessage());
		}catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
			
		}catch(Exception e) {
			// 마지막 catch문은 위에 선언한 catch문을 다 통과한 예외들을 처리할 수 있게
			// 모든 예외를 담을 수 있는 에외 최상위 클래스 Exception으로 예외를 처리해준다.
			System.out.println(e.getMessage());
			System.out.println("e 예외 발생");
		}

	}

}

