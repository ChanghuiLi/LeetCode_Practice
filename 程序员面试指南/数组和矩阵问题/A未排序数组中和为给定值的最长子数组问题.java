package 数组和矩阵问题;

import java.util.HashMap;

public class A未排序数组中和为给定值的最长子数组问题 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//构造加和数组的方法。
	public static int Solution(int[] nums,int k) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int sum = 0;
		int len = 0;
		map.put(0, -1);
		for(int i = 0;i<nums.length;i++) {
			sum = sum+nums[i];
			if(map.containsKey(sum-k)) {
				len = Math.max(len, map.get(sum-k)+1);
			}
			if(!map.containsKey(sum)) {
				map.put(sum, i);
			}
		}
		return len;
	}
	

}
