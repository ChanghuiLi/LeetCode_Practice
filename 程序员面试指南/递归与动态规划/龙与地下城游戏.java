package 递归与动态规划;

public class 龙与地下城游戏 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] dp = new int[][] {{-2,-3,3,-1},{-5,-10,1,1},{0,30,-5,100},{-1,1,1,1}};
		for(int i = 0;i<dp.length;i++) {
			for(int j = 0;j<dp[0].length;j++) {
				System.out.print(dp[i][j]+",");
			}
			System.out.println();
		}
		System.out.println(Solution(dp));

	}
	public static int Solution(int[][] nums) {
		//路径上的最小元素
		int[][] dp = new int[nums.length][nums[0].length];
		//路径上的加和值
		int[][] m = new int[nums.length][nums[0].length];
		dp[0][0] = nums[0][0];
		m[0][0] = nums[0][0];
		for(int i = 1; i < nums[0].length; i++) {
			m[0][i] = m[0][i-1] + nums[0][i];
			dp[0][i] = Math.min(dp[0][i-1], m[0][i]);
		}
		for(int j = 1; j < nums.length; j++) {
			m[j][0] = m[j-1][0] + nums[j][0];
			dp[j][0] = Math.min(dp[j-1][0], m[j][0]);
		}
		int temp = 0;
		int temp2 = 0;
		int sum1 = 0;
		int sum2 = 0;
		for(int i = 1; i < nums.length; i++) {
			for(int j = 1; j < nums[0].length; j++) {
				sum1 = m[i-1][j]+nums[i][j];
				sum2 = m[i][j-1]+nums[i][j];
				temp = Math.min(sum1, dp[i-1][j]);
				temp2 = Math.min(sum2,dp[i][j-1]);
//				//往哪条路径过来。
//				dp[i][j] = Math.max(Math.max(dp[i-1][j], dp[i][j-1]), temp);
				if(temp>temp2) {
					m[i][j] = m[i-1][j]+nums[i][j];
					dp[i][j] = Math.min(dp[i-1][j], sum1);
				}else {
					m[i][j] = m[i][j-1]+nums[i][j];
					dp[i][j] = Math.min(dp[i][j-1], sum2);
				}
				
			}
		}
		for(int i = 0;i<dp.length;i++) {
			for(int j = 0;j<dp[0].length;j++) {
				System.out.print(dp[i][j]+",");
			}
			System.out.println();
		}
		
		return Math.abs(dp[nums.length-1][nums.length-1]);
	}

}
