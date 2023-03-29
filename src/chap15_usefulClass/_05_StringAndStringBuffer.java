package chap15_usefulClass;

public class _05_StringAndStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("스트링");
		String str2 = str1;
		String str3 = new String("스트링");
		
		StringBuffer sb1 = new StringBuffer("버퍼");
		StringBuffer sb2 = sb1;
		
		System.out.println(str1 == str2);		//true
		System.out.println(str1.equals(str2));	//true
		System.out.println(str1 == str3);		//false
		System.out.println(str1.equals(str3));	//true
		
		System.out.println("-------");
		str1 = "바꿔버리기";
		System.out.println(str1);				//바꿔버리기: heap 메모리에 새로운 값을 생성해 바라봄
		System.out.println(str2);				//스트링 : heap 메모리에 기존에 있던 값을 계속 바라봄
		
		
		
		System.out.println(sb1 == sb2);			//true
		System.out.println(sb1.equals(sb2));	//true
		System.out.println("-------");
		sb1.insert(1, "바꿈");
		System.out.println(sb1);				//버바꿈퍼
		System.out.println(sb2);				//버바꿈퍼
		

	}

}
