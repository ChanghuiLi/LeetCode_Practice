package DP;

public class P198rob {
	public int rob(int[] nums) {
        if(nums.length<=0||nums == null) return 0;
        if(nums.length<2) return nums[nums.length-1];
        int[] dp = new int[nums.length+1];
        dp[1] = nums[0];
        dp[2] = nums[1];
        int res = Math.max(dp[1],dp[2]);
        int max = 0;
        int temp;
        for(int j = 3;j<=nums.length;++j) {
        	for(int k = j-2;k>=0;k--) {
        		temp = nums[j-1] + dp[k];
        		max = Math.max(temp,max);
        	}
        	dp[j] = max;
        	res = Math.max(dp[j],res);
        }
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
