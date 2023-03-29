package chap15_usefulClass;

public class _01_object {
	public static class Example implements Cloneable{
		// clone 메소드는 Cloneable 인터페이스를 상속받아 clone() 메소드를직접 구현해야 사용 가능
		public Object clone() {
			Object obj = null;
			try {
				// super.clone() Object 안에 있는 clone 메소드를 호출하는데
				// clone 메소드에서 전달하는 예외가
				// CloneNotSupportedException이기 때문에 catch구문에서 동일한 예외로 받아준다.
				// 어떤 예외로 나올지 모르면 Exception ce로 하면 됨
				obj = super.clone();
			}catch(CloneNotSupportedException ce){
				System.out.println(ce.getMessage());
			}
			return obj;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example ex1 = new Example();
		
		// 깊은 복사: 변수가 가진 객체의 값 복사
		Example ex2 = (Example)ex1.clone();
		
		if(ex1.equals(ex2)) {
			System.out.println("같은 객체 입니다.");
		}else {
			System.out.println("다른 객체 입니다.");
		}
		
		// 얕은 복사: 변수가 가진 주소 값을 복사
		ex2 = ex1;
		if(ex1.equals(ex2)) {
			System.out.println("같은 객체 입니다.");
		}else {
			System.out.println("다른 객체 입니다.");
		}
		
		
		
		

	}

}
