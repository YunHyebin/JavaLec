package chap98_homework.nc230329.operator;

import java.util.Arrays;
import java.util.Scanner;

public class Operator08 {

	public static void main(String[] args) {
//		8. 사용자가 입력한 하나의 문자열과 하나의 정수로 "입력한 문자열 xxxxx이고, 입력한 숫자는 xxxxxx입니다." 라고 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열과 정수 합친 하나의 문자열 입력: ");
		String input = sc.next();

		String patternStr = "[a-zA-Z가-힣]";
		String patternInt = "[0-9]";

		String[] strArr = input.split(patternInt);
		String[] intArr = input.split(patternStr);
		
		String sResult = "";
		String iResult = "";
		for(int i=0; i<strArr.length; i++) {
			sResult += strArr[i];
		}
		for(int i=0; i<intArr.length; i++) {
			iResult += intArr[i];
		}
		
		System.out.println("입력한 문자열 " + sResult + "이고, 입력한 숫자는 " + iResult + "입니다.");
	
		

	}

}
