package chap98_homework.nc230320;

import java.util.Arrays;
import java.util.List;

public class ArrayUility2 {

	public static int[] concat(int[] s1, int[] s2) {
		int[] concatArr = new int[s1.length + s2.length];
		int index = 0;
		for (int num : s1) {
			concatArr[index++] = num;
		}
		for (int num : s2) {
			concatArr[index++] = num;
		}
		return concatArr;
	}
	
	  static int[] remove(int[] s1, int[] s2) {
		  List<int[]>removeList = Arrays.asList(s1);
		  for (int i=0; i<s1.length; i++) {
			  for (int j : s2) {
				  if (removeList.contains(j)) {
					  removeList.remove(j);
				  }
			  }
		  }
		  int[] removeArr = new int [removeList.size()];
		  for (int i=0; i<removeList.length; i++) {
			  removeArr[i] = removeList.get(i).intValue;
		  }
		  
		  
		  
	  }

}
