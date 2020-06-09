package 重要的代码片段;

import java.util.Arrays;

import java.util.Collections;
import java.util.Comparator;

public class 降序排序 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a = new Integer[] {1,2,3,4,5,12,45,3,3245};
        Arrays.sort(a,Collections.reverseOrder());
//		Collections.sort(a,Comparator<1 super Integer>);
//		Collections.sort(a, new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				// TODO Auto-generated method stub
//				return o1-o2;
//			}
//			
//		});
        //Integer转Int类型
        int[] arr2 = Arrays.stream(a).mapToInt(Integer::valueOf).toArray();
		for(int i = 0;i<arr2.length;i++) {
			System.out.print(arr2[i]+",");
			System.out.println(arr2);
		}

	}

	private static void sort(int[] a, Comparator<? super Integer> sort) {
		// TODO Auto-generated method stub
		
	}

}
