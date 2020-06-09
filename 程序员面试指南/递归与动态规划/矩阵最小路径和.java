package 递归与动态规划;

public class 矩阵最小路径和 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int Solution(int[][] nums) {
		if(nums==null||nums.length<=0||nums[0]==null||nums[0].length<=0) return 0;
		//定义状态，到i，j的最短路径。
		int[][] dp = new int[nums.length][nums[0].length];
		//初始化
		for(int i = 0; i <nums.length;i++) dp[i][0] = nums[i][0];
		for(int j = 0; j < nums[0].length; j++) dp[0][j] = nums[0][j];
		
		//状态转移
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums[0].length; j++) {
				dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]);
			}
		}
		
		return dp[nums.length-1][nums[0].length-1];
		
		
	}

}
