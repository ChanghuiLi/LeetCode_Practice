package 递归与动态规划;

public class A跳跃游戏 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {3,2,3,1,1,4};
		System.out.println(Solution(nums));

	}
	//dp的方法
	public static int Solution(int[] nums) {
		//边界条件判定
		
		int[] dp = new int[nums.length];
		dp[0] = 0;
		for(int i = 1; i < nums.length; i++) {
			dp[i] = Integer.MAX_VALUE;
			for(int j = i-1; j >= 0; j--) {
				if(nums[j] >= (i-j)) {
					dp[i] = Math.min(dp[i], dp[j]+1);
				}
			}
		}
		for(int i = 0; i < nums.length; i++) {
			System.out.print(dp[i]+" ");
		}
		return dp[nums.length-1];
	}
	
	//	最优解法：O（n）时间复杂度，O（1）空间复杂度
	//  jump表示跳了多少步。cur表示跳jump步能达到最远位置，next表示下一次能跳到的最远位置。
	public static int Solution2(int[] nums) {
		
		int jump = 0;
		int cur = 0;
		int next = 0;
		for(int i = 0;i < nums.length; i++) {
			if(cur < i) {
				jump++;
				cur = next;
			}
			next = Math.max(next, i+nums[i]);
		}
		return jump;
	}
	
	

}
