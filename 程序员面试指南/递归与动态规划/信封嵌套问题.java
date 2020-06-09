package 递归与动态规划;

import java.util.Arrays;
import java.util.Comparator;

public class 信封嵌套问题 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[][] {{7,2},{3,4},{5,6},{2334,123},{2,123},{10000,0}};
		
		System.out.println(Solution(a));
		
	}
	public static void sortmatrix(int[][] a) {
		Arrays.sort(a, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				//指定int[]的第几个位置。如果大于的话o1>o2的话（返回正数），升序。否则，降序。
				if (o1[0]==o2[0]) return o1[1]-o2[1];//如果第二个元素相等的话，按照第一个元素升序排序(小的排前面)。
				return o1[0]-o2[0];
			}
		});
		
	}
	//首先按照一个维度排序之后，第二个维度的最长递增子序列问题。
	public static int Solution(int[][] input) {
		sortmatrix(input);
		for(int i = 0;i<input.length;i++) {
			for(int j = 0;j<input[0].length;j++) {
				System.out.print(input[i][j]+",");
			}
			System.out.println();
		}
		int[] dp = new int[input.length];
		dp[0] = 1;
		for(int i = 1; i < input.length; i++) {
			dp[i] = 1;
			for(int j = i-1; j>=0;j--) {
				if(input[j][1]<input[i][1]) {
					dp[i] = Math.max(dp[i], dp[j]+1);//重要
				}
			}
			
		}
		for(int i = 0;i<dp.length;i++) {
			System.out.print(dp[i]+" ");
		}
		System.out.println();
		return dp[input.length-1];
		
	}

}
