package 数组和矩阵问题;

import java.util.HashSet;

public class A最长可整合数组 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int GetLL(int[] nums) {
		int max = 0;
		int min = 0;
		int res = 0;
		HashSet<Integer> set = new HashSet<Integer>();
 		for(int i = 0;i<nums.length;i++) {
			max = Integer.MIN_VALUE;
			min = Integer.MAX_VALUE;
			for(int j = i;j<nums.length;j++) {
				if(set.contains(nums[i])) {
					break;
				}
				set.add(nums[i]);
				max = Math.max(max, nums[i]);
				min = Math.min(min, nums[i]);
				if(max-min == j-i) {
					res = Math.max(res, j-i+1);
				}
				
			}
			set.clear();
		}
 		return res;
	}

}
