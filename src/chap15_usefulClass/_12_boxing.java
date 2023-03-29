package chap15_usefulClass;

public class _12_boxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 100;
		
		// 원시타입을 객체로 만듬 : 박싱
		Integer objNum1 = (Integer)num1;
		
		// 객체를 원시타입으로 자동 언박싱 
		int num2 = num1 + objNum1;
		
		Integer objNum2 = Integer.valueOf(300);
		
		//언박싱, 객체를 원시타입으로 변환
		int num3 = (int)objNum2;
		
		// 자동박싱 : 컴파일러가 자동으로 원시타입을 객체로 만듬
		Integer objNum3 = objNum2 + num3;
		
		System.out.println("수동박싱int = Integer + int : " + objNum1);
		System.out.println("자동 언박싱 " + num2);
		System.out.println("수동 언박싱 " + num3);
		System.out.println("자동 박싱 " + objNum3);
		
		
		
		

	}

}
