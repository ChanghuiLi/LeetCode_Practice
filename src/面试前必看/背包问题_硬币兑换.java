package 面试前必看;

public class 背包问题_硬币兑换 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3};
        int[] b = {3,4,5,6,9,7};
        int bag = 10;
        int[] res = money(a,10);
        for(int i = 0;i<res.length;i++) {
        	System.out.print(res[i]);
        }
        //

	}
	public static int[] money(int[] nums,int count) {
		int res = 0;
		int[] dp = new int[count+1];
		for(int i = 1;i<dp.length;i++) {
			dp[i] = i/nums[0];
		}
		for(int i = 1;i<nums.length;i++) {
			for(int j = nums[i];j<=count;j++) {
				if(j>=nums[i]) {
					dp[j] = Math.min(dp[j], dp[j-nums[i]]+1);
				}
			}
		}
		return dp;
		
	}

}
