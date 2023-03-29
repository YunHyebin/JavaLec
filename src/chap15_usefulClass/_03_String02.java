package chap15_usefulClass;

import java.util.ArrayList;
import java.util.List;

public class _03_String02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "computer";
		String str2 = "smartPhone";
		String str3 = "abcdhadecba";
		
		if(str1.contains("tp")) {
			System.out.println("str1은 tp 포함합니다.");
		}else {
			System.out.println("str1은 tp 포함하지 않습니다.");
		}
		
		//해당 문자나 문자열의 index 확인
		System.out.println("\n------index 확인-----");
		int index1 =str2.indexOf('h');
		int index2 =str3.indexOf('a', 4);
		int index3 =str3.indexOf("abc");
		int index4 = str3.lastIndexOf('h');
		int index5 = str3.lastIndexOf('h', 7);
		int index6 = str3.lastIndexOf("bc");
		
		//문자열의 길이
		int[] intArr = new int[10];
		System.out.println("\n------length 확인-----");
		System.out.println("str1의 길이: " + str1.length());
		System.out.println("intArr 배열의 길이: " + intArr.length);
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(1);
		intList.add(1);
		intList.add(1);
		System.out.println("intList길이 : " +intList.size());
		
		// replace, replaceAll 변환 (정규식 사용가능)
		System.out.println("\n------replace 변환-----");
		String str4 = "abc"
				+ "abc"
				+ "abc"
				+ "aabbcc";
		System.out.println(str4.replace("abc", "111"));	//111111111aabbcc
		//[]안의 문자를 전부 치환한다.
		System.out.println(str4.replaceAll("[ac]", "2"));//2b22b22b222bb22
		System.out.println(str4.replace('a', '1')
								.replace('b', '2')
								.replace('c', '3'));	//123123123112233
		
		
		
		
		
		
		

	}

}
