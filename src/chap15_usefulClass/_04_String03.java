package chap15_usefulClass;

public class _04_String03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "bit-naver-cloud";
		String str2 = "kiaaCar";
		String str3 = "aBcDeF";
		int num1 = 1234;
		double num2 = 1234.5678;
		boolean boola = true;
		
		// 특정 문자로 자르기 split
		System.out.println("\n------ 특정 문자로 자르기 split-----");
		String [] strArr = str1.split("-");
		System.out.println("-기준으로 split 결과 : " + strArr.toString()); //[Ljava.lang.String;@626b2d4a
		for(String s : strArr) {
			System.out.println(s);
		}
		
		// 인덱스로 문자열 자르기
		System.out.println("\n------인덱스로 문자열 자르기-----");
		//String str2 = "kiaaCar";
		System.out.println(str2.substring(4));    //Car
		System.out.println(str2.substring(2, 4));  //aa
		System.out.println(str2.substring(str2.indexOf('a'))); //aaCar
		System.out.println(str2.substring(1, str2.length()-1));
		
		// 대문자, 소문자로 치환
		System.out.println("\n------대문자, 소문자로 치환-----");
		// 소문자로 치환
		System.out.println(str3.toLowerCase());
		// 대문자로 치환
		System.out.println(str3.toUpperCase());
		
		// 앞뒤 공백 없애기
		System.out.println("\n------앞뒤 공백 없애기-----");
		String str4 = "          aaabbb      ddd   ";
		System.out.println(str4.trim());
		
		
		// 다른 타입의 값을 String 타입으로 변환
		System.out.println("\n------다른 타입의 값을 String 타입으로 변환-----");
		String s1 = String.valueOf(num1);
		String s2 = String.valueOf(num2);
		String s3 = String.valueOf(boola);
		String s4 = Integer.valueOf(num1).toString();
		System.out.println(s1 + ", " + s2 + "," +s3+"," + s4);
		
		
		
		

	}

}
