package chap05_array;

public class _06_shallowCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] intArr = {1, 2, 3, 4, 5};
		
		//얕은 복사
		// 값을 변경하면 각각 배열 요소에 서로 영향을 미친다.
		int [] copyArr1 = intArr;
		System.out.println(intArr);
		System.out.println(copyArr1); // 주소값 같다고 출력남 [I@3d012ddd
		
		intArr[0] = 20;
		System.out.println(copyArr1[0]);
		
		copyArr1[4] = 30;
		System.out.println(intArr[4]);
		
		


		
		
		
	}

}
