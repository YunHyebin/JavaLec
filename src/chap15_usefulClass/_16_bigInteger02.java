package chap15_usefulClass;

import java.math.BigInteger;

public class _16_bigInteger02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		for(int i=1; i<100; i++) {
			System.out.println(i+ "!= " + factorial(BigInteger.valueOf(i)));
			Thread.sleep(500);
			
		}
		
	}
	
	// 팩토리얼 계산하는 메소드
	static BigInteger factorial(BigInteger num) {
		if(num.intValue() == 0) {
			return BigInteger.ONE;
		
		}else {
			// 재귀메소드(함수) : 메소드 안에서 해당 자신의 메소드를 다신호룰
			return num.multiply(factorial(num.subtract(BigInteger.ONE)));
			
		}
		
	}
	

}
