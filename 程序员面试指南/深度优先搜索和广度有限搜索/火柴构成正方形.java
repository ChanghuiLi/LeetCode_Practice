package 深度优先搜索和广度有限搜索;

import java.util.Arrays;
import java.util.Collections;

public class 火柴构成正方形 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {1,1,2,2,2};
		System.out.println(makesquare(a));

	}
	
	public static  boolean makesquare(int[] nums) {
		if(nums==null||nums.length<4) return false;
		int sum = 0;
		int max = 0;
		for(int i = 0;i < nums.length;i++) {
			max = Math.max(max, nums[i]);
			sum = sum + nums[i];
		}
		Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
		Arrays.sort(arr,Collections.reverseOrder());
		int[] nums2 = Arrays.stream(arr).mapToInt(Integer::valueOf).toArray();
		if(max>sum/4||sum%4!=0) return false;
		return dfs(nums2,0,nums2.length,0,0,0,0,sum/4);
	}

	private static boolean dfs(int[] nums2, int i, int length, int j, int k, int l, int m, int n) {
		// TODO Auto-generated method stub
		if(i==length) {
			if(j ==n && k==n && l==n &&m==n) return true;
			else return false;
		}
		if(j > n||k>n||l>n||m>n) return false;
		return dfs(nums2,i+1,length,j+nums2[i],k,l,m,n)||dfs(nums2,i+1,length,j,k+nums2[i],l,m,n)
				||dfs(nums2,i+1,length,j,k,l+nums2[i],m,n)||dfs(nums2,i+1,length,j,k,l,m+nums2[i],n);
	}

}
