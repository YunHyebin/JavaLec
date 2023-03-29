package chap98_homework.nc230322;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _middle_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList strList = new ArrayList();
		ArrayList resultList = new ArrayList();
		
		// 문자열을 캐릭터로 하나씩 뽑고 숫자로 변형하여 list에 삽입
		System.out.print("문자열 입력: ");
		String str = sc.next();
		for (int i=0; i <str.length(); i++) {
			strList.add((int)str.charAt(i));
		}
		System.out.println(strList);
		


	}

}
