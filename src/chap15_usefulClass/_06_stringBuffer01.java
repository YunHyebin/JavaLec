package chap15_usefulClass;

public class _06_stringBuffer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1 = new StringBuffer("bitcamp");
		StringBuffer sb2 = new StringBuffer("bitcamp");
		
		// 주소 비교
		System.out.println(sb1 == sb2);			//주소 값 비교 false
		//equals() 오버라이딩 되어있지 않아 리터럴(실제 값)을 비교할 수 없음
		// 같은 객체인지만 배교함
		System.out.println(sb1.equals(sb2));	//같은 값을 바라보는지 비교 false
		
		// 문자열로 변환해서 값을 비교
		String str1 = sb1.toString();
		String str2 = sb2.toString();
		System.out.println(str1.equals(str2));	//리터럴 값 비교 true
		System.out.println(str1 == str2);		//주소 값 비교 false
		
	}

}
