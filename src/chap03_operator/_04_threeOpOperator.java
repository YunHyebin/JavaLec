package chap03_operator;

import java.io.IOException;

public class _04_threeOpOperator {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//1. 삼항 조건 연산자
		int num1 = 120;
		int num2 = 11;
		int result = (num1 / num2) == (10 / num1) ? (num1 * 2) : (num2 * 2);
		System.out.println(result);
		
		//2. 삼항 조건 연산자의 중첩
		result = num1 / num2 == 10 / num2 ? num1 * 2 > 100 ? 101 : 99 : num2 * 2 > 100 ? 11 : 22;
		System.out.println(result);
		
		result = (num1 / num2 == 10 / num1) ? (num1 * 2 > 100 ? 101 : 99) : (num2 * 2 > 100 ? 11 : 22);
				
		
		int asciiCode = System.in.read();
		
		result = num1 / num2 > 8 
				?
					num1 - 11 == 100?
						num1*2 :
						num1 /2
				:
					num2 - 11 < 0 ?
						num2 * 2:
						num2 / 2;
	}

}
