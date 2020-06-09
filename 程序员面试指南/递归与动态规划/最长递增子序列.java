package 递归与动态规划;

import java.util.ArrayList;
import java.util.List;

public class 最长递增子序列 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//dp[i]以该元素结尾的最长子序列。
	public List<Integer> Solution(int[] nums){
		List<Integer> res = new ArrayList<Integer>();
		int[] dp = Help(nums);
		
		//找到最大的index，设置i开始从后向前检索。
		//nums[i]<nums[index]&&dp[i]+1 == dp[index],{输出，index = i}
		
		return res;
	}
	private int[] Help(int[] nums) {
		// TODO Auto-generated method stub
		int[] dp = new int[nums.length];
		dp[0] = 1;
		for(int i = 1;i < nums.length; i++) {
			dp[i] = 1;
			for(int j = 0; j < i; j++) {
				if(nums[i]>nums[j]) {
					dp[i] = Math.max(dp[i], dp[j]+1);
				}
			}
		}
		return dp;
	}

}
