package chap98_homework.nc230327;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		//1. 정수형 데이터를 저장할 수 있는 ArrayList를 생성하고 사용자가 입력한 5개의 정수를 저장하고 출력하세요.
		
		System.out.println("\n-------문제1--------");
		ArrayList<Integer> intArrList = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<5; i++) {
			System.out.println("숫자 입력: ");
			Integer temp = Integer.valueOf(sc.nextLine());
			intArrList.add(temp);
			intArrList.add(sc.nextInt());
		}
		System.out.println(intArrList);
		

		//2. 정수형 데이터를 저장할 수 있는 LinkedList를 생성하고 사용자가 입력한 5개의 정수를 저장하고 index가 3, 4번 요소를 값은 100, 200으로 변경하고 출력하세요.
		System.out.println("\n-------문제2--------");
		List<Integer> intList = new LinkedList<Integer>();
		for (int i=0; i<5; i++) {
			System.out.println("숫자 입력: ");
			Integer temp = Integer.valueOf(sc.nextLine());
			intList.add(temp);
		}
		intList.set(3, 100);
		intList.set(4, 200);
		System.out.println(intList);
		
		
		//3. Map<String, Integer>을 하나 생성하여 key는 알파벳(대소문자 구분) value는 해당 알파벳의 유니코드 값을 Integer형태로 저장하세요.
		System.out.println("\n-------문제3--------");
		Map<String, Integer> map = new HashMap<String, Integer> ();
		System.out.println("영어 문자열 입력: ");
		String text = sc.nextLine();
		for (int i=0; i <text.length(); i++) {
			map.put(String.valueOf(text.charAt(i)), Integer.valueOf((int)text.charAt(i))); 
		}
		
		System.out.println("<<출력 1>>");
		System.out.println(map);
		
		System.out.println("<<출력2>>");
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("key : " + entry.getKey() + "\t value: " + entry.getValue());
		}
	     

	}

}
