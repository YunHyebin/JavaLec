package chap17_generic;

public class _02_genericMethod {

	public static void main(String[] args) {
		String[] strArr = {"java", "javaScript", "html"};
		
		//int형 배열은 원시타입이라 안됨. 따라서 배열의 형을 Integer로 함
		Integer[] intArr = {1, 2, 3, 4, 5};
		
		// type을 지정하지 않은 자료형 추론
//		String result1 = getLastEle(strArr);
//		Integer result2 = getLastEle(intArr);
		
		String result1 = _02_genericMethod.<String>getLastEle(strArr);
		Integer result2 = _02_genericMethod.<Integer>getLastEle(intArr);
		
		
		
		System.out.println("strArr의 마지막 요소: " + result1);
		System.out.println("intArr의 마지막 요소: " + result2);

	
	
	}//main 함수 종료 지점
	
	
	
	
	public static <T> T getLastEle(T[] tArr) {
		return tArr[tArr.length - 1]; 	//T가 담겨져있는 tArr 배열의 마지막 요소 반환
	}//getLastEle 함수 종료 지점

}
