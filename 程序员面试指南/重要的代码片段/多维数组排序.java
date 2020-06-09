package 重要的代码片段;

import java.util.Arrays;
import java.util.Comparator;

public class 多维数组排序 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[][] {{7,2},{3,4},{5,6},{2334,123},{2,123},{10000,0}};
		
		Arrays.sort(a, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				//指定int[]的第几个位置。如果大于的话o1>o2的话（返回正数），升序。否则，降序。
				if (o1[1]==o2[1]) return o1[0]-o2[0];//如果第二个元素相等的话，按照第一个元素升序排序(小的排前面)。
				return o2[1]-o1[1];
			}
		});
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<a[0].length;j++) {
				System.out.print(a[i][j]+",");
			}
			System.out.println();
		}

	}

}
