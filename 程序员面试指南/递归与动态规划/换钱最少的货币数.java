package 递归与动态规划;

public class 换钱最少的货币数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,2,3};
		System.out.println(Solution(arr,0));

	}
	
	public static int Solution(int[] nums, int target) {
		int max = Integer.MAX_VALUE;
		int[][] dp = new int[nums.length+1][target+1];
		//初始状态可以最大值
		for(int i = 1; i <= target; i++) {
			dp[1][i] = max;
			if(nums[0]<=i&&dp[1][i-nums[0]]!=max) {
				dp[1][i] = dp[1][i-nums[0]]+1;
			}
		}
		int left = max;//可以标记位置信息进行迭代，将大问题化简为小问题。
		for(int i = 2; i <= nums.length; i++) {
			for(int j = 1; j <= target; j++) {
				left = max;
				if(nums[i-1]<=j && dp[i][j-nums[i-1]]!=max) {
					left = dp[i][j-nums[i-1]]+1;
				}
				dp[i][j] = Math.min(dp[i-1][j], left);
			}
		}
		return dp[nums.length][target]==max? -1:dp[nums.length][target];
		
	}

}
