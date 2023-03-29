package chap05_array;

public class _07_deepCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = { 10, 20, 30, 40, 50 };
		int[] array2 = { 1, 2, 3, 4, 5 };

		System.arraycopy(array1, 0, array2, 1, 4);
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		
		//1. clone을 이용한 깊은 복사
		int [] arr1 = {1,2,3,4,5};
		int [] arr2 = arr1.clone();
		System.out.println(arr1); // arr1의 주소: [I@123a439b
		System.out.println(arr2);	// arr2의 주소: [I@7de26db8
		System.out.println(arr1 == arr2); // 같은 주소인지 판별값; false
		System.out.println(arr1.equals(array2)); // 같은 값인지 판별값; true
		
		// 깊은 복사는 값을 변경해도 서로 영향을 주지 않는다.
		arr1[0] = 10;
		arr2[0] = 20;
		System.out.println(arr1[0]); // 10
		System.out.println(arr2[0]); // 20
		
		//2. System.arraycopy을 이용한 깊은 복사
		int [] arr3 = new int[5];
		
		System.arraycopy(arr1, 2, arr3, 0, arr1.length - 2);
		
		for(int b : arr3) {
			System.out.println(b + " ");
		}
		
		System.out.println(arr1); //[I@76ccd017
		System.out.println(arr3); //[I@26f0a63f
		System.out.println(arr1 == arr3); // false
		
		arr1[1] = 13;
		arr2[1] = 33;
		System.out.println(arr1[1]); // 13
		System.out.println(arr2[1]); // 33
		

			
			
		}

	}
}
