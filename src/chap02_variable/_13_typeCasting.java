package chap02_variable;

public class _13_typeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 묵시적(자동) 형변환
		// 바이트 크키가 작은 변수를 바이트 크기가 큰 변수에 대입할 때 
		// 자동으로 크키가 큰 변수의 자료형으로 변경됨.
		// 바이트 크기가 낮은 타입에서 큰 타입으로는 자동형변환
		short sNum = 10;
		int iNum = sNum;
		
		// 세밀한 표현범위의 타입으로 자동형변환
		long lNum = 1000000L;
		float fNum = lNum;
		
		//2. 명시적(강제) 형변환
		// 바이트가 큰 타입에서 작은 타입으로 형변환은 작은 타입의 자료형을 명시한다.
		int uniCode = 65;
		char ch1 = (char)uniCode;
		
		// 명시적 형변환에서 범위를 초과할 경우
		long longVal = 32770L;
		short shortVal = (short)longVal;
		
		//3. 형변환 자동출력
		System.out.println(iNum);
		System.out.println(fNum);
		System.out.println(ch1);
		// 최대값 범위보다 커질 경우 값이 최소값부터 시작
		// 범위의 최소값보다 작아지는 경우 최대값부터 다시 시작
		System.out.println("범위초과 시 " + shortVal);
		System.out.println("---------------\n");
		
		//4. 연산에서의 형변환
		//바이트 크기가 큰 타입과 작은 타입을 연산할 경우 -> 작은 타입의 변수가 묵시적으로 큰타입으로 변경된 후 연산됨
		long lNum2 = 100000000L;
		int iNum2 = 100;
		long result1 = lNum2 + iNum2;
		System.out.println(result1);
		
		//바이트 크기가 작은 타입으로 형변환 후 연산하고 싶을 경우 큰 타입을 강제 형변환 후 연산
		int result2 = (int)(iNum2 + lNum2);
		System.out.println(result2);
		
		//2. 문자열 결합 연산에서의 형변환
		String str = "java";
		int version = 11;
		
		String result3 = str + version;
		//문자열 결합연산에서는 문자열을 제외한 모든 타입이 문자열 타입으로 변경된 후 연산됨.
		//version의 값이 문자열로 변환된 후 결합됨
		System.out.println(result3);
		
		System.out.println("----------------\n");
		
		
	}

}
