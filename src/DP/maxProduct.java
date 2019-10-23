package DP;

public class maxProduct {
	public int maxProduct(int[] nums) {
		if(nums.length==1) return nums[0];
		int[][] M = new int[nums.length][2];
		M[0][0] = nums[0];
		M[0][1] = nums[0];
		int res = nums[0];
		for(int i = 1;i < nums.length; i++) {
			//分别和M[1],M[0]；四个数比较。然后更新参数。
			M[i][0] = Math.max(Math.max(nums[i]*M[i-1][0], nums[i]*M[i-1][1]), nums[i]);
			M[i][1] = Math.min(Math.min(nums[i]*M[i-1][0], nums[i]*M[1-1][1]), nums[i]);
			//正的话，更新正参数
			res = Math.max(M[i][0], M[i-1][0]);
		}
		return res;
    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
