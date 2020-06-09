package 动态规划问题归类;

import java.util.Arrays;

public class  背包问题集合{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,5};
		System.out.println(coinChange2(nums,5));

	}
	
	//等和子集划分
	//可以划分成两个相等的集合，也就是集合有元素相加等于所有元素之和的一半。
	public static boolean Solution(int[] nums) {
		
		int sum = 0;
		for(int i = 0; i < nums.length;i++) {
			sum += nums[i];
		}
		if(sum%2==1) {
			return false;
		}
		int count = sum/2;
		boolean[] dp = new boolean[count+1];
		if(nums[0]>count) {
			return false;
		}
		dp[nums[0]] =  true;
		dp[0] = true;
		for(int i = 1;i < nums.length;i++) {
			//(当需要降低空间复杂度的时候，只用一位数组，第二次遍历的时候需要从后往前遍历)
			for(int j = count;j>0;j--) {
				if(dp[j]||(nums[i]<=j&&dp[j-nums[i]])) {
					dp[j] = true;
				}
			}
		}
		return false;
	}
	
	//494. 目标和 
	public int findTargetSumWays(int[] nums, int S) {
//		sum(P) - sum(N) = target
//		sum(P) + sum(N) + sum(P) - sum(N) = target + sum(P) + sum(N)
//        2 * sum(P) = target + sum(nums)
		
	}
	
	//322 零钱兑换最少次数
	public int coinChange(int[] coins, int amount) {
		int max = amount+1;
		int[] dp = new int[amount+1];
		Arrays.fill(dp, max);
		dp[0] = 0;
		for(int i = 1;i <= amount;i++) {
			for(int j = 0; j < coins.length; j++) {
				if(coins[j]<=i) {
					dp[i] = Math.min(dp[i], dp[i-coins[j]]+1);
				}
			}
		}
		return dp[amount]>amount? -1:dp[amount];
	}
	
	
	public static int coinChange2(int[] coins, int amount) {
		int max = amount+1;
		int[][] dp = new int[coins.length][amount+1];
		for(int i = 0;i<dp.length;i++) {
			for(int j = 0;j<dp[0].length;j++) {
				dp[i][j] = max;
			}
		}
		for(int i = 0;i<coins.length;i++) {
			dp[i][0] = 0;
		}
		for(int j = coins[0];j <=amount; j = j+ coins[0]) {
			dp[0][j] = dp[0][j-coins[0]] + 1;
		}
		for(int i = 1;i < coins.length;i++) {
			for(int j = 1;j <=amount ;j++) {
				if(j>=coins[i]){
                    dp[i][j] = Math.min(dp[i-1][j], dp[i][j-coins[i]]+1);
                }else {
                	dp[i][j] = dp[i-1][j];
                }
			}
		}
		for(int i = 0;i<dp.length;i++) {
			for(int j = 0;j<dp[0].length;j++) {
				System.out.print(dp[i][j]+"  ");
			}
			System.out.println();
		}
		return dp[coins.length-1][amount]>amount? -1:dp[coins.length-1][amount];
	}
	
	//零钱兑换方法数 dp【x】 = dp【x】+dp【x-coins【i】】
	public int change(int amount, int[] coins) {
		int[] dp = new int[amount+1];
		return 0;
    }
	
	//一和零--test
	public int findMaxForm(String[] strs, int m, int n) {
		
	}
}
