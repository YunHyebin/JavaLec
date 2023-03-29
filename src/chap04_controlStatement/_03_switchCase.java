package chap04_controlStatement;

public class _03_switchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// break문을 넣어야 정삭적으로 동작
		// break문이 없을 경우에 맞는 조건부터 break 문을 만날때까지 case가 모두 실행됨
		// 따라서 case 각각 항상 break문을 넣어줘야 한다.
		String grade = "A";
		switch(grade) {
		case "A" :
			System.out.println("점수는 90점 이상입니다");
			break;
		case "B" :
			System.out.println("점수는 90점 미만	"
					+ " 80점 이상입니다.");
			// tab + enter
			break;
		case "C" :
			System.out.println("점수는 80점 미만	"
					+ "70점 이상입니다.");
		default:
			System.out.println("점수는 70점 미만입니다.");
		}
		
		switch(10 % 3) {
			case 1 :
			
			case 2 :
			
			default:
		}
// switch case에선 boolean으로 안됨
	}

}
