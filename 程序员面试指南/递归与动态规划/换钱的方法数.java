package 递归与动态规划;

public class 换钱的方法数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {5,10,25,1};
		System.out.println(Coin(nums,15));

	}
	public static int Coin(int[] nums, int aim) {
		//定义状态：dp[i][j] ，前i个类型的钱币，换j的钱方法数。dp[i][j] = dp[i-1][j],
		int[][] dp = new int[nums.length][aim+1];
		//初始化
		for(int i = 0; i < nums.length; i++) {
			dp[i][0] = 1;
		}
		
		for(int j = 1; nums[0] * j <= aim; j++) {
			dp[0][nums[0]*j] = 1;
		}
		
		for(int i = 1; i<nums.length; i++) {
			for(int j = 1; j <= aim; j++) {
				if(j >= nums[i]) {
					dp[i][j] = dp[i-1][j] + dp[i][j-nums[i]];
				}else {
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		for(int i = 0;i<dp.length;i++) {
			for(int j = 0;j<dp[0].length;j++) {
				System.out.print(dp[i][j]+",");
			}
			System.out.println();
		}
		
		return dp[nums.length-1][aim];
	}

}
