package chap98_homework.nc230323;

import java.util.Scanner;
import java.util.regex.Pattern;

public class _basic_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 사용자가 문자열 3개를 입력하고 그 문자열을 합쳐서 출력하세요(StrginBuffer 사용필수).
		System.out.println("\n----------문제1-----------");
		Scanner sc = new Scanner(System.in);
		System.out.print("문제1\t문자열 입력1: ");
		String inputSb1 = sc.nextLine();
		StringBuffer sb1 = new StringBuffer(inputSb1);
		System.out.print("문제1\t문자열 입력2: ");
		String inputSb2 = sc.nextLine();
		System.out.print("문제1\t문자열 입력3: ");
		String inputSb3 = sc.nextLine();
		StringBuffer result1 = sb1.append(inputSb2);
		result1 = sb1.append(inputSb3);
		System.out.println("문제1 결과: " + result1);

		
		
		
		
		
//		2. 크기가 30인 StringBuffer에 "hello"라는 문자열이 담겨있다.
//	    비어있는 바이트의 공간을 a로 모두 채우시오.
		StringBuffer q2 = new StringBuffer("hello");
		q2.setLength(30);
		System.out.println("길이" + q2.length());
		
////		System.out.println(q2);
//		System.out.println(q2.index);
////		q2.replace(q2.indexOf(" "), q2.length()-1, "a");
//		System.out.println("문제2: " + q2);
		
		
		
//	3. 16.459를 소수점 둘 째 자리까지 반올림해서 출력(xx.xx)
		System.out.println("\n----------문제3-----------");
		double q3 = 16.459;
		System.out.println(Math.round(q3*100)/100.0);
		
		
		
//	4. 문자열 "145.987", "-563.11" 을 double형으로 변경하여 덧셈의 결과를 출력하세요.
		System.out.println("\n----------문제4-----------");
		String q4 = "145.987";
		String Q4 = "-563.11";
		System.out.println(Double.valueOf(q4) + Double.valueOf(Q4));
		

	}


}
