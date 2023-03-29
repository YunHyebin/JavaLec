package chap15_usefulClass;

public class _07_stringBuffer02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1 = new StringBuffer(100);
		StringBuffer sb2 = new StringBuffer("bitcamp");
		
		// capacity와 length의 차이
		sb1.append("navercloud");
		System.out.println(sb1.capacity());		//버퍼의 크기 100
		System.out.println(sb1.length());		//담겨있는 문자열의 길이 10
		
		// delete와 insert
		StringBuffer sb3 = sb2.delete(3, 7);		//camp 자름
		System.out.println("camp를 자른 sb2의 값: " + sb2);	// bit
		System.out.println(sb3);					// bit
		sb3 = sb3.insert(3, "camp");
		System.out.println(sb3);					//bitcamp
		System.out.println(sb2);					//bitcamp
		System.out.println(sb3 == sb2);				//true
		System.out.println(sb3.equals(sb2));		//true
		
		String str2 = sb2.toString();
		String str3 = sb3.toString();
		System.out.println(str2 == str3);			//false
		System.out.println(str2.equals(str3));		//true
//		
//		// reverse()
//		sb1 = sb1.reverse();
//		System.out.println(sb1);					//duolcrevan
//		
//		//setCharAt()
//		sb3.setCharAt(3, 'C');
//		System.out.println(sb3);					//bitCamp
//		
//		//setLength()
//		sb3.setLength(10);
//		System.out.println(sb3);					//bitCamp□□□
		
		
	}

}
